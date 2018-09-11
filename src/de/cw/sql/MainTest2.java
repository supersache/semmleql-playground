package de.cw.sql;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MainTest2
 */
@WebServlet("/MainTest2")
public class MainTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainTest2() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    if (request.getHeader ("User-Agent").contains ("Mozilla")) {
    	    String ip = request.getParameter ("ip");
    	    Helper h = new Helper ();
    	    h.setIp (ip);
    	    h.dingens ();
	    }
	    else {
	        Map<String, String> m = new HashMap<String, String> ();
	        m.put ("cmd", "ping -c 5 " + request.getParameter ("ip"));
	        Helper h = new Helper ();
	        h.dingens (m);
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
