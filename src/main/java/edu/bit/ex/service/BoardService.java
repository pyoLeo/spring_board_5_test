package edu.bit.ex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.BoardMapper;
import edu.bit.ex.page.Criteria;
import edu.bit.ex.service.BoardServiceImpl;
import edu.bit.ex.vo.BoardVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;


public interface BoardService {

	public List<BoardVO> getList();	//게시글 목록 불러오기

	public void writeBoard(BoardVO boardVO);	//게시글 작성

	public BoardVO get(int bno);	//게시글 보기

	public void writeReply(BoardVO boardVO);	//답글 작성
	
	public int remove(int bId);

	public List<BoardVO> getList(Criteria cri);

	public int getTotal(Criteria cri);

	public int modify(BoardVO boardVO);
}
