/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.20
 * Generated at: 2017-09-29 06:39:02 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/_head.jspf", Long.valueOf(1506665536000L));
    _jspx_dependants.put("/_footer.jspf", Long.valueOf(1506602861000L));
    _jspx_dependants.put("/_top.jspf", Long.valueOf(1506667127000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html lang=\"kr\">\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<meta http-equiv=\"content-type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<title>SLiPP Java Web Programming</title>\n");
      out.write("<meta name=\"viewport\"\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, maximum-scale=1\">\n");
      out.write("<link href=\"/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<!--[if lt IE 9]>\n");
      out.write("\t\t\t<script src=\"//html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("<link href=\"/css/styles.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-fixed-top header\">\n");
      out.write("\t<div class=\"col-md-12\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\n");
      out.write("\t\t\t<a href=\"/index.jsp\" class=\"navbar-brand\">SLiPP</a>\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\tdata-target=\"#navbar-collapse1\">\n");
      out.write("\t\t\t\t<i class=\"glyphicon glyphicon-search\"></i>\n");
      out.write("\t\t\t</button>\n");
      out.write("\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbar-collapse1\">\n");
      out.write("\t\t\t<form class=\"navbar-form pull-left\">\n");
      out.write("\t\t\t\t<div class=\"input-group\" style=\"max-width: 470px;\">\n");
      out.write("\t\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"Search\"\n");
      out.write("\t\t\t\t\t\tname=\"srch-term\" id=\"srch-term\">\n");
      out.write("\t\t\t\t\t<div class=\"input-group-btn\">\n");
      out.write("\t\t\t\t\t\t<button class=\"btn btn-default btn-primary\" type=\"submit\">\n");
      out.write("\t\t\t\t\t\t\t<i class=\"glyphicon glyphicon-search\"></i>\n");
      out.write("\t\t\t\t\t\t</button>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t<li><a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-bell\"></i></a>\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://slipp.net\" target=\"_blank\">SLiPP</a></li>\n");
      out.write("\t\t\t\t\t\t<li><a href=\"https://facebook.com\" target=\"_blank\">Facebook</a></li>\n");
      out.write("\t\t\t\t\t</ul></li>\n");
      out.write("\t\t\t\t<li><a href=\"./user/list.html\"><i\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-user\"></i></a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</nav>\n");
      out.write("<div class=\"navbar navbar-default\" id=\"subnav\">\n");
      out.write("\t<div class=\"col-md-12\">\n");
      out.write("\t\t<div class=\"navbar-header\">\n");
      out.write("\t\t\t<a href=\"#\" style=\"margin-left: 15px;\"\n");
      out.write("\t\t\t\tclass=\"navbar-btn btn btn-default btn-plus dropdown-toggle\"\n");
      out.write("\t\t\t\tdata-toggle=\"dropdown\"><i class=\"glyphicon glyphicon-home\"\n");
      out.write("\t\t\t\tstyle=\"color: #dd1111;\"></i> Home <small><i\n");
      out.write("\t\t\t\t\tclass=\"glyphicon glyphicon-chevron-down\"></i></small></a>\n");
      out.write("\t\t\t<ul class=\"nav dropdown-menu\">\n");
      out.write("\t\t\t\t<li><a href=\"user/profile.html\"><i\n");
      out.write("\t\t\t\t\t\tclass=\"glyphicon glyphicon-user\" style=\"color: #1111dd;\"></i>\n");
      out.write("\t\t\t\t\t\tProfile</a></li>\n");
      out.write("\t\t\t\t<li class=\"nav-divider\"></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\"><i class=\"glyphicon glyphicon-cog\"\n");
      out.write("\t\t\t\t\t\tstyle=\"color: #dd1111;\"></i> Settings</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\n");
      out.write("\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\n");
      out.write("\t\t\t\tdata-target=\"#navbar-collapse2\">\n");
      out.write("\t\t\t\t<span class=\"sr-only\">Toggle navigation</span> <span\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\n");
      out.write("\t\t\t\t\tclass=\"icon-bar\"></span>\n");
      out.write("\t\t\t</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbar-collapse2\">\n");
      out.write("\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("\t\t\t\t<li class=\"active\"><a href=\"/index.jsp\">Posts</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/user/login.jsp\" role=\"button\">로그인</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"/user/form.jsp\" role=\"button\">회원가입</a></li>\n");
      out.write("\t\t\t\t<!--\n");
      out.write("                <li><a href=\"#loginModal\" role=\"button\" data-toggle=\"modal\">로그인</a></li>\n");
      out.write("                <li><a href=\"#registerModal\" role=\"button\" data-toggle=\"modal\">회원가입</a></li>\n");
      out.write("                -->\n");
      out.write("\t\t\t\t<li><a href=\"#\" role=\"button\">로그아웃</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\" role=\"button\">개인정보수정</a></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\t<div class=\"container\" id=\"main\">\n");
      out.write("\t\t<div class=\"col-md-12 col-sm-12 col-lg-10 col-lg-offset-1\">\n");
      out.write("\t\t\t<div class=\"panel panel-default qna-list\">\n");
      out.write("\t\t\t\t<ul class=\"list\">\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<div class=\"wrap\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main\">\n");
      out.write("\t\t\t\t\t\t\t\t<strong class=\"subject\"> <a href=\"./qna/show.html\">국내에서\n");
      out.write("\t\t\t\t\t\t\t\t\t\tRuby on Rails와 Play가 활성화되기 힘든 이유는 뭘까?</a>\n");
      out.write("\t\t\t\t\t\t\t\t</strong>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"auth-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"icon-add-comment\"></i> <span class=\"time\">2016-01-15\n");
      out.write("\t\t\t\t\t\t\t\t\t\t18:47</span> <a href=\"./user/profile.html\" class=\"author\">자바지기</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"reply\" title=\"댓글\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"icon-reply\"></i> <span class=\"point\">8</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t<div class=\"wrap\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"main\">\n");
      out.write("\t\t\t\t\t\t\t\t<strong class=\"subject\"> <a href=\"./qna/show.html\">runtime\n");
      out.write("\t\t\t\t\t\t\t\t\t\t에 reflect 발동 주체 객체가 뭔지 알 방법이 있을까요?</a>\n");
      out.write("\t\t\t\t\t\t\t\t</strong>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"auth-info\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"icon-add-comment\"></i> <span class=\"time\">2016-01-05\n");
      out.write("\t\t\t\t\t\t\t\t\t\t18:47</span> <a href=\"./user/profile.html\" class=\"author\">김문수</a>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"reply\" title=\"댓글\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<i class=\"icon-reply\"></i> <span class=\"point\">12</span>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t</ul>\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3\"></div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-6 text-center\">\n");
      out.write("\t\t\t\t\t\t<ul class=\"pagination center-block\" style=\"display: inline-block;\">\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">«</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">1</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">2</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">3</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">4</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">5</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"#\">»</a></li>\n");
      out.write("\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t<div class=\"col-md-3 qna-write\">\n");
      out.write("\t\t\t\t\t\t<a href=\"/qna/form.html\" class=\"btn btn-primary pull-right\"\n");
      out.write("\t\t\t\t\t\t\trole=\"button\">질문하기</a>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("\t<!--login modal-->\n");
      out.write("\t<!--\n");
      out.write("<div id=\"loginModal\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("  <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("          <h2 class=\"text-center\"><img src=\"https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=100\" class=\"img-circle\"><br>Login</h2>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <form class=\"form col-md-12 center-block\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label for=\"userId\">사용자 아이디</label>\n");
      out.write("                  <input class=\"form-control\" name=\"userId\" placeholder=\"User ID\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label for=\"password\">비밀번호</label>\n");
      out.write("                  <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <button class=\"btn btn-primary btn-lg btn-block\">로그인</button>\n");
      out.write("                  <span class=\"pull-right\"><a href=\"#registerModal\" role=\"button\" data-toggle=\"modal\">회원가입</a></span>\n");
      out.write("              </div>\n");
      out.write("          </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("          <button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">Cancel</button>\n");
      out.write("      </div>  \n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\t<!--register modal-->\n");
      out.write("\t<!--\n");
      out.write("<div id=\"registerModal\" class=\"modal fade\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\">\n");
      out.write("  <div class=\"modal-dialog\">\n");
      out.write("  <div class=\"modal-content\">\n");
      out.write("      <div class=\"modal-header\">\n");
      out.write("          <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-hidden=\"true\">×</button>\n");
      out.write("          <h2 class=\"text-center\"><img src=\"https://lh5.googleusercontent.com/-b0-k99FZlyE/AAAAAAAAAAI/AAAAAAAAAAA/eu7opA4byxI/photo.jpg?sz=100\" class=\"img-circle\"><br>회원가입</h2>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-body\">\n");
      out.write("          <form class=\"form col-md-12 center-block\">\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label for=\"userId\">사용자 아이디</label>\n");
      out.write("                  <input class=\"form-control\" id=\"userId\" name=\"userId\" placeholder=\"User ID\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label for=\"password\">비밀번호</label>\n");
      out.write("                  <input type=\"password\" class=\"form-control\" id=\"password\" name=\"password\" placeholder=\"Password\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label for=\"name\">이름</label>\n");
      out.write("                  <input class=\"form-control\" id=\"name\" name=\"name\" placeholder=\"Name\">\n");
      out.write("              </div>\n");
      out.write("              <div class=\"form-group\">\n");
      out.write("                  <label for=\"email\">이메일</label>\n");
      out.write("                  <input type=\"email\" class=\"form-control\" id=\"email\" name=\"email\" placeholder=\"Email\">\n");
      out.write("              </div>\n");
      out.write("            <div class=\"form-group\">\n");
      out.write("              <button class=\"btn btn-primary btn-lg btn-block\">회원가입</button>\n");
      out.write("            </div>\n");
      out.write("          </form>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"modal-footer\">\n");
      out.write("          <div class=\"col-md-12\">\n");
      out.write("          <button class=\"btn\" data-dismiss=\"modal\" aria-hidden=\"true\">Cancel</button>\n");
      out.write("      </div>  \n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("-->\n");
      out.write("\n");
      out.write("\t");
      out.write("\n");
      out.write("\t<!-- script references -->\n");
      out.write("\t<script src=\"js/jquery-2.2.0.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/scripts.js\"></script>");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
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
