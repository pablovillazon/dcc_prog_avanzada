package com.poafinance.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class Configuracion {
    @Bean
    public TransaccionService transaccionService() {
        return new TransaccionService();
    }

    @Bean
    public TransaccionRepository transaccionRepository() {
        return new TransaccionRepositoryImpl();
    }

    @Bean
    public SeguridadAspect seguridadAspect() {
        return new SeguridadAspect();
    }

    @Bean
    public AuditoriaAspect auditoriaAspect() {
        return new AuditoriaAspect();
    }
}

