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