package net.cj.payroll.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@AllArgsConstructor
@Getter
public class UserRespDto {
	
	private String userId;
	private String userName;
	private String userAuth;
	private String userInfo;

}
