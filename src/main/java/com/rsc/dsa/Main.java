package com.rsc.dsa;

import com.rsc.dsa.list.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List list = new List(5);
        list.push("oi");
        System.out.println(list.realLength());
        list.push("tudo");
        list.push("bem");
        System.out.println(list.realLength());
        System.out.println(list.realLength());
        System.out.println(list.toString());
        list.push(0, "eitanois");
        try{
            System.out.println(list.search(3));
            System.out.println(list.search(6));
        } catch(Exception ex) {
            System.out.println(ex.toString());
        }
        System.out.println(list.search("tudo"));
        list.push("rapha");
        list.push("ma");
        list.pop(2);
        list.pop(2);
        list.pop(2);
        list.pop(2);
        list.pop("oi");
        System.out.println(list.search("tudoo"));
        System.out.println(list.toString());

        int i = 0;
        i++;
    }
}