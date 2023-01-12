package aula;

public class CriaConta {

	public static void main(String[] args) {

		System.out.println("Criando a primeira conta!\n\n");

		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.agencia = 14;
		primeiraConta.numero = 1536;
		primeiraConta.titular = "Leonardo Lindao Gostoso";

		Conta segundaConta = new Conta();
		segundaConta.saldo = 355;
		segundaConta.agencia = 199;
		segundaConta.numero = 1230;
		//segundaConta.titular = "Aleatorio";

		
		System.out.println("Titular: " + primeiraConta.titular);
		System.out.println("Saldo: " + primeiraConta.saldo);
		System.out.println("Agencia: " + primeiraConta.agencia);
		System.out.println("Numero: " + primeiraConta.numero);
		System.out.println("Endereço: " + primeiraConta + "\n");

		System.out.println("Titular: " + segundaConta.titular);
		System.out.println("Saldo: " + segundaConta.saldo);
		System.out.println("Agencia: " + segundaConta.agencia);
		System.out.println("Numero: " + segundaConta.numero);
		System.out.println("Endereço: " + segundaConta + "\n");

		
		
	}

}
