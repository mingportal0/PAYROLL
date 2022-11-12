package net.cj.payroll.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.cj.payroll.test.login.UserVo;

@Controller
public class SummerNoteController {

	@Autowired
	ToastGridService toastGridService;
	
	@RequestMapping("/test/userInfo")
	public String test(Model model, Authentication authentication) {
		UserVo userVo = (UserVo) authentication.getPrincipal();
		UserRespDto user = toastGridService.getUserInfo(userVo.getUserId());
		
		model.addAttribute("user", user);
		return "/test/userInfo";
	}
}
