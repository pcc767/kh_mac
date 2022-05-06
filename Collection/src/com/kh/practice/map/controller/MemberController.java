package com.kh.practice.map.controller;

import com.kh.practice.map.medel.vo.Member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MemberController {

    HashMap<String, Member> idToMemberMap = new HashMap<>();

    public boolean joinMembership(String id, Member member){
        if(idToMemberMap.containsKey(id))
            return false;

        idToMemberMap.put(id, member);
        return true;
    }

    public String login(String id, String password) {
        if(!idToMemberMap.containsKey(id))
            return null;

        Member member = idToMemberMap.get(id);
        if(!member.getPassword().equals(password))
            return null;

        return member.getName();
    }

    public boolean changePassword(String id, String oldPw, String newPw){
        if(!idToMemberMap.containsKey(id))
            return false;

        Member member = idToMemberMap.get(id);
        if(!member.getPassword().equals(oldPw))
            return false;

        member.setPassword(newPw);
        return true;
    }

    public void changName(String id, String newName){
        if(!idToMemberMap.containsKey(id))
            return;

        Member member = idToMemberMap.get(id);
        member.setName(newName);
    }

    public TreeMap<String, Member> sameName(String name){
        TreeMap<String, Member> treeMap = new TreeMap<>();

        Iterator<String> iterator = idToMemberMap.keySet().iterator();
        while (iterator.hasNext()){
            String key = iterator.next();
            Member member = idToMemberMap.get(key);
            treeMap.put(key, member);
        }
        return treeMap;
    }


}
