package com.kh.practice.list.music.view;


import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

import java.util.List;
import java.util.Scanner;

public class MusicView {

    public static Scanner sc = new Scanner(System.in);
    MusicController mc = new MusicController();

    public void mainMenu() {
        while (true) {
            System.out.println("1. 마지막 위치에 곡 추가");
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
                    System.out.println("종료합니다.");
                    return;
                default:
                    System.out.println("잘 못된 번호입니다. 다시 입력해 주세요");
            }
        }
    }

    public void addList() {
        System.out.println("****** 마지막 위치에 곡 추가 ******");
        System.out.print("추가할 곡명 : ");
        String title = sc.nextLine();
        System.out.print("추가할 가수명 : ");
        String singer = sc.nextLine();

        int addMusic = mc.addList(new Music(title,singer));
        if(addMusic != 1) {
            System.out.println("추가 실패");
            return;
        }
        System.out.println("추가 성공");
    }

    public void addAtZero() {
        System.out.println("****** 첫 위치에 곡 추가 ******");
        System.out.print("추가할 곡명 : ");
        String title = sc.nextLine();
        System.out.print("추가할 가수명 : ");
        String singer = sc.nextLine();

        int addFistMusic = mc.addAtZero(new Music(title, singer));
        if(addFistMusic != 1) {
            System.out.println("추가 실패");
            return;
        }
        System.out.println("추가 성공");
    }

    public void printAll() {
        System.out.println("****** 전체 곡 목록 출력 ******");
        List<Music> list = mc.printAll();

        if(list.isEmpty()){
            System.out.println("비어있습니다.");
            return;
        }

        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i));
        }

//        for(Music music : list){
//            System.out.println(music);
//        }

    }

    public void searchMusic() {
        System.out.println("****** 특정 곡 검색 ******");
        System.out.print("검색할 곡명 : ");
        String title = sc.nextLine();

        Music music = mc.searchMusic(title);
        if(music == null){
            System.out.println("검색한 곡이 없습니다.");
            return;
        }

        System.out.println("검색한 곡은"+music+"입니다.");
    }

    public void removeMusic() {
        System.out.println("****** 특정 곡 삭제 ******");
        System.out.print("삭제할 곡명 : ");
        String title = sc.nextLine();

        Music music = mc.removeMusic(title);
        if(music == null) {
            System.out.println("삭제할 곡이 없습니다.");
            return;
        }
        System.out.println(music+"을 삭제하였습니다.");
    }

    public void setMusic() {
        System.out.println("****** 특정 곡 정보 수정 ******");
        System.out.print("검색할 곡명 : ");
        String title = sc.nextLine();

        Music serMusic = mc.searchMusic(title);
        if(serMusic == null){
            System.out.println("수정할 곡이 없습니다.");
            return;
        }
        System.out.println("수정할 곡은"+serMusic+"입니다.");

        System.out.print("수정할 곡명 : ");
        String modifyTitle = sc.nextLine();
        System.out.print("수정할 가수 : ");
        String modifySinger = sc.nextLine();

        Music music = mc.setMusic(title, new Music(modifyTitle,modifySinger));
        if(music == null){
            System.out.println("수정할 곡이 없습니다.");
            return;
        }
        System.out.println(music+"으로 변경되었습니다.");
    }

    public void ascTitle() {
        int asc = mc.ascTitle();
        if(asc != 1){
            System.out.println("정렬 실패");
            return;
        }
        System.out.println("정렬 성공");
    }

    public void descSinger() {
        int desc = mc.descSinger();
        if(desc != 1){
            System.out.println("정렬 실패");
            return;
        }
        System.out.println("정렬 성공");
    }


}
