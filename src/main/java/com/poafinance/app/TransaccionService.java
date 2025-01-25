package com.poafinance.app;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.ThreadMXBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

public class TransaccionService {
    @Autowired
    private TransaccionRepository transaccionRepository;

    @Transactional
    public void realizarTransaccion(Transaccion transaccion) {
        // Lógica de negocio para realizar la transacción
        long inicio = System.currentTimeMillis();
        transaccionRepository.save(transaccion);
        long fin = System.currentTimeMillis();
        long tiempoEjecucion = fin - inicio;
        System.out.println("Tiempo de ejecución: " + tiempoEjecucion + " ms");

        // Obtener métricas de memoria
        MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
        long memoriaUsada = memoryMXBean.getHeapMemoryUsage().getUsed();
        long memoriaTotal = memoryMXBean.getHeapMemoryUsage().getMax();
        System.out.println("Memoria usada: " + memoriaUsada + " bytes");
        System.out.println("Memoria total: " + memoriaTotal + " bytes");

        // Obtener métricas de threads
        ThreadMXBean threadMXBean = ManagementFactory.getThreadMXBean();
        int numThreads = threadMXBean.getThreadCount();
        System.out.println("Número de threads: " + numThreads);

        // Obtener métricas cualitativas
        double tasaExito = calcularTasaExito(transaccion);
        System.out.println("Tasa de éxito: " + tasaExito);
    }

    private double calcularTasaExito(Transaccion transaccion) {
        // Lógica para calcular la tasa de éxito
        // Por ejemplo, puede ser el número de transacciones exitosas dividido por el número total de transacciones
        return 0.9;
    }
}
