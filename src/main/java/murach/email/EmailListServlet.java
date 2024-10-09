package murach.email;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

import murach.business.User;
//import murach.data.UserDB;

public class EmailListServlet extends HttpServlet  {

    @Override
    protected void doPost(HttpServletRequest request, 
                          HttpServletResponse response) 
                          throws ServletException, IOException {

        String url = "/index.html";
        

        // get current action
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";  // default action
        }
        
        // Print action parameter to the Tomcat console for debugging
        System.out.println("Action parameter: " + action);
    
        // perform action and set URL to appropriate page
        if (action.equals("join")) {
            url = "/index.html";    // the "join" page
        }
        else if (action.equals("add")) {                
            // get parameters from the request
            String email = request.getParameter("email");
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String heardFrom = request.getParameter("heardFrom");
            String updates = request.getParameter("updates");
            String contactVia = request.getParameter("contactVia");

            // store data in User object and save User object in db
            User user = new User(firstName, lastName, email, heardFrom, updates, contactVia);
            //UserDB.insert(user);
            
            request.setAttribute("user", user);
            url = "/survey.jsp";   // the "thanks" page
        }
        
        // forward request and response objects to specified URL
        getServletContext()
            .getRequestDispatcher(url)
            .forward(request, response);
    }    
    @Override
    protected void doGet(HttpServletRequest request, 
                         HttpServletResponse response) 
                         throws ServletException, IOException {
        doPost(request, response);
    }    
}
