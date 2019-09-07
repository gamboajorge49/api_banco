package com.jorge.banco.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bancos")
public class Banco {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String codigo;
	private String nome;
	private String cnpj;
	private String end_logradouro;
	private String end_numero;
	private String end_complemento;
	private String end_bairro;
	private String end_cep;
	private String end_cidade;
	private String end_estado;
	private Date data_cadastro;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
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

	public String getEnd_cep() {
		return end_cep;
	}

	public void setEnd_cep(String end_cep) {
		this.end_cep = end_cep;
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

	public Date getData_cadastro() {
		return data_cadastro;
	}

	public void setData_cadastro(Date data_cadastro) {
		this.data_cadastro = data_cadastro;
	}

}
