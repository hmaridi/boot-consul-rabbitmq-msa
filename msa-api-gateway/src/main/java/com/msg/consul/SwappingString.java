package com.msg.consul;

public class SwappingString {

	public static void main(String[] args) {
		String str="HARI";
		char[] ch=str.toCharArray();
		char temp=ch[0];
		ch[0]=ch[1];
		ch[1]=temp;
		String strs=new String(ch);
		System.out.println(str);
		System.out.println(strs);
		
	}

}
