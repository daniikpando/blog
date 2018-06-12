/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import dao.ArticuloDAO;
import dao.CategoriaArticuloDAO;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.Articulo;
import models.Usuario;

/**
 *
 * @author daniel
 */
@WebServlet(name = "ServletGuardarArticulo", urlPatterns = {"/articulo/guardar"})
public class ServletGuardarArticulo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        HttpSession sesion = request.getSession();
        
        Articulo articulo = new Articulo();
        
        articulo.setTitulo(request.getParameter("titulo"));
        articulo.setContenido(request.getParameter("contenido"));
        articulo.setDescripcion(request.getParameter("descripcion"));
        articulo.setUsuario( (Usuario)(sesion.getAttribute("usuario")) );
        
        String[] ids = request.getParameterValues("categoria");
        int[] idCategorias = new int[ids.length];
        
        for(int i=0; i < ids.length; i++){
            idCategorias[i] = Integer.parseInt(ids[i]);
        }
        
        ArticuloDAO articulodao = new ArticuloDAO();
        int idArticulo;
        
        try {
            idArticulo = articulodao.insertarArticulo(articulo);
            CategoriaArticuloDAO ca = new CategoriaArticuloDAO();
            
            for(int i=0; i<idCategorias.length; i++){
                ca.insertarCategoriaArticulo(idCategorias[i], idArticulo);
            }
            
            response.sendRedirect("/webapp/articulo?id="+idArticulo);
        } catch (Exception ex) {
            ex.printStackTrace();
            response.sendRedirect("/webapp/articulo/nuevo");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
