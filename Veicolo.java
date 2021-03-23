
public abstract class Veicolo {
	
	private int freno;
	private int acceleratore;
	private String marca;
	private String modello;
	
	/* Inizio costruttore */
	
	public Veicolo(int freno, int acceleratore, String marca, String modello) {
		super();
		this.freno = freno;
		this.acceleratore = acceleratore;
		this.marca = marca;
		this.modello = modello;
	}

	/* Fine Costruttore */
	
	/* Metodi getter e setter */
	
	public int getFreno() {
		return freno;
	}





	public void setFreno(int freno) {
		this.freno = freno;
	}





	public int getAcceleratore() {
		return acceleratore;
	}





	public void setAcceleratore(int acceleratore) {
		this.acceleratore = acceleratore;
	}





	public String getMarca() {
		return marca;
	}





	public void setMarca(String marca) {
		this.marca = marca;
	}





	public String getModello() {
		return modello;
	}





	public void setModello(String modello) {
		this.modello = modello;
	}


	/* Fine metodi getter e setter */

	
	/* Metodo per la partenza */
	
	public void Partenza() {
		
		if (freno == 0) {
			
			acceleratore++;
			
		}
	}
}

