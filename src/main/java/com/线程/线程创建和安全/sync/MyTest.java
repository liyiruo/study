package com.线程.线程创建和安全.sync;

import lombok.Data;

/**
 * @Classname MyTest
 * @Description TODO
 * @Date 2020/10/9 20:56
 * @Created by liyiruo
 */
@Data
public class MyTest {
  //  Object o = new Object();
//    private int a;
//    private boolean b;
}
//创建一个类如果这个类为空 没有任何东西 那么至少占用12个字节，另外4个字节为空
/*
com.线程.线程创建和安全.sync.MyTest object internals:
 OFFSET  SIZE   TYPE DESCRIPTION                               VALUE
      0     4        (object header)                           78 29 b1 0f (01111000 00101001 10110001 00001111) (263268728)
      4     4        (object header)                           00 70 00 00 (00000000 01110000 00000000 00000000) (28672)
      8     4        (object header)                           43 c1 00 f8 (01000011 11000001 00000000 11111000) (-134168253)
     12     4        (loss due to the next object alignment)
Instance size: 16 bytes
Space losses: 0 bytes internal + 4 bytes external = 4 bytes total
 */