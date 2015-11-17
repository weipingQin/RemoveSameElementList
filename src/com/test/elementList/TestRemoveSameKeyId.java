package com.test.elementList;

import java.util.ArrayList;
import java.util.List;

public class TestRemoveSameKeyId {
	
	
	
	public static void main(String[] args) {
		TestRemoveSameKeyId test = new TestRemoveSameKeyId();
		List<Integer> result1 = test.initKeyList();
		List<Integer> result2 = test.initKeyListFromData1();
		System.out.println("����޳���ͬ��keyList�����ս����"+test.removeUnuselessKeyIdList(result1,result2));
		//System.out.println("����޳���ͬ��keyList������ʣ���Ԫ�ظ�����"+test.removeUnuselessKeyIdList(result1,result2).size());
	}
	
	///���ص�keyList������
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
		//System.out.println("��ʼ�����keyList:"+keyList);
	}
	
	///ģ�����˹�����List������ ��һ����� �������� ��������
	private  List<Integer> initKeyListFromData1(){
		List<Integer> keyList = new ArrayList<>();
		keyList.add(10213);
		keyList.add(10222);
		keyList.add(10290);
		return keyList;
		//System.out.println("����˷��ع�����keyList:"+keyList);
	}
	
	///Server�ͱ��ص�KeyList���Ƚ� �޳�û���õ�keyList
	int tempKeyId = 0;
	private List<Integer> removeUnuselessKeyIdList(List<Integer> localKeyList,List<Integer> ServerKeyList){
		for(int i = 0 ; i < localKeyList.size() ; i++){
			tempKeyId = localKeyList.get(i);
			for(int j=0 ; j < ServerKeyList.size();j++){
				if(ServerKeyList.get(j) == tempKeyId){
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
			List<Integer> keyList = new ArrayList<>();
			System.out.println("����˷��ع�����keyList:"+keyList);
		}
}
