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
		
		contaExemplo.saca(400);
		System.out.println(contaExemplo.saldo);
		
		
	}

}
