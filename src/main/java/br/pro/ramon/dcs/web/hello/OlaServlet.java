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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nome = req.getParameter("nome");

        if (nome == null || nome.trim().isEmpty()) {
            nome = "mundo";
        }

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("Olá, <strong>" + nome + "</strong>!");
    }

}
