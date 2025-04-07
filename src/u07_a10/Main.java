package u07_a10;

import u07_a10.maquinaria.Locomotora;
import u07_a10.maquinaria.Tren;
import u07_a10.personal.JefeEstacion;
import u07_a10.personal.Maquinista;
import u07_a10.personal.Mecanico;

import java.util.Date;
import java.util.Calendar;

/**
 * Clase principal que demuestra el uso de las clases del sistema ferroviario.
 * Este ejemplo crea personal (mecánicos, maquinistas, jefes de estación),
 * locomotoras y trenes con vagones para mostrar sus relaciones y funcionalidad.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema Ferroviario");
        System.out.println("===================");
        
        // Creando el personal

        // Mecánicos con diferentes especialidades
        Mecanico mecanico1 = new Mecanico("Carlos Ruiz", "612345678", "FRENOS");
        Mecanico mecanico2 = new Mecanico("Elena Martínez", "623456789", "MOTOR");
        Mecanico mecanico3 = new Mecanico("Juan Sánchez", "634567890", "ELECTRICIDAD");
        
        // Maquinistas con diferentes rangos
        Maquinista maquinista1 = new Maquinista("Ana García", "12345678A", 2800.50, "Principal");
        Maquinista maquinista2 = new Maquinista("Roberto Fernández", "23456789B", 2500.75, "Ayudante");
        
        // Jefes de estación con diferentes fechas de nombramiento
        Date fecha1 = new Date(); // Fecha actual

        Calendar cal = Calendar.getInstance();
        cal.set(2021, Calendar.SEPTEMBER, 1); // Fecha 1 de septiembre de 2021
        Date fecha2 = cal.getTime();

        JefeEstacion jefe1 = new JefeEstacion("Luis Álvarez", "34567890C", fecha1);
        JefeEstacion jefe2 = new JefeEstacion("María López", "45678901D", fecha2);
        
        // Creando las locomotoras
        Locomotora locomotora1 = new Locomotora("L1234", 5000, 2018, mecanico1);
        Locomotora locomotora2 = new Locomotora("L5678", 6500, 2020, mecanico2);
        
        // Creando los trenes y asignando locomotoras y maquinistas
        Tren tren1 = new Tren(locomotora1, maquinista1);
        Tren tren2 = new Tren(locomotora2, maquinista2);
        
        // Añadiendo vagones a los trenes
        tren1.enganchaVagon(1000, 750, "Cereales");
        tren1.enganchaVagon(2000, 1500, "Carbón");
        tren1.enganchaVagon(1500, 1200, "Madera");
        
        tren2.enganchaVagon(3000, 2800, "Petróleo");
        tren2.enganchaVagon(2500, 2000, "Ganado");
        tren2.enganchaVagon(1800, 1600, "Maquinaria");
        tren2.enganchaVagon(2200, 1900, "Vehículos");
        tren2.enganchaVagon(1700, 1500, "Contenedores");
        
        // Intentar añadir un vagón más al tren 2 (que ya tiene 5)
        tren2.enganchaVagon(1000, 800, "Paquetería");
        
        // Resumen del sistema ferroviario creado
        System.out.println("\n=== RESUMEN DEL SISTEMA FERROVIARIO ===");
        System.out.println("Personal:");
        System.out.println("- 3 Mecánicos especializados en distintas áreas");
        System.out.println("- 2 Maquinistas de diferentes rangos");
        System.out.println("- 2 Jefes de estación con distintas fechas de nombramiento");
        System.out.println("\nMaterial rodante:");
        System.out.println("- 2 Locomotoras de diferentes potencias y años");
        System.out.println("- 1 Tren con 3 vagones de mercancías diversas");
        System.out.println("- 1 Tren con 5 vagones (capacidad máxima) de mercancías diversas");
    }
}