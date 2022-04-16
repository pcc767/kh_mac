package com.kooki.codeChallenge;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;
import java.util.Scanner;

public class CodeChallenge_1_Basic {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // 순서대로 코드 짜주세요.
        // 1. 알맞은 변수 선언하고 출력하기
        //  Ex) 정수형으로 1000 출력 하기
        int value = 1000;
        System.out.println(value);

        // 1.1 정수형으로 94743616344 출력하기
        long val_1 = 94743616344L;
        System.out.println(val_1);

        // 1.2 실수형으로 3.14 출력하기
        double val_2 = 3.14;
        System.out.println(val_2);

        // 1.3 100을 3으로 나누고, 소수점 표시하기 ex) 33.333333

        double val_3 = 100 / 3.0;
        System.out.println(val_3);

        // 1.4 실수 12.71을 선언하고, 소수점 버리기 ex) 12
        double val_4 = 12.71;
        System.out.println((int)val_4);


        // 1.5 byte b에 128로 초기화 억지로 시키기

        System.out.println((byte)128);



//		2. 각종 연산자와 if문 Switch문 함께 사용하기
        // Ex) val2라는 인자가 100보다 큰지 확인하고, 결과 '예' '아니오' 출력하기
        int val2 = 123;
        if(val2 > 100) {
            System.out.println("예");
        }else {
            System.out.println("아니오");
        }

        //2.1 한수를 입력받아 2의 배수, 3의 배수, 5의 배수인지 확인하세요.

        System.out.println("숫자 입력 : ");
        int inputNum = Integer.parseInt(sc.nextLine());

        if (inputNum % 2 == 0){
            System.out.println("2의 배수입니다.");
        }
        if (inputNum % 3 == 0) {
            System.out.println("3의 배수입니다.");
        }
        if (inputNum % 5 == 0){
            System.out.println("5의 배수입니다.");
        }


        //2.2 // 1~300 중에 한수를 입력받고,
        // 1~100이하 구간, 100초과 ~ 200 이하 구간, 200~초과 구간으로 분리하여 출력하세요.
        // 50 = 1~100 구간 , 124 = 100~200구간
        System.out.println("숫자 입력(1~300사이) : ");
        int inputNum_1 = Integer.parseInt(sc.nextLine());

        if (inputNum_1<100){
            System.out.println("1~100 구간입니다.");
        } else if (inputNum_1>100 && inputNum_1<200){
            System.out.println("100초과 ~ 200이하 구간입니다.");
        } else if (inputNum_1>200){
            System.out.println("200초가 구간입니다.");
        }



        //2.3 switch문을 통해 숫자와 문자를 구별하는 코드를 작성하세요.
        System.out.println("숫자 및 문자 입력 : ");
        int inputNum_2 = Integer.parseInt(sc.nextLine());

        switch (inputNum_2) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                System.out.println("숫자입니다.");
                break;
            default:
                System.out.println("문자입니다.");
                break;
        }




        //2.4 ID/PW를 입력받고, ID가 5글자 이상이고, ID에 PW가 포함되지 않은 상태를
        //    if문 하나로 체크해주세요.
        System.out.println("ID를 입력 : ");
        String inputId = sc.nextLine();
        System.out.println("PW를 입력 : ");
        String inputPw = sc.nextLine();

        if(inputId.length()<5){
            System.out.println("5글자 이상입니다.");
        }
        if(inputPw.contains(inputId)){
            System.out.println("PW에 ID가 포함될 수 없습니다.");
        }


//		3. 반복문
        // ex) 1~10까지 출력하기
        for(int i =0; i<10; i++) {
            System.out.println(i);
        }

        // 3.1 구구단 2단만 출력하기 ex) 2 X 1 = 2 꼴로

        // 3.2 1부터 100까지 짝수만 골라서 출력하기

        // 3.3 1부터 100까지 수 중에 5의 배수와 7의 배수를 확인하고 출력하기.

        // 3.4 1부터 1000까지 수 중에
        //     3의 배수이면서 4의 배수인 수를 모두 찾고,
        //     이중에 20번을 찾으면 반복문 정지하기.


