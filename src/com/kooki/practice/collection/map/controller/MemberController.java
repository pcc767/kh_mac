package com.kooki.practice.collection.map.controller;

import com.kooki.practice.collection.map.model.vo.Member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class MemberController {

    Map<String, Member> idToMemberMap = new HashMap<>();

    public boolean joinMemberShip(String id, Member member){
        if(idToMemberMap.containsKey(id))
            return false;

        idToMemberMap.put(id, member);
        return true;
    }

    public String login(String id, String password){
        if(!idToMemberMap.containsKey(id))
            return null;

        Member member = idToMemberMap.get(id);
        if(!member.getPassword().equals(password))
            return null;

        return member.getName();

    }

    public boolean changePassword(String id, String oldPw, String newPw){
        if(idToMemberMap.containsKey(id))
            return false;

        Member member = idToMemberMap.get(id);
        if(!member.getPassword().equals(oldPw))
            return false;

        member.setPassword(newPw);
        return true;
    }

    public void changeName(String id, String newName){
        if(!idToMemberMap.containsKey(id))
            return;

        Member member = idToMemberMap.get(id);
        member.setName(newName);
    }

    public TreeMap<String, Member> sameName(String name){
        TreeMap<String, Member> memberTreeMap = new TreeMap<>();

        Iterator<String> iterator = idToMemberMap.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Member member = idToMemberMap.get(key);
            if(member.getName().equals(name))
                memberTreeMap.put(key, member);
        }

        return memberTreeMap;


//        for(String key : idToMemberMap.keySet()){
//            Member member = idToMemberMap.get(key);
//            if(member.getName().equals(name))
//                treeMap.put(key, member);
//        }


    }











}
