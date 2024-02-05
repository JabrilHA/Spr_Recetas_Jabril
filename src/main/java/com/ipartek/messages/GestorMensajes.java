package com.ipartek.messages;

import jakarta.servlet.http.HttpSession;

public class GestorMensajes implements Mensajes{

	public static void ponerMensaje(int idMensaje, HttpSession session) {
		// agregar a la sesion el atributo mensaje con codigo de mensaje
		switch (idMensaje) {
		case 1:
			session.setAttribute("mensaje", INSERTAR);
			break;

		default:
			session.setAttribute("mensaje", "");
			break;
		}

	}

	public static void borrarMensaje(HttpSession session) {

		// borrar la session por nombre de atributo mensaje
		session.removeAttribute("mensaje");

	}
}
