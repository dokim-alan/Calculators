package ca.sait.calculators.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * Basic arithmetic calculator.
 * @author Alan Kim
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

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
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
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
        
        String ageFirstInput = request.getParameter("first");
        String ageSecondInput = request.getParameter("second");
        
        if (ageFirstInput != null && ageSecondInput != null) {
        
            try {
                int ageFirst = Integer.parseInt(ageFirstInput);
                int ageSecond = Integer.parseInt(ageSecondInput);
                
                String operator = request.getParameter("operator");
                double ageCalc;
                
                if(operator.equals("+")){
                    ageCalc = ageFirst + ageSecond;
                } else if (operator.equals("-")) {
                    ageCalc = ageFirst - ageSecond;
                } else if (operator.equals("*")) {
                    ageCalc = ageFirst * ageSecond;
                } else { // operator.equals("%")
                    ageCalc = ageFirst % ageSecond;
                }
                    
                String message = String.format("Result: %f", ageCalc);
                request.setAttribute("message", message);
            } catch (Exception ex) {
                // Age input exists but is not a number.
                String message = String.format("invalid\n");
                // message += String.format("Age input exists but is not a number.");
                request.setAttribute("message", message);
            }
        } else {
            // Age input is missing.
            String message = String.format("Result: ---\n");
            // message +=  String.format("Age input is missing.");
            request.setAttribute("message", message);
        }
        
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }
}
