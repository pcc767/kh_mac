package com.kh.hw.employee.view;

import com.kh.hw.employee.controller.EmployeeController;

import java.util.Scanner;

public class EmployeeMenu {

    public static Scanner sc = new Scanner(System.in);
    EmployeeController eyc = new EmployeeController();

    public EmployeeMenu() {
        while (true) {
            System.out.println("1. 사원 추가");
            System.out.println("2. 사원 수정");
            System.out.println("3. 사원 삭제");
            System.out.println("4. 사원 출력");
            System.out.println("9. 프로그램 종료");
            System.out.print("메뉴 번호를 누르세요 : ");
            int inputNum = Integer.parseInt(sc.nextLine());

            switch (inputNum) {
                case 1:
                    insertEmp();
                    break;
                case 2:
                    updateEmp();
                    break;
                case 3:
                    deleteEmp();
                    break;
                case 4:
                    printEmp();
                    break;
                case 9:
                    System.out.println("프로그램을 종료합니다.");
                    return;
                default:
                    System.out.println("번호를 잘 못 입력하셨습니다.");
            }
        }
    }

    public void insertEmp() {

        System.out.print("사원 번호 : ");
        int empNo = Integer.parseInt(sc.nextLine());
        System.out.print("사원 이름 : ");
        String name = sc.nextLine();
        System.out.print("사원 성별 : ");
        char gender = sc.next().charAt(0);
        sc.nextLine();
        System.out.print("전화 번호 : ");
        String phone = sc.nextLine();
        while (true) {
            System.out.print("추가 정보를 더 입력하시겠습니까?(y/n) : ");
            char inputChar = sc.next().charAt(0);
            sc.nextLine();

            if (inputChar == 'y' || inputChar == 'Y') {
                System.out.print("사원 부서 : ");
                String dept = sc.nextLine();
                System.out.print("사원 연봉 : ");
                int salary = Integer.parseInt(sc.nextLine());
                System.out.print("보너스율 : ");
                double bonus = Double.parseDouble(sc.nextLine());

                eyc.add(empNo, name, gender, phone, dept, salary, bonus);

            } else if (inputChar == 'n' || inputChar == 'N') {
                eyc.add(empNo, name, gender, phone);
            }
            break;
        }
    }

    public void updateEmp(){
        System.out.println("가장 최신의 사원 정보를 수정하게 됩니다.");
        System.out.println("사원의 어떤 정보를 수정하시겠습니까?");
        System.out.println("1. 전화번호");
        System.out.println("2. 사원연봉");
        System.out.println("3. 보너스 율");
        System.out.println("9. 돌아가기");
        System.out.print("메뉴 번호를 누르세요 : ");
        int inputNum = Integer.parseInt(sc.nextLine());

        switch (inputNum){
            case 1 :
                System.out.println("수정할 전화번호 : ");
                String phone = sc.nextLine();
                eyc.modify(phone);
                break;

            case 2 :
                System.out.println("수정할 사원연봉 : ");
                String salary = sc.nextLine();
                eyc.modify(salary);
                break;

            case 3 :
                System.out.println("수정할 보너스율 : ");
                String bonus = sc.nextLine();
                eyc.modify(bonus);
                break;

            case 9 :
                System.out.println("메인메뉴로 돌아갑니다.");
                break;

            default :
                System.out.println("잘 못 입력하셨습니다.");
        }

    }

    public void deleteEmp(){
        System.out.print("정말 삭제하시겠습니까?(y/n) : ");
        char inputCha = sc.next().charAt(0);
        sc.nextLine();

        if(inputCha == 'y' || inputCha == 'Y') {
            eyc.remove();
            System.out.println("데이터 삭제에 성공하였습니다.");
        } else if(inputCha == 'n' || inputCha == 'N'){
            new EmployeeMenu();
        }
    }


    public void printEmp(){
        if(eyc.inform()==null){
            System.out.println("사원 데이터가 없습니다.");
        }else
            System.out.println(eyc.inform());

    }

}
