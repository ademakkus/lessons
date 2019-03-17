package tr.galeri.controller;

import java.util.Scanner;

import tr.galeri.model.Galeri;
import tr.galeri.model.Kullanici;
import tr.galeri.model.Musteri;
import tr.galeri.service.Data;
import tr.galeri.service.MusteriService;

public class Test {
	
	public static int musteriIndex=0;
	
	public static int galeriIndex=0;

	public static void main(String[] args) {
		
		MusteriService musteriService=new MusteriService();
		
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
		
		System.out.println("1 :M��teri Kay�t");
		System.out.println("2 :Galeri Kay�t");
		System.out.println("3 :Kullan�c� Giri�i");
		
		int secim=sc.nextInt();
		
		switch (secim) {
		case 1:musteriKayit(musteriService);break;
		case 2:galeriKayit();break;
		case 3:kullaniciGiris();break;

		default:
			break;
		}
		
		}
	
		
		

	}

	private static void kullaniciGiris() {
		// TODO Auto-generated method stub
		
	}

	private static void galeriKayit() {
		// TODO Auto-generated method stub
		
	}

	private static void musteriKayit(MusteriService musteriService) {


		Musteri musteri =new Musteri();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("M��teri Ad� :");
		
		musteri.setAdSoyad(sc.next());
		
		System.out.println("M��teri Adres :");
		
		musteri.setAdres(sc.next());
		
		musteri.setTelefon("1254654");
		
		System.out.println("Kullan�c� Ad� Giriniz :");
		
		Kullanici kullanici=new Kullanici();
		
		kullanici.setKullaniciAdi(sc.next());
		
		System.out.println("�ifre Giriniz :");
		
		kullanici.setSifre(sc.next());
		
		musteri.setKullanici(kullanici);
		
		musteriService.musteriEkle(musteri);
	
		
	
		
	}

}
