package tuan12_task1;

import java.sql.Date;

public class Product {
	private String name ;
	private String type;
	private int price;
	private Date experiredDate;
	public Product(String name, String type, int price, Date experiredDate) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.experiredDate = experiredDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getExperiredDate() {
		return experiredDate;
	}
	public void setExperiredDate(Date experiredDate) {
		this.experiredDate = experiredDate;
	}
	
	
}