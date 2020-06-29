package com.设计模式._模版模式;

/**抽象类
 * @author liyiruo
 */
public abstract class AbstractClass {
    /**
     * 这是抽象类里的第一个抽象方法
     */
    abstract void operation1();

    /**
     * 这是抽象类里的第2个抽象方法
     */
    abstract void operation2();

    public void templateMethod() {
        operation1();
        operation2();
    }
    
}
