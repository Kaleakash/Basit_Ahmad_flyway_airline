/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2024-07-01 16:28:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import model.Search;

public final class search_002dresults_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.Search");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");

    String driverName = "com.mysql.cj.jdbc.Driver";
    String connectionUrl = "jdbc:mysql://localhost/";
    String dbName = "db_world";
    String userId = "root";
    String password = "root@123";
    String query = Search.getQuery();
    try {
        Class.forName(driverName);
    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    }
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta name=\"header\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<style>\r\n");
      out.write("{box-sizing: border-box;}\r\n");
      out.write("\r\n");
      out.write("body { \r\n");
      out.write("  margin: 28;\r\n");
      out.write("  font-family: Arial, Helvetica, sans-serif;\r\n");
      out.write("}\r\n");
      out.write(".bg-img {\r\n");
      out.write("  /* The image used */\r\n");
      out.write("  background-image: url(https://wallpaperaccess.com/full/254381.jpg);\r\n");
      out.write("   /* Control the height of the image */\r\n");
      out.write("  min-height: 500px;\r\n");
      out.write("\r\n");
      out.write("  /* Center and scale the image nicely */\r\n");
      out.write("  background-position: center;\r\n");
      out.write("  background-repeat: no-repeat;\r\n");
      out.write("  background-size: cover;\r\n");
      out.write("  position: relative;\r\n");
      out.write("}\r\n");
      out.write("  /* Add styles to the form container */\r\n");
      out.write(".container {\r\n");
      out.write("  position: absolute;\r\n");
      out.write("  right: 0;\r\n");
      out.write("  margin: 20px;\r\n");
      out.write("  max-width: 1000px;\r\n");
      out.write("  padding: 16px;\r\n");
      out.write("  background-color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Full-width input fields */\r\n");
      out.write("  input[type=text], input[type=password] {\r\n");
      out.write("  width: 80%;\r\n");
      out.write("  padding: 18px;\r\n");
      out.write("  margin: 5px 0 22px 0;\r\n");
      out.write("  border: none;\r\n");
      out.write("  background: #f1f1f1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("input[type=text]:focus, input[type=password]:focus {\r\n");
      out.write("  background-color: #ddd;\r\n");
      out.write("  outline: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Set a style for the submit button */\r\n");
      out.write(".btn {\r\n");
      out.write("  background-color: #FFA500;\r\n");
      out.write("  color: black;\r\n");
      out.write("  padding: 16px 20px;\r\n");
      out.write("  border: none;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  width: 100%;\r\n");
      out.write("  opacity: 0.9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn:hover {\r\n");
      out.write("  opacity: 1;\r\n");
      out.write("}\r\n");
      out.write(".header {\r\n");
      out.write("  overflow: hidden;\r\n");
      out.write("  background-color: #FFA500;\r\n");
      out.write("  padding: 10px 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header a {\r\n");
      out.write("  float: left;\r\n");
      out.write("  color: black;\r\n");
      out.write("  text-align: center;\r\n");
      out.write("  padding: 12px;\r\n");
      out.write("  text-decoration: none;\r\n");
      out.write("  font-size: 14px; \r\n");
      out.write("  line-height: 25px;\r\n");
      out.write("  border-radius: 4px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header a.logo {\r\n");
      out.write("  font-size: 25px;\r\n");
      out.write("  font-weight: Italics;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header a:hover {\r\n");
      out.write("  background-color: #ddd;\r\n");
      out.write("  color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header a.active {\r\n");
      out.write("  background-color: dodgerblue;\r\n");
      out.write("  color:peach puff ;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".header-right {\r\n");
      out.write("  float: right;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media screen and (max-width: 500px) {\r\n");
      out.write("  .header a {\r\n");
      out.write("    float: none;\r\n");
      out.write("    display: block;\r\n");
      out.write("    text-align: left;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .header-right {\r\n");
      out.write("    float: none;\r\n");
      out.write("  }\r\n");
      out.write("}\r\n");
      out.write(".footer\r\n");
      out.write("{\r\n");
      out.write("position: fixed;\r\n");
      out.write("left: 0;\r\n");
      out.write("bottom: 10px;\r\n");
      out.write("width: 100%;\r\n");
      out.write("background-color:#FFA500;\r\n");
      out.write("color: black;\r\n");
      out.write("text-align: center;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<div class=\"header\">\r\n");
      out.write("  <a href=\"Header.jsp\" class=\"logo\">FlyAway Airline</a>\r\n");
      out.write("  <div class=\"header-right\">\r\n");
      out.write("    <a class=\"hover\" href=\"index.jsp\">Home</a>\r\n");
      out.write("    <a href=\"#contact\">Search Flight</a>\r\n");
      out.write("    <a href=\"login.jsp\">Admin Login</a>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"bg-img\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write(" <h2 align=\"center\"><span><strong>Search Results</strong></span></h2>\r\n");
      out.write("    <p align=\"center\"><span><strong>\r\n");
      out.write("        Showing available flights from ");
      out.print(Search.source);
      out.write(" to  ");
      out.print(Search.destination);
      out.write(" <br>\r\n");
      out.write("        Date of travel : ");
      out.print(Search.date);
      out.write(' ');
      out.write('(');
      out.print(Search.date);
      out.write(")  <br>\r\n");
      out.write("        No of travellers :  ");
      out.print(Search.persons);
      out.write("  <br>\r\n");
      out.write("    </p>\r\n");
      out.write("<table class=\"table table-hover table-striped\">\r\n");
      out.write("        <thead>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <th scope=\"col\">Flight name</th>\r\n");
      out.write("            <th scope=\"col\">Flight number</th>\r\n");
      out.write("            <th scope=\"col\">Class</th>\r\n");
      out.write("            <th scope=\"col\">Date of travel</th>\r\n");
      out.write("            <th scope=\"col\">Source City</th>\r\n");
      out.write("            <th scope=\"col\">Destination City</th>\r\n");
      out.write("            <th scope=\"col\">Departure time</th>\r\n");
      out.write("            <th scope=\"col\">Arrival time</th>\r\n");
      out.write("            <th scope=\"col\">Seat available</th>\r\n");
      out.write("            <th scope=\"col\">Ticket Price</th>\r\n");
      out.write("            <th scope=\"col\">Select</th>\r\n");
      out.write("        </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        <tbody>\r\n");
      out.write("        <br><p align=\"center\"><span><strong>Select a flight</strong></span></p><br>\r\n");
      out.write("\r\n");
      out.write("<!-- mysql try statement -->\r\n");
      out.write("   ");

            try{
                connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
                statement=connection.createStatement();
                resultSet = statement.executeQuery(query);
                while(resultSet.next()){
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- table design getValues -->\r\n");
      out.write("<tr bgcolor=\"#F5F5F5\">\r\n");
      out.write("            <td>");
      out.print(resultSet.getString("flight_name") );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(resultSet.getString("flight_number") );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(resultSet.getString("class") );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(resultSet.getString("date_of_travel") );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(resultSet.getString("source_info") );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(resultSet.getString("destination") );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(resultSet.getString("departure_time") );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(resultSet.getString("arival_time") );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(resultSet.getString("seat_availibility") );
      out.write("</td>\r\n");
      out.write("            <td>");
      out.print(resultSet.getInt("ticket_price") );
      out.write("</td>\r\n");
      out.write("            <td>\r\n");
      out.write("<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/booking-details.jsp\" method=\"post\">\r\n");
      out.write("                    <input type=\"hidden\" id=\"flight_name\" name=\"flight_name\" value=\"");
      out.print(resultSet.getString("flight_name"));
      out.write("\">\r\n");
      out.write("                    <input type=\"hidden\" id=\"ticket_price\" name=\"ticket_price\" value=\"");
      out.print(resultSet.getString("ticket_price"));
      out.write("\">\r\n");
      out.write("                    <input type=\"hidden\" id=\"flight_id\" name=\"flight_id\" value=\"");
      out.print(resultSet.getString("flight_number"));
      out.write("\">\r\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-success\" value=\"Book This Flight\">\r\n");
      out.write("                </form>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        ");

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        
      out.write("\r\n");
      out.write("        </tbody>\r\n");
      out.write("    </table>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("       <div class=\"footer\" align=\"center\">\r\n");
      out.write("    <b>FlyAway</b> @ project by <b>Basit Ahmad</b></div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
