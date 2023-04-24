package ejercicio2;

public class Contador {
	/**
	 * 
	 */
	private int cont;

	
	/**
	 * 
	 */
	public Contador() {
		super();
		
	}


	/**
	 * 
	 * @param cont
	 */
	public Contador(int cont) {
		super();
		if (cont < 0) {
			this.cont = 0;
		} else {
			this.cont = cont;
		}
	}
	
	//Constructor copia
	
	/**
	 * 
	 * @param contador
	 */
	public Contador(Contador contador) {
		this.cont = contador.cont;
	
	}


	public int getCont() {
		return cont;
	}

	/**
	 * 
	 * @param cont
	 */
	public void setCont(int cont) {
		if(cont<0) {
			cont=0;
		}else {
			this.cont = cont;
		}
		
	}
	/**
	 * 
	 * @param hasta
	 */
	public void incrementar() {
		cont++;
	}

	/**
	 * Método que decrementará en uno al contador
	 */
	public void decrementar() {
		cont--;
		if (cont<=0) {
			cont=0;
		}
	}
	
	/**
	 * Método que mostrará en cuanto está el contador
	 */
	public String toString () {
		String result;
		result = "El contador está en "+ cont;
		return result;
	}
}
