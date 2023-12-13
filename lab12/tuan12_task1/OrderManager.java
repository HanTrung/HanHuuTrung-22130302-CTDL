package tuan12_task1;

import java.util.Comparator;
import java.util.List;

public class OrderManager {
	private List<Order> orders;

	public OrderManager(List<Order> orders) {
		this.orders = orders;
	}
	public Product getMaxProduct() {
		Comparator<Product> cmp = Comparator.comparing(Product::getPrice);
		return this.orders.stream().flatMap(x->x.getItems().stream()).map(x->x.getItem()).max(cmp).get();
	}
	

}
