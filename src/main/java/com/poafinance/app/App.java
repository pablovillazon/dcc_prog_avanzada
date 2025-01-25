package com.poafinance.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext contexto = new AnnotationConfigApplicationContext(Configuracion.class);
        TransaccionService transaccionService = contexto.getBean(TransaccionService.class);
        Transaccion transaccion = new Transaccion(1, "Depósito", 1000.0, "2023-02-20");
        transaccionService.realizarTransaccion(transaccion);

    }
}
