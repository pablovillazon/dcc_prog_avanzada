package com.poafinance.app;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AuditoriaAspect {
    @After("execution(* TransaccionService.realizarTransaccion(..))")
    public void registrarTransaccion(JoinPoint joinPoint) {
        // Lógica de registro de la transacción
        long inicio = System.currentTimeMillis();
        // Registro de la transacción
        long fin = System.currentTimeMillis();
        long tiempoRegistro = fin - inicio;
        System.out.println("Tiempo de registro: " + tiempoRegistro + " ms");
    }
}

