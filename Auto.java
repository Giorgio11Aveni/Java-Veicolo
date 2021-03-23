
public class Auto extends Veicolo {

	private int frizione;
	private static final int MaxFrizione = 10;
	
	
	public Auto( int acceleratore, int freno, String marca, String modello, int frizione) {
		
		super(acceleratore, freno, marca, modello);
		this.frizione = frizione;
		
		
	}
	
	public int getFrizione() {
		return frizione;
	}

	public void setFrizione(int frizione) {
		this.frizione = frizione;
	}

	@Override
	public void Partenza() {
		if (this.getFreno() == 0) {
			int m = MaxFrizione;
			int a = super.getAcceleratore();
			System.out.println("Sto partendo \n");
			
			while (frizione != m & a != 10) {
				
				
				a++; 
				m--;
				System.out.println("Valore frizione" + " : " + m + "         Valore acceleratore" + " : " +a+ "            Valore freno:"+ this.getFreno());
			}
		}else{
			
			System.out.println("Il freno è abbassato");
		}
	}	
}
