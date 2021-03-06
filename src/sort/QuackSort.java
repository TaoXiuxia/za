package sort;

public class QuackSort {

	public static void main(String[] args) {
	}

	private static void quick(int[] a) {
		if (a.length > 0) {
			quickSort(a, 0, a.length - 1);
		}
	}

	private static void quickSort(int[] a, int low, int high) {
		if (low < high) { // 如果不加这个判断递归会无法退出导致堆栈溢出异常
			int middle = getMiddle(a, low, high);
			quickSort(a, 0, middle - 1);
			quickSort(a, middle + 1, high);
		}
	}

	private static int getMiddle(int[] a, int low, int high) {
		int temp = a[low];// 基准元素
		while (low < high) {
			// 找到比基准元素小的元素位置
			while (low < high && a[high] >= temp) {
				high--;
			}
			a[low] = a[high];
			while (low < high && a[low] <= temp) {
				low++;
			}
			a[high] = a[low];
		}
		a[low] = temp;
		return low;
	}
}
