package servlet;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by KAI on 10/3/17.
 */
public class HelloFilter implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        String param = request.getParameter("param");
        if (!"123".equals(param))
            chain.doFilter(request, response);

    }

    public void destroy() {

    }
}
