package edu.bit.ex.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.BoardMapper;
import edu.bit.ex.mapper.LoginMapper;
import edu.bit.ex.page.Criteria;
import edu.bit.ex.service.BoardServiceImpl;
import edu.bit.ex.vo.BoardVO;
import edu.bit.ex.vo.UserVO;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j;

@Service
public interface LogInService {
	public UserVO loginUser(String id, String pw);
}

