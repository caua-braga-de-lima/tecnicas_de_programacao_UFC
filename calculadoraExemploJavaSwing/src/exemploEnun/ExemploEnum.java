package exemploEnun;

public class ExemploEnum {

	
	
	public void testarCarro(TipoCarros tipo) {
		
		if(TipoCarros.FUSCA == tipo ) {
			System.out.println("fusca");
		}else if(TipoCarros.UNO == tipo) {
			System.out.println("Uno");
		}else if(TipoCarros.GOL == tipo) {
			System.out.println("gol");
		}
	}
}
