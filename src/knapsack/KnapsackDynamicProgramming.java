package knapsack;

import java.util.Scanner;

/**
 * 背包问题的动态规划实现，
 * @author TaoXX
 *
 */
public class KnapsackDynamicProgramming {

	public static void main(String[] args) {
		test();
	}
	
	/**
	 * 从控制台输入数据，数据格式为:
	 * 第一行 背包容量capacity 物品数量num 第二行至第N+1行 物品体积cubage 物品价值value
	 * 
	 * 输出能够装入背包的物品的最大价值
	 */
	public static void test() {
		Scanner scanner = new Scanner(System.in);
		while (scanner.hasNext()) {
			int capacity = scanner.nextInt();
			int num = scanner.nextInt();
			int[] cubage = new int[num];
			int[] value = new int[num];
			for (int i = 0; i < num; i++) {
				cubage[i] = scanner.nextInt();
				value[i] = scanner.nextInt();
			}
			System.out.println(knapsackProblem(capacity, num, cubage, value));
		}
	}
	
	/**
	 * 
	 * @param capacity 背包容量
	 * @param num  物品数目
	 * @param cubage 每件物品的体积
	 * @param value  每件物品的价值
	 * @return  
	 */
	public static int knapsackProblem(int capacity, int num, int[] cubage, int[] value) {
		int[][] totleValues = new int[num + 1][capacity + 1];
		for (int i = 1; i < num + 1; i++) {
			for (int j = 1; j < capacity + 1; j++) {
				if (cubage[i - 1] > j) {
					totleValues[i][j] = totleValues[i-1][j];
				}else{
					totleValues[i][j] = Math.max(totleValues[i - 1][j], totleValues[i - 1][j - cubage[i - 1]] + value[i - 1]);
				}
			}
		}
		return totleValues[num][capacity];
	}
}
