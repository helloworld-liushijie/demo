package com.huibo.io_util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * io操作
 * @author 刘世杰
 */
public class IO_Operate {
	
	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		//字符输入流
		BufferedReader reader = new BufferedReader(new FileReader("res/demo.txt"));
		//用于存->读取的字符串
		String str = null;
		//用于判断是否第一行
		boolean isFirst = true;
		//存取第一行数据
		String first_line_data = null;
		List<Person> list = new ArrayList<>();
		while((str=reader.readLine()) != null) { //判断是否读完
			//TODO 1.读取所有内容并显示
			//System.out.println(str);
			if(isFirst == true) {
				first_line_data = str;
				isFirst = false;
			} else {
				//person属性数据
				String[] personArr = str.split(",");
				if(personArr[3].equals("男")) {
					//TODO 2.输出所有性别为男的数据
					System.out.println(str);
				}
				//存储对象数据
				Person person = new Person();
				person.setName(personArr[0]);
				person.setAge(Integer.valueOf(personArr[1]));
				person.setAddress(personArr[2]);
				person.setSex(personArr[3]);
				list.add(person);
			}
		}
		//TODO 3.按年龄从大到小排序(重写compareTo方法)
		Collections.sort(list);
		//输出流
		BufferedWriter writer = new BufferedWriter(new FileWriter("res\\out.txt"));
		//写入首行信息
		writer.write(first_line_data+"\r\n");
		StringBuilder builder = new StringBuilder();
		for(Person person : list) {
			builder.append(person.getName()).append(",").append(person.getAge()).append(",")
				.append(person.getAddress()).append(",").append(person.getSex()).append("\r\n");
		}
		//TODO 4.把排序后的数据输出到result.txt文件
		writer.write(builder.toString());
		//刷新
		writer.flush();
		//关闭资源
		writer.close();
		reader.close();
	}
}
