package com.mycompany.app.vehiculos;

public class VehiculoCarga extends Vehiculo implements TransportarMaterial{
    
    public VehiculoCarga() {
        super(true, 20, 3, 50, 5);
    }

    public void transportarMaterial() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}