package tr.com;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {


		Scanner sc=new Scanner(System.in);
		
		System.out.println("Kullanici Sayisini giriniz :");
		
		int kullaniciSayisi=sc.nextInt();
		
		Kullanici kullanicilar[]=new Kullanici[kullaniciSayisi];
		
		
		for(int i=0;i<kullaniciSayisi;i++)
		{
			Kullanici kullanici=new Kullanici();
			
			System.out.println("Kullan�c� ad� giriniz :");
			
			kullanici.setAdSoyad(sc.next());
			
			System.out.println("Kullan�c� Email giriniz :");
			
			kullanici.setEmail(sc.next());
			
			System.out.println("Kullan�c� Telefon giriniz :");
			
			kullanici.setTelefon(sc.next());
			
			System.out.println("Kullan�c� Adres giriniz :");
			
			kullanici.setAdres(sc.next());
			
	
			kullanicilar[i]=kullanici;
			
		}
		
		
		kullanicilar[0].etkinlikEkle();
		
		kullanicilar[0].etkinlikEkle();
		
		kullanicilar[0].etkinlikleriYazdir();
		
		
		

	}

}
