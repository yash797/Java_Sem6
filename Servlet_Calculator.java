// INDEX.HTML FILE:-
// <html>
// <head>
// <title>Calculator App</title>
// </head>
// <body>
// <form action="CalculatorServlet">Enter First Number:
// <input type="text"name="txtN1">
// <br>
// Enter Second Number:<input type="text"name="txtN2">
// <br>
// Select an Operation:
// <input type="radio"name="opr"value="+">
// ADDTION<input type="radio"name="opr"value="-">
// SUBSTRACTION<input type="radio"name="opr"value="*">
// MULTIPLY<input type="radio"name="opr"value="/">
// DIVIDE<br><input type="reset"><input type="submit"value="Calculate">
// </form>
// </body>
// </html>

// CalculatorServlet.java FILE:-

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class CalculatorServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        out.println("<html><head><title>Servlet CalculatorServlet</title></head><body>");

        double n1=Double.parseDouble(request.getParameter("txtN1"));
        double n2=Double.parseDouble(request.getParameter("txtN2"));
        double result=0;
        String opr=request.getParameter("opr");
        if(opr.equals("+"))
            if (opr.equals("*"))

        result=n1+n2;
        if(opr.equals("*"))
        result=n1*n2;
        if(opr.equals("-"))
        result=n1-n2;
        if(opr.equals("/"))
        result=n1/n2;out.println("<h1>Result="+result);
        out.println("</body></html>");
    }
}
