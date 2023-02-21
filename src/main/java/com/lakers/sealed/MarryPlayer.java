package com.lakers.sealed;

/**
 * Created on 2023/2/20 16:40
 *
 * @author lakers
 */
public non-sealed class MarryPlayer extends SealedPlayer {
    @Override
    public void play() {
        System.out.println("不想玩儿了");
    }
}
