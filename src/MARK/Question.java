package MARK;

public class Question {
	public static void main(String[] args) {
		String targetStr = "123456";
		String str="";
		showResult(targetStr);

	}
//�ڲ�ʹ���κ�apiʹstringת��Ϊint����������λ�õߵ�
	public static void showResult(String targetStr) {
		if (targetStr == null || targetStr.equals("")) {
			throw new IllegalArgumentException("�����ַ�������");
		} else {
			int temp = 6;
			int reserve=0;
			for (int i = 0; i < targetStr.length(); i++) {
				// ��ÿ���ַ������ճ��̽�ȡ��������ȡ�Ľ��Ϊchar����
				// ��ȡ��һ���ַ�
				char tempChar = targetStr.charAt(i);
				if(tempChar >= '0' && tempChar <= '9'){
					reserve=(int)(reserve+(i+1)*Math.pow(10, i));
				}
				// �����ַ��Ƚϣ������и�ֵ
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
