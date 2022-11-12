package net.cj.payroll.test;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ToastGridController {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	ToastGridService toastGridService;
	
	@GetMapping("/test/getUserData")
	public List<UserRespDto> getUserData(){
		List<UserRespDto> data = toastGridService.getUserData();
		return data;
	}
	
	@PostMapping("/test/saveUserInfo")
	public String saveUserInfo(@RequestBody UserRespDto dto) {
		log.debug("@@dto: " + dto.getUserId());
		log.debug("@@dto: " + dto.getUserInfo());
		
		toastGridService.saveUserInfo(dto);
		
		return "저장완료";
	}
}
