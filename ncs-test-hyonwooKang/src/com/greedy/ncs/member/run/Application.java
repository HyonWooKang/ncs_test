package com.greedy.ncs.member.run;

import com.greedy.ncs.member.model.dto.MemberDTO;

public class Application {
	
	public static void main(String[] args) {
		
		MemberDTO member1 = new MemberDTO();
		
		member1.setMemberNum(1);
		member1.setId("spencer");
		member1.setPw("pw1234");
		member1.setName("강현우");
		member1.setDate("2020.08.31");;
		member1.setHeight(180.1);
		member1.setWeight(80.5);
		member1.setActivated(true);
		
		System.out.println("Member number : " + member1.getMemberNum() + ", ID : " + member1.getId() + ", pw" + member1.getPw()
		+ ", name : " + member1.getName() + ", date : " + member1.getDate() + ", height : " +  member1.getHeight() + ", weight : "
		+ member1.getWeight() + ", isActivated : " + member1.isActivated());
		
		
	}

}
