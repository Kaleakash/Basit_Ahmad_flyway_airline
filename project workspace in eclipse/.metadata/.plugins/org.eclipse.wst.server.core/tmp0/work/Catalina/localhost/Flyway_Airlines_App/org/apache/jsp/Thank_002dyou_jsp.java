/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2024-07-01 16:23:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Search;
import model.Booking;

public final class Thank_002dyou_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("model.Search");
    _jspx_imports_classes.add("model.Booking");
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

    Booking.name_on_card = request.getParameter("name_on_card");
    Booking.card_details = request.getParameter("card_details");

    if (Booking.name_on_card.equals("") || Booking.card_details.equals("")) {
        out.println("Please enter valid card details");
    }

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
      out.write("  min-height: 900px;\r\n");
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
      out.write("  max-width: 900px;\r\n");
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
      out.write("<div class=\"header\">\r\n");
      out.write("  <a href=\"Header.jsp\" class=\"logo\">FlyAway Airline</a>\r\n");
      out.write("  <div class=\"header-right\">\r\n");
      out.write("    <a class=\"hover\" href=\"index.jsp\">Home</a>\r\n");
      out.write("    <a href=\"#contact\">Search Flight</a>\r\n");
      out.write("    <a href=\"login.jsp\">Admin Login</a>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"bg-img\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("    <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/index.jsp\" class=\"w3-bar-item w3-button w3-wide\"><img src=\"img/favicon.png\" class=\"img-fluid\" alt=\"image\" width=\"18%\">  FlyAway</a>\r\n");
      out.write("    <div class=\"conainer\">\r\n");
      out.write("        <a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/login.jsp\" class=\"w3-bar-item w3-button\"><i class=\"fa fa-gear\"></i> Admin Login</a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <h2 align=\"center\"><span><strong>Thank You</strong></span></h2>\r\n");
      out.write("       \r\n");
      out.write("        <p align=\"center\"><span><strong>Your ticket has been booked. The summary/details are as follows</strong></span></p>\r\n");
      out.write("        <p><button onclick=\"window.print()\" class=\"btn btn-success btn-block\" >Print Ticket</button></p>\r\n");
      out.write("        <br>\r\n");
      out.write("        \r\n");
      out.write("        <h3>Ticket Summary</h3>\r\n");
      out.write("        <h4><strong>");
      out.print(Search.source);
      out.write(" to ");
      out.print(Search.destination);
      out.write(' ');
      out.write('|');
      out.write(' ');
      out.print(Search.date);
      out.write("</strong></h4>\r\n");
      out.write("        <p align=\"left\">");
      out.print(Booking.flight_booking_id);
      out.write(' ');
      out.write('-');
      out.write(' ');
      out.print(Booking.flight_name);
      out.write(" (Travellers ");
      out.print(Search.persons);
      out.write(")</p><br>\r\n");
      out.write("        <br>\r\n");
      out.write("        \r\n");
      out.write("        <h3><strong>Passenger Summary</strong></h3>\r\n");
      out.write("        <h3>Booking Name-");
      out.print(Booking.passenger_name);
      out.write(" | Email- ");
      out.print(Booking.passenger_email);
      out.write(" | Phone- ");
      out.print(Booking.passenger_phone);
      out.write("</h3>\r\n");
      out.write("        <br>\r\n");
      out.write("        \r\n");
      out.write("        <h3><strong>Payment Summary</strong></h3>\r\n");
      out.write("        <h4>Payment By-");
      out.print(Booking.name_on_card);
      out.write(" | Card No- ");
      out.print(Booking.card_details);
      out.write("</h4><br>\r\n");
      out.write("        <h2 align=\"right\"><strong>Total Paid- Rs.");
      out.print(Search.persons*Booking.ticket_price);
      out.write("</strong></h2><br><br>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    </div>\r\n");
      out.write("       <div class=\"footer\" align=\"center\">\r\n");
      out.write("    <b>FlyAway</b> @ project by <b>Basit Ahmad</b></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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