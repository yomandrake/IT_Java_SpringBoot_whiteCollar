package com.botiga.whiteCollars.Pictures;

import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.botiga.whiteCollars.shops.Shop;

@Entity
public class Picture {
	
	@Id
	private String pictureName;
	private String pictureAuthor;
	private float picturePrice;
	private LocalDate pictureEntryDate;
	
	@ManyToOne
	private Shop shop;//Foreign key
	
	public Picture() {
		
	}
	
	public Picture(String pictureName, String pictureAuthor, float picturePrice) {
		super();
		this.pictureName = pictureName;
		this.pictureAuthor = pictureAuthor;
		this.picturePrice = picturePrice;
		this.pictureEntryDate = LocalDate.now();//Autocomplete
		this.shop = new Shop ("",0);
		
	}


	public String getPictureName() {
		return pictureName;
	}


	public void setPictureName(String pictureName) {
		this.pictureName = pictureName;
	}


	public String getPictureAuthor() {
		return pictureAuthor;
	}


	public void setPictureAuthor(String pictureAuthor) {
		this.pictureAuthor = pictureAuthor;
	}


	public float getPicturePrice() {
		return picturePrice;
	}


	public void setPicturePrice(float picturePrice) {
		this.picturePrice = picturePrice;
	}


	public LocalDate getPictureEntryDate() {
		return pictureEntryDate;
	}


	public void setPictureEntryDate(LocalDate pictureEntryDate) {
		this.pictureEntryDate = pictureEntryDate;
	}

	public Shop getShop() {
		return shop;
	}


	public void setShop(Shop shop) {
		this.shop = shop;		
	}


}
