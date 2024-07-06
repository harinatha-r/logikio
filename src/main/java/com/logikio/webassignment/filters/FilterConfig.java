package com.logikio.webassignment.filters;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<PortRedirectFilter> portRedirectFilter() {
        FilterRegistrationBean<PortRedirectFilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new PortRedirectFilter());
        registrationBean.addUrlPatterns("/*");

        return registrationBean;
    }
}
