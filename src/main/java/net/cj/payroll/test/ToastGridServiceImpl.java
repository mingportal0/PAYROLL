package net.cj.payroll.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.cj.payroll.test.login.UserMapper;

@Service
public class ToastGridServiceImpl implements ToastGridService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<UserRespDto> getUserData() {
		List<UserRespDto> dto = (List<UserRespDto>) userMapper.getUserData();
		return dto;
	}

	@Override
	public UserRespDto getUserInfo(String userId) {
		UserRespDto dto = userMapper.getUserInfo(userId);
		return dto;
	}

	@Override
	public void saveUserInfo(UserRespDto dto) {
		userMapper.saveUserInfo(dto);
	}

}
