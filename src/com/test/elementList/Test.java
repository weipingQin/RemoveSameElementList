package com.test.elementList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	///�������� ����������һ������ Android�ͻ�����Ҫ�Է���˷��ع�����List ������ӦԪ�ص��滻 ���ߵ�List�ȽϽ�����ͬԪ���޳�����
	///����ת�� ��ʵ����2��List һһ�Ƚϣ���������ͬ��Ԫ�أ���ȥ����Ȼ��ϲ���Listʣ�µ����е�Ԫ�� 
	public static void main(String[] args) {
		int[] arr2 = {1,2,3,4,5};     
		int[] arr1 = {3,4,5,6,7};     
		//Set�ǲ������ظ��ģ����Խ������ֵȫ������Set������     
		Set set = new HashSet<Integer>();     
		for(int i = 0; i < arr1.length ; i++){     
			set.add(arr1[i]);     
		}     
		for(int i = 0; i < arr2.length ; i++){     
			set.add(arr2[i]);     
		}     
		//�õ����ǲ��ظ���ֵ��Set�ĳ���     
		System.out.println(set.size());     
		Iterator i = set.iterator();     
		int[] arrays = new int[set.size()];     
		int num=0;     
		while(i.hasNext()){     
			int a = (Integer)i.next();     
			arrays[num] = a;     
			num = num + 1;     
			System.out.println(num);     
		}     
		for(int s = 0; s < arrays.length ; s++){     
			System.out.println(arrays[s]);     
		}     
		//�Խ����������     
		Arrays.sort(arrays);     
		for(int s = 0; s < arrays.length ; s++){     
			System.out.println(arrays[s]);     
		}     
	}
}
