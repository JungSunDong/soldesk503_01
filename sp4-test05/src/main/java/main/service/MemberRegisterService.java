package main.service;

import java.util.Date;

import main.DTO.MemberDTO;
import main.DTO.MemberDao;
import main.DTO.RegisterRequest;

public class MemberRegisterService {
	// 의존객체
	private MemberDao memberDao;
	// 의존객체 주입 = Dependency Injection
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
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
