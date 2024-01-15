package in.vaibhavit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import in.vaibhavit.binding.SearchCriteria;
import in.vaibhavit.entity.StudentEnq;
import in.vaibhavit.service.EnquiryService;

@Controller
public class EnquiryController {

	@Autowired
	private EnquiryService enqService;

	@GetMapping("/enquiry")
	public String enqpage(Model model) {
		model.addAttribute("enq", new StudentEnq());
		return "addEnqView";
	}

	@PostMapping("/enquiry")
	public String addEnquiry(StudentEnq se, Model model) {
		boolean addEnq = enqService.addEnq(se);
		if (addEnq) {
			// success
		} else {
			// error
		}
		return "addEnqView";

	}

	@GetMapping("/enquiries")
	public String viewEnquiries(Model model) {

		List<StudentEnq> enquiriesList = enqService.getEnquiries(null, null);

		model.addAttribute("enquiries", enquiriesList);

		return "displayEnqView";

	}

	@PostMapping("/filter-enquiries")
	public String filterEnquiries(SearchCriteria sc, Model model) {
		List<StudentEnq> enquiriesList = enqService.getEnquiries(null, null);

		model.addAttribute("enquiries", enquiriesList);

		return "displayEnqView";

	}
}
