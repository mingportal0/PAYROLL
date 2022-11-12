package net.cj.payroll.test.login;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import net.cj.payroll.test.UserRespDto;

/**
 * 
 * @author mjroh
 * 유저 정보를 DB에 저장하기 위한 Mapper 인터페이스
 */
@Mapper
public interface UserMapper {

	void saveUser(UserVo userVo);
	
	UserVo getUserAccount(String userId);

	List<UserRespDto> getUserData();

	UserRespDto getUserInfo(String userId);

	void saveUserInfo(UserRespDto dto);
}
