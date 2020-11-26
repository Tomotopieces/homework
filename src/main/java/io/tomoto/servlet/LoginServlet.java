package io.tomoto.servlet;

import io.tomoto.model.entity.User;
import io.tomoto.model.service.impl.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Tomoto
 * <p>
 * 2020/11/24 15:41
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private final UserService service = new UserService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String account = req.getParameter("account");
        String password = req.getParameter("password");
        User user = service.getUserByAccount(account);
//        User user = new User(1, "IzzelAliz", "HaiLuo", "是海螺");
        req.setAttribute("user", user);
        if (user.getUserPassword().equals(password)) {
            req.getRequestDispatcher("/info.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }
    }
}
