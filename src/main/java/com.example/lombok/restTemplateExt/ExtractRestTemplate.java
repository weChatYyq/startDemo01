package com.example.lombok.restTemplateExt;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * 如果你和我一样使用过 spring 的 RestTemplate，我相信你会我和一样，对他抛出的非 http 状态码异常深恶痛绝。
 * 重置http状态码
 */
public class ExtractRestTemplate extends FilterRestTemplate {
    private RestTemplate restTemplate;
    public ExtractRestTemplate(RestTemplate restTemplate) {
        super(restTemplate);
        this.restTemplate = restTemplate;
    }

    public <T> RestResponseDTO<T> postForEntityWithNoException(String url, Object request, Class<T> responseType, Object... uriVariables)
            throws RestClientException {
        RestResponseDTO<T> restResponseDTO = new RestResponseDTO<T>();
        ResponseEntity<T> tResponseEntity;
        try {
            tResponseEntity = restTemplate.postForEntity(url, request, responseType, uriVariables);
            restResponseDTO.setData(tResponseEntity.getBody());
            restResponseDTO.setMessage(tResponseEntity.getStatusCode().name());
            restResponseDTO.setStatusCode(tResponseEntity.getStatusCodeValue());
        }catch (Exception e){
            restResponseDTO.setStatusCode(RestResponseDTO.UNKNOWN_ERROR);
            restResponseDTO.setMessage(e.getMessage());
            restResponseDTO.setData(null);
        }
        return restResponseDTO;
    }
}

