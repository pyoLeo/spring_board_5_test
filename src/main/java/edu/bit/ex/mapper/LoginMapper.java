package edu.bit.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import edu.bit.ex.page.Criteria;
import edu.bit.ex.vo.BoardVO;
import edu.bit.ex.vo.UserVO;

@Mapper
public interface LoginMapper {
	@Select("select * from users where username = #{username} and password = #{password}")
	public UserVO logInUser(@Param("username") String username, @Param("password") String password);
}