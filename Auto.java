
public class Auto extends Veicolo {

	private int frizione;
	private static final int MaxFrizione = 10;
	
	public Auto( int acceleratore, int freno, int frizione) {
		
		super(acceleratore, freno);
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
			System.out.println("Sto partendo");
			
			while (frizione != m & a != 10) {
				
				
				a++; 
				m--;
				System.out.println("Valore frizione" + " : " + m + "         Valore acceleratore" + " : " +a+ "            Valore freno:"+ this.getFreno());
			}
		}else{
			
			System.out.println("Il freno è abbassato");
		}
	}

	@Override
	public String toString() {
		return super.toString() + " " + frizione + " " + MaxFrizione ;
	}
}
