package com.test.elementList;

import java.util.ArrayList;
import java.util.List;

public class TestRemoveSameKeyId {
	
	
	
	public static void main(String[] args) {
		TestRemoveSameKeyId test = new TestRemoveSameKeyId();
		List<String> result1 = test.initKeyList();
		List<String> result2 = test.initKeyListFromData1();
		System.out.println("最后剔除相同的keyList的最终结果是"+test.removeUnuselessKeyIdList(result1,result2)+"一共找到了"+test.removeUnuselessKeyIdList(result1,result2).size()+"个元素");
		//System.out.println("最后剔除相同的keyList的最终剩余的元素个数是"+test.removeUnuselessKeyIdList(result1,result2).size());
	}
	
	///本地的keyList的数据
	private List<String> initKeyList(){
		List<String> keyList = new ArrayList<>();
		keyList.add("10212");
		keyList.add("10213");
		keyList.add("10215");
		keyList.add("10222");
		keyList.add("10214");
		keyList.add("10216");
		keyList.add("10290");
		return keyList;
	}
	
	///模拟服务端过来的List的数据 第一种情况 是有数据 部分数据
	private  List<String> initKeyListFromData1(){
		List<String> keyList = new ArrayList<>();
		keyList.add("10213");
		keyList.add("10222");
		keyList.add("10290");
		return keyList;
	}
	
	///Server和本地的KeyList做比较 剔除没有用的keyList
	String tempKeyId = "";
	private List<String> removeUnuselessKeyIdList(List<String> localKeyList,List<String> ServerKeyList){
		for(int i = 0 ; i < localKeyList.size() ; i++){
			tempKeyId = localKeyList.get(i);
			for(int j=0 ; j < ServerKeyList.size();j++){
				if(ServerKeyList.get(j).equals(tempKeyId)){
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
			List<String> keyList = new ArrayList<>();
			System.out.println("服务端返回过来的keyList:"+keyList);
		}
}
