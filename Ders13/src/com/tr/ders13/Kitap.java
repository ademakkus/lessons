package com.tr.ders13;

public class Kitap {

	public String kitapAdi;

	public int fiyati;

	public String yazar;

	public String ISBNNO;

	public void kitapAdiYazdir() {
		System.out.println(this.kitapAdi);
	}
	
	public Kitap() {

		System.out.println("Kitap Nesnesi Olusturuldu....");
	
	}
	
	public Kitap(String kitapAd�) {

		this.kitapAdi=kitapAd�;
		System.out.println("Kitap Nesnesi Olusturuldu....");
	
	}

}
