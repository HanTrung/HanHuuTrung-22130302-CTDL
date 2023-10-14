package tuan3;

import java.util.Arrays;

public class Order {
	private OrderItem[] items;

	public Order(OrderItem[] items) {
		super();
		this.items = items;
	}

	public double cost() {
		int totalCost = 0;
		for (OrderItem item : items) {
			totalCost += item.getQuality()* item.p.getPrice();
		}
		return totalCost;
	}

	
	public boolean contains(Product p) {
		Arrays.sort(items, (a, b) -> a.p.getId().compareTo(b.p.getId()));
		int index = binarySearchProduct(p, 0, items.length - 1);
		return index >= 0;
	}

	private int binarySearchProduct(Product p, int left, int right) {
		if (left <= right) {
			int mid = left + (right - left) / 2;
			int compareResult = p.getId().compareTo(items[mid].p.getId());

			if (compareResult == 0) {
				return mid; 
			} else if (compareResult < 0) {
				return binarySearchProduct(p, left, mid - 1);
			} else {
				return binarySearchProduct(p, mid + 1, right);
			}
		}
		return -1; 
	}



	public Product[] filter(String type) {
		int count = 0;
        for (OrderItem item : items) {
            if (item.p.getType().equals(type)) {
                count++;
            }
        }

        Product[] filteredProducts = new Product[count];
        int index = 0;
        for (OrderItem item : items) {
            if (item.p.getType().equals(type)) {
                filteredProducts[index] = item.p;
                index++;
            }
        }
        return filteredProducts;
    }
	public static void main(String[] args) {
 
        Product product1 = new Product("1", "Product A", 10.0, "Type 1");
        Product product2 = new Product("2", "Product B", 20.0, "Type 2");
        Product product3 = new Product("3", "Product C", 30.0, "Type 1");


        OrderItem item1 = new OrderItem(product1, 3);
        OrderItem item2 = new OrderItem(product2, 2);
        OrderItem item3 = new OrderItem(product3, 1);

 
        Order order = new Order(new OrderItem[] { item1, item2, item3 });

     
        double totalCost = order.cost();
        System.out.println("total cost: " + totalCost);

  
        Product searchProduct = new Product("4", "Product D", 20.0, "Type 2");
        boolean containsProduct = order.contains(searchProduct);
        System.out.println("product contain : " + containsProduct);

        
        Product[] filteredProducts = order.filter("Type 1");
        System.out.println("product 'Type 1':");
        for (Product product : filteredProducts) {
            System.out.println(product.getName());
        }
    }
	public boolean containsBubbleSort(Product p) {
		Arrays.sort(items, (a, b) -> a.p.getId().compareTo(b.p.getId()));
		int index = binarySearchProduct(p, 0, items.length - 1);
		return index >= 0;
	}
	private void bubbleSortItem() {
		for (int i = 0; i < items.length; i++) {
			for (int j = items.length - 1; j > i; j--) {
				if (items[j].p.getId().compareTo(items[j - 1].p.getId())>0) {
					 OrderItem t = items[j];
					items[j] = items[j - 1];
					items[j - 1] = t;
				}
			}
	

		}

	}public  void selectionSort() {
		for (int i = 0; i < items.length; i++) {
			int temp = i;
			for (int j = 1 + i; j < items.length - 1 - i; j++) {
				if (items[i].p.getId().compareTo(items[j].p.getId())>0)
					temp = j;
			}
			if (temp != i) {
				OrderItem t = items[temp];
				items[temp] = items[i];
				items[i] = t;

			}
		
		}
	}

	public void insertionSort() {
		for (int i = 1; i < items.length; i++) {
			OrderItem t = items[i];
			int j = i - 1;

			 while (j >= 0 && t.p.getId().compareTo(items[j].p.getId()) < 0) {
				items[j + 1] = items[j];
				j--;
			}
			items[j + 1] = t;


		}
	}

	private int binarySearchProductBubbleSort(Product p, int left, int right) {
		if (left <= right) {
			int mid = left + (right - left) / 2;
			int compareResult = p.getId().compareTo(items[mid].p.getId());

			if (compareResult == 0) {
				return mid; 
			} else if (compareResult < 0) {
				return binarySearchProduct(p, left, mid - 1);
			} else {
				return binarySearchProduct(p, mid + 1, right);
			}
		}
		return -1; 
	}
}


