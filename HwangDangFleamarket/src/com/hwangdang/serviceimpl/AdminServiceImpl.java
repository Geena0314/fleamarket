package com.hwangdang.serviceimpl;

import java.util.List;

import com.hwangdang.daoimpl.AdminDaoImpl;
import com.hwangdang.service.Service;



public class AdminServiceImpl implements Service {
	
	private AdminDaoImpl adminDao;
	
	public AdminServiceImpl(AdminDaoImpl adminDao){
		this.adminDao = adminDao;
	}
	
	public List getBoardList(){
		
		return adminDao.selectAllQnABoard();
	}
	
	
}
