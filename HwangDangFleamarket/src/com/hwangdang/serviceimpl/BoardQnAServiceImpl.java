package com.hwangdang.serviceimpl;

import java.util.List;

import com.hwangdang.daoimpl.BoardQnADaoImpl;
import com.hwangdang.service.Service;


public class BoardQnAServiceImpl implements Service {
	
	private BoardQnADaoImpl adminDao;
	
	public BoardQnAServiceImpl(BoardQnADaoImpl adminDao){
		this.adminDao = adminDao;
	}
	
	public List getBoardList(){
		return adminDao.selectAllQnABoard();
	}
	
	
}