//		4. 중첩 반복문
        // 4.1 구구단 1단부터 9단까지 모두 출력하는데, 단이 바뀔때마다 "x단" 표시하기
        // ex) 2 X 9 = 18;
        //     3단 시작!
        //     3 X 1 = 3

        // 4.2 구구단 1단부터 9단까지 모두 출력하는데
        // 9단까지 가로로 출력하기
        // ex) 2X1=1 3X1=3 4X1=4 ...
        //     2X2=2 3X2=6 4X2=8

        // 4.3 사용자에게 1~100 수중 2개를 입력 받고, 두 수의 범위 안의 숫자 모두 출력하기.
        //     단, 무한 반복하기.
        // 입력 53, 47
        // 출력 48, 49, 50, 51, 52

        System.out.println("첫번째 숫자 : ");
        int firNum = Integer.parseInt(sc.nextLine());
        System.out.println("두번째 숫자 : ");
        int secNum = Integer.parseInt(sc.nextLine());

        if(firNum<secNum){
            int temp = firNum;
            firNum = secNum;
            secNum = temp;
        }

        for(int i=secNum; i<firNum; i++){
            System.out.println(i+"");
        }





//		5. 배열
//		5.1 배열 정수형으로 10개 칸을 선언하고, 1부터 10까지로 값 초기화 하기

//		5.2 배열 정수형으로 100개까지 선언하고, 3과 7의 배수 100개 찾아서 넣기
        // 21, 42 .....
        System.out.println("--------------------------------------");
        int[] intArrays = new int[100];
        int numCheck = 1;
        int count = 0;

        while(true){
            numCheck++;
            if(numCheck%3==0 && numCheck%7==0){
                intArrays[count]=numCheck;
                count++;
            }
            if(count==100){
                break;
            }
        }
        System.out.println(Arrays.toString(intArrays));


//		5.3 배열 String형으로 10개 공간 선언하고 사용자의 값을 입력받아 값 저장하기.
        //  단, exit로 입력시 바로 종료하고 저장 받은 데이터 모두 출력
        System.out.println("--------------------------------------");
        String[] strArrays = new String[10];
        int count_1 = 0;

        while (true) {
            System.out.print("입려할 문자 개수(1~10) : ");
            int num = Integer.parseInt(sc.nextLine());

            if(num<=10) {
                if(num<=10-count_1) {
                    for (int i = 0; i < num; i++) {
                        System.out.print("입력할 문자" + (i + 1) + " : ");
                        String str = sc.nextLine();
                        strArrays[count_1] = str;
                        if(str.equals("exit")){
                            System.out.println(Arrays.toString(strArrays));
                            return;
                        }
                        count_1++;
                    }
                }else
                    System.out.println("다시 입력하세요");
            }else{
                if(num+count_1>=10)
                    System.out.println("다시 입력하세요");
            }
            if(0 == 10-count_1)
                break;

            System.out.println("입력한 문자 개수 : "+count_1);
            System.out.println("입력할 남은 횟수 : "+(10-count_1));

        }

        System.out.println(Arrays.toString(strArrays));

        System.out.println("숫자로 입력된 배열");
        String[] strArray_1 = new String[10];

        for(int i=0; i< strArrays.length; i++){
            strArray_1[i] = strArrays[i].replaceAll("[^\\d]","");
        }
        System.out.println(Arrays.toString(strArray_1));




//		5.4 배열 String형으로 10개 공간 선언하고 사용자의 값을 입력받아 값 저장하기.
        //  이중에 숫자로 입력된 값만 출력하기



//		5.5 배열 String형으로 10개 공간 선언하고 사용자에게 '영문' 값을 입력받아 값 저장하기.
        //  이중에 알파벳 별로 모두 count 해보기.
        // abc bbb ccc
        // a : 1개
        // b : 4개
        // c : 4개
    }
}
