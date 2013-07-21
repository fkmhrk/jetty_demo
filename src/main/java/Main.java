import jp.fkmsoft.demo.server.MyServlet;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.ServletHandler;

public class Main {
    public static void main(String[] args) {
        Server server = new Server(8080); // port num
        
        ServletHandler context = new ServletHandler();
        context.addServletWithMapping(MyServlet.class, "/");
        
        server.setHandler(context);
        
        try {
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
