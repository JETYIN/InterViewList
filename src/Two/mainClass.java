package Two;

public class mainClass {
	int flag;
	public static void main(String[] args) {
		// ����ת������ķ���ȱʧ
		Aclass a = new Bclass();
		Aclass ac = new Cclass();
		show(a);
		show(ac);
		//�������к�����Ĺ������ƣ�����������Ӽ�࣬һ��������ת��
		show(new Bclass());
		show(new Cclass());

	}
//����ת������ķ������Ǹ��࣬�������Լ��ķ�����ȱʧ�����ڵ���ʱ�����ڴ�����ع������ٴ�����

	public static void show(Aclass a) {
		a.run();
	}
	public void show(){
	}
}
