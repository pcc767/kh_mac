package com.kooki.shape.view;

import com.kooki.shape.controller.SquareController;
import com.kooki.shape.controller.TriangleController;

import java.util.Scanner;

public class ShapeMenu {

    public static Scanner sc = new Scanner(System.in);
    TriangleController tc = new TriangleController();
    SquareController scr = new SquareController();

    public void inputMenu() {
        System.out.println("===== 도형 프로그램 =====");
        System.out.println("3. 삼각형");
        System.out.println("4. 사각형");
        System.out.println("9. 프로그램 종료");
        System.out.print("메뉴 번호 : ");
        int inputNum = Integer.parseInt(sc.nextLine());

        switch (inputNum) {

            case 3 :
                triangleMenu();
                break;
            case 4 :
                squareMenu();
                break;
            case 9 :
                System.out.println("프로그램을 종료합니다.");
                return;
            default:
                System.out.println("잘못된 번호입니다.");
        }

    }

    private void triangleMenu() {

        while (true) {
            System.out.println("===== 삼각형 =====");
            System.out.println("1. 삼각형 면적");
            System.out.println("2. 삼각형 색칠");
            System.out.println("3. 삼각형 정보");
            System.out.println("9. 메인으로");
            System.out.print("메뉴 번호 : ");
            int inputNum = Integer.parseInt(sc.nextLine());

            switch (inputNum) {
                case 1:
                    inputSize(3, 1);
                    continue;
                case 2:
                    inputSize(3, 2);
                    continue;
                case 3:
                    printInformation(3);
                    continue;
                case 9:
                    System.out.println("메인으로 돌아갑니다.");
                    inputMenu();
                    return;
                default:
                    System.out.println("잘못된 번호입니다.");
            }
        }
    }

    private void squareMenu() {

        while (true) {
            System.out.println("===== 사각형 =====");
            System.out.println("1. 사각형 둘레");
            System.out.println("2. 사각형 면적");
            System.out.println("3. 사각형 색칠");
            System.out.println("4. 사각형 정보");
            System.out.println("9. 메인으로");
            System.out.print("메뉴 번호 : ");
            int inputNum = Integer.parseInt(sc.nextLine());

            switch (inputNum) {
                case 1:
                    inputSize(4, 1);
                    continue;
                case 2:
                    inputSize(4, 2);
                    continue;
                case 3:
                    inputSize(4, 3);
                    continue;
                case 4:
                    printInformation(4);
                    continue;
                case 9:
                    System.out.println("메인으로 돌아갑니다.");
                    inputMenu();
                    return;
                default:
                    System.out.println("잘못된 번호입니다.");
            }

        }

    }

    private void inputSize(int type, int menuNum) {

        double width = 0;
        double height = 0;

        if (type == 3) {

            switch (menuNum) {
                case 1:
                    System.out.print("높이 : ");
                    width = Integer.parseInt(sc.nextLine());
                    System.out.print("너비 : ");
                    height = Integer.parseInt(sc.nextLine());
                    System.out.println("삼각형 면적 : " + tc.calcArea(height, width));
                    break;
                case 2:
                    System.out.print("색깔을 입력하세요 : ");
                    tc.paintColor(sc.nextLine());
                    System.out.println("색이 수정되었습니다.");
                    break;
            }
        } else if (type == 4) {

            if (menuNum == 1 || menuNum == 2) {
                System.out.print("높이 : ");
                width = Integer.parseInt(sc.nextLine());
                System.out.print("너비 : ");
                height = Integer.parseInt(sc.nextLine());
            }

            switch (menuNum) {
                case 1:
                    System.out.println("사각형의 둘레 : " + scr.calcPerimeter(height, width));
                    break;
                case 2:
                    System.out.println("사각형의 면적 : " + scr.calcArea(height, width));
                    break;
                case 3:
                    System.out.print("색깔을 입력하세요 : ");
                    scr.paintColor(sc.nextLine());
                    System.out.println("색이 수정되었습니다.");
                    break;
            }
        }

    }

    private void printInformation(int type) {

        if(type == 3){
            System.out.println(tc.print());
        } else if(type == 4){
            System.out.println(scr.print());
        }
    }


}
