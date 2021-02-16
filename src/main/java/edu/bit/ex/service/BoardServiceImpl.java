package edu.bit.ex.service;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.bit.ex.mapper.BoardMapper;
import edu.bit.ex.page.Criteria;
import edu.bit.ex.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Log4j
@Service
@AllArgsConstructor
public class BoardServiceImpl implements BoardService {

	private BoardMapper mapper;
	
	@Override
	public List<BoardVO> getList() {
		// TODO Auto-generated method stub
		log.info("getList------");
		return mapper.getList();
	}
	
	@Override
	public void writeBoard(BoardVO boardVO) {
		// TODO Auto-generated method stub
		log.info("write------");
		mapper.write(boardVO);
	}

	@Transactional
	@Override
	public BoardVO get(int bno) {
		// TODO Auto-generated method stub
		log.info("get------");
		mapper.upHit(bno);
		return mapper.read(bno);
	}

	@Override
	public void writeReply(BoardVO boardVO) {
		// TODO Auto-generated method stub
		log.info("writeReply------");
		mapper.replyShape(boardVO);
		mapper.reply(boardVO);
	}

	@Override
	public int remove(int bId) {
		// TODO Auto-generated method stub
		log.info("remove..........");	
		return mapper.delete(bId);
	}

	@Override
	public List<BoardVO> getList(Criteria cri) {
		// TODO Auto-generated method stub
		log.info("get List with criteria" + cri);
		return mapper.getListWithPaging(cri);
	}

	@Override
	public int getTotal(Criteria cri) {
		// TODO Auto-generated method stub
		log.info("get total count");
		return mapper.getTotalCount(cri);
	}

	@Override
	public int modify(BoardVO boardVO) {
		// TODO Auto-generated method stub
		log.info("modify......");
		mapper.modify(boardVO);
		
		return boardVO.getbId();
	}
	

}
