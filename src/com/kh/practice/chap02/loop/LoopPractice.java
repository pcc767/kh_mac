package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

        public static Scanner sc = new Scanner(System.in);

        public void practice1() {

            System.out.print("1이상의 숫자를 입력하세요 : ");
            int iNum = Integer.parseInt(sc.nextLine());

            if(iNum > 1) {
                for(int i=0; i<iNum; i++) {
                    System.out.print((i+1)+" ");
                }
            } else if (iNum < 1) {
                System.out.println("1 이상의 숫자를 입력해 주세요");
            }
        }

        public void practice2() {

            while(true) {
                System.out.print("1이상의 숫자를 입력하세요 : ");
                int iNum = Integer.parseInt(sc.nextLine());

                if(iNum <= 0) {
                    System.out.println("1이상의 숫자를 입력해 주세요");
                    continue;
                }
                for(int i=0; i<iNum; i++) {
                    System.out.println((i+1)+" ");
                }
                break;
            }

        }

        public void practice3() {

            while(true) {
                System.out.print("1이상의 숫자를 입력하세요 : ");
                int iNum = Integer.parseInt(sc.nextLine());

                if(iNum <= 0) {
                    System.out.println("1이상의 숫자를 입력해 주세요");
//				continue;
                }

                for(int i=0; i<iNum; i++) {
                    System.out.println((iNum-i)+" ");
                }
                break;
            }
        }

        public void practice4() {

            while(true) {
                System.out.print("1이상의 숫자를 입력하세요 : ");
                int iNum = Integer.parseInt(sc.nextLine());

                if(iNum <= 0) {
                    System.out.println("1이상의 숫자를 입력해 주세요");
                    continue;
                }
                for(int i=0; i<iNum; i++) {
                    System.out.println((iNum-i)+" ");
                }
                break;
            }

        }

        public void practice5() {

            System.out.print("정수를 하나 입력하세요 : ");
            int iNum = Integer.parseInt(sc.nextLine());

            int sum = 0;
            for(int i=0; i<iNum; i++) {
                sum += i;
                System.out.print(i+1);

                if((i+1) <= (iNum-1)) {
                    System.out.print("+");
                } else {
                    System.out.print("="+sum);
                }
            }
        }

        public void practice6() {

            System.out.print("첫 번째 숫자 : ");
            int iNum1 = Integer.parseInt(sc.nextLine());
            System.out.print("두 번째 숫자 : ");
            int iNum2 = Integer.parseInt(sc.nextLine());

            if(iNum1>0 && iNum2>0) {
                if(iNum1 > iNum2) {
                    for(int i=iNum2; i<=iNum1; i++) {
                        System.out.print(i+" ");
                        if(i == iNum1) {
                            return;
                        }
                    }
                } else {
                    for(int i=iNum1; i<=iNum2; i++) {
                        System.out.print(i+" ");
                        if(i == iNum2) {
                            return;
                        }
                    }
                }
            } else {
                System.out.println("1 이상의 숫자를 입력해 주세요");
            }
        }

        public void practice7() {

            while(true) {
                System.out.print("첫 번째 숫자 : ");
                int iNum1 = Integer.parseInt(sc.nextLine());
                System.out.print("두 번째 숫자 : ");
                int iNum2 = Integer.parseInt(sc.nextLine());

                if(iNum1>0 && iNum2>0) {
                    if(iNum1 > iNum2) {
                        for(int i=iNum2; i<=iNum1; i++) {
                            System.out.print(i+" ");
                            if(i == iNum1) {
                                return;
                            }
                        }
                    } else {
                        for(int i=iNum1; i<=iNum2; i++) {
                            System.out.print(i+" ");
                            if(i == iNum2) {
                                return;
                            }
                        }
                    }
                } else {
                    System.out.println("1 이상의 숫자를 입력해 주세요");
                    continue;
                }
            }
        }

        public void practice8() {

            System.out.print("출력할 구구단 : ");
            int guNum = Integer.parseInt(sc.nextLine());
            System.out.println("===== "+guNum+"단 =====");

            for(int i=1; i<10; i++) {
                System.out.println(guNum+" * "+i+" = "+guNum*i);
            }
            System.out.println("===============");
        }

        public void practice9() {
            System.out.print("출력할 구구단 : ");
            int guNum = Integer.parseInt(sc.nextLine());

            if(guNum > 9 || guNum <= 0){
                System.out.println("9 이하 0 이상의 숫자만 입력해 주세요");
            }

            for (int i = guNum; i < 10; i++) {
                System.out.println("===== "+i+"단 =====");
                for (int j = 1; j < 10; j++) {
                    System.out.println(i+" * "+j+" = "+guNum*j);
                }
            }
        }

        public void practice10() {

            while(true) {
                System.out.print("출력할 구구단 : ");
                int guNum = Integer.parseInt(sc.nextLine());

                if(guNum > 9 || guNum <= 0){
                    System.out.println("9 이하 0 이상의 숫자만 입력해 주세요");
                    continue;
                }
                for (int i = guNum; i < 10; i++) {
                    System.out.println("===== "+i+"단 =====");
                    for (int j = 1; j < 10; j++) {
                        System.out.println(i+" * "+j+" = "+guNum*j);
                    }
                }
                break;
            }
        }

        public void practice11() {
            System.out.println("시작 숫자 : ");
            int startNum = Integer.parseInt(sc.nextLine());
            System.out.println("공차 : ");
            int iNum = Integer.parseInt(sc.nextLine());

            System.out.println(startNum);
            for(int i = startNum; i < iNum*10  ; i++) {
                System.out.println(i+iNum);
                i+=iNum;
            }
        }

        public void practice12() {

            while(true) {
                System.out.print("연산자(+,-,*,/,%) : ");
                String str = sc.nextLine();

                if(str.equals("exit")) {
                    System.out.print("프로그램을 종료합니다.");
                    return;
                }

                System.out.print("정수1 : ");
                int iNum1 = Integer.parseInt(sc.nextLine());
                System.out.print("정수2 : ");
                int iNum2 = Integer.parseInt(sc.nextLine());

                if (!str.equals("+") && !str.equals("-") && !str.equals("*") && !str.equals("/") && !str.equals("%")) {
                    System.out.print("없는 연산자 입니다. 다시 입력해주세요.");
                    continue;
                } else if (iNum2 == 0) {
                    System.out.print("0으로 나눌 수 없습니다. 다시 입력해 주세요");
                    continue;
                }

                switch(str) {
                    case "+" :
                        System.out.println(iNum1+"+"+iNum2+" = "+(iNum1+iNum2));
                        break;
                    case "-" :
                        System.out.println(iNum1+"-"+iNum2+" = "+(iNum1-iNum2));
                        break;
                    case "*" :
                        System.out.println(iNum1+"*"+iNum2+" = "+(iNum1*iNum2));
                        break;
                    case "/" :
                        System.out.println(iNum1+"/"+iNum2+" = "+(iNum1/iNum2));
                        break;
                    case "%" :
                        System.out.println(iNum1+"%"+iNum2+" = "+(iNum1%iNum2));
                        break;
                }
            }
        }


        public void practice13() {
            System.out.print("정수 입력 : ");
            int iNum = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < iNum ; i++) {
                for (int j = 0; j < i+1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        }

        public void practice14() {
            System.out.print("정수 입력 : ");
            int iNum = Integer.parseInt(sc.nextLine());

            for (int i = 0; i < iNum; i++) {
                for(int j = 0; j < iNum-i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }

        public void practice15() {
            System.out.print("숫자 : ");
            int iNum = Integer.parseInt(sc.nextLine());

            if(iNum < 2 ) {
                System.out.println("잘 못 입력하셨습니다.");
            }
            for (int i = 2; i <= iNum; i++) {
                if(i==iNum) {
                    System.out.println("소수입니다.");
                }else if(iNum%i==0) {
                    System.out.println("소소가 아닙니다.");
                    break;
                }
            }
        }


        public void practice16() {

            while (true) {
                System.out.print("숫자 : ");
                int iNum = Integer.parseInt(sc.nextLine());

                if (iNum < 2) {
                    System.out.println("잘 못 입력하셨습니다.");
                    continue;
                }

                for (int i = 2; i <= iNum; i++) {
                    if (i == iNum) {
                        System.out.println("소수입니다.");
                    } else if (iNum % i == 0) {
                        System.out.println("소수가 아닙니다.");
                        break;
                    }
                }
            }
        }

        public void practice17() {

            int repeat = 0;
            int count = 0;
            while (true) {
                System.out.print("숫자 : ");
                int iNum = Integer.parseInt(sc.nextLine());

                if (iNum < 2) {
                    System.out.println("잘 못 입력하셨습니다.");
                    continue;
                }

                for(int i=2; i<=iNum; i++) {
                    for(int j=2; j<=i;j++) {
                        if(i%j==0) {
                            count++;
                        }
                    }
                    if(count==1) {
                        System.out.print(i+" ");
                        repeat++;
                    }
                    count=0;
                }

                System.out.println();
                System.out.println("2 부터"+iNum+"까지의 소수의 개수는"+repeat+"입니다.");
                break;
            }

        }

        public void practice18() {
            System.out.print("자연수 하나를 입력하세요 : ");
            int iNum = Integer.parseInt(sc.nextLine());
            int repeat = 0;

            for(int i=2; i<=iNum; i++){
                if (i%2==0 && i%3==0) {
                    repeat++;
                } else if(i%2==0 || i%3==0) {
                    System.out.print(i+" ");
                }
            }
            System.out.println();
            System.out.println("count : "+repeat);
        }


}
