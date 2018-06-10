/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author daniel
 */
public class Dispatcher {
    
    public static void irAPagina(HttpServletRequest request, HttpServletResponse response, ServletContext contexto, String url)
            throws ServletException, IOException {
        RequestDispatcher despachador = contexto.getRequestDispatcher(url);
        despachador.forward(request, response);
    }
    
}
