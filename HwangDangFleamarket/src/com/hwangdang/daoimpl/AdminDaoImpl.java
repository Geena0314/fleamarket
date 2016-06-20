package com.hwangdang.daoimpl;

import org.mybatis.spring.SqlSessionTemplate;

import com.hwangdang.dao.Dao;

public class AdminDaoImpl implements Dao {

	private SqlSessionTemplate session;

	public AdminDaoImpl(SqlSessionTemplate session){
		this.session = session;
	}
	
	//
	public void selectAllQnABoard(){
		session.selectList("");
		
		
	}
	
	
}
