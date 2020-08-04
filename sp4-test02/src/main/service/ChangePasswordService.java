package main.service;

import main.DTO.MemberDTO;
import main.DTO.MemberDao;

public class ChangePasswordService {

	private MemberDao memberDao = new MemberDao();
	
	public void changePassword(String email, String oldPw , String newPw) {
		MemberDTO dto = memberDao.selectByEmail(email);
		if (dto == null) {
			System.err.println("해당 이용자가 존재하지않습니다");
			return;
		}
		dto.changePassword(oldPw, newPw);
		memberDao.update(dto);
	}
}
