package knapsack;

import java.util.Scanner;

/**
 * 来源 http://blog.csdn.net/luojinping/article/details/6900788
 */
public class KnapsackRecursion {

	static int capacity ;
	static int num ;
	static int value[] ;
	static int cubage[] ;
	static int i=0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			capacity = scanner.nextInt();
			num = scanner.nextInt();
			cubage = new int[num];
			value = new int[num];
			for (int i = 0; i < num; i++) {
				cubage[i] = scanner.nextInt();
				value[i] = scanner.nextInt();
			}
			System.out.println(MaxValue(capacity,num-1));
		}
	}

	/**
	 * @param leftCapacity 剩余容量
	 * @param n n表示第n个是不是装入
	 * @return
	 */
	static int MaxValue(int leftCapacity, int n) {
		if (n < 0) {
			return 0;
		}
		int f = 0, b = 0;
		if (leftCapacity >= cubage[n]) {
			f = MaxValue(leftCapacity - cubage[n], n - 1) + value[n];  // 放第n个
		}
		b = MaxValue(leftCapacity, n - 1);  // 不放第n个
		return f > b ? f : b;
	}
}