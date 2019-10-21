package com.example.basedataconvert;

/**
 * 自动类型转换
 * 自动类型转换是指：数字表示范围小的数据类型可以自动转换成范围大的数据类型。(向上转换)
 * {@link static/自动转换.jpg}
 * 实线表示自动转换时不会造成数据丢失，虚线则可能会出现数据丢失问题。
 */
public class AutoConvert {
    public static void convertTest01(){
        long a = 100;
        int b = 200;
        long c = b;
    }

    /**
     * 自动转换也要小心数据溢出问题，看下面的例子。
     * 编译没任何问题，但结果却输出的是负数，这是因为两个 int 相乘得到的结果是 int, 相乘的结果超出了 int 的代表范围。
     * 这种情况，一般把第一个数据转换成范围大的数据类型再和其他的数据进行运算。{}
     * @return
     */
    public static long convertTest02(){
       int a = 100000000;
       int b = 1999;
       long c = a*b;
       return c;
    }
    public static long convertTest03(){
        int a = 100000000;
        int b = 1999;
        long c = (long)a*b;
        return c;
    }

    public static void main(String[] args) {
        System.out.println(convertTest02());//输出结果 -1963462912
        System.out.println(convertTest03());//输出结果 199900000000
    }
}
