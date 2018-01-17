package com.yc.biz.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.yc.bean.Student;
import com.yc.biz.DemoBiz;
import com.yc.dao.BaseDao;

@Service
public class DemoBizImpl implements DemoBiz{

	private BaseDao baseDao;

	@Resource(name = "baseDaoImpl")
	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
	@Override
	public String getDemo() {
		
		List<Student> list=this.baseDao.findAll(new Student(), "findAll");
		Gson gson=new Gson();
		
		System.out.println("提供者打印"+list);
		
		return gson.toJson(list);
	}

}
