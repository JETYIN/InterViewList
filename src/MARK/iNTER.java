package MARK;

public class iNTER {
	/** 将“123456”转换为123456，并将其变为654321 **/
	/** 静态代码块中的代码在java类没有实例化的时候就会开始执行 **/
	static {
		System.out.println("static");
	}
	int target =8;
	int arm=6;
	
	String ab[]=new String[2];
	String a[]=new String[]{"1","2"};
	int b[]=new int[]{1,2};
	int c[][]=new int[1][2];
	
	int d[][]={{1,2},{3,4}};
	//定义二维数组的三种方式s
	int e[][]=new int[2][];

	public static void main(String[] args) {
		show();
		System.out.println(parseInt("123456"));
	}

	/** 输出6543210 **/
	public static void show() {
		String s = "123456";
		int result = 0;

		for (int i = 0; i < s.length(); i++) {
			result = (int) (result + i * Math.pow(10, i));
		}

		System.out.println(result);

	}
/**输出结果为123456**/
	public static int parseInt(String s) {
		if (s == null || s.equals(""))
			throw new IllegalArgumentException("参数不能为null或空串！");

		int result = 0;
		for (int i = 0, len = s.length(); i < len; i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				result = result * 10 + (int) (c - '0');
			} else {
				throw new IllegalArgumentException("s中只能包含数字");
			}
		}

		return result;
	}
}
