package com.utilidades;

import java.util.*;
import java.io.*;

public class Configuracion {
    private static Configuracion ejemplar = null;

    private Properties propiedades = null;

    private Configuracion() {
    	propiedades = new Properties();
    	try {
    		 InputStream in = getClass().getResourceAsStream("configuracion.properties");  

    		 propiedades.load(in);   		 
    	}
    	catch (Exception e) {
    	   System.out.print("Error leyendo el archivo");
    	}
    }

    public synchronized static Configuracion getInstance() {
        if (ejemplar == null)
        	ejemplar = new Configuracion();
        return ejemplar;
    }

    public String obtenerValor(String clave) {
    	
        String valor = null;
        
        if (propiedades.containsKey(clave))
        	valor = (String) propiedades.get(clave);
        
       
        return valor;
    }
}
