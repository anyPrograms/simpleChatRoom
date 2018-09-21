package com.simpleChatRoom.Utils;

import org.apache.log4j.Logger;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class listenerLoadConfig implements ServletContextListener {

    private Logger log = Logger.getLogger(listenerLoadConfig.class);

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
    }

    @Override
    public void contextInitialized(ServletContextEvent event){
        String path=event.getServletContext().getRealPath("WEB-INF/config/dbconfig.properties");
        loadDBConfig.load(path);
        log.info("load database successfully!");
    }

}
