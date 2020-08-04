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
			System.out.println("����� ����� �Ϸ� �Ǿ����ϴ�");
		}else {
			System.out.println("�ߺ� ������Դϴ�.");
		}
		
	}
}
