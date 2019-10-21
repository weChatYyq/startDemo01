package com.example.lombok.restTemplateExt;

import lombok.Data;

@Data
public class RestResponseDTO<T> {
    public static int UNKNOWN_ERROR = 99;
    String message;
    int statusCode;
    T data;
}
