package com.lakers.stream;

import java.util.List;

/**
 * Created on 2023/2/21 10:02
 *
 * @author lakers
 */
public class StreamTest {


    public static void main(String[] args) {
        List<String> strings = List.of("lakers", "rose", "bob", "apple", "mac");
        List<String> stringList = strings.stream().filter(t -> t.length() > 5).toList();
    }
}
