package tuan12_task1;

public class OrderItem {
	private int amout;
	private Product item;
	public OrderItem(int amout, Product item) {
		this.amout = amout;
		this.item = item;
	}
	public int getAmout() {
		return amout;
	}
	public void setAmout(int amout) {
		this.amout = amout;
	}
	public Product getItem() {
		return item;
	}
	public void setItem(Product item) {
		this.item = item;
	}
	
	

}
