package com.kh.practice.book.view;

import com.kh.practice.book.controller.BookController;
import com.kh.practice.book.model.vo.Book;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class BookMenu {

    public static Scanner sc = new Scanner(System.in);
    BookController bc = new BookController();
    Book[] bArr;

    public BookMenu(){
        bc.makeFile();
        bArr = bc.fileRead();
    }

    public void mainMenu(){
        System.out.println("1. 도서 추가 저장");
        System.out.println("2. 저장 도서 출력");
        System.out.println("9. 프로그램 끝내기");
        System.out.print("메뉴 번호 : ");
        int inputNum = Integer.parseInt(sc.nextLine());

        switch (inputNum){
            case 1 :
                fileSave();
                break;
            case 2 :
                fileRead();
                break;
            case 9 :
                System.out.println("프로그램이 종료되었습니다.");
                return;
            default :
                System.out.println("잘 못 입력하셨습니다 .다시 입력해 주세요.");
        }

    }

    public void fileSave() {
        System.out.println("도서명 : ");
        String title = sc.nextLine();
        System.out.println("저자명 : ");
        String author = sc.nextLine();
        System.out.println("도서 가격 : ");
        int price = Integer.parseInt(sc.nextLine());
        System.out.println("출판 날짜(yyyy-mm-dd) : ");
        String[] date = sc.nextLine().split("-");

        int[] arrDate = new int[]{
                Integer.parseInt(date[0]),
                Integer.parseInt(date[1]),
                Integer.parseInt(date[2]),
        };

        Calendar date1 = Calendar.getInstance();
        date1.set(Calendar.YEAR,arrDate[0]);
        date1.set(Calendar.MONTH, arrDate[1]);
        date1.set(Calendar.DATE, arrDate[1]);

        System.out.println("할인율 : ");
        double discount = Double.parseDouble(sc.nextLine());

        for(int i=0; i< bArr.length; i++){
            if(bArr[i]==null){
                bArr[i] = new Book(title,author,price,date1,discount);
            }
        }

        bc.fileSave(bArr);

    }

    private void fileRead() {

        Book[] book = bc.fileRead();
        System.out.println(Arrays.toString(book));

    }

}
