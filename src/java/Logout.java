    import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class Logout extends HttpServlet
{
    public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException
    {
        res.setContentType("text/html");
        PrintWriter out=res.getWriter();
        Cookie c1=new Cookie("fc"," ");
        Cookie c2=new Cookie("hb"," ");
        c1.setMaxAge(0);
        c2.setMaxAge(0);
        res.addCookie(c1);
        res.addCookie(c2);
     
        out.println("Successfully logout");
    }
}