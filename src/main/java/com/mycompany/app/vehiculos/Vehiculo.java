package com.mycompany.app.vehiculos;

public abstract class Vehiculo implements GirarIzquierda, GirarDerecha{
    private boolean diesel;
    private int cantGasolina;
    private int cantPasajeros;
    private int velocidadMax;
    private double aceleracion;

    public Vehiculo(boolean diesel, int cantGasolina, int cantPasajeros, int velocidadMax, double aceleracion) {
        this.diesel = diesel;
        this.cantGasolina = cantGasolina;
        this.cantPasajeros = cantPasajeros;
        this.velocidadMax = velocidadMax;
        this.aceleracion = aceleracion;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "diesel=" + diesel + ", cantGasolina=" + cantGasolina + ", cantPasajeros=" + cantPasajeros + ", velocidadMax=" + velocidadMax + ", aceleracion=" + aceleracion + '}';
    }
    
    public String tipoVehiculo(Vehiculo vehiculo){
        String res="";
        if(vehiculo instanceof VehiculoCarrera)
            res="Se puede competir, es un vehiculo de carrera"; 
        if(vehiculo instanceof VehiculoCarga)
            res="No se puede competir, es un vehiculo para transportar carga"; 
        if(vehiculo instanceof Camioneta)
            res="No se puede copeitr, Es una camioneta, para transportar personas"; 
        return res;
    }

    public boolean isDiesel() {
        return diesel;
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }

    public int getCantGasolina() {
        return cantGasolina;
    }

    public void setCantGasolina(int cantGasolina) {
        this.cantGasolina = cantGasolina;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }

    public int getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(int velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public double getAceleracion() {
        return aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    public String girarTimon() {
        return "se movio a la Izquierda";
    }
    
     
}