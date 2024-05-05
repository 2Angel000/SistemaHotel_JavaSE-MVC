/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;

/**
 *
 * @author mcsmo
 */
public class Componentes {

    public static String HoraActual() {
        LocalDateTime horaLocal = LocalDateTime.now();
        int horas = horaLocal.getHour();
        int minutos = horaLocal.getMinute();
        return Globales.hora + horas + ":" + minutos ;
    }
    
    public static String FechaActual(){
        Date fecha = new Date();
        return new SimpleDateFormat("dd-MM-yyyy").format(fecha);
    }
    
 
    

}
