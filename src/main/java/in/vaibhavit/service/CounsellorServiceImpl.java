package in.vaibhavit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vaibhavit.binding.DashboardResponse;
import in.vaibhavit.entity.Counsellor;
import in.vaibhavit.repo.CounsellorRepo;

@Service
public class CounsellorServiceImpl implements CounsellorService {
	@Autowired
	private CounsellorRepo crepo;

	@Override
	public String saveCounsellor(Counsellor c) {
		Counsellor saveObj=crepo.save(c);
		if(saveObj.getCid()!=null)
		{
			return "Registration success";
		}
		return "Resgistration fail";
	}

	@Override
	public Counsellor loginCheck(String email, String pwd) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean recoverPwd(String eamil) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DashboardResponse getDashboardInfo(Integer cid) {
		// TODO Auto-generated method stub
		return null;
	}

}
