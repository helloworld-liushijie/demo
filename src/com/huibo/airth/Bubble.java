package com.huibo.airth;

/**
 * �����㷨
 * @author ������
 */
public class Bubble {
	public static void main(String[] args) {
		int[] arr = {10,21,11,31,20};
		//����ð���㷨
		for(int i = 0;i < arr.length-1;i++) {
			for(int j = 0;j < arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		//����ð���㷨
		/*for(int i = 0;i < arr.length-1;i++) {
			for (int j = 0; j < arr.length-1; j++) {
				if(arr[j] < arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}*/
		for (int i : arr) { 
			System.out.println(i);
		}
	}
}
