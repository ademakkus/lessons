package tr.universite;

public class Fakulte extends Universite{
	
	public Fakulte() {
	
		System.out.println("Fak�lte yarat�ld�");
		// TODO Auto-generated constructor stub
	}
	
	public String fakulteAdi;
	
	/**
	 * 
	 * overload
	 */
	
	@Override
	public void bolumAc()
	{
		System.out.println("B�l�m ac�ld�.");
	}
	
	@Override
	public void sinavYap() {
		System.out.println("S�nav yap");
	}
	
	

}
