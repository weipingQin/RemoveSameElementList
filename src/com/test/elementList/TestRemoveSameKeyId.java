package com.test.elementList;

import java.util.ArrayList;
import java.util.List;

public class TestRemoveSameKeyId {
	
	
	
	public static void main(String[] args) {
		TestRemoveSameKeyId test = new TestRemoveSameKeyId();
		List<String> result1 = test.initKeyList();
		List<String> result2 = test.initKeyListFromData1();
		System.out.println("����޳���ͬ��keyList�����ս����"+test.removeUnuselessKeyIdList(result1,result2)+"һ���ҵ���"+test.removeUnuselessKeyIdList(result1,result2).size()+"��Ԫ��");
		//System.out.println("����޳���ͬ��keyList������ʣ���Ԫ�ظ�����"+test.removeUnuselessKeyIdList(result1,result2).size());
	}
	
	///���ص�keyList������
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
	
	///ģ�����˹�����List������ ��һ����� �������� ��������
	private  List<String> initKeyListFromData1(){
		List<String> keyList = new ArrayList<>();
		keyList.add("10213");
		keyList.add("10222");
		keyList.add("10290");
		return keyList;
	}
	
	///Server�ͱ��ص�KeyList���Ƚ� �޳�û���õ�keyList
	String tempKeyId = "";
	private List<String> removeUnuselessKeyIdList(List<String> localKeyList,List<String> ServerKeyList){
		for(int i = 0 ; i < localKeyList.size() ; i++){
			tempKeyId = localKeyList.get(i);
			for(int j=0 ; j < ServerKeyList.size();j++){
				if(ServerKeyList.get(j).equals(tempKeyId)){
					System.out.println("����List�Ƚϵ���ͬ��Ԫ����:"+tempKeyId);
					localKeyList.remove(localKeyList.get(i));
					continue;
				}
			}
		}
		return localKeyList;
	}
	
	///ģ�����˹�����List������ �ڶ������ û���κ����ݷ��ع���
		private void initKeyListFromData2(){
			List<String> keyList = new ArrayList<>();
			System.out.println("����˷��ع�����keyList:"+keyList);
		}
}
