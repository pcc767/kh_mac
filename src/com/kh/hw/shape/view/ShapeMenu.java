package com.kh.hw.shape.view;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

import java.util.Scanner;

public class ShapeMenu {

    public static Scanner sc = new Scanner(System.in);

    TriangleController tc = new TriangleController();
    SquareController scr = new SquareController();

    public void inputMenu() {
        while(true) {
            System.out.println("===== 도형 프로그램 =====");
            System.out.println("3. 삼각형");
            System.out.println("4. 사각형");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 번호 : ");

            int num = Integer.parseInt(sc.nextLine());

            switch(num) {
                case 3 :
                    triangleMenu();
                    break;

                case 4 :
                    squareMenu();
                    break;

                case 9 :
                    System.out.println("프로그램 종료");
                    break;

                default :
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요\n");
                    continue;
            }
            break;

        }

    }

    public void triangleMenu(){
        while(true) {
            System.out.println("===== 삼각형 =====");
            System.out.println("1. 삼각형 면적");
            System.out.println("2. 삼각형 색칠");
            System.out.println("3. 삼각형 정보");
            System.out.println("9. 메인으로");
            System.out.print("메뉴 번호 : ");
            int num = Integer.parseInt(sc.nextLine());

            switch(num) {
                case 1 :
                    inputSize(3,1);
                    continue;

                case 2 :
                    inputSize(3,2);
                    continue;

                case 3 :
                    printInformation(3);
                    continue;

                case 9 :
                    System.out.println("메인으로 돌아갑니다.\n");
                    inputMenu();
                    break;

                default :
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요");
                    continue;
            }
            break;
        }

    }


    public void squareMenu(){
        while(true) {
            System.out.println("===== 사각형 =====");
            System.out.println("1. 사각형 둘레");
            System.out.println("2. 사각형 면적");
            System.out.println("3. 사각형 색칠");
            System.out.println("4. 사각형 정보");
            System.out.println("9. 메인으로");
            System.out.print("메뉴 번호 : ");

            int num = Integer.parseInt(sc.nextLine());

            switch(num) {
                case 1 :
                    inputSize(4,1);
                    continue;

                case 2 :
                    inputSize(4,2);
                    continue;

                case 3 :
                    inputSize(4,3);
                    continue;

                case 4 :
                    printInformation(4);
                    continue;

                case 9 :
                    System.out.println("메인으로 돌아갑니다.\n");
                    inputMenu();
                    break;

                default :
                    System.out.println("잘못된 번호입니다. 다시 입력해주세요\n");
                    continue;
            }
            break;

        }
    }

    public void inputSize(int type, int menuNum) {
        double height = 0;
        double width =0;

        if(type == 3) {
            switch(menuNum) {
                case 1 :
                    System.out.print("높이 : ");
                    height = Double.parseDouble(sc.nextLine());
                    System.out.print("너비 : ");
                    width = Double.parseDouble(sc.nextLine());
                    System.out.println("삼각형 면적은 : "+tc.calcArea(height, width));
                    break;

                case 2 :
                    System.out.print("색깔을 입력하세요 : ");
                    tc.paintColor(sc.nextLine());
                    System.out.println("색이 수정되었습니다.");
                    break;
            }
        }else if(type == 4) {
            switch(menuNum) {
                case 1:
                    System.out.print("높이 : ");
                    height = Double.parseDouble(sc.nextLine());
                    System.out.print("너비 : ");
                    width = Double.parseDouble(sc.nextLine());
                    System.out.println("삼각형 둘레는 : "+scr.calPerimeter(height, width));
                    break;

                case 2:
                    System.out.print("높이 : ");
                    height = Double.parseDouble(sc.nextLine());
                    System.out.print("너비 : ");
                    width = Double.parseDouble(sc.nextLine());
                    System.out.println("사각형 면적은 : "+scr.calcArea(height, width));
                    break;

                case 3:
                    System.out.print("색깔을 입력하세요 : ");
                    scr.paintColor(sc.nextLine());
                    System.out.println("색이 수정되었습니다.");
                    break;
            }
        }

    }

    public void printInformation(int type) {
        if(type == 3) {
            System.out.println(tc.print());
        }else if(type == 4) {
            System.out.println(scr.print());
        }
    }

}
