package servlet;



import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import foodupload.foodinterface;
import foodupload.foodinterImpl;

/**
 *
 * @author hp1
 */
@WebServlet(name = "DeleteFromDBP", urlPatterns = {"/DeleteFromDBP"})
public class DeleteFromDBP extends HttpServlet {

 
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        int id = Integer.parseInt(req.getParameter("id") );
        
        foodinterface pdao = new foodinterImpl();
       
        pdao.delete(id);
         
        resp.sendRedirect("fooddetails.jsp");
        
    }
    
    
    
}