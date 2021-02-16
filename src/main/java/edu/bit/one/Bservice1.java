package edu.bit.one;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.bit.ex.vo.BoardVO;

@Service
public class Bservice1 {
	
	@Autowired
	SqlSession sqlSession;	//My Batis
	
	public List<BoardVO> selectBoardList() throws Exception {
		IBDao dao = sqlSession.getMapper(IBDao.class);
		return dao.listDao();
	}
}
