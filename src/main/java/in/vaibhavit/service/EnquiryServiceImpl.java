package in.vaibhavit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import in.vaibhavit.binding.SearchCriteria;
import in.vaibhavit.entity.StudentEnq;

@Service
public class EnquiryServiceImpl implements EnquiryService {

	@Override
	public boolean addEnq(StudentEnq se) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<StudentEnq> getEnquiries(Integer cid, SearchCriteria s) {
		// TODO Auto-generated method stub
		return null;
	}

}
