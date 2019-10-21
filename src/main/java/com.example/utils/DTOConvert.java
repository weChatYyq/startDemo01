package com.example.utils;



public interface DTOConvert<S,T>{
     T doForward(S s);
     S doBackward(T t);
}
