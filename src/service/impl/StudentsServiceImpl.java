package service.impl;

import java.util.List;

import dao.StudentsDao;
import dao.impl.StudentsDaoImpl;
import entity.Students;
import entity.Students;
import service.StudentsService;

public class StudentsServiceImpl implements StudentsService{

	private StudentsDao sd=new StudentsDaoImpl();
	@Override
	public List<Students> stus() {
		List<Students> stus = sd.stus();
		if(stus!=null) {
			return stus;
		}
		return null;
	}
}
