package in.vaibhavit.service;

import in.vaibhavit.binding.DashboardResponse;
import in.vaibhavit.entity.Counsellor;

public interface CounsellorService {
	
	public String saveCounsellor(Counsellor c);
	
	public Counsellor loginCheck(String email,String pwd);
	
	public boolean recoverPwd(String eamil);
	
	public DashboardResponse getDashboardInfo(Integer cid);

}
