package com.example.basedataconvert;

/**
 * 类型提升
 * 所谓类型提升就是指在多种不同数据类型的表达式中，类型会自动向范围表示大的值的数据类型提升。
 */
public class riseType {
    /**
     * b 为 int 型，a为 long 型，运算结果为 long 型，运算结果正常，没有出现溢出的情况。
     */
    public static void test(){
        long a = 100000000;
        int b = 1999;
        long c = a*b;
    }
}
