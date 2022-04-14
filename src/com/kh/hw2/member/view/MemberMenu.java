package com.kh.hw2.member.view;

import com.kh.hw2.member.controller.MemberController;
import com.kh.hw2.member.model.vo.Member;

import javax.swing.*;
import java.util.Scanner;

public class MemberMenu {

    MemberController mc = new MemberController();
    public static Scanner sc = new Scanner(System.in);

    public void mainMenu(){
        while (true) {
            System.out.println("현제 등록 가능한 회원 수는 " + mc.existMemberNum() + "명 입니다.");
            System.out.println("1. 새 회원 등록");
            System.out.println("2. 회원 검색");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 삭제");
            System.out.println("5. 모두 출력");
            System.out.println("9. 끝내기");
            System.out.print("메뉴 번호 : ");
            int inputNum = Integer.parseInt(sc.nextLine());

            switch (inputNum) {
                case 1:
                    insertMember();
                    break;
                case 2:
                    searchMember();
                    break;
                case 3 :
                    updateMember();
                    break;
                case 4 :
                    deleteMember();
                    break;
                case 5 :
                    printAll();
                    break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default :
                    System.out.println("잘 못 입력하셨습니다. 다시 입력해주세요");
            }
        }
    }

    public void insertMember() {
        System.out.println("새 회원을 등록합니다.");
        String id = null;
        while (true) {
            System.out.print("아이디 : ");
            id = sc.nextLine();
            if(!mc.checkId(id))
                break;
            else
                System.out.println("중복된 아이디입니다. 다시 입력해주세요.");
        }
        System.out.print("이름 : ");
        String name = sc.nextLine();
        System.out.print("비밀번호 : ");
        String password = sc.nextLine();
        System.out.print("이메일 : ");
        String email = sc.nextLine();
        char gender;
        while (true) {
            System.out.print("성별 : ");
            gender = sc.nextLine().toUpperCase().charAt(0);
            if(gender == 'M' || gender == 'F'){
                break;
            } else
                System.out.println("성별을 다시 입력하세요");
        }
        System.out.print("나이 : ");
        int age = Integer.parseInt(sc.nextLine());

        mc.insertMember(new Member(id,name,password,email,gender,age));

    }

    public void searchMember() {
        System.out.println("1. 아이디로 검색하기");
        System.out.println("2. 이름으로 검색하기");
        System.out.println("3. 이메일로 검색하기");
        System.out.println("9. 메인으로 돌아가기");
        System.out.print("메뉴 번호 : ");
        int inputNum = Integer.parseInt(sc.nextLine());

        switch (inputNum) {
            case 1 :
                searchId();
                break;
            case 2 :
                searchName();
                break;
            case 3 :
                searchEmail();
                break;
            case 9 :
                System.out.println("메인으로 돌아갑니다.");
                return;
            default :
                System.out.println("잘 못 입력하셨습니다.");
        }
    }

    public void searchId() {
        System.out.println("검색할 아이디 : ");
        String inputId = sc.nextLine();

        Member member = mc.searchId(inputId);

        if(member == null)
            System.out.println("검색결과가 없습니다.");
        else {
            System.out.println("찾으신 회원 조회 결과입니다.");
            System.out.println(member.toString());
        }

    }

    public void searchName() {
        System.out.println("검색할 이름 : ");
        String inputName = sc.nextLine();

        Member[] member = mc.searchName(inputName);

        if(member.length == 0)
            System.out.println("검색결과가 없습니다.");
        else {
            System.out.println("찾으신 회원 조회 결과입니다.");
            for(int i=0; i<member.length; i++) {
                System.out.println(member[i].inform());
            }
        }
    }

    public void searchEmail() {
        System.out.println("검색할 이메일 : ");
        String inputEmail = sc.nextLine();

        Member[] member = mc.searchName(inputEmail);

        if(member.length == 0)
            System.out.println("검색결과가 없습니다.");
        else {
            System.out.println("찾으신 회원 조회 결과입니다.");
            for(int i=0; i<member.length; i++) {
                System.out.println(member[i].inform());
            }
        }
    }

    public void updateMember() {
        System.out.println("1. 비밀번호 수정하기");
        System.out.println("2. 이름 수정하기");
        System.out.println("3. 이메일 수정하기");
        System.out.println("9. 메인으로 돌아가기");
        System.out.println("메뉴 선택 : ");
        int inputNum = Integer.parseInt(sc.nextLine());

        switch (inputNum) {
            case 1 :
                updatePassword();
                break;
            case 2 :
                updateName();
                break;
            case 3 :
                updateEmail();
                break;
            case 9 :
                System.out.println("메인으로 돌아갑니다.");
                break;
            default :
                System.out.println("잘 못 입력하셨습니다.");
        }
    }

    public void updatePassword() {
        System.out.println("수정항 회원 아이디 : ");
        String inputId = sc.nextLine();
        System.out.println("수정항 회원 패스워드 : ");
        String inputPassword = sc.nextLine();

        if(mc.updatePassword(inputId, inputPassword))
            System.out.println("수정이 성공적으로 되었습니다.");
        else
            System.out.println("존재하지 않는 아이디입니다.");
    }

    public void updateName() {
        System.out.println("수정항 회원 아이디 : ");
        String inputId = sc.nextLine();
        System.out.println("수정항 회원 이름 : ");
        String inputName = sc.nextLine();

        if(mc.updatePassword(inputId, inputName))
            System.out.println("수정이 성공적으로 되었습니다.");
        else
            System.out.println("존재하지 않는 아이디입니다.");
    }

    public void updateEmail() {
        System.out.println("수정항 회원 아이디 : ");
        String inputId = sc.nextLine();
        System.out.println("수정항 회원 이메일 : ");
        String inputEmail = sc.nextLine();

        if(mc.updatePassword(inputId, inputEmail))
            System.out.println("수정이 성공적으로 되었습니다.");
        else
            System.out.println("존재하지 않는 아이디입니다.");
    }

    public void deleteMember() {
        System.out.println("1. 특정 회원 삭제하기");
        System.out.println("2. 모든 회원 삭제하기");
        System.out.println("9. 메인으로 돌아가기");
        System.out.print("매뉴 선택");
        int inputMenu = Integer.parseInt(sc.nextLine());

        switch (inputMenu) {
            case 1 :
                deleteOne();
                break;
            case 2 :
                deleteAll();
                break;
            case 9 :
                System.out.println("메인으로 돌아갑니다.");
                break;
            default :
                System.out.println("잘 못 입력하셨습니다.");
        }
    }

    public void deleteOne(){
        System.out.println("삭제할 아이디 : ");
        String name = sc.nextLine();
        System.out.println("정말 삭제하시겠습니까?(y/n) : ");
        char cha = sc.nextLine().toUpperCase().charAt(0);

        if(cha == 'Y'){
            if(mc.delete(name))
                System.out.println("성공적으로 삭제하였습니다.");
            else
                System.out.println("존재하지 않는 아이디입니다.");
        }

    }

    public void  deleteAll(){
        System.out.println("정말 삭제하시겠습니까?(y/n) : ");
        char cha = sc.nextLine().toUpperCase().charAt(0);

        if(cha == 'Y'){
            mc.delete();
            System.out.println("성공적으로 삭제하였습니다.");
        }

    }

    public void printAll(){
        if(mc.existMemberNum() == 0) {
            System.out.println("저장된 회원이 없습니다.");
            return;
        }

        Member[] members = mc.printAll();
        for(int i = 0; i< members.length; i++) {
            System.out.println(members[i].inform());
        }

    }















}
