package UninterAtividade02Exercicio03;

public class Conta {
	
	int numero;
	String titular;
	double saldo; 
	double limite;
	//double valor;
	
	
	
	
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
	
	void Retirada (double valor) {
		
		if(limite >= valor || saldo >= valor) {
			
			System.out.println("Saque permitido.");
			System.out.println("Saque Realizado de " + valor);
			saldo -= valor;
			System.out.println();
			
			
		
		}else {
			
			System.out.println("Saque Negado !");
			System.out.println("Saldo ou Limite insuficiente.");
			System.out.println();
			
		}
		
	}
	
	void info() {
		
		System.out.println("Titular: " + titular);
		System.out.println("Número da Conta: " + numero);
		System.out.println("Saldo: " + saldo);
		System.out.println("Limite: " + limite);
		System.out.println();
	}

}
