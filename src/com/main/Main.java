package com.main;

import com.utilidades.Configuracion;

public class Main {

	public static void main(String[] args) {
		System.out.println(Configuracion.getInstance().obtenerValor("CONF_1"));
		System.out.println(Configuracion.getInstance().obtenerValor("CONF_2"));
		System.out.println(Configuracion.getInstance().obtenerValor("CONF_3"));
		System.out.println(Configuracion.getInstance().obtenerValor("CONF_4"));
		System.out.println(Configuracion.getInstance().obtenerValor("CONF_5"));

	}

}
