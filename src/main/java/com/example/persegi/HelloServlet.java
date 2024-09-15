package com.example.persegi;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int panjang = Integer.parseInt(request.getParameter("Panjang"));
        int lebar = Integer.parseInt(request.getParameter("Lebar"));

        int keliling = 2*panjang + 2*lebar;
        String bentuk = (panjang==lebar)? "bujur sangkar":"persegi panjang";

        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1> NO. 1 </h1>");
        out.println("<p>" + "Keliling :  "+ (2*panjang + 2*lebar) + "</p>");
        out.println("<p>" + "Luas :  "+ panjang*lebar + "</p>");
        out.println("<br/>");
        out.println("<h1> NO. 2 </h1>");
        out.println("<p>" + "Input merupakan :  "+bentuk+"</p>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}