package Try;

public class mainClass {
	
public static void main(String[] args) {
	// Inter为接口，类似与于List list=new ArrayList();
	Inter in;
	in=new Aclass();
	run(in);
	run(new Bcalss());
}
public static void run(Inter in){
	in.textOne();
	in.textTwo();
}
}
