package net.cj.payroll.test;

import java.util.List;

public interface ToastGridService {

	public List<UserRespDto> getUserData();

	public UserRespDto getUserInfo(String userId);

	public void saveUserInfo(UserRespDto dto);
}
