package com.example.utils;

public class StringUtil {

    /**
     * 字符串不变性
     * {@linkplain static/字符串不变性.jpg}
     *
     * @param origion
     * @return
     */
    public String of(String origion) {
        String s = "abcd";
        s = s.concat("ef");
        return s;
    }
}
