package com.luffy.cloud.ali.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author: zqy
 * @date: 2020-04-04 15:26
 **/
@Component
@Slf4j
public class MyGlobalGatewayFilter implements GlobalFilter, Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("请求路径: " + exchange.getRequest().getPath().toString());
        log.info("请求参数: " + exchange.getRequest().getQueryParams());

        // 如果不放行的话用以下两行
//        exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
//        return exchange.getResponse().setComplete();

        return chain.filter(exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
