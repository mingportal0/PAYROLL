package net.cj.payroll.test.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    
    @GetMapping("/login")
    public String login() {
    	return "test/login";
    }
      
    @GetMapping("/user_access")
    public String userAccess(Model model, Authentication authentication) {
        //Authentication 객체를 통해 유저 정보를 가져올 수 있다.
        UserVo userVo = (UserVo) authentication.getPrincipal();
        model.addAttribute("username", userVo.getUsername());
        return "test/user_access";
    }

    @GetMapping("/access_denied")
    public String accessDenied() {
        return "test/access_denied";
    }
}
