package UninterAtividade02Exercicio03;

public class Principal {

	public static void main(String[] args) {
		
		// Premissa:
		
		Conta c1 = new Conta(001, "Rafael", 1000, 300);
		
		//informa��o antes das atividades:
		
		c1.info(); 
		
		
		
		c1.Retirada(200);
		c1.Depositar(500);
		
		// Informa��o depois das a��es:
		
		c1.info(); 
		
		
		Conta c2 = new Conta(002,"Poliska", 14000, 400);
		
		c2.info();
		
		c2.Depositar(7000);
		
		c2.info();
		
		// Transfer�ncia:
		
		c2.transferir(c1,200);
		
		c2.info();
		
		c1.info();
	}
	

}
