package edu.bit.ex.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import edu.bit.ex.vo.BoardVO;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTest {

	@Setter(onMethod_ = @Autowired)
	private BoardMapper boardMapper;
	
	@Test
	public void testBoardMapper() {
		assertNotNull(boardMapper);
	}
	
	@Test
	public void testList() {
		List<BoardVO> list = boardMapper.getList();
		
		log.info("boardMapper");
		
		for(BoardVO boardVO : list) {
			log.info(boardVO.getbContent());
		}
	}
}

/*
 * @Test public void testWrite() { assertNotNull(boardMapper) } }
 */
