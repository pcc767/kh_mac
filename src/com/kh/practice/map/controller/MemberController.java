package com.kh.practice.map.controller;


import com.kh.practice.map.model.vo.Member;

import java.util.*;

public class MemberController {

    private HashMap<String, Member> idToMemberMap = new HashMap<>();

    public boolean joinMembership(String id, Member m){
        if(idToMemberMap.containsKey(id))
            return false;
        idToMemberMap.put(id,m);
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
        if(!idToMemberMap.containsKey(id))
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
        TreeMap<String, Member> map = new TreeMap<>();
        Iterator<String> iterator = idToMemberMap.keySet().iterator();

        while (iterator.hasNext()){
            String key = iterator.next();
            Member member = idToMemberMap.get(key);
            if(member.getName().equals(name))
                map.put(key,member);
        }
        return map;
    }





}
