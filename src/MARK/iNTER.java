package MARK;

public class iNTER {
	/** ����123456��ת��Ϊ123456���������Ϊ654321 **/
	/** ��̬������еĴ�����java��û��ʵ������ʱ��ͻῪʼִ�� **/
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
	//�����ά��������ַ�ʽs
	int e[][]=new int[2][];

	public static void main(String[] args) {
		show();
		System.out.println(parseInt("123456"));
	}

	/** ���6543210 **/
	public static void show() {
		String s = "123456";
		int result = 0;

		for (int i = 0; i < s.length(); i++) {
			result = (int) (result + i * Math.pow(10, i));
		}

		System.out.println(result);

	}
/**������Ϊ123456**/
	public static int parseInt(String s) {
		if (s == null || s.equals(""))
			throw new IllegalArgumentException("��������Ϊnull��մ���");

		int result = 0;
		for (int i = 0, len = s.length(); i < len; i++) {
			char c = s.charAt(i);
			if (c >= '0' && c <= '9') {
				result = result * 10 + (int) (c - '0');
			} else {
				throw new IllegalArgumentException("s��ֻ�ܰ�������");
			}
		}

		return result;
	}
}
