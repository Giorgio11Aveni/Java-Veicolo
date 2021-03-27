
public class TestVeicolo {

	public static void main(String args[]) {
		
		Auto auto1 = new Auto(0,0, "Fiat", "Panda", 0, "Folle");
		
		System.out.println("Auto: " + auto1.getMarca() + " " + auto1.getModello() + "\n");
		
		auto1.Partenza();
		
	}
}
