package com.lakers.yield;

/**
 * Created on 2023/2/20 16:45
 *
 * @author lakers
 */
public class YieldTest {

    public static int calc(int n, String operation) {
        var result = switch (operation) {
            case "*" -> {
                yield n * n;
            }
            case "+" -> {
                yield n + n;
            }
            default -> n;
        };
        return result;
    }
}
