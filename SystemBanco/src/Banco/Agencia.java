package Banco;

public class Agencia {
	private int numero;
	int contas;
	String endereco;
	String telefone;
	
	public Agencia(int numero, int contas, String endereco, String telefone) {
		this.numero = numero;
		this.contas = contas;
		this.endereco = endereco;
		this.telefone = telefone;
	}

public Agencia(int numero2, String enderecoA, String telefoneA) {
		// TODO Auto-generated constructor stub
	}

	//get e set gerado automaticamente
	public int getNumero() {
		return numero;
	}

	public int getContas() {
		return contas;
	}

	public void setContas(int contas) {
		this.contas = contas;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}