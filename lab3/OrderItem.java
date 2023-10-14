package tuan3;

public class OrderItem {
	public Product p;
	private int quatity;
	public OrderItem(Product p, int quality) {
		super();
		this.p = p;
		this.quatity = quality;
	}
	public Product getP() {
		return p;
	}
	public void setP(Product p) {
		this.p = p;
	}
	public int getQuality() {
		return quatity;
	}
	public void setQuality(int quality) {
		this.quatity = quality;
	}



}
