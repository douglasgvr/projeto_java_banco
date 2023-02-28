
public class Main {

	public static void main(String[] args) {
		Cliente douglas = new Cliente();
		douglas.setNome("Douglas Coelho");
		
		IConta cc = new ContaCorrente(douglas);
		cc.depositar(200);
		
		IConta poupanca = new ContaPoupanca(douglas);
		
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

	}

}
