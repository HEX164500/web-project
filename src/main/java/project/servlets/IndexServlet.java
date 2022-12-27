package project.servlets;

import java.io.IOException;
import javax.faces.webapp.FacesServlet;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import project.model.User;

/**
 *
 * @author lucas
 */
@WebServlet(name = "Index Servlet", urlPatterns = "/", loadOnStartup = 1)
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("sended-attribute-to-forwarded-page", new Object());

        req.getRequestDispatcher("/index.xhtml").forward(req, resp); // basic dispatcher
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // from form post, get data
        req.getParameter("username");
        req.getParameter("password");

        // call service then perform login, or just do in a filter like a normal person
        // loginService.login(username, password) --> setup user session, maybe calling the httpsession api
        HttpSession session = req.getSession(); // the session api
        session.setAttribute("username", new User().getName()); // remember, same object

        super.doPost(req, resp);
    }

}
