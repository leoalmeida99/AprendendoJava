package aula;

public class TestaMetodo {

	public static void main(String[] args) {

		Conta contaExemplo = new Conta();
		contaExemplo.saldo = 100;
		System.out.println(contaExemplo.saldo);
		contaExemplo.deposita(200);
		System.out.println(contaExemplo.saldo);
		contaExemplo.deposita(200);
		System.out.println(contaExemplo.saldo);
		
		//contaExemplo.saca(400);
		
		
		Conta contaPaula = new Conta();
		contaPaula.deposita(2000);
		System.out.println("Saldo da paula: " + contaPaula.saldo);
		contaPaula.transfere(300, contaExemplo);
		
		System.out.println(contaExemplo.saldo);
		System.out.println(contaPaula.saldo);
		
		
		
	}

}
