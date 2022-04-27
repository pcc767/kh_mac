package com.kh.practice.list.music.view;

import com.kh.practice.list.music.controller.MusicController;
import com.kh.practice.list.music.model.vo.Music;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class MusicView {

    public static Scanner sc = new Scanner(System.in);
    MusicController mc = new MusicController();

    public void mainMenu(){
        while(true) {
            System.out.println("===== 메인 메뉴 =====");
            System.out.println("1. 마지막 위치에 곡 추가");
            System.out.println("2. 첫 위치에 곡 추가");
            System.out.println("3. 전체 곡 목록 출력");
            System.out.println("4. 특정 곡 검색");
            System.out.println("5. 특정 곡 삭제");
            System.out.println("6. 특정 곡 정보 수정");
            System.out.println("7. 곡명 오름차순 정렬");
            System.out.println("8. 가수명 내림차순 정렬");
            System.out.println("9. 종료");
            System.out.println("메뉴 번호 선택 : ");
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
                    System.out.println("잘 못 입력하셨습니다. 다시 입력해 주세요");
            }
        }
    }

    public void addList() {
        System.out.println("***** 마지막 위치에 곡 추가 *****");
        System.out.println("곡 명 : ");
        String title = sc.nextLine();
        System.out.println("가수 명 : ");
        String singer = sc.nextLine();
        int addSuc = mc.addList(new Music(title, singer));
        if(addSuc==1){
            System.out.println("추가 성공");
        }else {
            System.out.println("추가 실패");
        }

    }

    public void addAtZero() {
        System.out.println("***** 첫 위치에 곡 추가 *****");
        System.out.println("곡 명 : ");
        String title = sc.nextLine();
        System.out.println("가수 명 : ");
        String singer = sc.nextLine();
        int addSuc = mc.addAtZero(new Music(title, singer));
        if(addSuc==1){
            System.out.println("추가 성공");
        }else {
            System.out.println("추가 실패");
        }
    }

    public void printAll() {
        System.out.println("***** 전체 곡 목록 출력 *****");
        List<Music> list = mc.printAll();
        if(list.isEmpty()) {
            System.out.println("비어있습니다.");
            return;
        }
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }

    public void searchMusic() {
        System.out.println("***** 특정 곡 검색 *****");
        System.out.println("곡 명 : ");
        String title = sc.nextLine();

        Optional<Music> optSearch = mc.searchMusic(title);
        if(optSearch.isEmpty()){
            System.out.println("검색한 곡이 없습니다.");
        }else{
            System.out.println("검색한 곡은"+title+" "+optSearch.get()+"입니다.");
        }
    }

    public void removeMusic() {
        System.out.println("***** 특정 곡 검색 *****");
        System.out.println("곡 명 : ");
        String title = sc.nextLine();

        Optional<Music> optRemove = mc.searchMusic(title);
        if(optRemove.isEmpty()){
            System.out.println("삭제할 곡이 없습니다.");
        }else {
            System.out.println(title+" "+optRemove+"을 삭제하였습니다.");
        }
    }

    public void setMusic() {
        System.out.println("***** 특정 곡 정보 수정 *****");
        System.out.println("수정할 곡 : ");
        String setTitle = sc.nextLine();
        System.out.println("곡 명 : ");
        String title = sc.nextLine();
        System.out.println("가수 명 : ");
        String singer = sc.nextLine();

        Optional<Music> optSet = mc.setMusic(setTitle, new Music(title,singer));
        if(optSet.isEmpty()){
            System.out.println("수정할 곡이 없습니다.");
        }else {
            System.out.println(title+" "+optSet+"을 삭제하였습니다.");
        }
    }

    public void ascTitle() {
        int asc = mc.ascTitle();
        if(asc==1){
            System.out.println("정렬 성공");
        }else {
            System.out.println("정렬 실패");
        }
    }

    public void descSinger() {
        int des = mc.descSinger();
        if(des==1){
            System.out.println("정렬 성공");
        }else {
            System.out.println("정렬 실패");
        }

    }


}
