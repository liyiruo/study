package com.设计模式._代理模式;

/**
 * wo 和代理同时实现了送礼物的功能 ，代理心中有个我，送礼物的时候，用我的方法。
 * @author liyiruo
 */
public class Proxys implements GiftGift {
    private Me me;
    Proxys(SchoolGirl schoolGirl) {
        me = new Me(schoolGirl);
    }

    @Override
    public void giveDolls() {
        me.giveDolls();
    }
}
