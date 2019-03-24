package com.huibo.cache;

/**
 * ����ز���
 * @author ������
 */
public class CachePool {
	
	public static void main(String[] args) {
		Integer i1 = new Integer(200);
		Integer i2 = new Integer(200);
		//new Integerÿ�ζ��ᴴ���¶���
		System.out.println(i1 == i2);//false
		
		//Integer�Ļ���صĴ�СĬ����-128 - 127
		Integer i3 = Integer.valueOf(100);
		Integer i4 = Integer.valueOf(100);
		System.out.println(i3 == i4);//true
		
		//����Integer����ش�С
		/**
		 * 	public static Integer valueOf(int i) {
         *		if (i >= IntegerCache.low && i <= IntegerCache.high)
         *   		return IntegerCache.cache[i + (-IntegerCache.low)];
         *		return new Integer(i);
    	 *	}
		 */
		Integer i5 = Integer.valueOf(128);
		Integer i6 = Integer.valueOf(128);
		System.out.println(i5 == i6);//false
		
		//�����������Զ�װ����̵��� valueOf() 
		Integer i7 = 100;
		Integer i8 = 100;
		System.out.println(i7 == i8);//true
		short s1 = 1;
		s1 += 1;
		System.out.println(s1);
	}
}
