/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import dbhelpers.UpdateQuery;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.customers;

/**
 *
 * @author agade
 */
@WebServlet(name = "UpdateServlet", urlPatterns = {"/updatecust"})
public class UpdateServlet extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet UpdateServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
        doPost(request, response);
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
        
        //get the form data and set up a new car object
        int CustID = Integer.parseInt(request.getParameter("CUSTID"));
        String FirstName = request.getParameter("firstName");
        String LastName = request.getParameter("lastName");
        String Addr1 = request.getParameter("addr1");
        String Addr2 = request.getParameter("addr1");
        String City = request.getParameter("city");
        String State = request.getParameter("state");
        String Zip = request.getParameter("zip");
        String EmailAddr = request.getParameter("emailAddr");
        int Age = Integer.parseInt(request.getParameter("age"));
        
        
       
        customers customer = new customers();
        customer.setCustID(CustID);
        customer.setFirstName(FirstName);
        customer.setLastName(LastName);
        customer.setAddr1(Addr1);
        customer.setAddr2(Addr2);
        customer.setCity(City);
        customer.setState(State);
        customer.setZip(Zip);
        customer.setEmailAddr(EmailAddr);
        customer.setAge(Age);
        
        //create an UpdateQuery object and use it to update the customer
        
        UpdateQuery uq = new UpdateQuery();
        uq.doUpdate(customer);
        
        //pass control to the ReadServlet
        
        String url = "/read";
        
        RequestDispatcher dispatcher = request.getRequestDispatcher(url);
        dispatcher.forward(request, response);
        
        
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
