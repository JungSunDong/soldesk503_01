package main.service;

import java.util.Date;

import main.DTO.MemberDTO;
import main.DTO.MemberDao;
import main.DTO.RegisterRequest;

public class MemberRegisterService {
	// ���� ��ü
	private MemberDao memberDao = new MemberDao();
	
	public void regist(RegisterRequest request) {
		MemberDTO dto = memberDao.selectByEmail(request.getEmail());
		if (dto == null) {
			dto = new MemberDTO();
			dto.setEmail(request.getEmail());
			dto.setName(request.getName());
			dto.setPassword(request.getPassword());
			dto.setRegisterDate(new Date());
			memberDao.insert(dto);
			System.out.println("사용자 등록이 완료되었습니다");
		}else {
			System.out.println("중복된사용자입니다.");
		}
		
	}
}
