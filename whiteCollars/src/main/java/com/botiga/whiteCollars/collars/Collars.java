package com.botiga.whiteCollars.collars;

import java.util.Date;

public class Collars {
	
	private String collarName;
	private String collarAuthor;
	private float collarPrice;
	private Date collarEntryDate;
	
	public Collars() {
		
	}

	public Collars(String collarName, String collarAuthor, float collarPrice, Date collarEntryDate) {
		super();
		this.collarName = collarName;
		this.collarAuthor = collarAuthor;
		this.collarPrice = collarPrice;
		this.collarEntryDate = collarEntryDate;
	}

	public Collars(String collarName, float collarPrice, Date collarEntryDate) {
		super();
		this.collarName = collarName;
		this.collarAuthor = "Anonimous";
		this.collarPrice = collarPrice;
		this.collarEntryDate = collarEntryDate;
		
	}

	public String getCollarName() {
		return collarName;
	}

	public void setCollarName(String collarName) {
		this.collarName = collarName;
	}

	public String getCollarAuthor() {
		return collarAuthor;
	}

	public void setCollarAuthor(String collarAuthor) {
		this.collarAuthor = collarAuthor;
	}

	public float getCollarPrice() {
		return collarPrice;
	}

	public void setCollarPrice(float collarPrice) {
		this.collarPrice = collarPrice;
	}

	public Date getCollarEntryDate() {
		return collarEntryDate;
	}

	public void setCollarEntryDate(Date collarEntryDate) {
		this.collarEntryDate = collarEntryDate;
	}
	
	
	
	

}
