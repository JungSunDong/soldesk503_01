package main.service;

import java.util.Collection;

import main.DTO.MemberDTO;
import main.DTO.MemberDao;

public class MemberListPrinter {
	
	private MemberDao memberDao;
	private MemberPrinter printer;
	
	// 의존객체 주입 : Dependency Injection(DI)
	public MemberListPrinter(MemberDao memberDao , MemberPrinter printer) {
		this.memberDao = memberDao;
		this.printer = printer;
	}
	
	public void printAll() {
		Collection<MemberDTO> lists = memberDao.selectAll();
		System.out.println("총 회원수 : " + lists.size());
		for(MemberDTO dto : lists) {
			printer.print(dto);
		}
	}
	
}
