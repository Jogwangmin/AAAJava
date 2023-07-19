package com.kh.day18.member.controller;

import java.util.List;

import com.kh.day18.member.model.dao.MemberDAO;
import com.kh.day18.member.model.vo.Member;

public class MemberController_prev {
//	private List<Member> mList;
//	private MemberView view;
	private MemberDAO memberDao;
	
	public MemberController_prev() {
//		view = new MemberView();
//		mList = new ArrayList<Member>();
		memberDao = new MemberDAO();
	}
	
	/**
	 * 이름으로 인덱스 찾기
	 * @param name
	 * @return
	 */
	public int findIndexByName(String name) {
		int index = memberDao.findIndexByName(name);
		return index;
	}
	/**
	 * 이름으로 회원 정보 찾기
	 * @param name
	 * @return
	 */
	public Member findOneByName(String name) {
		return memberDao.findOneByName(name);
	}
	/**
	 * 회원 전체 정보 조회
	 * @return
	 */
	public List<Member> allMemberList() {
		return memberDao.allMemberList();
	}
	/**
	 *  회원 정보 등록
	 * @param member
	 */
	public void addMember(Member member) {
		memberDao.addMember(member);;
	}
	/**
	 * 회원 정보 삭제
	 * @param index
	 */
	public void subMember(int index) {
		memberDao.subMember(index);;
	}
	/**
	 * 회원 정보 수정
	 * @param index
	 * @param mOne
	 */

	public void modifyMember(int index, Member mOne) {
		memberDao.modifyMember(index, mOne);
	}
}