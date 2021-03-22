
public abstract class Veicolo {
	
	private int freno;
	private int acceleratore;
	
	//costruttore
	
	public Veicolo(int freno, int acceleratore) {
		super();
		this.freno = freno;
		this.acceleratore = acceleratore;
	}



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

	@Override
	public String toString() {
		return "Veicolo = " + freno + " " + acceleratore;
	}
	
	public void Partenza() {
		
		if (freno == 0) {
			
			acceleratore++;
			
		}
	}
	
	
	

}

