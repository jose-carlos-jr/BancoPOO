package Principal;

import java.util.Date;

import Banco.*;

public class Principal {

	public static void main(String[] args) {
		String nome = "Jose";
		String cpf = "123123123";
		String endereco = "rua sao joao";
		String telefone = "99175-3333";
		int numero = 160;
		String enderecoA = "rua teodorio chagas ";
		String telefoneA = "99683-9309";
		Date nascimento = new Date();

		Cliente cliente1 = new Cliente (nome, cpf, endereco, telefone, nascimento);
		
		Agencia agencia1 = new Agencia(numero, enderecoA, telefoneA);
		System.out.println("Agencia: " + agencia1.getNumero() + " Rua: " + agencia1.getEndereco() + " Telefone: " + agencia1.getTelefone());
		
		Conta conta1 = new Conta(cliente1, 1);
		System.out.println("Saldo da conta 1: " + conta1.verSaldo());

		Cliente cliente2 = new Cliente(nome, cpf, endereco, telefone, nascimento);
		Conta conta2 = new Conta(cliente2, 2);
		System.out.println("Saldo da conta 2: " + conta2.verSaldo());

		// Modo de deposito
		if (conta1.deposito(100)) {
			System.out.println("Deposito efetuado com sucesso, novo saldo da conta 1: " + conta1.verSaldo());
		}

		// Modo de saque
		if (conta1.saque(50)) {
			System.out.println("Saque efetuado com sucesso, novo saldo conta 1: " + conta1.verSaldo());
		}
		System.out.println("Saldo da conta 1: " + conta1.verSaldo());
	}


}