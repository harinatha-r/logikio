package com.logikio.webassignment.filters;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static com.logikio.webassignment.constants.HtmlTemplates.PORT_REDIRECT_HTML_TEMPLATE;

public class PortRedirectFilter implements Filter {

    private static final Logger logger = LoggerFactory.getLogger(PortRedirectFilter.class);
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
                    throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        int serverPort = httpRequest.getLocalPort();
        logger.info("PortRedirectFilter: Received request on port " + serverPort);

        if (serverPort != 8085) {
            response.getWriter().write(PORT_REDIRECT_HTML_TEMPLATE);
            return;
        }

        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }
}

