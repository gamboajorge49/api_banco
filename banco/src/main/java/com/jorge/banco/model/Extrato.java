package com.jorge.banco.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
/*
 * @NamedQuery(name = "Extrato.findAll", query =
 * "select t.id_conta,case t.tipo when 'T' then 'Transferência Enviada'" +
 * " when 'R' then 'Transferência Recebida' when 'D' then 'Deposito'" +
 * " when 'P' then 'Pagamento' when 'S' then 'Saque'" + " else 'ERRO'end" +
 * " as tipo,t.valor," +
 * " case when t.tipo in ('T','S','P') then 'Debito' when t.tipo in ('D','R') then 'Credito'"
 * + " else 'ERRO'end" +
 * " as direcao,t.descricao,c.cliente_nome participante,t.data" +
 * " from transacoes t" + " left join contas c on c.id = t.id_conta_dest")
 */
@Table(name = "extrato")
public class Extrato {

	@Id
	@Column(name = "id_conta", nullable = false)
	private long idConta;
	private String tipo;
	private float valor;
	private String direcao;
	private String descricao;
	private String participante;
	private Date data;

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getParticipante() {
		return participante;
	}

	public void setParticipante(String participante) {
		this.participante = participante;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public long getIdConta() {
		return idConta;
	}

	/*Extrato(long idConta) {
		this.idConta = idConta;

	}*/

}
