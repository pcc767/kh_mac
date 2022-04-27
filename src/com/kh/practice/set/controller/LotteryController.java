package com.kh.practice.set.controller;

import com.kh.practice.set.model.vo.Lottery;

import java.util.*;

public class LotteryController {

    private HashSet<Lottery> lottery = new HashSet<>();
    private HashSet<Lottery> win = new HashSet<>();

    public boolean insertObject(Lottery l){
        return lottery.add(l);
    }

    public boolean deleteObject(Lottery l){
        boolean isRemove = lottery.remove(l);
        if(isRemove && !win.isEmpty()){
            win.remove(l);
        }
        return isRemove;
    }

    public HashSet<Lottery> winObject(){
        int total = 4 - win.size();
        if(total ==0){
            return win;
        }
        ArrayList<Lottery> list = new ArrayList<>(lottery);
        Collections.shuffle(list);
        for(int i=0; i<total; i++){
            win.add(list.get(i));
        }
        return win;
    }

    public TreeSet<Lottery> sortedWinObject(){
        List<Lottery> list = new ArrayList<>(win);
        list.sort(new Comparator<Lottery>() {
            @Override
            public int compare(Lottery o1, Lottery o2) {
                int result = o1.getName().compareTo(o2.getName());
                if(result == 0){
                    result = o1.getPhone().compareTo(o2.getPhone());
                }
                return result;
            }
        });

        TreeSet<Lottery> newList = new TreeSet<>(list);
        return newList;
    }

    public Boolean searchWinner(Lottery l){
        return win.contains(l);
    }




}
