package com.test.elementList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test2 {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<Integer>();  
		List<Integer> list2 = new ArrayList<Integer>();  
		list1.add(1);  
		list1.add(2);  
		list1.add(3);  
		list1.add(4);  
		list2.add(3);  
		list2.add(4);  
		list2.add(5);  
		list2.add(6);  
		List<Integer> list = new ArrayList<Integer>();  
		list.addAll(list1);  
		list.addAll(list2);  
		System.out.println("第一个List打印的结果>>>两个List做合并"+list);  

		
		Collections.sort(list, new Comparator<Integer>() {  
			public int compare(Integer o1, Integer o2) {  
				return o1 - o2;  
			}  
		});  
		System.out.println("第二个List排序之后打印的结果"+list);  
		for (int i = 0; i < list.size(); i++) {  
			if (list.get(i) == list.get(i - 1)) {  
				list.remove(i);  
			}  
		}  
		System.out.println("第三个List排序之后打印的结果"+list);  
	}
}
