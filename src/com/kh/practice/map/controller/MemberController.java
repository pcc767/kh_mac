package com.kh.practice.map.controller;


import com.kh.practice.map.model.vo.Member;

import java.util.*;

public class MemberController {

    HashMap<String, Member> map = new HashMap<>();

    public boolean joinMembership(String id, Member m){
        if(!map.containsKey(id)){
            map.put(id, m);
            return true;
        }
        return false;
    }

    public String login(String id, String password){
        if(map.containsKey(id)){
            password.equals(map.get(id).getPassword());
            return map.get(id).getName();
        }
        return "";
    }

    public boolean changePassword(String id, String oldPw, String newPw){
        if(map.containsKey(id)){
            if(map.get(id).getPassword().equals(oldPw)){
                map.get(id).setPassword(newPw);
                return true;
            }
        }
        return false;
    }

    public void changeName(String id, String newName){
        map.get(id).setName();
    }

    public TreeMap sameName(String name){

        TreeMap<String, String> treeMap = new TreeMap<String, String>();
//        Iterator<String> iterator = map.keySet().iterator();

//        while (iterator.hasNext()){
//            String key = iterator.next();
//            if (map.get(key).getName().equals(name)){
//                treeMap.put(key, name);
//            }
//        }

        for(String key : map.keySet()){
            if(map.get(key).getName().equals(name)){
                treeMap.put(key, name);
            }
        }

        return treeMap;

    }





}
