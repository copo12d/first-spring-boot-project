package com.copo12d.example;

import com.copo12d.example.Interfaces.MetodoDeEnvio;

public class SMS implements MetodoDeEnvio {
    @Override
    public void mensaje() {
        System.out.println("Mensaje de envio por SMS");
    }
}
