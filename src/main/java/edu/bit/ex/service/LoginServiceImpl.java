package edu.bit.ex.service;

import org.springframework.stereotype.Service;

import edu.bit.ex.mapper.LoginMapper;
import edu.bit.ex.vo.UserVO;
import lombok.AllArgsConstructor;

//구현객체
@Service
@AllArgsConstructor
public class LoginServiceImpl implements LogInService {
	LoginMapper loginMapper;

	@Override
	public UserVO loginUser(String id, String pw) {
		return loginMapper.logInUser(id, pw);
	}
}
