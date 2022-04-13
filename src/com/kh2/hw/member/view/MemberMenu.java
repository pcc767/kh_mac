package com.kh2.hw.member.view;

import com.kh2.hw.member.controller.MemberController;

import java.util.Scanner;

public class MemberMenu {

    private static Scanner sc = new Scanner(System.in);
    private MemberController mc = new MemberController();

    public void mainMenu() {
        System.out.println("최대 등록 가능한 회원 수는 10명입니다.");
        System.out.println("현재 등록된 회원 수는"+mc.existMemberNum()+"명입니다.");
        if(mc.existMemberNum() != 10) {
            System.out.println("1. 새 회원 등록");
            System.out.println("2. 회원 검색");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 삭제");
            System.out.println("5. 모두 출력");
            System.out.println("9. 끝내기");
            System.out.print("입력할 메뉴 : ");
            int inputNum = Integer.parseInt(sc.nextLine());

            switch(inputNum) {

                case 1 :
                    insertMember();
                    break;
                case 2 :
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
                    System.out.println("번호가 잘 못 입력되었습니다.");

            }

        }

        if(mc.existMemberNum() == 10) {
            System.out.println("2. 회원 검색");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 삭제");
            System.out.println("5. 모두 출력");
            System.out.println("9. 끝내기");
            System.out.println("입력할 메뉴 : ");
            int inputNum = Integer.parseInt(sc.nextLine());

            switch(inputNum) {

                case 2 :
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
                    System.out.println("번호가 잘 못 입력되었습니다.");

            }

        }
    }
    public void insertMember() {
        System.out.println("새 회원을 등록합니다.");
        System.out.print("아이디 : ");
        String id = sc.nextLine();
        if (id.equals(mc.checkId(id))) {
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
            System.out.print("성별(M/F) : ");
            gender = sc.nextLine().charAt(0);
            if (gender == 'm' || gender == 'M' || gender == 'f' || gender == 'F') {
                break;
            }else {
                System.out.println("성별을 다시 입려하세요");
                continue;
            }
        }

        System.out.print("나이 : ");
        int age = Integer.parseInt(sc.nextLine());

        mc.insertMember(id,name,password,email,gender,age);

    }

    public void searchMember() {
        System.out.println("1. 아이디 검색하기");
        System.out.println("2. 이름으로 검색하기");
        System.out.println("3. 이메일로 검색하기");
        System.out.println("9. 메인으로 돌아가기");
        System.out.print("메뉴 번호 : ");
        int inputMum = Integer.parseInt(sc.nextLine());

        switch (inputMum) {
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
                mainMenu();
                break;
            default :
                System.out.println("잘 못 입력하셨습니다.");
                break;
        }

    }

    public void searchId(){
        System.out.println("아이디 : ");
        String id = mc.searchId(sc.nextLine());

        if(id.equals("")){
            System.out.println("검색 결과가 없습니다.");
            mainMenu();
        } else {
            System.out.println("찾으신 회원 조회 결과입니다.");
            System.out.println(id);
        }
    }

    public void searchName() {
        System.out.println("이름 : ");
        String name = sc.nextLine();

        if (mc.searchName(name) == null) {
            System.out.println("찾으신 회원 조회 결과입니다.");
            mainMenu();
        } else {
            System.out.println("찾으신 회원 조회 결과입니다.");
            for (int i = 0; i < MemberController.SIZE; i++) {
                if (mc.searchName(name)[i].getId() == null) {
                    return;
                } else {
                    System.out.println(mc.searchName(name)[i].inform());
                }
            }
        }
    }

    public void searchEmail() {
        System.out.print("이메일 : ");
        String email = sc.nextLine();

        if (mc.searchEmail(email) == null) {
            System.out.println("찾으신 회원 조회 결과입니다.");
            mainMenu();
        } else {
            System.out.println("찾으신 회원 조회 결과입니다.");
            for (int i = 0; i < MemberController.SIZE; i++) {
                if (mc.searchEmail(email)[i].getId() == null) {
                    return;
                } else {
                    System.out.println(mc.searchEmail(email)[i].inform());
                }
            }
        }

    }

    public void updateMember(){
        System.out.println("1. 비밀번호 수정하기");
        System.out.println("2. 이름 수정하기");
        System.out.println("3. 이메일 수정하기");
        System.out.println("9. 메인으로 돌아가기");
        System.out.println("선택 번호 : ");
        int inputNum = Integer.parseInt(sc.nextLine());

        switch(inputNum) {
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
                mainMenu();
                break;
            default :
                System.out.println("잘 못 입력하셨습니다.");
                break;
        }
    }

    public void updatePassword(){
        System.out.println("수정할 회원 아이디 : ");
        String id = sc.nextLine();
        System.out.println("수정할 회원 비밀번호 : ");
        String password = sc.nextLine();

        boolean result = mc.updatePassword(id,password);

        if(!result){
            System.out.println("존재하지 않는 아이디입니다.");
        }else {
            System.out.println("수정이 성공적으로 되었습니다.");
        }
        return;
    }

    public void updateName(){
        System.out.println("수정할 회원 아이디 : ");
        String id = sc.nextLine();
        System.out.println("수정할 회원 이름 : ");
        String name = sc.nextLine();

        boolean result = mc.updateName(id,name);

        if(!result) {
            System.out.println("존재하지 않는 아이디입니다.");
        }else {
            System.out.println("수정이 성공적으로 되었습니다.");
        }
    }

    public void updateEmail(){
        System.out.println("수정할 회원 아이디 : ");
        String id = sc.nextLine();
        System.out.println("수정할 회원 이메일 : ");
        String email = sc.nextLine();

        boolean result = mc.updateName(id,email);

        if(!result) {
            System.out.println("존재하지 않는 아이디입니다.");
        }else {
            System.out.println("수정이 성공적으로 되었습니다.");
        }
    }

    public void deleteMember(){
        System.out.println("1. 특정 회원 삭제하기");
        System.out.println("2. 모든 회원 삭제하기");
        System.out.println("9. 메인으로 돌아가기");
        int inputNum = Integer.parseInt(sc.nextLine());

        switch (inputNum) {
            case 1 :
                deleteOne();
                break;
            case 2 :
                deleteAll();
                break;
            case 9 :
                mainMenu();
                break;
            default :
                System.out.println("잘 못 입력하셨습니다.");
                break;
        }
    }

    public void deleteOne(){
        System.out.println("삭제할 회원 아이디 : ");
        String id = sc.nextLine();
        System.out.println("정말 삭제하시겠습니까?(y/n)");
        String cho = sc.nextLine();

        if(cho.equals("n") || cho.equals("N")){
            return;
        }
        if(!mc.delete(id)) {
            System.out.println("존재하지 않는 아이디입니다.");
        }else {
            System.out.println("성공적으로 삭제하였습니다.");
            mainMenu();
        }

    }

    public void deleteAll(){
        System.out.println("정말 삭제하시겠습니까?(y/n)");
        String cho = sc.nextLine();

        if(cho.equals("n") || cho.equals("N")){
            return;
        } else {
            mc.delete();
            System.out.println("성공적으로 삭제하였습니다.");
            mainMenu();
        }
    }

    public void printAll() {
        int total = mc.existMemberNum();
        if (total == 0) {
            System.out.println("저장된 회원이 없습니다.");
        } else {
            for (int i = 0; i < total; i++) {
                if (mc.printAll()[i] == null) {
                    return;
                } else {
                    System.out.println(mc.printAll()[i]);
                }
            }
        }
        return;
    }


}

