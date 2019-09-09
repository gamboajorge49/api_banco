create or replace
view `new_view` as
select
    `t`.`id_conta` as `id_conta`,
    case
        `t`.`tipo`
        when 'T' then 'Transferência Enviada'
        when 'R' then 'Transferência Recebida'
        when 'D' then 'Deposito'
        when 'P' then 'Pagamento'
        when 'S' then 'Saque'
        else 'ERRO'
    end as `tipo`,
    `t`.`valor` as `valor`,
    case
        when `t`.`tipo` in ('T',
        'S',
        'P') then 'Debito'
        when `t`.`tipo` in ('D',
        'R') then 'Credito'
        else 'ERRO'
    end as `direcao`,
    `t`.`descricao` as `descricao`,
    `c`.`cliente_nome` as `participante`,
    `t`.`data` as `data`
from
    (`transacoes` `t`
left join `contas` `c` on
    (`c`.`id` = `t`.`id_conta_dest`))