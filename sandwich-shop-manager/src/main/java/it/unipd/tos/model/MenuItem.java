package it.unipd.tos.model;

public class MenuItem {
	
	private ItemType type;
	private String name;
	private double price;
	
	public enum ItemType{
		Panini, Fritti, Bevande;
	}
	
	public MenuItem(ItemType t, String n, double p) {
		type=t;
		name=n;
		price=p;
	}

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price<0) {
			this.price=0;
		}else {
			this.price = price;
		}
		
	}
	
	
}
