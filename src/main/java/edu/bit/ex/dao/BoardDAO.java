package edu.bit.ex.dao;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.springframework.stereotype.Repository;

@Repository	//DAO repository 연속계층
public class BoardDAO {
	
	private DataSource dataSource;

	
	public BoardDAO() {

		try {
			Context context = new InitialContext(); // 커넥션풀을 가져오는 것
			dataSource = (DataSource) context.lookup("java:comp/env/jdbc/oracle");
			} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
