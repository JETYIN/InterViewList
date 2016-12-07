package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString {
public static void main(String[] args) {
	
	String str1="abcd";
	String str2="abcd";
	/**返回true，字符串str1创建后会加入到常量池中，当创建str2时，
	 * 常量池中存在abcd，即是str2指向abcd的内存地址，str1，str2指向同一地址**/
	System.out.println(str1==str2);
	
	
	String str3=new String("abcd");
	String str4=new String("abcd");
	/***返回false，str3，str4指向不同的内存地址*/
	System.out.println(str3==str4);
	
	String target="abshcaac";
	System.out.println(target.replace("a", "*"));
	System.out.println(target.replaceAll("a", "t"));
	
	String targetStr="3e3#sdfsdf4#d";
	String reg="([#]{0,}?[#])";
	//设置匹配规则
	Pattern pattern=Pattern.compile(reg);
	//匹配结果
	Matcher matcher=pattern.matcher(targetStr);
	if(matcher.find()){
		System.out.println(matcher.group());
	}
}
	
}
