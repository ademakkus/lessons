package com.tr.game;

public class Oyuncu {

	public String oyuncuAdi;

	private int x;

	private int y;

	private int toplamPuan;

	/**
	 * Bu oyuncunun constructor methodunu tan�mlar Islev� yen� nesne uret�m� �le
	 * b�rl�kte oyuncuad� x y degerle� atan�r
	 * 
	 * @param oyuncuAdi
	 * @param x
	 * @param y
	 */
	public Oyuncu(String oyuncuAdi, int x, int y) {

		this.oyuncuAdi = oyuncuAdi;
		this.x = x;
		this.y = y;

	}

	public int getX() {
		return this.x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return this.y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getToplamPuan() {
		return this.toplamPuan;
	}

	public void setToplamPuan(int toplamPuan) {
		this.toplamPuan = toplamPuan;
	}

	public void puanEkle(int puan) {
		this.toplamPuan += puan;
	}

	public void hareketEt(char hareketYonu, int satir, int sutun) {

		if (hareketYonu == 'b') {

			if (this.y != 0) {
				setY(getY() - 1);
			} else {
				System.out.println("Hareket Edemezsiniz Yerinizde kald�n�z!");
			}

		} else if (hareketYonu == 'g') {
			if (this.x != satir) {
				setX(getX() + 1);
			} else {
				System.out.println("Hareket Edemezsiniz Yerinizde kald�n�z!");
			}
		} else if (hareketYonu == 'k') {
			if (this.x != 0) {
				setX(getX() - 1);
			} else {
				System.out.println("Hareket Edemezsiniz Yerinizde kald�n�z!");
			}
		} else if (hareketYonu == 'd') {
			if (this.y != sutun) {
				setY(getY() + 1);
			} else {
				System.out.println("Hareket Edemezsiniz Yerinizde kald�n�z!");

			}
		}
		else
		{
			System.out.println("Yanl�� y�n girdiniz!");

		}

	}

}
