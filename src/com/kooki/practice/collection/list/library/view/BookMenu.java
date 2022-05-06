package com.kooki.practice.collection.list.library.view;


import com.kh.practice.list.library.model.vo.Book;
import com.kooki.practice.collection.list.library.controller.BookController;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

    public static Scanner sc = new Scanner(System.in);
    BookController bc = new BookController();

    public void mainMenu(){
        while (true) {
            System.out.println("=== Welcome KH Library ===");
            System.out.println("***** 메인 메뉴 *****");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서명 오름차순 정렬");
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
                case 5 :
                    ascBook();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요");
            }
        }
    }


    private void insertBook() {
        System.out.println("***** 새 도서 추가 *****");
        System.out.print("도서명 입력받기 : ");
        String title = sc.nextLine();
        System.out.print("저자명 입력받기 : ");
        String author = sc.nextLine();
        System.out.print("장르 입력받기(1.인문 / 2.자연과학 / 3.의료 / 4.기타) : ");
        int beforeCategory = Integer.parseInt(sc.nextLine());
        System.out.print("가격 입력받기 : ");
        int price = Integer.parseInt(sc.nextLine());

        String category = "";
        switch (beforeCategory){
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

        Book book = new Book(title,author,category,price);
        bc.insertBook(book);
    }

    private void selectList() {
        ArrayList<Book> bookList = new ArrayList<>();
        bookList = bc.selectList();
        if(bookList.isEmpty()) {
            System.out.println("존재하는 도서가 없습니다.");
            return;
        }

        for(int i=0; i< bookList.size(); i++)
            System.out.println(bookList.get(i));
    }

    private void searchBook() {
        System.out.print("검색할 도서명 : ");
        String title = sc.nextLine();
        ArrayList<Book> bookList = bc.searchBook(title);

        if(bookList.isEmpty()) {
            System.out.println("검색 결과가 없습니다.");
            return;
        }

        for(int i=0; i< bookList.size(); i++)
            System.out.println(bookList.get(i));
    }

    private void deleteBook() {
        System.out.print("삭제할 도서명 : ");
        String deleteTitle = sc.nextLine();
        System.out.print("삭제할 저자명 : ");
        String deleteAuthor = sc.nextLine();

        Book remove = bc.deleteBook(deleteTitle,deleteAuthor);

        if(remove != null){
            System.out.println("성공적으로 삭제되었습니다.");
            return;
        }

        System.out.println("삭제할 도서를 찾지 못했습니다.");

    }

    private void ascBook() {
        if(bc.ascBook() == 1){
            System.out.println("정령에 성공하였습니다.");
            return;
        }
        System.out.println("정렬에 실패하였습니다.");

    }


}
