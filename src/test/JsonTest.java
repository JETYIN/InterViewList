package test;

import java.util.HashMap;
import java.util.Map;

public class JsonTest {
	public static void main(String[] args) {

	}

	/** 转化为json对象 **/
	public static void toJson() {
		Map<String,String> map=new HashMap();
		map.put("name","JET");
		map.put("sex","Man");
		map.put("work","coder");
		
		//将map数据装换为json数组
	
		//将服务器获取的jsonarray解析
		//jsonarray.getJsonObject(0).getString("name");? 
		
	}
}
