package Two;

public class mainClass {
	int flag;
	public static void main(String[] args) {
		// 向上转型子类的方法缺失
		Aclass a = new Bclass();
		Aclass ac = new Cclass();
		show(a);
		show(ac);
		//下面两行和上面的功能类似，但是下面更加简洁，一样是向上转型
		show(new Bclass());
		show(new Cclass());

	}
//向上转型子类的方法覆盖父类，但子类自己的方法将缺失，但在调用时有利于代码的重构，减少代码量

	public static void show(Aclass a) {
		a.run();
	}
	public void show(){
	}
}
