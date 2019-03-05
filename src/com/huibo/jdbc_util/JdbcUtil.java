package com.huibo.jdbc_util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * jdbc����
 * @author ������
 */
public class JdbcUtil {
	
	static {
		//����������
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//����
		/*Integer queryRes = updateDatabase("update stu set psd = 123321 where name = ?", "jack");
		System.out.println(queryRes);*/
		
		//��ѯ
		/*List<Object> list = queryDatabase("select * from stu where name = ?", "jack");
		System.out.println(list);*/
	}
	
	/**
	 * url
	 */
	private static String url = "jdbc:mysql://localhost:3306/test?characterEncoding=utf-8";
	
	/**
	 * username
	 */
	private static String username = "root";
	
	/**
	 * password
	 */
	private static String password = "1234";
	
	/**
	 * Connection
	 */
	private static Connection conn = null;
	
	/**
	 * PrepareStatement
	 */
	private static PreparedStatement pre = null;
	
	/**
	 * ResultSet
	 */
	private static ResultSet set = null;
	
	/**
	 * ��������
	 */
	public static Connection getConn() {
		try {
			conn = DriverManager.getConnection(url,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}
	
	/**
	 * 
	 * @param sql-->Ԥ�������
	 * @param name-->��̬����
	 * @return
	 */
	public static PreparedStatement getPre(String sql,String name) {
		try {
			pre = conn.prepareStatement(sql);
			pre.setString(1, name);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pre;
	}
	
	/**
	 * ���²���
	 * @param sql-->Ԥ�������
	 * @param name-->��̬����
	 * @return
	 */
	public static Integer updateDatabase(String sql,String name) {
		getConn();
		getPre(sql, name);
		Integer res = null;
		try {
			res = pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeSource();
		}
		return res;
	}
	
	/**
	 * ��ѯ����
	 * @param sql-->Ԥ�������
	 * @param name-->��̬����
	 * @return
	 */
	public static List<Object> queryDatabase(String sql,String name) {
		getConn();
		getPre(sql, name);
		List<Object> list = new ArrayList<>();
		try {
			set = pre.executeQuery();
			while(set.next()) {
				list.add(set.getString("name")+"="+set.getString("psd"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			closeSource();
		}
		return list;
	}
	
	/**
	 * ��Դ�رղ���
	 */
	public static void closeSource() {
		try {
			if(set != null) {
				set.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			if(pre != null) {
				pre.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
