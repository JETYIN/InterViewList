package test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestString {
public static void main(String[] args) {
	
	String str1="abcd";
	String str2="abcd";
	/**����true���ַ���str1���������뵽�������У�������str2ʱ��
	 * �������д���abcd������str2ָ��abcd���ڴ��ַ��str1��str2ָ��ͬһ��ַ**/
	System.out.println(str1==str2);
	
	
	String str3=new String("abcd");
	String str4=new String("abcd");
	/***����false��str3��str4ָ��ͬ���ڴ��ַ*/
	System.out.println(str3==str4);
	
	String target="abshcaac";
	System.out.println(target.replace("a", "*"));
	System.out.println(target.replaceAll("a", "t"));
	
	String targetStr="3e3#sdfsdf4#d";
	String reg="([#]{0,}?[#])";
	//����ƥ�����
	Pattern pattern=Pattern.compile(reg);
	//ƥ����
	Matcher matcher=pattern.matcher(targetStr);
	if(matcher.find()){
		System.out.println(matcher.group());
	}
}
	
}
