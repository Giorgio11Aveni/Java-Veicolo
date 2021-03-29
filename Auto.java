import java.util.*;
public class Auto {

	//DICHIARAZIONE COSTANTI
	
	private static final int MaxFrizione = 10;
	private static final int MaxAcceleratore = 10;
	private static final int MinFreno = 0;
	private static final int MinAcceleratore = 0;
	private static final int MinFrizione = 0;
	
	//DICHIARAZIONE VARIABILI
	
	private int frizione;
	private String marciaInnestata;
	private int freno;
	private int acceleratore;
	private String marca;
	private String modello;
	private  static  final  String marce [] = { "prima" , " seconda " , " terza " , " quarta " , " quinta " , " retromarcia " };
	private int n_marcia;
	//DICHIRARAZIONE MAPPA PER LE MARCE
	
	//TreeMap<Integer,String> marcia = new TreeMap<Integer,String>();
	
	//COSTRUTTORE
	
	public Auto( int acceleratore, int freno, String marca, String modello, int frizione, String marciaInnestasta) {
		
		this.acceleratore = acceleratore;
		this.freno = freno;
		this.frizione = frizione;
		this.marca = marca;
		this.modello = modello;
		/*this.marciaInnestata = marciaInnestata;
		this.marcia.put(0, "Folle");
		this.marcia.put(1, "Prima");
		this.marcia.put(2, "Seconda");
		this.marcia.put(3, "Terza");
		this.marcia.put(4, "Quarta");
		this.marcia.put(5, "Quinta");
		this.marcia.put(6, "Retromarcia");
		*/
	}
	
	
	
	
	public int getFrizione() {
		return frizione;
	}




	public void setFrizione(int frizione) {
		this.frizione = frizione;
	}




	public String getMarciaInnestata() {
		return marciaInnestata;
	}




	public void setMarciaInnestata(String marciaInnestata) {
		this.marciaInnestata = marciaInnestata;
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




	public void Ritardo(int rit){
        for(int i=0; i<rit; i++){
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException ex){
                Thread.currentThread().interrupt();
            }
        }
    }

	public void Partenza() {
		
		this.frizione = MaxFrizione;
		
		if (this.freno == MinFreno && this.frizione == MaxFrizione) {
			this.marciaInnestata = this.marce[0];


		}else{
			
			System.out.println("Il freno è abbassato oppure devi abbassare la frizione per inserire la marcia");
		}
	
		
		if (marciaInnestata == "prima") {
				
				
			System.out.println("Sto partendo... \n");
			
			while (acceleratore != 7) {
				
				this.acceleratore ++; 
				
				Ritardo(10);
				
				this.frizione --;
				
				System.out.println( "Valore frizione" + " : " + this.frizione + "         Valore acceleratore" + " : " +this.acceleratore+ "            Valore freno: "+ this.freno+"             Marcia Innestata: "+this.marciaInnestata );

				
				if (this.acceleratore == 7) {
				CambioMarce();
				}
			
		}
		
	}else{
		
		System.out.println("Non hai messo la marcia");
		
	}
}	
	

	public void CambioMarce() {
			
		
		this.frizione = MaxFrizione;
		this.acceleratore = MinAcceleratore;
		System.out.println("Valore frizione" + " : " + this.frizione + "         Valore acceleratore" + " : " +this.acceleratore+ "            Valore freno: "+ this.freno+"             Marcia Innestata: "+this.marciaInnestata   ); 
		
		
		 for(int i = 0; i<6; i++){
				if (n_marcia == i) {
					this.marciaInnestata = this.marce[i+1];
					this.n_marcia++;
					System.out.println("Cambio marcia... \n" + "Valore frizione" + " : " + this.frizione + "         Valore acceleratore" + " : " +this.acceleratore+ "            Valore freno: "+ this.freno+"             Marcia Innestata: "+this.marciaInnestata );
					Cammina();
					
			}else{
				
				//this.marciaInnestata = this.marce[i+1];
			}
				
				
				
			}
	}
		
	
	
	public int Cammina () {
		
		while (acceleratore != 7) {
			
			//this.frizione = MaxFrizione;
			
			this.acceleratore ++; 
			
			Ritardo(10);
			
			this.frizione --;
			
			System.out.println("Valore frizione" + " : " + this.frizione + "         Valore acceleratore: " +this.acceleratore+ "            Valore freno: "+ this.freno+"             Marcia Innestata: "+this.marciaInnestata );
		
			
			if (this.acceleratore == 7) {
				
				CambioMarce();
				//this.n_marcia++;
				
			System.out.println("Valore frizione" + " : " + this.frizione + "         Valore acceleratore: " +this.acceleratore+ "            Valore freno: "+ this.freno+"             Marcia Innestata: "+this.marciaInnestata );
			
			
			
			}else{
		
		
	} 
	}
		return n_marcia;
}
}




