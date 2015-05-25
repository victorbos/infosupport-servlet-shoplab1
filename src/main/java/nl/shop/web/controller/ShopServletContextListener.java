package nl.shop.web.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletRegistration;
import javax.servlet.annotation.WebListener;

/**
 * Created by Victor on 14-5-2015.
 */
@WebListener
public class ShopServletContextListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent servletContextEvent) {
//        ServletContext servletContext = servletContextEvent.getServletContext();
//        servletContext.addServlet("product-servlet", ProductServlet.class);
//        servletContext.getServletRegistration("product-servlet").addMapping("/products");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
