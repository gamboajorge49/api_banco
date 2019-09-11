package com.jorge.banco.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "contas")
public class Conta {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String id_agencia;
	private String numero;
	private String cliente_nome;
	private String cliente_cpf;
	private String cliente_end_logradouro;
	private String cliente_end_numero;
	private String cliente_end_bairro;
	private String cliente_end_complemento;
	private String cliente_end_cidade;
	private String cliente_end_estado;
	private String cliente_end_cep;
	private String tipo;
	private float saldo;
	private Date data_cadastro;

	public String getId_agencia() {
		return id_agencia;
	}

	public void setId_agencia(String id_agencia) {
		this.id_agencia = id_agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCliente_nome() {
		return cliente_nome;
	}

	public void setCliente_nome(String cliente_nome) {
		this.cliente_nome = cliente_nome;
	}

	public String getCliente_cpf() {
		return cliente_cpf;
	}

	public void setCliente_cpf(String cliente_cpf) {
		this.cliente_cpf = cliente_cpf;
	}

	public String getCliente_end_logradouro() {
		return cliente_end_logradouro;
	}

	public void setCliente_end_logradouro(String cliente_end_logradouro) {
		this.cliente_end_logradouro = cliente_end_logradouro;
	}

	public String getCliente_end_numero() {
		return cliente_end_numero;
	}

	public void setCliente_end_numero(String cliente_end_numero) {
		this.cliente_end_numero = cliente_end_numero;
	}

	public String getCliente_end_bairro() {
		return cliente_end_bairro;
	}

	public void setCliente_end_bairro(String cliente_end_bairro) {
		this.cliente_end_bairro = cliente_end_bairro;
	}

	public String getCliente_end_complemento() {
		return cliente_end_complemento;
	}

	public void setCliente_end_complemento(String cliente_end_complemento) {
		this.cliente_end_complemento = cliente_end_complemento;
	}

	public String getCliente_end_cidade() {
		return cliente_end_cidade;
	}

	public void setCliente_end_cidade(String cliente_end_cidade) {
		this.cliente_end_cidade = cliente_end_cidade;
	}

	public String getCliente_end_estado() {
		return cliente_end_estado;
	}

	public void setCliente_end_estado(String cliente_end_estado) {
		this.cliente_end_estado = cliente_end_estado;
	}

	public String getCliente_end_cep() {
		return cliente_end_cep;
	}

	public void setCliente_end_cep(String cliente_end_cep) {
		this.cliente_end_cep = cliente_end_cep;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

	public long getId() {
		return id;
	}

}
