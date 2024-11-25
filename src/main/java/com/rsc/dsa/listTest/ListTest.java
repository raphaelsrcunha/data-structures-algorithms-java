package com.rsc.dsa.listTest;

import com.rsc.dsa.Person;
import com.rsc.dsa.list.List;

public class ListTest {

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

        List<Person> list2 = new List<Person>(2);

        Person p1 = new Person("raphael", "123456", "asd@asd.com");
        Person p2 = new Person("maiza", "6654321", "maiza@asd.com");
        Person p3 = new Person("olivinha", "335487", "olivinha@asd.com");
        Person p4 = new Person("joaquim", "65679", "joaquim@asd.com");
        Person p5 = new Person("joaquim", "65679", "joaquim@asd.com");
        int a = 2;

        list2.push(p1);
        list2.push(p2);
        list2.push(p3);
        list2.push(p4);
        list2.pop(1);
        list2.push(p1);
        list2.push(p2);
        list2.pop(p5);


    }

}
