package com.bedirhansaglam.yazilim.islemler;

public class ButunIslemler {
	
	
	public String tarihCevir(String tarih)
	{ //ddMMuyyyy hh:mm:ss format�nda gelen tarih t�rk�e �ekle d�n��t�r�l�yor. dd-G�n, MM-ay, u-Haftan�n ka��nc� g�n� ,yyyy y�l� ,hh:mm:ss saat:dakika:saniye bi�iminde tarihi temsil eder
		String turkceTarih="";
		String[] gunler= {"Pazartesi","Sal�","�ar�amba","Per�embe","Cuma","Cumartesi","Pazar"};
		String[] aylar= {"Ocak","�ubat","Mart","Nisan","May�s","Haziran","Temmuz","A�ustos","Eyl�l","Ekim","Kas�m","Aral�k"};
		int ay=Integer.parseInt(tarih.substring(2,4))-1;
		int gun=Integer.parseInt(tarih.substring(4,5))-1;
		turkceTarih+=tarih.substring(0,2)+" "+aylar[ay]+" "+tarih.substring(5,9) +" "+gunler[gun]+" Saat "+tarih.substring(10);
		return turkceTarih;
	}

}
