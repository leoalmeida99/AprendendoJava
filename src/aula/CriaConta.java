package aula;

public class CriaConta {

	public static void main(String[] args) {
	
		System.out.println("Criando a primeira conta!");
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		primeiraConta.agencia = 14;
		primeiraConta.numero = 1536;
		primeiraConta.titular = "Leonardo Lindao Gostoso";
		
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 200;
		
		
		System.out.println(primeiraConta.saldo + segundaConta.saldo);
		System.out.println(segundaConta.titular);
		System.out.println(segundaConta.numero);
	}

}
