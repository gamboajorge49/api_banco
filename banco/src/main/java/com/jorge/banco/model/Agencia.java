package com.jorge.banco.model;

import javax.persistence.*;

@Entity
@Table(name="agencias")
public class Agencia {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private long id_banco;
	private String codigo;
	private String nome;
	private String cnpj;
	private String gerente_nome;
	private String end_logradouro;
	private String end_numero;
	private String end_complemento;
	private String end_bairro;
	private String end_cidade;
	private String end_estado;
	private String end_cep;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getId_banco() {
		return id_banco;
	}

	public void setId_banco(long id_banco) {
		this.id_banco = id_banco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return codigo;
	}

	public void setNumero(String numero) {
		this.codigo = numero;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getGerente_nome() {
		return gerente_nome;
	}

	public void setGerente_nome(String gerente_nome) {
		this.gerente_nome = gerente_nome;
	}

	public String getEnd_logradouro() {
		return end_logradouro;
	}

	public void setEnd_logradouro(String end_logradouro) {
		this.end_logradouro = end_logradouro;
	}

	public String getEnd_numero() {
		return end_numero;
	}

	public void setEnd_numero(String end_numero) {
		this.end_numero = end_numero;
	}

	public String getEnd_complemento() {
		return end_complemento;
	}

	public void setEnd_complemento(String end_complemento) {
		this.end_complemento = end_complemento;
	}

	public String getEnd_bairro() {
		return end_bairro;
	}

	public void setEnd_bairro(String end_bairro) {
		this.end_bairro = end_bairro;
	}

	public String getEnd_cidade() {
		return end_cidade;
	}

	public void setEnd_cidade(String end_cidade) {
		this.end_cidade = end_cidade;
	}

	public String getEnd_estado() {
		return end_estado;
	}

	public void setEnd_estado(String end_estado) {
		this.end_estado = end_estado;
	}

	public String getEnd_cep() {
		return end_cep;
	}

	public void setEnd_cep(String end_cep) {
		this.end_cep = end_cep;
	}

}
