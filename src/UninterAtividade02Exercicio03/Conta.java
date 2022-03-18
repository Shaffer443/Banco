package UninterAtividade02Exercicio03;

public class Conta {
	
	private static final String c2 = null;
	int numero;
	String titular;
	double saldo; 
	double limite;
	//double debito;
	//double credito;
	//Conta c1;
	//Conta c2;
	
	
	
	
	public Conta(int numero, String titular, double saldo, double limite) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limite = limite;
		
	}

	public double Depositar (double valor) {
		
		return saldo += valor;
		
		
	}
	
	
	
	public double Retirada (double valor) {
		
		if(limite >= valor || saldo >= valor) {
			
			System.out.println("Saque permitido.");
			System.out.println("Saque Realizado de " + valor);
			System.out.println();
			
			//return saldo -= valor;
		
		}else {
			
			System.out.println("Saque Negado !");
			System.out.println("Saldo ou Limite insuficiente.");
			System.out.println();
			
		}
		
		return saldo -= valor;
		
	}
	
	
	
		
	void info() {
		
		System.out.println("Titular: " + titular);
		System.out.println("Número da Conta: " + numero);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
		System.out.println();
	}
	
	// Transferência: Não funcionando
	
	void transferir (Conta outra, double valor) {
		
		saldo-=valor;
		outra.saldo += valor;
		
		
	}

}
