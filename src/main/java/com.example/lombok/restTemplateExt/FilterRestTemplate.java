package com.example.lombok.restTemplateExt;

import lombok.AllArgsConstructor;
import lombok.experimental.Delegate;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
public class FilterRestTemplate implements RestOperations {
    @Delegate
    protected volatile RestTemplate restTemplate;
}
