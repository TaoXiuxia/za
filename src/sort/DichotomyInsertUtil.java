package sort;

public class DichotomyInsertUtil {

	public static void sort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int temp = array[i];
			int left = 0;
			int right = i - 1;
			int mid = 0;
			while (left <= right) {
				mid = (left + right) / 2;
				if (temp < array[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			for (int j = i - 1; j >= left; j--) {
				array[j + 1] = array[j];
			}
			array[left] = temp;
		}
	}

	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 176, 213, 227, 49, 78, 34, 12, 164, 11, 18, 1 };
		sort(a);
		for(int q:a){
			System.out.println(q);
		}
	}
}
