package com.pojo;

public class ProductInfo {
    private int pId;
    private String pname;
    private int price;
    private int quantity;
    private String category;
    
    public ProductInfo() {
    	super();
		// TODO Auto-generated constructor stub
	}
    public ProductInfo(int pId,String pname, int price,int quantity,String category){
    	super();
    	this.pId = pId;
    	this.pname = pname;
    	this.price = price;
    	this.quantity = quantity;
    	this.category = category;
    }
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "ProductID: "+pId+" Product_Name: "+pname+" Price: "+price+" Quantity: "
    			+quantity+" Category: "+category;
    }
    
    
    
}
