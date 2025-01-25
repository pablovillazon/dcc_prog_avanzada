package com.poafinance.app;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class SeguridadAspect {
    @Before("execution(* TransaccionService.realizarTransaccion(..))")
    public void autenticarUsuario(JoinPoint joinPoint) {
        // Lógica de autenticación y autorización
        long inicio = System.currentTimeMillis();
        // Autenticación y autorización
        long fin = System.currentTimeMillis();
        long tiempoAutenticacion = fin - inicio;
        System.out.println("Tiempo de autenticación: " + tiempoAutenticacion + " ms");
    }
}
