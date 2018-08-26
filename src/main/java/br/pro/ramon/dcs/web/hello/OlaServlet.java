package br.pro.ramon.dcs.web.hello;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ola")
public class OlaServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");

        if (nome == null || nome.trim().isEmpty()) {
            nome = "mundo";
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Olá, <strong>" + nome + "</strong>! (via GET)");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nome = request.getParameter("nome");

        if (nome == null || nome.trim().isEmpty()) {
            nome = "mundo";
        }

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Olá, <strong>" + nome + "</strong>! (via POST)");
    }

}
