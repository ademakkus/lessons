package tr.universite;

public class Bolum extends Fakulte {

	public Bolum() {

		System.out.println("B�l�m yarat�ld�");
		// TODO Auto-generated constructor stub
	}

	public String bolumAdi;

	@Override
	public void bolumAc() {
			System.out.println("B�l�m b�l�m acamaz error:404");
	}

	@Override
	public void sinavYap() {

		System.out.println("B�l�m s�nav yapt�");
	}

}
