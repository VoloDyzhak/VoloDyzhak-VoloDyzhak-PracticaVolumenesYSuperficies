package Clases;

public class Cubo {
	private int lado ;
	
	/**
	 * 
	 * @param lado
	 * constructor
	 */
	public Cubo(int lado) {
	      /**
	       * exepcion 
	       */
		if(lado <=0) {
			throw new IllegalArgumentException("no puede ser menpor a 0");
		}
		
		this.lado = lado;
	}

	/**
	 * Metodo que calcula la superfivcie
	 * @return  
	 */
	public int superficie(){
		
		return (lado * lado)*6; 
				
		}
	/**
	 * metodo qu calcula el volumen
	 * @return 
	 */
		
public int Volumen(){
		
		return lado * lado* lado;
				
		}

}
