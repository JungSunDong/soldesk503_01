package main.service;

import main.DTO.MemberDTO;
import main.DTO.MemberDao;

public class MemberInfoPrinter {

	private MemberDao memberDao = new MemberDao();
	private MemberPrinter printer = new MemberPrinter();
	
	public void printMemberInfo(String email) {
		MemberDTO dto = memberDao.selectByEmail(email);
		if (dto == null) {
			System.out.println("사용자 데이터가 없습니다 \n");
			return;
		}
		printer.print(dto);
	}
}
