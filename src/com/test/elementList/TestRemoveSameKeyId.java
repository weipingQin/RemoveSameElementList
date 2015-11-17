package com.test.elementList;

import java.util.ArrayList;
import java.util.List;

public class TestRemoveSameKeyId {
	
	
	
	public static void main(String[] args) {
		TestRemoveSameKeyId test = new TestRemoveSameKeyId();
		List<Integer> result1 = test.initKeyList();
		List<Integer> result2 = test.initKeyListFromData1();
		System.out.println("最后剔除相同的keyList的最终结果是"+test.removeUnuselessKeyIdList(result1,result2));
		//System.out.println("最后剔除相同的keyList的最终剩余的元素个数是"+test.removeUnuselessKeyIdList(result1,result2).size());
	}
	
	///本地的keyList的数据
	private List<Integer> initKeyList(){
		List<Integer> keyList = new ArrayList<>();
		keyList.add(10212);
		keyList.add(10213);
		keyList.add(10215);
		keyList.add(10222);
		keyList.add(10214);
		keyList.add(10216);
		keyList.add(10290);
		return keyList;
		//System.out.println("初始化后的keyList:"+keyList);
	}
	
	///模拟服务端过来的List的数据 第一种情况 是有数据 部分数据
	private  List<Integer> initKeyListFromData1(){
		List<Integer> keyList = new ArrayList<>();
		keyList.add(10213);
		keyList.add(10222);
		keyList.add(10290);
		return keyList;
		//System.out.println("服务端返回过来的keyList:"+keyList);
	}
	
	///Server和本地的KeyList做比较 剔除没有用的keyList
	int tempKeyId = 0;
	private List<Integer> removeUnuselessKeyIdList(List<Integer> localKeyList,List<Integer> ServerKeyList){
		for(int i = 0 ; i < localKeyList.size() ; i++){
			tempKeyId = localKeyList.get(i);
			for(int j=0 ; j < ServerKeyList.size();j++){
				if(ServerKeyList.get(j) == tempKeyId){
					System.out.println("两个List比较到相同的元素了:"+tempKeyId);
					localKeyList.remove(localKeyList.get(i));
					continue;
				}
			}
		}
		return localKeyList;
	}
	
	///模拟服务端过来的List的数据 第二种情况 没有任何数据返回过来
		private void initKeyListFromData2(){
			List<Integer> keyList = new ArrayList<>();
			System.out.println("服务端返回过来的keyList:"+keyList);
		}
}
