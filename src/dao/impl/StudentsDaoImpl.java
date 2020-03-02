package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import dao.StudentsDao;
import entity.Students;
import utils.DBUtils;

public class StudentsDaoImpl implements StudentsDao{
	private Connection conn;
	private PreparedStatement pst;
	private ResultSet rs;
	
	// �����ݿ��в���ѧ����Ϣ���ص�һ��list

	@Override
	public List<Students> stus() {
		List<Students> stus = new ArrayList<Students>();
		try {
			conn=DBUtils.getConnection();
			PreparedStatement pst = conn.prepareStatement("select * from studentsinfo");
			rs = pst.executeQuery();
			while(rs.next()) {
				Students stu = new Students();
				stu.setSid(rs.getInt("sid"));
				stu.setSname(rs.getString("sname"));
				stu.setSage(rs.getInt("sage"));
				stu.setSsex(rs.getNString("ssex"));
				stus.add(stu);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stus;
	}

}
