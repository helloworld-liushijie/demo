package com.huibo.airth;

/**
 * ≈≈–ÚÀ„∑®
 * @author ¡ı ¿Ω‹
 */
public class Bubble {
	public static void main(String[] args) {
		int[] arr = {10,21,11,31,20};
		//…˝–Ú√∞≈›À„∑®
		for(int i = 0;i < arr.length-1;i++) {
			for(int j = 0;j < arr.length-1;j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		//Ωµ–Ú√∞≈›À„∑®
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
