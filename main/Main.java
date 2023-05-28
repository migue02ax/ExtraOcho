package main;

import Controlador.ControladorLibro;
import Modelo.Libro;
import Persistencia.DemoLibroDB;
import Persistencia.LibroDAO;
import Vista.VentanaLibro;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        VentanaLibro ventana = new VentanaLibro("MVC y JDBC");
        ControladorLibro controlador = new ControladorLibro(ventana);



    }
}