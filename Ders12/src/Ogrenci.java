
public class Ogrenci {
	
	
	public Ogrenci()
	{
		System.out.println("Constructor method cal�st�!");
	}
	
	public Ogrenci(String name)
	{
		new Ogrenci();
		System.out.println(name+" ��renci ad�");
	}
	
	{
		System.out.println("bosluk blok cal�st�");
	}
	
	static {
		System.out.println("static blok cal�st�");
	}

}
