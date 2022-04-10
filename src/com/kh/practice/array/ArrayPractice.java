package com.kh.practice.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {

    public static Scanner sc = new Scanner(System.in);

    public void practice1() {

        int[] array = new int[10];
        for(int i=0; i<array.length; i++) {
            System.out.print(i+1+" ");
        }

    }


    public void practice2() {

        int[] array = new int[10];
        for(int i = array.length; i>0; i--) {
            System.out.print(i+" ");
        }

    }


    public void practice3() {

        System.out.print("양의 정수 : ");
        int num = Integer.parseInt(sc.nextLine());
        int[] arrayNum = new int[num];

        for (int i = 0; i < num; i++) {
            arrayNum[i] = i + 1;
            System.out.print(arrayNum[i]+" ");
        }

    }


    public void practice4() {

        String[] strArray = new String[] {"사과","귤","포도","복숭아","참외"};
        for(int i=0; i<strArray.length; i++) {
            if(strArray[i]=="귤") {
                System.out.println("귤");
            }
        }

    }


    public void practice5() {

        System.out.print("문자열 : ");
        String str = sc.nextLine();
        System.out.print("문자 : ");
        char cha = sc.next().charAt(0);
        char[] arrayCha = new char[str.length()];
        int count = 0;

        System.out.printf("%s에 %s가 존재하는 위치(인덱스) : ",str,cha);

        for(int i=0; i<str.length(); i++){
            arrayCha[i] = str.charAt(i);
            if(arrayCha[i] == cha) {
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.printf("\n"+"%s 개수 : %d",cha,count);

    }


    public void practice6() {

        System.out.println("0~6 사이의 숫자 입력 : ");
        int iNum = Integer.parseInt(sc.nextLine());
        String[] days = new String[] {"월","화","수","목","금","토","일"};

        if(iNum > 6) {
            System.out.println("잘 못 입력하셨습니다.");
            return;
        }

        System.out.println(days[iNum]+"요일");

    }


    public void practice7() {

        System.out.print("정수 : ");
        int iNum = Integer.parseInt(sc.nextLine());
        int[] arrayNum = new int[iNum];
        int total = 0;

        for(int i=0; i<iNum; i++) {
            System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
            arrayNum[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < iNum; i++) {
            System.out.print(arrayNum[i]+" ");
            total+=arrayNum[i];
        }
        System.out.println();
        System.out.println("총합 : "+ total);

    }

    public void practice8() {

        int num = 1;

        while (true) {
            System.out.print("정수 : ");
            int iNum = Integer.parseInt(sc.nextLine());
            int[] arrNum = new int[iNum];

            if (iNum % 2 == 0 || iNum < 3) {
                System.out.println("다시 입력하세요");
                continue;
            }
            for (int i = 0; i < iNum; i++) {
                if (i < iNum / 2) {
                    arrNum[i] = num++;
                } else {
                    arrNum[i] = num--;
                }

                if (i < iNum - 1) {
                    System.out.print(arrNum[i] + "," + " ");
                } else {
                    System.out.print(arrNum[i]);
                }
            }
            break;
        }

    }


    public void practice9() {

        System.out.print("치킨 이름을 입력하세요 : ");
        String str = sc.nextLine();
        String[] arrayStr = new String[] {"양념","불닭","간장"};

        for(int i=0; i<arrayStr.length; i++) {
            if(arrayStr[i].equals(str)) {
                System.out.println(arrayStr[i]+"치킨 배달 가능");
                return;
            }
        }

        System.out.println(str+"치킨은 없는 메뉴입니다.");
    }


    public void practice10() {

        System.out.print("주민등록번호(-포함) :");
        String str = sc.nextLine();
        char[] arrayStr = new char[str.length()];

        for(int i = 0; i<arrayStr.length; i++) {
            arrayStr[i] = str.charAt(i);
            if(i>7 ) {
                System.out.print("*");
            } else {
                System.out.print(arrayStr[i]);
            }
        }

    }



    public void practice11() {

        Random random = new Random();
        int[] arrayNum = new int[10];

        for(int i=0; i<arrayNum.length; i++) {
            int randomValue = random.nextInt(10)+1;
            arrayNum[i] = randomValue;
            System.out.print(arrayNum[i]+" ");
        }

    }


    public void practice12() {

        Random random = new Random(System.currentTimeMillis());
        int[] arrayNum = new int[10];

        for(int i=0; i<arrayNum.length; i++) {
            arrayNum[i] = random.nextInt(10) + 1;
        }
        System.out.println(Arrays.toString(arrayNum));

        int max = arrayNum[0];
        int min = arrayNum[0];

        for(int i=0; i<arrayNum.length; i++) {
            if(arrayNum[i] > max) {
                max = arrayNum[i];
            }
            if(arrayNum[i] < min) {
                min = arrayNum[i];
            }

        }
        System.out.println("\n"+"최대값 : "+max);
        System.out.println("최소값 : "+min);

    }


    public void practice13() {

        Random random = new Random(System.currentTimeMillis());
        int[] arrayNum = new int[10];

        for(int i=0; i<arrayNum.length; i++) {
            arrayNum[i] = random.nextInt(10)+1;
            for (int j = 0; j < i; j++) {
                if(arrayNum[i] == arrayNum[j]) {
                    i--;
                }
            }
        }

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i]+" ");
        }

    }


    public void practice14() {

        Random random = new Random(System.currentTimeMillis());
        int[] arrayNum = new int[5];

        for(int i=0; i<arrayNum.length; i++) {
            arrayNum[i] = random.nextInt(45)+1;
            for (int j = 0; j < i; j++) {
                if(arrayNum[i] == arrayNum[j]) {
                    i--;
                }
            }
        }

        Arrays.sort(arrayNum);

        for (int i = 0; i < arrayNum.length; i++) {
            System.out.print(arrayNum[i]+" ");
        }

    }

//    public void practice15() {
//
//        System.out.print("문자열 : ");
//        String str = sc.nextLine();
//        char[] chaArray = new char[str.length()];
//        char[] pureArray = new char[str.length()];
//
//        for(int i=0; i<chaArray.length; i++) {
//            chaArray[i] = str.charAt(i);
//        }
//
//        int len = 0;
//        for(int i=0; i<chaArray.length; i++) {
//            for(int j=0; j< pureArray.length; j++) {
//                if(pureArray[j] == chaArray[i]) {
//                    break;
//                }
//                if(pureArray[j]==0) {
//                    len++;
//                    pureArray[j]=chaArray[i];
//                    break;
//                }
//            }
//        }
//        System.out.print("문자열에 있는 문자 : ");
//        for(int i=0; i<len; i++){
//            System.out.print(pureArray[i]);
//            if(i < len-1){
//                System.out.print(", ");
//            }
//        }
//        System.out.println("\n"+"문자개수 : " +len);
//
//    }

    public void practice15(){
        System.out.println("문자열 : ");
        String inputStr = sc.nextLine();
        char[] arrayStr = new char[inputStr.length()];
        char[] pureStr = new char[inputStr.length()];

        for(int i=0; i< arrayStr.length; i++) {
            arrayStr[i] = inputStr.charAt(i);
        }

        int len=0;
        for(int i=0; i< arrayStr.length; i++){
            for(int j=0; j< pureStr.length; j++) {
                if(pureStr[j]==arrayStr[i]) {
                    break;
                }
                if(pureStr[j]==0) {
                    len++;
                    pureStr[j] = arrayStr[i];
                    break;
                }

            }

        }
        for (int i = 0; i < len; i++) {
            System.out.print(pureStr[i]);
            if(i<len-1)
                System.out.print(",");
        }






    }

    public void practice16() {
        System.out.print("배열의 크기를 입력하세요 : ");
        int iSize = Integer.parseInt(sc.nextLine());
        String[] arraySize = new String[iSize];

        int count =0;

        while (true) {

            for (int i = count; i < arraySize.length; i++) {
                System.out.print((i + 1) + "번째 문자열 : ");
                arraySize[i] = sc.nextLine();
                count++;
            }

            System.out.print("더 값을 입력하시겠습니까?(Y/N) : ");
            char ch = sc.nextLine().charAt(0);

            if (ch == 'n' || ch == 'n') {
                System.out.println(Arrays.toString(arraySize));
                break;
            }

            if (ch == 'y' || ch == 'Y') {
                System.out.print("더 입력하고 싶은 개수 : ");
                int moreSize = Integer.parseInt(sc.nextLine());
                String[] arrayMore = new String[arraySize.length+moreSize];

                arrayMore = Arrays.copyOf(arraySize, arrayMore.length);
                arraySize = arrayMore;
                }

        }
    }



}
