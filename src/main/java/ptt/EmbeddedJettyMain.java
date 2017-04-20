package ptt;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;

public class EmbeddedJettyMain {

	public static void main(String[] args) throws Exception {
		Server server = new Server(7071);
		ServletContextHandler handler = new ServletContextHandler(server, "/dashboard");
		handler.addServlet(DashboardServlet.class, "/");
		server.start();
	}

}
