package simple_knapsack;


//简单背包问题-递归实现-
//将不同重量的数据项放入背包中，以使背包的最后
//-----------达到指定的总重量-------------
public class Pairing {
	private int weight = 20;                    // 背包承受的重量
	private int target;
	private int[] items = { 11, 8, 7, 6, 5 };// 可选的总量数据项
	private int size;                         // 可选物体的数目
	private int j = 0;

	// ------------構造函數----------------
	public Pairing() {
		this.size = items.length;
	}

	// -------------主程序----------------
	public String pairing() {
		target = weight;
		String result = "";
		for (int i = j; i < size; i++) {

			if (target > items[i]) {          // 目標重量大与选择数据项
				result = result + " " + String.valueOf(items[i]);
				System.out.println(result + " --target is " + target + "--"
						+ items[i] + " is too small");

				target = target - items[i];

			} else if (target < items[i]) {    // 目标总量小于选择的数据项
				System.out.println(result + " --target is " + target + "--"
						+ items[i] + " is too big");

			} else {                           // 目标重量等于选择的数据项
				result = result + " " + String.valueOf(items[i]);
				System.err.println(result + " --target is " + target + "--"
						+ items[i] + " is success");
				return "success";
			}

		}
		// 当以items[j]为首个匹配项的匹配不存在是，递归处理从j+1到size范围内的数
		j = j + 1;
		pairing();
		// 没有恰好等于目标的匹配组合
		return "fail";

	}//end pairing

}//end 
