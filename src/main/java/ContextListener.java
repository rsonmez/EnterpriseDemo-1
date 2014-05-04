
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Web application lifecycle listener.
 *
 * @author Ergo
 */
public class ContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("uygulama yüklendi");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("uygulama kaldırıldı");
    }
}
