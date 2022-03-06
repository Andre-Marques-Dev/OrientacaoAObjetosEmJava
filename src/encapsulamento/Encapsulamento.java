package encapsulamento;

public class Encapsulamento {
	
	public static void main(String[] args) {
		
//		Cliente cliente = new Cliente() ;
//			
//			cliente.nome = "Alexandre Afonso";
//			cliente.telefone = "31993964002";
//			
//			System.out.println("Nome cliente: " + cliente.nome);
		
		Cliente cliente = new Cliente() ;
		
		cliente.setNome("Alexandre Afonso");
		cliente.setTelefone("34985645231");
		
		System.out.println("Nome cliente: " + cliente.getNome());
		System.out.println("Primeiro nome: " + cliente.getPrimeiroNome());
		System.out.println("Ultimo nome: " + cliente.getUltimoNome());
		
	}

}
