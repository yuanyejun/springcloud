package com.atguigu.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author 原野
 * @DATE 2023/7/17 9:25
 * @Description: gateway路由配置
 * @Version 1.0
 */
@Configuration
public class GateWayConfig {


    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder){

        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
        routes.route("path_route_atguigu",r -> r.path("/anime")
                .uri("https://www.bilibili.com/anime/")).build();


        return routes.build();

    }

}
