package in.vaibhavit.service;

import java.util.List;

import in.vaibhavit.binding.SearchCriteria;
import in.vaibhavit.entity.StudentEnq;

public interface EnquiryService {
	
	public boolean addEnq(StudentEnq se);
	
	public List<StudentEnq> getEnquiries(Integer cid,SearchCriteria s);

}
