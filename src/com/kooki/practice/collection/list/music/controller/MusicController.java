package com.kooki.practice.collection.list.music.controller;

import com.kooki.practice.collection.list.music.model.vo.Music;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MusicController {

    public static Scanner sc= new Scanner(System.in);

    ArrayList<Music> list = new ArrayList<>();

    public int addList(Music music){
        list.add(music);
        return 1;
    }

    public int addAtZero(Music music){
        list.add(0, music);
        return 1;
    }

    public List<Music> printAll(){
        return list;
    }

    public Music searchMusic(String title){
        for(int i=0; i<list.size(); i++){
            if (list.get(i).getTitle().contains(title))
                return list.get(i);
        }

        return null;
    }

    public Music removeMusic(String title){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getTitle().contains(title))
                return list.remove(i);
        }
        return null;
    }

    public Music setMusic(String title, Music music){
        for(int i=0; i<list.size(); i++){
            if(list.get(i).getTitle().contains(title))
                return list.set(i,music);
        }
        return null;
    }

    public int ascTitle(){
        list.sort(new Comparator<Music>() {
            @Override
            public int compare(Music o1, Music o2) {
                int result = o1.getTitle().compareTo(o2.getTitle());
                if(result==0)
                    result = o1.getSinger().compareTo(o2.getSinger());
                return result;
            }
        });
        return 1;
    }

    public int descSinger(){
        list.sort(new Comparator<Music>() {
            @Override
            public int compare(Music o1, Music o2) {
                return o2.getSinger().compareTo(o1.getSinger());
            }
        });
        return 1;
    }






}
