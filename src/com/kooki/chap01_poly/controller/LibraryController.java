package com.kooki.chap01_poly.controller;


import com.kooki.chap01_poly.model.vo.AniBook;
import com.kooki.chap01_poly.model.vo.Book;
import com.kooki.chap01_poly.model.vo.CookBook;
import com.kooki.chap01_poly.model.vo.Member;

public class LibraryController {
	private Member mem = null;
	Book[] bList = new Book[5];
	
	{
		bList[0] = new CookBook("�������� ����", "������", "tvN", true);
		bList[1] = new AniBook("����ž", "�Ұ��", "���̳�", 16);
		bList[2] = new AniBook("������ ���ǽ�", "����", "japan", 12);
		bList[3] = new CookBook("�������� �󸶳� ���ְԿ�", "������", "����", false);
		bList[4] = new CookBook("������ �� �����غ�", "������", "�ұ�å", true);
	}
	
	public void insertMember(Member mem) {
		this.mem = mem;
	}
	
	public Member myInfo() {
		return this.mem;
	}
	
	public Book[] selectAll() {
		return this.bList;
	}
	
	public Book[] searchBook(String keywork) {
		Book[] tmpBook = new Book[5];
		int count = 0;
		
		for(int i = 0; i < bList.length; i++) {
			if(bList[i].getTitle().contains(keywork) == true) {
				tmpBook[count] = bList[i];
				count++;
			}
		}
		return tmpBook;
	}
	
	public int rentBook(int index) {
		int result = 0;
		
		if(this.bList[index] instanceof AniBook) {
			if(((AniBook) bList[index]).getAccessAge() > this.mem.getAge()) {
				result = 1;
			}
		}
		else if(this.bList[index] instanceof CookBook) {
			if(((CookBook) bList[index]).isCoupon() == true) {
				mem.setCouponCount(mem.getCouponCount() + 1);
				result = 2;
			}
		}
		return result;
	}
}
