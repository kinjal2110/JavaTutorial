import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Process extends HttpServlet
{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        PrintWriter out=res.getWriter();
        res.setContentType("text/html");
        String fcolor=req.getParameter("fc");
        String hobby=req.getParameter("hb");
        Cookie c[]=req.getCookies();
        if(c==null)
        {
            Cookie c1=new Cookie("fc",fcolor);
            Cookie c2=new Cookie("hb",hobby);
            res.addCookie(c1);
            res.addCookie(c2);
            out.println("You have visited site first time");
        }
        else
        {
            out.println("your fcolor is "+c[0].getValue());                                                                                          
            out.println("<p>your Hobby is "+c[1].getValue()+"</p>");
            String url="/Cooki/Logout";
            out.println("<h1><a href="+url+">logout</a></h1>");
        }
    }
}