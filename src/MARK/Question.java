package MARK;

public class Question {
	public static void main(String[] args) {
		String targetStr = "123456";
		String str="";
		showResult(targetStr);

	}
//在不使用任何api使string转化为int，并且让其位置颠倒
	public static void showResult(String targetStr) {
		if (targetStr == null || targetStr.equals("")) {
			throw new IllegalArgumentException("输入字符串错误");
		} else {
			int temp = 6;
			int reserve=0;
			for (int i = 0; i < targetStr.length(); i++) {
				// 将每个字符串按照长短截取出来，截取的结果为char类型
				// 截取第一个字符
				char tempChar = targetStr.charAt(i);
				if(tempChar >= '0' && tempChar <= '9'){
					reserve=(int)(reserve+(i+1)*Math.pow(10, i));
				}
				// 按照字符比较，并进行赋值
				if (tempChar >= '0' && tempChar <= '9') {
					temp=temp+i*(int)Math.pow(10, (targetStr.length()-i));
					//temp = temp * 10 + (int) (tempChar - '0');

				}
			}
			System.out.println(reserve);
			System.out.println(temp);
		}
	}
	
}
