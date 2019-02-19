package com.bedirhansaglam.yazilim.object;
import javax.persistence.*;

@Entity
@Table(name="yonetici")
public class Yonetici {

	@Id @GeneratedValue
	@Column(name="adminID")
	private int adminID;
	@Column(name="ad")
	private String ad;
	@Column(name="soyad")
	private String soyad;
	@Column(name="email")
	private String email;
	@Column(name="sifre")
	private String sifre;
	@Column(name="sistemegiris")
	private String sistemegiris;
	public int getAdminID() {
		return adminID;
	}
	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	public String getSoyad() {
		return soyad;
	}
	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSifre() {
		return sifre;
	}
	public void setSifre(String sifre) {
		this.sifre = sifre;
	}
	public String getSistemegiris() {
		return sistemegiris;
	}
	public void setSistemegiris(String sistemegiris) {
		this.sistemegiris = sistemegiris;
	}
	

	
	
}
