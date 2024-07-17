package com.worldcup.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.worldcup.entity.CricketStaff;

@Repository
public class WorldcupcricketDao {
	
	@Autowired
	SessionFactory factory;
	
	public List<CricketStaff> allIndianCricketStaff()
	{
		Session session = factory.openSession();
		Criteria critera = session.createCriteria(CricketStaff.class);
		List<CricketStaff> staffList  = critera.list();
		
		return staffList;
	}
	

}
