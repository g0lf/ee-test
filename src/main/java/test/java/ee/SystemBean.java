package test.java.ee;

import org.h2.tools.Server;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.ejb.Stateless;
import java.sql.SQLException;

@SuppressWarnings("unused")
@Singleton
@Startup
public class SystemBean {

    @PostConstruct
    public void init() {
        //Server server = Server.createTcpServer().start();
    }

}
