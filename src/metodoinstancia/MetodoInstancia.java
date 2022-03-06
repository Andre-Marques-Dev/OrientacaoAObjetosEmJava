package metodoinstancia;

public class MetodoInstancia {
	
	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.primeiroNome = "Alexandre";
		cliente.ultimoNome = "Afonso";
		cliente.telefone = "031973319381";
		cliente.email = "andremig.brasil@gmail.com";
		
		Cliente cliente2 = new Cliente();
		cliente2.primeiroNome = "João";
		cliente2.ultimoNome = "Alberto";
		cliente2.telefone = "031985949103";
		
		System.out.println("Nome cliente: " + cliente.obterNomeCompleto() + " DDD: " + cliente.obterDDD());
		System.out.println("Nome cliente: " + cliente2.obterNomeCompleto() + " DDD: " + cliente2.obterDDD());
	}
	
//	static String obterNomeCompletoCliente(Cliente cliente) {
//		String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
//		
//		return nomeCompleto;
//	}
			

}
