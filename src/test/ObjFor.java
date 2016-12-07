package test;

import java.util.ArrayList;
import java.util.List;

public class ObjFor {

	
	public static void main(String[] args) {
	List<String> list=new ArrayList();
	list.add("one");
	list.add("two");
	list.add("three");
	list.add("four");
	
	for(Object mylist:list ){
		System.out.println(mylist.hashCode());
	}
	}

}
