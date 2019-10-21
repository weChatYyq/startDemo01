package com.example.lombok;

public class OperationsImpl implements Operations {
    @Override
    public void sel(Integer age, String name) {
        System.out.println("OperationsImpl--sel");
    }

    @Override
    public void selAll() {
        System.out.println("OperationsImpl--selAll");

    }

    @Override
    public String ofStr(String name) {
        System.out.println("OperationsImpl--ofStr");
        return name+"-ofStr";
    }

}
