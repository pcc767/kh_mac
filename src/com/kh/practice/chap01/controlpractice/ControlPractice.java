package com.kh.practice.chap01.controlpractice;

import java.util.Scanner;

public class ControlPractice {

    public static Scanner sc = new Scanner(System.in);


    public void practice1() {

        System.out.println("1. 입력");
        System.out.println("2. 수정");
        System.out.println("3. 조회");
        System.out.println("4. 삭제");
        System.out.println("5. 종료");
        System.out.print("메뉴 번호를 입력하세요 : ");

        int iNum = Integer.parseInt(sc.nextLine());

        switch (iNum) {
            case 1:
                System.out.println("입력 메뉴 입니다.");
                break;
            case 2:
                System.out.println("수정 메뉴 입니다.");
                break;
            case 3:
                System.out.println("조회 메뉴 입니다.");
                break;
            case 4:
                System.out.println("삭제 메뉴 입니다.");
                break;
            default:
                System.out.println("종료");
                break;
        }
    }


    public void practice2() {

        System.out.print("숫자를 한 개 입력하세요 : ");
        int iNum = Integer.parseInt(sc.nextLine());
        if (iNum > 0 && iNum % 2 == 0) {
            System.out.println("짝수다");
        } else if (iNum % 2 != 0 && iNum > 0) {
            System.out.println("홀수다");
        } else if (iNum < 0) {
            System.out.println("양수만 입력해 주세요");
        }

    }


    public void practice3() {

        System.out.print("국어 점수 : ");
        int kor = Integer.parseInt(sc.nextLine());
        System.out.print("영어 점수 : ");
        int eng = Integer.parseInt(sc.nextLine());
        System.out.print("수학 점수 : ");
        int math = Integer.parseInt(sc.nextLine());

        int total = kor + eng + math;
        double avg = total / 3.0;

        if (kor >= 40 && eng >= 40 && math >= 40) {
            if (avg >= 60) {
                System.out.println("국어 : " + kor);
                System.out.println("영어 : " + eng);
                System.out.println("수학 : " + math);
                System.out.println("축하합니다. 합격입니다.!");
            } else {
                System.out.println("불합격 입니다.");
            }
        }
    }


    public void practice4() {

//		메소드 명 : public void practice4(){}
//		수업 자료(7page)에서 if문으로 되어있는 봄, 여름, 가을, 겨울 예제를 switch문으로 바꿔서 출력하세요.
//		ex 1.
//		1~12 사이의 정수 입력 : 8
//		8월은 여름입니다.
//		ex 2.
//		1~12 사이의 정수 입력 : 99
//		99월은 잘못 입력된 달입니다.

//		if(month == 1 || month == 2 || month == 12)
//		{
//		season = "겨울";
//		} else if(month >= 3 && month <= 5) {
//		season = "봄";
//		} else if(month >= 6 && month <= 8) {
//		season = "여름";
//		} else if(month >= 9 && month <= 11) {
// 		season = "가을";
// 		} else {
//		season = "해당하는 계절이 없습니다.";
//		}

        System.out.print("1~12 사이의 정수 입력 : ");
        int iMonth = Integer.parseInt(sc.nextLine());

        switch (iMonth) {
            case 1:
            case 2:
            case 12:
                System.out.println("겨울");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("봄");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("해당하는 계절이 없습니다.");
                break;

        }
    }

    public void practice5() {

        System.out.print("아이디 : ");
        String sId = sc.nextLine();
        System.out.print("비밀번호 : ");
        String sPw = sc.nextLine();

        String id = "myId";
        String pw = "myPassword12";
        if(sId.equals(id) && sPw.equals(pw)){
            System.out.println("로그인 성공");
        } else if (sId.equals(id)) {
            System.out.println("비밀번호가 틀렸습니다.");
        } else if (sPw.equals(pw)) {
            System.out.println("아이디가 틀려습니다.");
        } else {
            System.out.println("아이디와 비밀번호를 확인해주세요");
        }
    }


    public void practice6() {

        System.out.print("권한을 확인하고자 하는 회원 등급 : ");
        String sGrade = sc.nextLine();

        switch (sGrade) {
            case "관리자"  :
                System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회 , 댓글 작성");
                break;
            case "회원"  :
                System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
                break;
            case "비회원"  :
                System.out.println("게시글 조회");
                break;
        }

    }


