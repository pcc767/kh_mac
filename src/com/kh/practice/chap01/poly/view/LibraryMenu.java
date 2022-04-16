package com.kh.practice.chap01.poly.view;

import com.kh.practice.chap01.poly.controller.LibraryController;
import com.kh.practice.chap01.poly.model.vo.Book;
import com.kh.practice.chap01.poly.model.vo.Member;

import java.util.Arrays;
import java.util.Scanner;

public class LibraryMenu {

    public static Scanner sc = new Scanner(System.in);
    LibraryController lc = new LibraryController();

    public void mainMenu(){
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("나이 : ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("성별 : ");
        char gender = sc.nextLine().charAt(0);

        lc.insertMember(new Member(name,age,gender));
        while (true) {
            System.out.println("1. 마이 페이지");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 대여하기");
            System.out.println("9. 프로그램 종료하기");
            System.out.print("메뉴 선택 : ");
            int inputNum = Integer.parseInt(sc.nextLine());


            switch (inputNum) {
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
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘 못입력하셨습니다. 다시 입력해 주세요");
            }
        }
    }

    public void selectAll(){

//        Book[] bList = Arrays.copyOf(lc.selectAll(),lc.selectAll().length);
        Book[] bList = lc.selectAll();

        for(int i=0; i<bList.length; i++){
            System.out.println(i+" 번째 도서 : "+bList[i]);
        }
    }

    public void searchBook(){
        System.out.print("검색할 제목 키워드 : ");
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
    }

    public void rentBook(){
        selectAll();
        System.out.print("대여할 도서 번호 선택 : ");
        int index = Integer.parseInt(sc.nextLine());
        int result = lc.rentBook(index);

        if(result==0){
            System.out.println("성공적으로 대여되었습니다.");
        } else if (result == 1) {
            System.out.println("나이 제한으로 대여 불가능입니다.");
        } else if (result==2) {
            System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었으니 마이페이지에서 확인하세요.");
        }


    }

}
