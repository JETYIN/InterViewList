package MARK;

public class TextOfSplit {
	
	public static void main(String[] args) {
		String str="2-ssd-3d-454dd-yin-344";
		String regx="-";
		String array[]=str.split(regx);
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		
	}

}
