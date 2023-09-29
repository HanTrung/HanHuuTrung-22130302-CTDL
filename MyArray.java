package tuan1;

import java.util.ArrayList;

public class MyArray {
	private int[] array;

	public MyArray(int[] array) {
		this.array = array;
	}

	public int[] mirror() {
		int[] copyArray = new int[array.length * 2];
		for (int i = 0; i < array.length; i++) {
			copyArray[i] = array[i];
			copyArray[copyArray.length - i - 1] = array[i];
		}
		/*
		 * for (int i = (copyArray.length - 1); i >= copyArray.length / 2; i--) {
		 * copyArray[i] = array[copyArray.length - i - 1]; }
		 */
		return copyArray;
	}

	public int[] removeDuplicates() {
		ArrayList<Integer> myArrayList = new ArrayList<Integer>();
		int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = array[i];
		}
		for (int i = 0; i < array.length; i++) {
			int check = 0;
			for (int x = 0; x <= i; x++) {
				if (result[i] == result[x]) {
					check += 1;
				}
				if (check == 2) {
					result[i] = 0;
					check = 0;
				}

			}
		}
		for (int i = 0; i < result.length; i++) {
			if (result[i] != 0) {
				myArrayList.add(result[i]);
			}
		}
		int[] last = new int[myArrayList.size()];
		for (int i = 0; i < myArrayList.size(); i++) {
			last[i] = myArrayList.get(i);
		}
		return last;
	}

	public int[] getMissingValues() {
		ArrayList<Integer> missArrayList = new ArrayList<Integer>();

		int maxVa = array[0];
		int minVa = array[0];
		for (int i : array) {
			if (i < minVa) {
				minVa = i;
			}
			if (i > maxVa) {
				maxVa = i;
			}

		}
		for (int i = minVa; i <= maxVa; i++) {
			boolean check = false;

			for (int x : array) {
				if (x == i) {
					check = true;
					break;
				}
			}
			if (!check) {
				missArrayList.add(i);
			}
		}

		int[] last = new int[missArrayList.size()];
		for (int i = 0; i < (missArrayList.size()); i++) {
			last[i] = missArrayList.get(i);
		}
		return last;
	}
	public int[] fillMissValue(int k) {
		int len= array.length;
		for(int i=0; i<len;i++) {
			if(array[i]==(-1)&&k==2) {
				array[i]=(array[i-1]+array[i+1])/2;
			}
			if(array[i]==-1&&k==3) {
				int r1=(array[i-2]+array[i-1]+array[i+1])/3;
				int r2=(array[i+2]+array[i-1]+array[i+1])/3;
				if (r1<r2) {
					array[i]=r1;
				}else {
					array[i]=r2;
				}
			}
		}return array;
	}

	public static void main(String[] args) {
		
		int[] chuoi = { 1, 2, 3 };
		int[] chuoi1 = { 1, 3, 5, 1, 3, 7, 9, 8 };
		MyArray myArrray = new MyArray(chuoi);
		MyArray myArrray1 = new MyArray(chuoi1);
		int[] xuatChuoi = myArrray.mirror();
		int[] xuatChuoi1 = myArrray1.removeDuplicates();
		for (int i = 0; i < xuatChuoi.length; i++) {
			System.out.println(xuatChuoi[i] + " ");
		}
		for (int i = 0; i < xuatChuoi1.length; i++) {
			System.out.println(xuatChuoi1[i] + " ");
		}

		int[] chuoi2 = { 10, 11, 12, 13, 14, 16, 17, 19, 20 };
		MyArray myArrray2 = new MyArray(chuoi2);
		int[] xuatChuoi2 = myArrray2.getMissingValues();
		for (int i = 0; i < xuatChuoi2.length; i++) {
			System.out.println(xuatChuoi2[i] + " ");

		}
		int[] chuoi3 = { 10, 11, -1, 13, 14, 16, 17, 19, 20 };
		MyArray myArrray3 = new MyArray(chuoi3);
		int[] xuatChuoi3 = myArrray3.fillMissValue(3);
		for (int i = 0; i < xuatChuoi3.length; i++) {
			System.out.println(xuatChuoi3[i] + " ");

		}
	}
}
