package com.kh.day07.oop.member;

public class Member {
	// 입력받을거 3개 정도 만들고
	// 캡슐화의 원칙 적용해서 구성
	private String memberId;
	private String memberPw;
	private String memberEmail;
	private String memberAddress;

	public Member() { // 오버로딩, 개수가 다르다
		
	}
	
	public Member(String memberId, String memberPw, String memberEmail, String memberAddress) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.memberEmail = memberEmail;
		this.memberAddress = memberAddress;
	}
	
	//getter 메소드
	public String getMemberId() {
		return this.memberId;
	}
	public String getMemberPw() {
		return this.memberPw;
	}
	public String getMemberEmail() {
		return this.memberEmail;
	}
	public String getMemberAddress() {
		return this.memberAddress;
	}
	// new Member().setMemberId("khuser01);
	//setter 메소드
	public void setMemberId(String memberId) {
		// memberId = "khuser01"  값을 받아서 메소드 안에서 쓰게해주는 매개변수
		this.memberId = memberId;
	}
	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}
	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}
	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}
	
	
}
