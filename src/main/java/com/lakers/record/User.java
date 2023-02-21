package com.lakers.record;

/**
 * Created on 2023/2/20 17:00
 *
 * @author lakers
 */
public class User {

    private String name;

    public static void main(String[] args) {
        RecordUser recordUser = new RecordUser("liuyuanlong");
        System.out.println(recordUser.name());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
