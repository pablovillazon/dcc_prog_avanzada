package com.poafinance.app;

public class TransaccionRepositoryImpl implements TransaccionRepository {
    @Override
    public void save(Transaccion transaccion) {
        // Lógica para guardar la transacción en la base de datos
        System.out.println("Transacción guardada con éxito");
    }
}

