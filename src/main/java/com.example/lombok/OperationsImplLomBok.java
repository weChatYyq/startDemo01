package com.example.lombok;

import lombok.AllArgsConstructor;
import lombok.experimental.Delegate;

/**
 * 代理注解
 * @AllArgsConstructor & @Delegate 实现代理
 */
@AllArgsConstructor
public class OperationsImplLomBok implements Operations {
    @Delegate
    protected volatile OperationsImpl operationsImpl;
}
