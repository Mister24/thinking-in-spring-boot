/**
 * @Company Mister24.com Inc.
 * @Copyright Copyright (c) 2016-2019 All Rights Reserved.
 */
package com.fayuan.springbootchapter9.config;

import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * Rest服务配置
 *
 * @author mr.24
 * @version Id: RestConfig, v 1.0 2019-04-14 00:20 Exp $$
 */
public class RestConfig implements RestTemplateCustomizer {
    @Override
    public void customize(RestTemplate restTemplate) {
        OkHttp3ClientHttpRequestFactory okHttp3ClientHttpRequestFactory = (OkHttp3ClientHttpRequestFactory) restTemplate.getRequestFactory();
        okHttp3ClientHttpRequestFactory.setReadTimeout(5000);
        okHttp3ClientHttpRequestFactory.setWriteTimeout(3000);
    }
}
