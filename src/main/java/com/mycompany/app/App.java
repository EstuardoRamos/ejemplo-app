package com.mycompany.app;

import java.util.ArrayList;
import com.mycompany.app.vehiculos.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        ArrayList <Vehiculo> listaVehiculos= new ArrayList<Vehiculo>();
        listaVehiculos.add(new VehiculoCarga());
        listaVehiculos.add(new VehiculoCarrera());
        listaVehiculos.add(new Camioneta());
        listaVehiculos.add(new Camioneta());
        listaVehiculos.add(new VehiculoCarrera());
        listaVehiculos.add(new VehiculoCarga());
        listaVehiculos.add(new Camioneta());
        listaVehiculos.add(new VehiculoCarga());
        listaVehiculos.add(new VehiculoCarrera());
        listaVehiculos.add(new Camioneta());
        listaVehiculos.add(new Camioneta());
        listaVehiculos.add(new VehiculoCarga());
        listaVehiculos.add(new VehiculoCarrera());
        listaVehiculos.add(new Camioneta());
        listaVehiculos.add(new VehiculoCarrera());
        listaVehiculos.add(new VehiculoCarga());
        listaVehiculos.add(new Camioneta());
        listaVehiculos.add(new VehiculoCarga());
        listaVehiculos.add(new VehiculoCarrera());
        listaVehiculos.add(new VehiculoCarrera());
        for (Vehiculo e : listaVehiculos) {
            System.out.println(e.toString());
            System.out.println(e.tipoVehiculo(e));
            System.out.println("");
        }
    }
}
