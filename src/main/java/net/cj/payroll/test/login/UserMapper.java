package net.cj.payroll.test.login;

import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * @author mjroh
 * 유저 정보를 DB에 저장하기 위한 Mapper 인터페이스
 */
@Mapper
public interface UserMapper {

	void saveUser(UserVo userVo);
	
	UserVo getUserAccount(String userId);
}
