
public class Main {

	public static void main(String[] args) {

		
		Carro meuCarro = new Carro();
		Carro segundoCarro= new Carro(30);
		Carro terceiroCarro = new Carro(50, 56);
		
		
		meuCarro.velocidade=0;
		System.out.println(meuCarro.velocidadeAtual()); 
		
		meuCarro.up(200);
		System.out.println(meuCarro.velocidadeAtual()); 
		
		meuCarro.down(50);
		System.out.println(meuCarro.velocidadeAtual()); 
		
		
		segundoCarro.velocidade=0;
		System.out.println(segundoCarro.velocidadeAtual()); 
		
		segundoCarro.up(200);
		System.out.println(segundoCarro.velocidadeAtual()); 
		
		segundoCarro.down(50);
		System.out.println(segundoCarro.velocidadeAtual()); 
		System.out.println("id: " +segundoCarro.id);
		
		
//		meuCarro.id= 20;
//		meuCarro.nome= "Meu carro";
//		meuCarro.placa= "AAA-7878";
//		
//		System.out.println(meuCarro.nomeCarro());
//		
//		segundoCarro.id=30;
//		segundoCarro.placa= "EEE-4545";
//		segundoCarro.nome= "Calma";
//		
//		System.out.println(segundoCarro.nomeCarro());
//		
//		
//		System.out.println("id: " + meuCarro.id + " nome: "+ meuCarro.nome);
//		System.out.println("id: "+ segundoCarro.id + "nome: "+ segundoCarro.nome);
		
	}

}
