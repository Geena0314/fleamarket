package com.hwangdang.serviceimpl;

import com.hwangdang.dao.Dao;
import com.hwangdang.service.Service;

public class AdminServiceImpl implements Service {

	private Dao admindao;
	
	public AdminServiceImpl(Dao admindao){
		this.admindao = admindao;
	}
}
