package com.seeksky.webdemo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWord  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=GB2312");
        PrintWriter out=response.getWriter();
        out.println("<html><head><title>ResInfoServlet</title></head>");
        out.println("<body>");
        out.println("<br>LocalAddr : " + request.getLocalAddr());
        out.println("<br>LocalName : " + request.getLocalName());
        out.println("<br>username : "+request.getParameter("username"));
        out.println("<br>RemoteAddress:"+request.getRemoteAddr());
        out.println("</body></html>");
        out.close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
