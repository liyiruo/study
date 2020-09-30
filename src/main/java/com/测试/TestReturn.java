package com.测试;

/**
 * @Classname TestReturn
 * @Description 测试try（）{}finaly{} return
 * @Date 2020/9/30 13:05
 * @Created by liyiruo
 */
public class TestReturn {
    static int a = 1;
    public static void main(String[] args) {
        System.out.println(test());
    }
    private static Integer test() {
        try {
            ++a;
            System.out.println("执行了try==>" + a);
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            ++a;
            System.out.println("执行了finally==>" + a);
        }
        return a;
    }
}
