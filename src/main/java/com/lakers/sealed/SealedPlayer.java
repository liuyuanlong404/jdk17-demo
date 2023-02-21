package com.lakers.sealed;

/**
 * Created on 2023/2/20 16:39
 *
 * @author lakers
 */
public sealed class SealedPlayer permits MarryPlayer {

    public void play() {
        System.out.println("玩儿吧！");
    }
}
