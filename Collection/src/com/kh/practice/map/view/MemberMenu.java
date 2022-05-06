package com.kh.practice.map.view;

import com.kh.practice.map.controller.MemberController;
import com.kh.practice.map.medel.vo.Member;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;


public class MemberMenu {

    MemberController mc = new MemberController();
    public static Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        while (true) {
            System.out.println("========== KH site ==========");
            System.out.println("===== 메인 메뉴 =====");
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 같은 이름 회원 찾기");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 선택 : ");
            int inputNum = Integer.parseInt(sc.nextLine());

            switch (inputNum) {
                case 1:
                    joinMembership();
                    break;
                case 2:
                    login();
                    memberMenu();
                    break;
                case 3:
                    sameName();
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다 다시 입력해주세요.");
            }
        }
    }
    private void memberMenu() {
        System.out.println("===== 회원 메뉴 =====");
        System.out.println("1. 비밀번호 바꾸기");
        System.out.println("2. 이름 바꾸기");
        System.out.println("3. 로그아웃");
        System.out.print("메뉴 번호 선택 : ");
        int inputNum = Integer.parseInt(sc.nextLine());

        switch(inputNum){
            case 1 :
                changePassword();
                break;
            case 2 :
                changeName();
                break;
            case 3 :
                System.out.println("로그아웃 되었습니다.");
                return;
        }
    }



    private void joinMembership() {
        System.out.print("아이디 : ");
        String id  = sc.nextLine();
        System.out.print("비밀번호 : ");
        String password = sc.nextLine();
        System.out.print("이름 : ");
        String name = sc.nextLine();

        boolean isTrue = false;
        isTrue = mc.joinMembership(id, new Member(id, password, name));

        if(!isTrue)
            System.out.println("중복된 아이디입니다. 다시 입력해주세요.");

        System.out.println("성공적으로 회원가입 완료하였습니다.");
    }

    private void login() {
        while (true) {
            System.out.print("아이디 : ");
            String id = sc.nextLine();
            System.out.print("비밀번호 : ");
            String password = sc.nextLine();

            String log = mc.login(id, password);
            if (log == null) {
                System.out.println("틀린 아이디 또는 비밀번호입니다.");
                continue;
            }

            System.out.println(log + "님, 환영합니다!");
            return;
        }
    }

    private void changePassword() {
        System.out.print("아이디 : ");
        String id  = sc.nextLine();
        System.out.print("비밀번호 : ");
        String oldPw = sc.nextLine();
        System.out.print("변경할 비밀번호 : ");
        String newPw = sc.nextLine();

        boolean changePw = mc.changePassword(id,oldPw,newPw);
        if(!changePw)
            System.out.println("비밀번호 변경에 실패하였습니다. 다시 입력해주세요.");

        System.out.println("비밀번호 변경에 성공하였습니다.");
    }

    private void sameName() {
        System.out.print("검색할 이름 : ");
        String name = sc.nextLine();

        Iterator<Map.Entry<String, Member>> iterator = mc.sameName(name).entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Member> entry = iterator.next();
            System.out.println("같은 이름은 : "+entry.getValue().getName()+" 입니다.");
        }

    }

    private void changeName() {
        while (true) {
            System.out.print("아이디 : ");
            String id = sc.nextLine();
            System.out.print("비밀번호 : ");
            String password = sc.nextLine();

            String name = mc.login(id, password);
            if (name == null) {
                System.out.println("아이디 / 패스워드를 다시 확인해주세요.");
                continue;
            }
            System.out.println("현제 이름은 : " + name + " 입니다.");

            System.out.print("변경할 이름 : ");
            String chaName = sc.nextLine();
            mc.changName(id, chaName);
            System.out.println("이름변경에 성공하였습니다.");
            return;
        }
    }



}
