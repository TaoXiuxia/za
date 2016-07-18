package sort;

public class SimpleSelectSortUtil {

	public static void simpleSelectSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int min = array[i];
			int n = i; // 最小数的索引
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < min) { // 找出最小的数
					min = array[j];
					n = j;
				}
			}
			array[n] = array[i];
			array[i] = min;
		}
	}
}
