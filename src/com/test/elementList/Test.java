package com.test.elementList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test {

	///问题描述 碰到了这样一个问题 Android客户端需要对服务端返回过来的List 进行相应元素的替换 两边的List比较进行相同元素剔除操作
	///问题转化 其实就是2个List 一一比较，若是有相同的元素，则去除，然后合并掉List剩下的所有的元素 
	public static void main(String[] args) {
		int[] arr2 = {1,2,3,4,5};     
		int[] arr1 = {3,4,5,6,7};     
		//Set是不允许重复的，所以将数组的值全部放在Set对象中     
		Set set = new HashSet<Integer>();     
		for(int i = 0; i < arr1.length ; i++){     
			set.add(arr1[i]);     
		}     
		for(int i = 0; i < arr2.length ; i++){     
			set.add(arr2[i]);     
		}     
		//得到的是不重复的值，Set的长度     
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
		//对结果进行排序     
		Arrays.sort(arrays);     
		for(int s = 0; s < arrays.length ; s++){     
			System.out.println(arrays[s]);     
		}     
	}
}
