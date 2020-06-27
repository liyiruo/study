package com.设计模式._代理模式;

/**实际人实现接口
 * @author liyiruo
 */
public class Me implements GiftGift {
    private   SchoolGirl schoolGirl;
    public Me(SchoolGirl schoolGirl) {
        this.schoolGirl = schoolGirl;
    }
    @Override
    public void giveDolls() {
        System.out.println(" Me give gift to " + schoolGirl.getName());
    }
}
