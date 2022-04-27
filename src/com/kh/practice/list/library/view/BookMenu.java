package com.kh.practice.list.library.view;

import com.kh.practice.list.library.controller.BookController;
import com.kh.practice.list.library.model.vo.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookMenu {

    private static Scanner sc = new Scanner(System.in);
    private BookController bc = new BookController();

    public void mainMenu() {
        System.out.println("== Welcome KH Library ==");

        while(true) {
            System.out.println("******* 메인 메뉴 *******");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서 명 오름차순 정렬");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 선택 : ");
            int inputNum = Integer.parseInt(sc.nextLine());

            switch (inputNum) {
                case 1:
                    insertBook();
                    break;
                case 2:
                    selectList();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    deleteBook();
                    break;
                case 5:
                    ascBook();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘 못 입력하셨습니다. 다시 입력해 주세요.");
            }
        }
    }

    public void insertBook(){
        String category = null;

        System.out.print("1. 도서명 입력받기 : ");
        String title = sc.nextLine();
        System.out.print("2. 저자멸 입력받기 : ");
        String author = sc.nextLine();
        System.out.print("3. 장르 입력받기(1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
        int category_ = Integer.parseInt(sc.nextLine());

        switch (category_){
            case 1 :
                category = "인문";
                break;
            case 2 :
                category = "자연과학";
                break;
            case 3 :
                category = "의료";
                break;
            case 4 :
                category = "기타";
                break;
        }

        System.out.print("4. 가격 입력받기 : ");
        int price = Integer.parseInt(sc.nextLine());

        Book bk = new Book(title, author, category, price);
        bc.insertBook(bk);
    }

    public void selectList() {
        ArrayList<Book> bookList = new ArrayList<>(bc.selectList());
        if(bookList.isEmpty()){
            System.out.println("존재하는 도서가 없습니다.");
        }
        if(!bookList.isEmpty()){
            for(int i=0; i<bookList.size(); i++){
                System.out.println(bookList.get(i));
            }
        }
    }

    public void searchBook(){
        System.out.print("검색할 도서명 : ");
        String keyword = sc.nextLine();

        ArrayList<Book> searchList = new ArrayList<>(bc.searchBook(keyword));

        if(searchList.isEmpty()){
            System.out.println("검색 결과가 없습니다.");
        }
        if(!searchList.isEmpty()){
            for (int i=0; i<searchList.size(); i++){
                System.out.println(searchList.get(i));
            }
        }

    }

    public void deleteBook(){
        System.out.print("삭제할 도서명 : ");
        String title = sc.nextLine();
        System.out.print("삭제할 저장명 : ");
        String author = sc.nextLine();

        boolean remove =  bc.deleteBook(title, author);

        if(remove) {
            System.out.println("성공적으로 삭제되었습니다.");
        }
        if(!remove) {
            System.out.println("삭제할 도서를 찾지 못했습니다.");
        }
    }

    public void ascBook(){
        if(bc.ascBook() == 1) {
            System.out.println("정렬에 성공하였습니다.");
        } else {
            System.out.println("정렬에 실패하였습니다.");
        }
    }


}