    public void practice7() {
        System.out.print("키(m)를 입력해 주세요 : ");
        double iTall = Double.parseDouble(sc.nextLine());
        System.out.print("몸무게(kg)를 입력해 주세요 : ");
        double iWeight = Double.parseDouble(sc.nextLine());
        double iBmi = iWeight / (iTall*2*0.01);
        System.out.println("BMI 지수 : "+iBmi);

        if(iBmi<18.5) {
            System.out.println("저제중");
        } else if(iBmi>18.5 && iBmi<23) {
            System.out.println("정상 체중");
        } else if(iBmi>23 && iBmi<25) {
            System.out.println("과체중");
        } else if(iBmi>25 && iBmi<30) {
            System.out.println("비만");
        } else if(iBmi>30) {
            System.out.println("고도 비만");
        }
    }

    public void practice8() {
        System.out.print("피연산자1을 입력 : ");
        int iNum1 = Integer.parseInt(sc.nextLine());
        System.out.print("피연산자2를 입력 : ");
        int iNum2 = Integer.parseInt(sc.nextLine());
        System.out.print("연산자를 입력(+,-,*,/,%) : ");
        char cOp = sc.nextLine().charAt(0);

        if(iNum1>0 && iNum2>0) {
            switch (cOp) {
                case '+':
                    System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
                    break;
                case '-':
                    System.out.println(iNum1 + " - " + iNum2 + " = " + (iNum1 - iNum2));
                    break;
                case '*':
                    System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2));
                    break;
                case '/':
                    System.out.println(iNum1 + " / " + iNum2 + " = " + ((double) iNum1 / iNum2));
                    break;
                case '%':
                        System.out.println(iNum1 + " % " + iNum2 + " = " + (iNum1 % iNum2));
                        break;
                default:
                    System.out.println("종료합니다.");
                    break;
            }
        }
    }

    public void practice9() {
        System.out.print("중간고사 점수 : ");
        int iNumMid = Integer.parseInt(sc.nextLine());
        System.out.print("기말고사 점수 : ");
        int iNumLast = Integer.parseInt(sc.nextLine());
        System.out.print("과제    점수 : ");
        int iNumHome = Integer.parseInt(sc.nextLine());
        System.out.print("출석    점수 : ");
        double iNumAtt = Double.parseDouble(sc.nextLine());

        double mid = iNumMid*0.2;
        double last = iNumLast*0.3;
        double home = iNumHome*0.3;
        double total = mid+last+home+iNumAtt;
        double att = iNumAtt*0.3;

        System.out.println("========== 결과 ==========");
        System.out.println("중간고사 점수(20) : "+mid);
        System.out.println("기말고사 점수(30) : "+last);
        System.out.println("과제    점수(30) : "+home);
        System.out.println("출석    점수(20) : "+iNumAtt);
        System.out.println("총점 : "+total);
        System.out.println("-------------------------");

        if (iNumAtt<(20*0.3)) {
            System.out.println(" - Fail [출석 회수 부족"+"("+att+"/20] - ");
        } else if(total>70) {
            System.out.println(" - Pass - ");
        } else if (total<70) {
            System.out.println(" - Fail [점수 미달] - ");
        }

    }


    public void practice10() {

        System.out.println("실행할 기능을 선택하세요.");
        System.out.println("1. 메뉴 출력");
        System.out.println("2. 짝수/홀수");
        System.out.println("3. 합격/불합격");
        System.out.println("4. 계절");
        System.out.println("5. 로그인");
        System.out.println("6. 권한확인");
        System.out.println("7. BMI");
        System.out.println("8. 계산기");
        System.out.println("9. P/F");
        System.out.print("번호 선택 : ");
        int iNum = Integer.parseInt(sc.nextLine());

        switch(iNum) {

            case 1:
                practice1();
                break;
            case 2:
                practice2();
                break;
            case 3:
                practice3();
                break;
            case 4:
                practice4();
                break;
            case 5:
                practice5();
                break;
            case 6:
                practice6();
                break;
            case 7:
                practice7();
                break;
            case 8:
                practice8();
                break;
            case 9:
                practice9();
                break;
            default :
                System.out.println("종료합니다.");
                break;
        }
    }

    public void practice11() {
        System.out.println("비밀번호 입력(1000~9999) : ");
        String pwStr = sc.nextLine();
        int iCheck = 0;

        if(pwStr.length() > 4 ) {
            System.out.println("자리수 4자리 초과");
        } else if(pwStr.length() < 4) {
            System.out.println("자리수 4자리 미만");
        }

        for(int i=0; i<pwStr.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(pwStr.charAt(j) == pwStr.charAt(i) ) {
                    iCheck++;
                }
            }
        }

        if(iCheck >0 && pwStr.length() == 4) {
            System.out.println("비밀번호 자리 중복");
        } else if(iCheck == 0  && pwStr.length() == 4) {
            System.out.println("성공");
        }

    }





}



