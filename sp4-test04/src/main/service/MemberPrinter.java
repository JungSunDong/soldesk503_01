package main.service;

import main.DTO.MemberDTO;

public class MemberPrinter {

	public void print(MemberDTO dto) {
		System.out.printf("회원정보 : 회원 아이디 = %d , 회원 이메일 = %s , 회원 이름 = %s , 등록날짜 = %tF \n",dto.getId() , dto.getEmail() , dto.getName() , dto.getRegisterDate());
		
	}
}
