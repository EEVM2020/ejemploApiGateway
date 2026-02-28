package com.gateWay.filtros;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.http.HttpCookie;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class FiltroSesion extends AbstractGatewayFilterFactory<FiltroSesion.Config> {

	public FiltroSesion() {
        super(Config.class);
    }
	
	public static class Config {
        
    }
	
    @Override
    public GatewayFilter apply(Config config) {
        return (exchange, chain) -> {

            HttpCookie cookie = exchange.getRequest()
                    .getCookies()
                    .getFirst("TOKEN");

            if (cookie == null) {
                exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
                return exchange.getResponse().setComplete();
            }

            return chain.filter(exchange);
        };
    }
}
