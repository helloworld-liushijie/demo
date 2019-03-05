package com.huibo.io_util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * io����
 * @author ������
 */
public class IO_Operate {
	
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		//�ַ�������
		BufferedReader reader = new BufferedReader(new FileReader("res/demo.txt"));
		//���ڴ�->��ȡ���ַ���
		String str = null;
		//�����ж��Ƿ��һ��
		boolean isFirst = true;
		//��ȡ��һ������
		String first_line_data = null;
		List<Person> list = new ArrayList<>();
		while((str=reader.readLine()) != null) { //�ж��Ƿ����
			//TODO 1.��ȡ�������ݲ���ʾ
			//System.out.println(str);
			if(isFirst == true) {
				first_line_data = str;
				isFirst = false;
			} else {
				//person��������
				String[] personArr = str.split(",");
				if(personArr[3].equals("��")) {
					//TODO 2.��������Ա�Ϊ�е�����
					System.out.println(str);
				}
				//�洢��������
				Person person = new Person();
				person.setName(personArr[0]);
				person.setAge(Integer.valueOf(personArr[1]));
				person.setAddress(personArr[2]);
				person.setSex(personArr[3]);
				list.add(person);
			}
		}
		//TODO 3.������Ӵ�С����(��дcompareTo����)
		Collections.sort(list);
		//�����
		BufferedWriter writer = new BufferedWriter(new FileWriter("res\\out.txt"));
		//д��������Ϣ
		writer.write(first_line_data+"\r\n");
		StringBuilder builder = new StringBuilder();
		for(Person person : list) {
			builder.append(person.getName()).append(",").append(person.getAge()).append(",")
				.append(person.getAddress()).append(",").append(person.getSex()).append("\r\n");
		}
		//TODO 4.�����������������result.txt�ļ�
		writer.write(builder.toString());
		//ˢ��
		writer.flush();
		//�ر���Դ
		writer.close();
		reader.close();
	}
}
