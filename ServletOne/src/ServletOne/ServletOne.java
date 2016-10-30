/*
 * ServletOne.java
 *
 */

package ServletOne;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

public class ServletOne {
  
  /** Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
   * @param request servlet request
   * @param response servlet response
   */
  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8");
    PrintWriter out = response.getWriter();
    /* TODO output your page here */
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet ServletOne</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet ServletOne at " + request.getContextPath () + "</h1>");
        out.println("Date is: "+ new java.util.Date());
        out.println("</body>");
        out.println("</html>");
    /* */
    out.close();
  }
  
  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
  /** Handles the HTTP <code>GET</code> method.
   * @param request servlet request
   * @param response servlet response
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
    processRequest(request, response);
  }
  
  /** Handles the HTTP <code>POST</code> method.
   * @param request servlet request
   * @param response servlet response
   */
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
  throws ServletException, IOException {
    processRequest(request, response);
  }
  
  /** Returns a short description of the servlet.
   */
  public String getServletInfo() {
    return "Short description";
  }
  // </editor-fold>
}
