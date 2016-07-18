package sort;

public class InsertSortingUtil {

	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		sort(a);
		for (int q : a) {
			System.out.println(q);
		}
	}

	/**
	 * 直接插入排序
	 * @param array
	 */
	public static void sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (array[j] > temp) {
					array[j + 1] = array[j];
				} else {
					break;
				}
			}
			array[j + 1] = temp;
		}
	}
}
