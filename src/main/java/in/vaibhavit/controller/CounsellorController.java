package in.vaibhavit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.vaibhavit.entity.Counsellor;
import in.vaibhavit.service.CounsellorService;

@Controller
public class CounsellorController {

	@Autowired
	private CounsellorService counsellorSvc;

	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("counsellor", new Counsellor());
		return "loginView";
	}

	@PostMapping("/login")
	public String handleLogin(Counsellor c, Model model) {

		Counsellor obj = counsellorSvc.loginCheck(c.getEmail(), c.getPwd());
		if (obj == null) {
			model.addAttribute("errMsg", "Invalid Credentials");
		}
		return "redirect:dashboard";
	}

	@GetMapping("/dashboard")
	public String builDashboard(Model model) {

		// get data for dashboard

		return "dashboardView";
	}

	@GetMapping("/register")
	public String regPage(Model model) {
		model.addAttribute("counsellor", new Counsellor());
		return "registerView";

	}

	@PostMapping("/register")
	public String handleRegistration(Counsellor c, Model model) {
		String msg = counsellorSvc.saveCounsellor(c);

		model.addAttribute("msg", msg);
		return "registerView";
	}

	@GetMapping("/forgot-pwd")
	public String recoverPwdPage(Model model) {
		return "forgotPwdView";
	}
	
	@GetMapping("/recover-pwd")
	public String recoverPwd(@RequestParam String email,Model model)
	{
		boolean status=counsellorSvc.recoverPwd(email);
		
		if(status) {
			model.addAttribute("smsg","Pwd sent to your Email");
		}else {
			model.addAttribute("smsg","Invalid Email");

		}
		return "forgotPwdView";

	}
}
