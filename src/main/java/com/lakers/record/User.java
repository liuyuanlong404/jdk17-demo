package com.lakers.record;

/**
 * Created on 2023/2/20 17:00
 *
 * @author lakers
 */
public class User {

    public static void main(String[] args) {
        RecordUser user1 = new RecordUser("刘元龙");
        RecordUser user2 = new RecordUser("李浩");
        swap(user1, user2);
        System.out.println("person1:" + user1.name());
        System.out.println("person2:" + user2.name());
    }

    public static void swap(RecordUser person1, RecordUser person2) {
        RecordUser temp = person1;
        person1 = person2;
        person2 = temp;
        System.out.println("person1:" + person1.name());
        System.out.println("person2:" + person2.name());
    }


}
