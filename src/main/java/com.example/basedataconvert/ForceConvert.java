package com.example.basedataconvert;

/**
 * 强制类型转换
 * 自动类型转换是指：数字表示范围大的数据类型强制转换成范围小的数据类型。(向下转换)
 * (强制显示的把一个数据类型转换为另外一种数据类型)
 * {@link static/自动转换.jpg}
 * 实线表示自动转换时不会造成数据丢失，虚线则可能会出现数据丢失问题。
 */
public class ForceConvert {
    public static void convertTest01(){
        short s = 199;
        int i = s;//199
        double d = 10.24;
        long ee = (long)d;//10
    }

    /**
     * int 比较特殊
     *  向下转换时可以直接将 int 常量字面量赋值给 byte、short、char 等数据类型，而不需要强制转换，只要该常量值不超过该类型的表示范围都能自动转换。
     * @return
     */
    public static void convertTest02(){
       int a = 2;

//       byte b = a;//报错
       byte b = 2;
    }
}
