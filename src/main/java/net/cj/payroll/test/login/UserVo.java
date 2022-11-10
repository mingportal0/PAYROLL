package net.cj.payroll.test.login;

import lombok.Data;

//@Data - @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode 어노테이션을 한꺼번에 설정해주는 어노테이션
@Data
public class UserVo {

	private String userId;
    private String userPw;
    private String userName;
    private String userAuth;
}
