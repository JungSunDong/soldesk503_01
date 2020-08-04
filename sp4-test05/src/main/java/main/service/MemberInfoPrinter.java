package main.service;

import main.DTO.MemberDTO;
import main.DTO.MemberDao;

public class MemberInfoPrinter {

	private MemberDao memberDao = new MemberDao();
	private MemberPrinter printer = new MemberPrinter();
	
	
	// 의존객체 주입 : Dependency Injection(DI)
	public void setMemberDao(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	// 의존객체 주입 : Dependency Injection(DI)
	public void setPrinter(MemberPrinter printer) {
		this.printer = printer;
	}
	
	public void printMemberInfo(String email) {
		MemberDTO dto = memberDao.selectByEmail(email);
		if (dto == null) {
			System.out.println("사용자 데이터가 없습니다 \n");
			return;
		}
		printer.print(dto);
	}
}
