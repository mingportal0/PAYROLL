package net.cj.payroll.test.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {

	@Autowired
    UserService userService;
	
	@GetMapping("/signUp")
    public String signUpForm() {
    	return "test/signUp";
    }

    @PostMapping("/signUp")
    public String signUp(UserVo userVo) {
    	userService.joinUser(userVo);
        return "redirect:/login"; //to-do
    }
}
