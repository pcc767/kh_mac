package com.kooki.chap01_poly.view;

import com.kooki.chap01_poly.controller.LibraryController;
import com.kooki.chap01_poly.model.vo.Book;
import com.kooki.chap01_poly.model.vo.Member;

import java.util.Arrays;
import java.util.Scanner;


public class LibraryMenu {
	LibraryController lc = new LibraryController();
	Scanner sc = new Scanner(System.in);

	public void mainMenu() {
		System.out.print("�̸� : ");
		String inputName = sc.nextLine();
		System.out.print("���� : ");
		int inputAge = Integer.parseInt(sc.nextLine());
		System.out.print("���� : ");
		char inputGender = sc.nextLine().charAt(0);

		lc.insertMember(new Member(inputName, inputAge, inputGender));
		while (true) {
			System.out.println("\n==== �޴� ====");
			System.out.println("1. ����������");
			System.out.println("2. ���� ��ü ��ȸ");
			System.out.println("3. ���� �˻�");
			System.out.println("4. ���� �뿩�ϱ�");
			System.out.println("9. ���α׷� �����ϱ�");
			System.out.print("�޴� ��ȣ : ");
			int menuNum = Integer.parseInt(sc.nextLine());

			switch (menuNum) {
			case 1:
				System.out.println(lc.myInfo()); 
				break;
			case 2:
				selectAll(); 
				break;
			case 3:
				searchBook(); 
				break;
			case 4:
				rentBook(); 
				break;
			case 9:
				System.out.println("���α׷��� �����մϴ�."); 
				return;
			default:
				System.out.println("error : �޴� ��ȣ �߸� �Է��Ͽ����ϴ�."); 
				break;
			}
		}
	}

	public void selectAll() {
		Book[] bList = Arrays.copyOf(lc.selectAll(), 5/*lc.selectAll().length*/);
		
		System.out.println();
		for(int i = 0; i < bList.length; i++) {
			System.out.println(i + "�� ���� : " + bList[i]);
		}
		return;
	}

	public void searchBook() {
		System.out.print("\n�˻��� ���� Ű���� : ");
		String keyword = sc.nextLine();
		
		Book[] searchList = lc.searchBook(keyword);
		
		for(int i = 0; i < searchList.length; i++) {
			if(searchList[i] == null) { 
				return; 
			}
			else { 
				System.out.println(searchList[i]); 
			}
		}
		return;
	}

	public void rentBook() {
		selectAll();
		System.out.print("�뿩�� ���� ��ȣ ���� : ");
		int index = Integer.parseInt(sc.nextLine());
		int result = lc.rentBook(index);
		
		if(result == 0) {
			System.out.println("���������� �뿩�Ǿ����ϴ�.");
		}
		else if(result == 1) {
			System.out.println("���� �������� �뿩 �Ұ����Դϴ�.");
		}
		else if(result == 2){
			System.out.println("���������� �뿩�Ǿ����ϴ�. �丮�п� ������ �߱޵Ǿ����� �������������� Ȯ���ϼ���.");
		}
		return;
	}
}
