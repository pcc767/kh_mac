package com.kooki.practice.collection.map.view;

import com.kooki.practice.collection.map.controller.MemberController;
import com.kooki.practice.collection.map.model.vo.Member;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MemberMenu {

    public static Scanner sc = new Scanner(System.in);

    MemberController mc = new MemberController();

    public void mainMenu(){
        while (true) {
            System.out.println("=======================");
            System.out.println("======= KH 사이트 =======");
            System.out.println("=======================");

            System.out.println("******* 메인 메뉴 *******");
            System.out.println("1. 회원 가입");
            System.out.println("2. 로그인");
            System.out.println("3. 같은 이름 회원 찾기");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 선택 : ");
            int choiceNum = Integer.parseInt(sc.nextLine());

            switch (choiceNum) {
                case 1:
                    joinMemberShip();
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
                    System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요");
            }
        }
    }

    private void memberMenu() {
        System.out.println("******* 회 원 메뉴 *******");
        System.out.println("1. 비밀번호 바꾸기");
        System.out.println("2. 이름 바꾸기");
        System.out.println("3. 로그아웃");
        System.out.print("메뉴 번호 선택 : ");
        int choiceNum = Integer.parseInt(sc.nextLine());

        switch(choiceNum){
            case 1 :
                changePassword();
                break;
            case 2 :
                changeName();
                break;
            default:
                System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요");
        }

    }


    private void joinMemberShip() {

        boolean isSuccess = false;

        System.out.println("******* 회원 가입 메뉴 *******");
        System.out.print("1. 아이디 : ");
        String id = sc.nextLine();
        System.out.print("2. 비밀번호 : ");
        String password = sc.nextLine();
        System.out.print("3. 이름 : ");
        String name = sc.nextLine();

        isSuccess = mc.joinMemberShip(id, new Member(id,password,name));

        if(!isSuccess)
            System.out.println("중복된 아이디입니다. 다시 입력해 주세요");

        if(isSuccess)
            System.out.println("성족적으로 회원가입 완료하였습니다.");



    }

    private void login() {

        while (true) {
            System.out.println("******* 로그인 메뉴 *******");
            System.out.print("1. 아이디 : ");
            String id = sc.nextLine();
            System.out.print("2. 비밀번호 : ");
            String password = sc.nextLine();

            String login = mc.login(id, password);
            if (login == null){
                System.out.println("틀린 아이디/비밀번호 입니다. ");
                continue;
            }

            System.out.println(login+"님 환영합니다.");
            return;
        }

    }

    private void sameName() {
        System.out.print("3. 검색할 이름 : ");
        String name = sc.nextLine();

        TreeMap<String, Member> treeMap = mc.sameName(name);

        Iterator<Map.Entry<String, Member>> iterator = treeMap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Member> set = iterator.next();
            System.out.println("이름 : "+set.getValue().getName()+" / 아이디 : "+set.getValue().getId());
        }



    }

    private void changePassword() {

        while (true) {
            System.out.print("1. 아이디 : ");
            String id = sc.nextLine();
            System.out.print("2. 현제 비밀번호 : ");
            String oldPw = sc.nextLine();
            System.out.print("2. 변경할 비밀번호 : ");
            String newPw = sc.nextLine();

            boolean changePw = mc.changePassword(id, oldPw, newPw);
            if (!changePw) {
                System.out.println("비밀번호 변경에 실패하였습니다. 다시 입력해 주세요.");
                continue;
            } else
                System.out.println("비밀번호 변경에 성공하였습니다.");
        }
    }

    private void changeName() {
        while (true) {
            System.out.print("1. 아이디 : ");
            String id = sc.nextLine();
            System.out.print("2. 비밀번호 : ");
            String pw = sc.nextLine();

            String userName = mc.login(id, pw);
            if (userName == null) {
                System.out.println("이름 변경에 실패하였습니다. 다시 입력해주세요.");
                continue;
            }
            System.out.println("현제 이름 : " + userName + " 입니다.");

            System.out.print("2. 변경할 이름 : ");
            String newName = sc.nextLine();
            mc.changeName(id, newName);
            System.out.println("이름 변경에 성공하였습니다.");
            return;
        }
    }

}
