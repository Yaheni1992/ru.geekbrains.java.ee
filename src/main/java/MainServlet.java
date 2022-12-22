import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
import java.util.logging.Logger;

@WebServlet(name = "TestServlet",urlPatterns = "/testservlet")
public class MainServlet implements Servlet {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(MainServlet.class);
    private transient ServletConfig servletConfig;
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        this.servletConfig = servletConfig;
    }

    @Override
    public ServletConfig getServletConfig() {
        return servletConfig;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        logger.info("new request");
        servletResponse.getWriter().println("Hello Yauheni");
        logger.info("it`s worked");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}