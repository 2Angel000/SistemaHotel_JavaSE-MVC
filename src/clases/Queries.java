/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author mcsmo
 */
public class Queries {
    
    /*INNERS*/
  
    public static String habitacionAll = "SELECT * FROM habitacion";
    public static String usuariosAll = "SELECT usuario.id, usuario.empleado_id, empleado.nombre, usuario.usuario, usuario.clave FROM usuario INNER JOIN empleado ON empleado.id = usuario.empleado_id";
    public static String empleadoAll = "SELECT * FROM empleado";
    public static String huespedesAll = "SELECT registro.id, registro.nombre, registro.telefono, habitacion.habitacion, registro.checkin, registro.checkout FROM registro INNER JOIN habitacion ON habitacion.id = registro.habitacion_id";
    public static String solicitudAll = "SELECT * FROM solicitud";
    //nombre, telefono, habitacion, tipoH, No.Camas, No.Personas, Precio, Checkin,checkout
     //s*f id | nombre ,telefono ,habitacion_id, precio,checkin, checkout,
    public static String registrosAll = "SELECT registro.id, registro.nombre, registro.telefono, habitacion.habitacion, habitacion.tipo_habitacion, habitacion.no_camas, habitacion.no_personas, habitacion.precio, registro.checkin, registro.checkout FROM registro INNER JOIN habitacion ON habitacion.id = registro.habitacion_id";
    
    
}
