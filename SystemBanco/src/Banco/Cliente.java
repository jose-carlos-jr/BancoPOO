package Banco;

import java.util.Date;

public class Cliente {
	String nome;
	String cpf;
	Date nascimento;
	String endereco;
	String telefene;
	int agencia;
	int conta;

	public Cliente(String nome, String cpf, Date nascimento, String endereco, 
			String telefone, int agencia, int conta) {
		this.nome = nome;
		this.cpf = cpf;
		this.nascimento = nascimento;
		this.endereco = endereco;
		this.telefene = telefone;
		this.agencia = agencia;
		this.conta = conta;
	}
	
	public Cliente(String nome2, String cpf2, String endereco2, String telefone, Date nascimento2) {
		// TODO Auto-generated constructor stub
	}

	public int vincularAgencia () {
		return agencia;
	}
	public int vincularConta () {
		return conta;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	public Date getNascimento() {
		return nascimento;
	}
	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	public String getTelefene() {
		return telefene;
	}
	public void setTelefene(String telefene) {
		this.telefene = telefene;
	}
}