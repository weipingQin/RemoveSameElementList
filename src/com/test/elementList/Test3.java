package com.test.elementList;

import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		list1.add(2);
		list1.add(3);
		list1.add(5);
		list2.add(2);
		list2.add(5);
		list2.add(6);
		list2.add(8);
		System.out.println("��ӡһ�µ�һ��list1"+list1);
		System.out.println("��ӡһ�µ�һ��list2"+list2);
		
		for(int i = 0; i < list1.size();i++){
			int temp = list1.get(i);
			for(int j = 0; j < list2.size();j++){
				if(temp == list2.get(j)){
					System.out.println("����ͬ��Ԫ��: " + temp);
				}
			}
		}
		
		for(int i = 0 ; i < list2.size() ; i++){
			int temp2 = list2.get(i);
			for(int j = 0 ; j < list1.size() ; j++){
				if(temp2 == list1.get(j)){
					System.out.println("����ͬ��Ԫ��test2: " + temp2);
				}
				
			}
		}
	}
}
