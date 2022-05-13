package com.kooki.practice.collection.list.music.view;

import com.kh.hw2.member.model.vo.Member;
import com.kooki.practice.collection.list.music.controller.MusicController;
import com.kooki.practice.collection.list.music.model.vo.Music;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MusicView {

    private static Scanner sc = new Scanner(System.in);
    private MusicController mc = new MusicController();
//    private ArrayList<Music> list = new ArrayList<>();

    public void mainMenu(){
        while (true) {
            System.out.println("***** 메인메뉴 *****");
            System.out.println("1. 마지막 위치 곡 추가");
            System.out.println("2. 첫 위치에 곡 추가");
            System.out.println("3. 전체 곡 목록 출력");
            System.out.println("4. 특정 곡 검색");
            System.out.println("5. 특정 곡 삭제");
            System.out.println("6. 특정 곡 정보 수정");
            System.out.println("7. 곡명 오름차순 정렬");
            System.out.println("8. 가수명 내림차순 정렬");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 선택 : ");
            int inputNum = Integer.parseInt(sc.nextLine());

            switch (inputNum) {
                case 1:
                    addList();
                    break;
                case 2:
                    addAtZero();
                    break;
                case 3:
                    printAll();
                    break;
                case 4:
                    searchMusic();
                    break;
                case 5:
                    removeMusic();
                    break;
                case 6:
                    setMusic();
                    break;
                case 7:
                    ascTitle();
                    break;
                case 8:
                    descSinger();
                    break;
                case 9:
                    System.out.println("프로그램 종료");
                    return;
                default:
                    System.out.println("잘 못 입력하셨습니다. 다시 입력해 주세요.");
            }
        }
    }

    private void addList() {
        System.out.println("***** 마지막 위치에 곡 추가 *****");
        System.out.println("곡명 : ");
        String title = sc.nextLine();
        System.out.println("가수명 : ");
        String singer = sc.nextLine();

        int add = mc.addList(new Music(title, singer));
        if(add != 1) {
            System.out.println("추가 실패");
            return;
        }
        System.out.println("추가 성공");
    }

    private void addAtZero() {
        System.out.println("***** 첫 위치에 곡 추가 *****");
        System.out.println("곡명 : ");
        String title = sc.nextLine();
        System.out.println("가수명 : ");
        String singer = sc.nextLine();

        int add = mc.addAtZero(new Music(title, singer));
        if(add != 1) {
            System.out.println("추가 실패");
            return;
        }
        System.out.println("추가 성공");
    }

    private void printAll() {
        System.out.println("***** 전체 곡 목록 출력 *****");
        List<Music> list = mc.printAll();
        for(int i=0; i< list.size(); i++)
            System.out.println(list.get(i));
    }

    private void searchMusic() {
        System.out.println("***** 특정 곡 검색 *****");
        System.out.println("곡명 : ");
        String title = sc.nextLine();

        Music music = mc.searchMusic(title);
        if(music==null) {
            System.out.println("검색한 곡이 없습니다.");
            return;
        }

        System.out.println("검색한 곡은"+music+"입니다.");
    }

    private void removeMusic() {
        System.out.println("***** 특정 곡 검색 *****");
        System.out.println("삭제할 곡 : ");
        String title = sc.nextLine();

        Music music = mc.removeMusic(title);
        if(music == null) {
            System.out.println("삭제할 곡이 없습니다.");
            return;
        }

        System.out.println(music+"을(를) 삭제 하였습니다.");
    }

    private void setMusic() {
        System.out.println("***** 특정 곡 검색 *****");
        System.out.println("수정할 곡 : ");
        String title = sc.nextLine();
        System.out.println("가수 명 : ");
        String singer = sc.nextLine();

        Music music = mc.setMusic(title ,new Music(title, singer));

        if(music == null) {
            System.out.println("수정할 곡이 없습니다.");
            return;
        }

        System.out.println(music+"의 값이 변경되었습니다.");
    }

    private void ascTitle() {
        System.out.println("***** 곡 명 오름차순 정렬 *****");
        if(mc.ascTitle() == 1)
            System.out.println("정렬 성공");
        else
            System.out.println("정렬 실패");
    }

    private void descSinger() {
        System.out.println("***** 가수 명 내림차순 정렬 *****");
        if(mc.ascTitle() == 1)
            System.out.println("정렬 성공");
        else
            System.out.println("정렬 실패");
    }

}
