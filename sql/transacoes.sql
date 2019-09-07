CREATE TABLE `transacoes` (
  `id` int(11) NOT NULL,
  `id_conta` int(11) NOT NULL,
  `id_conta_dest` int(11) DEFAULT NULL,
  `tipo` char(1) NOT NULL COMMENT 'S=Saque\r\nD=Desposito\r\nT=Tranferencia\r\nP=Pagamento',
  `valor` decimal(19,2) NOT NULL,
  `descricao` varchar(100) NOT NULL,
  `data` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8