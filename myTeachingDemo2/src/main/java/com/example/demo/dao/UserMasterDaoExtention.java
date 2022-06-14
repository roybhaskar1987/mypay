package com.example.demo.dao;


import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.vo.UserMasterVo;

@Component
public class UserMasterDaoExtention {
	
	@Autowired
	UserMasterDao userMasterDao;
	
	@Transactional
	public boolean save(UserMasterVo userMasterVo) {
		setCommonData(userMasterVo, false);
		userMasterDao.save(userMasterVo);
		return true;
		
	}
	
	@Transactional
	public boolean update(UserMasterVo userMasterVo  ) {
		
		setCommonData(userMasterVo, true);
		userMasterDao.save(userMasterVo);
		return true;
		
	}
	
	@Transactional
	public boolean SaveAll ( List< UserMasterVo>  usermastervoList ) {
		
		for (UserMasterVo userMasterVo : usermastervoList) {
			setCommonData(userMasterVo, false);
			userMasterDao.save(userMasterVo);
		}
		return true;
	}
	
	@Transactional
	public boolean UpdateAll (List< UserMasterVo>  usermastervoList) {
		
		for (UserMasterVo userMasterVo : usermastervoList) {
			setCommonData(userMasterVo, true);
			userMasterDao.save(userMasterVo);
		}
		return true;
		
	}
	
	@Transactional
	private void setCommonData(UserMasterVo userMasterVo, boolean isUpdate) {
		
		userMasterVo.setCREATE_DATE( isUpdate==false ? new Date(): userMasterVo.getCREATE_DATE()   );
		userMasterVo.setUPDATE_DATE(isUpdate ? new Date() : userMasterVo.getUPDATE_DATE() );
		userMasterVo.setRECORD_STATUS(1);
		
	}

}
