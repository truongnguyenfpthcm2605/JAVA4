/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.68
 * Generated at: 2024-04-04 05:39:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.bai1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1678208717897L));
    _jspx_dependants.put("jar:file:/D:/JAVA4/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/LAB6-PS24083/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153359882000L));
    _jspx_dependants.put("jar:file:/D:/JAVA4/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/LAB6-PS24083/WEB-INF/lib/jstl-1.2.jar!/META-INF/fmt.tld", Long.valueOf(1153359882000L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.release();
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write(".titlewep {\r\n");
      out.write("	font-size: 2rem;\r\n");
      out.write("	color: #66347F;\r\n");
      out.write("	font-weight: bold;\r\n");
      out.write("	font-style: italic;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navs a {\r\n");
      out.write("	font-size: 15px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navs a:hover {\r\n");
      out.write("	transform: scale(1.05);\r\n");
      out.write("	transition: all linear 0.5s;\r\n");
      out.write("	color: #66347F;\r\n");
      out.write("}\r\n");
      out.write("/* pay */\r\n");
      out.write(".contentdialog {\r\n");
      out.write("	width: auto;\r\n");
      out.write("	width: 1000px;\r\n");
      out.write("	margin: 0;\r\n");
      out.write("	border-radius: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pay {\r\n");
      out.write("	display: flex;\r\n");
      out.write("	justify-content: space-around;\r\n");
      out.write("	width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pay>div {\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	background-color: rgba(0, 0, 0, 0.1);\r\n");
      out.write("	border-radius: 20px;\r\n");
      out.write("	margin: 10px;\r\n");
      out.write("	width: 45%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pay>div:hover {\r\n");
      out.write("	transform: scale(1.02);\r\n");
      out.write("	transition: all linear .5s;\r\n");
      out.write("	box-shadow: rgba(14, 30, 37, 0.12) 0px 2px 4px 0px,\r\n");
      out.write("		rgba(14, 30, 37, 0.32) 0px 2px 16px 0px;\r\n");
      out.write("	background-color: rgba(0, 0, 0, 0.04);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pay h3 {\r\n");
      out.write("	margin-bottom: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pay a {\r\n");
      out.write("	border-radius: 10px;\r\n");
      out.write("}\r\n");
      out.write("a {\r\n");
      out.write("	color: black;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("<div class=\"onhead\">\r\n");
      out.write("	");
      if (_jspx_meth_c_005furl_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"header\"\r\n");
      out.write("		style=\"background-color: rgba(0, 0, 0, 0.1); height: auto;\">\r\n");
      out.write("		<div>\r\n");
      out.write("			<div class=\"container d-flex flex-wrap\"\r\n");
      out.write("				style=\"justify-content: space-between; text-align: center; margin: 0px auto; padding: 10px;\">\r\n");
      out.write("				<a href=\"/ASM-PS24083/views/jsp/index.jsp\"\r\n");
      out.write("					class=\"d-flex align-items-center mb-3 mb-lg-0 me-lg-auto text-dark text-decoration-none\">\r\n");
      out.write("					<svg class=\"bi me-2\" width=\"40\" height=\"32\">\r\n");
      out.write("                            <use xlink:href=\"#bootstrap\"></use>\r\n");
      out.write("                        </svg> <span class=\" titlewep\">Bai 2 &#169;</span>\r\n");
      out.write("				</a>\r\n");
      out.write("				<div\r\n");
      out.write("					style=\"display: flex; justify-content: space-between; align-items: center; cursor: pointer;\"\r\n");
      out.write("					data-toggle=\"modal\" data-target=\"#exampleModal\">\r\n");
      out.write("\r\n");
      out.write("					<h5\r\n");
      out.write("						style=\"margin: 0 0 0 10px; font-style: italic; font-family: 'Times New Roman', Times, serif; color: aliceblue; font-weight: bold;\">\r\n");
      out.write("						Đăng Nhập</h5>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("				aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("				<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("					<div class=\"modal-content\" style=\"border-radius: 10px;\">\r\n");
      out.write("						<div class=\"modal-header\">\r\n");
      out.write("							<a class=\"modal-title\" id=\"exampleModalLabel\"\r\n");
      out.write("								href=\"/ASM-PS24083/views/jsp/index.jsp\"><span\r\n");
      out.write("								class=\" titlewep\">Manager&#169;</span></a>\r\n");
      out.write("							<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("								aria-label=\"Close\">\r\n");
      out.write("								<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("							</button>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"modal-body\">\r\n");
      out.write("							<form>\r\n");
      out.write("								<div class=\"form-group valid\">\r\n");
      out.write("									<label for=\"exampleInputEmail1\" class=\"badge bg-success\">Tên\r\n");
      out.write("										Tài Khoản</label> <input type=\"text\" class=\"form-control\" name=\"id\"\r\n");
      out.write("										id=\"exampleInputEmail1\" placeholder=\"Nhập tên tài khoản\"\r\n");
      out.write("										required>\r\n");
      out.write("\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"form-group valid\">\r\n");
      out.write("									<label for=\"exampleInputPassword1\" class=\"badge bg-success\" s>Mật\r\n");
      out.write("										Khẩu</label> <input type=\"password\" class=\"form-control\"\r\n");
      out.write("										name=\"password\" id=\"exampleInputPassword1\"\r\n");
      out.write("										placeholder=\"Nhập mật khẩu\" required>\r\n");
      out.write("								</div>\r\n");
      out.write("								<div class=\"form-group form-check\">\r\n");
      out.write("									<input type=\"checkbox\" class=\"form-check-input\"\r\n");
      out.write("										id=\"exampleCheck1\"> <label for=\"exampleCheck1\"\r\n");
      out.write("										class=\"badge bg-secondary\">Nhớ tài khoản?</label>\r\n");
      out.write("								</div>\r\n");
      out.write("\r\n");
      out.write("							</form>\r\n");
      out.write("						</div>\r\n");
      out.write("						<div class=\"modal-footer\">\r\n");
      out.write("							<button type=\"button\" class=\"btn btn-secondary\"\r\n");
      out.write("								data-dismiss=\"modal\">Đóng</button>\r\n");
      out.write("							<button type=\"button\" class=\"btn btn-dark\" data-dismiss=\"modal\">Đăng\r\n");
      out.write("								Nhập</button>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"rows bg-light\">\r\n");
      out.write("		<nav class=\"navbar navbar-expand-lg navbar-light bg-light\"\r\n");
      out.write("			style=\"margin-left: 10%;\">\r\n");
      out.write("			<a class=\"navbar-brand\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/video\"><span><i\r\n");
      out.write("					class='bx bxs-home'></i></span>Bai 1</a>\r\n");
      out.write("			<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("				data-target=\"#navbarSupportedContent\"\r\n");
      out.write("				aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\r\n");
      out.write("				aria-label=\"Toggle navigation\">\r\n");
      out.write("				<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("			</button>\r\n");
      out.write("\r\n");
      out.write("			<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("				<ul class=\"navbar-nav mr-auto navs\">\r\n");
      out.write("\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("						href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/findtitle\" style=\"color: green; cursor: pointer;\"\r\n");
      out.write("						class='bx bxs-heart'><i class='bx bxs-book-content'></i>Bai 2</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/user\"\r\n");
      out.write("						style=\"color: green; cursor: pointer;\" class='bx bxs-heart'><i\r\n");
      out.write("							class='bx bxs-book-content'></i>Bai 3</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/check\"\r\n");
      out.write("						style=\"color: green; cursor: pointer;\" class='bx bxs-heart'><i\r\n");
      out.write("							class='bx bxs-book-content'></i>Bai 4</a></li>\r\n");
      out.write("					<li class=\"nav-item\"><a class=\"nav-link\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${app}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/full\"\r\n");
      out.write("						style=\"color: green; cursor: pointer;\" class='bx bxs-heart'><i\r\n");
      out.write("							class='bx bxs-book-content'></i>Bai 5</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("		</nav>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"modal fade\" id=\"vd\" tabindex=\"-1\" role=\"dialog\"\r\n");
      out.write("	aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("	<div class=\"modal-dialog\" style=\"margin: 20px 14%\" role=\"document\">\r\n");
      out.write("		<div class=\"modal-content contentdialog\">\r\n");
      out.write("			<div class=\"modal-header\">\r\n");
      out.write("				<h5 class=\"modal-title\" id=\"exampleModalLabel\">\r\n");
      out.write("					<span class=\"badge badge-warning\"> Vip Action Movie&#169;</span>\r\n");
      out.write("				</h5>\r\n");
      out.write("				<button type=\"button\" class=\"close\" data-dismiss=\"modal\"\r\n");
      out.write("					aria-label=\"Close\">\r\n");
      out.write("					<span aria-hidden=\"true\">&times;</span>\r\n");
      out.write("				</button>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"modal-body \">\r\n");
      out.write("				<div class=\"container pay\">\r\n");
      out.write("					<div>\r\n");
      out.write("						<h2>Gói Tháng</h2>\r\n");
      out.write("						<p>Trải nghiệm của bạn sẽ tuyệt vời hơn !</p>\r\n");
      out.write("						<div style=\"display: flex; justify-content: space-evenly;\">\r\n");
      out.write("							<h4 style=\"text-decoration: line-through;\">249.000 VND</h4>\r\n");
      out.write("							<button class=\"btn btn-light\"\r\n");
      out.write("								style=\"border-radius: 10px; color: red;\">Giảm 40%</button>\r\n");
      out.write("						</div>\r\n");
      out.write("						<hr>\r\n");
      out.write("						<h2>163.000 VND</h2>\r\n");
      out.write("						<h5 style=\"color: red;\">Thời gian sử dụng : 30 Ngày</h5>\r\n");
      out.write("						<h4 style=\"font-weight: bold;\">Các Quyền lợi khi mua vip</h4>\r\n");
      out.write("						<ul style=\"list-style: none;\">\r\n");
      out.write("							<li>Xem Phim ở độ phẩn giải FULLHD 1080P 60fps</li>\r\n");
      out.write("							<li>Đặt quyền xem được những phim vip ở web</li>\r\n");
      out.write("							<li>Chia sẻ trên mọi nền tảng không bị giới hạn</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("						<a class=\"btn btn-success\" data-dismiss=\"modal\" aria-label=\"Close\">Mua\r\n");
      out.write("							Ngay</a>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div>\r\n");
      out.write("						<h2>Gói Năm</h2>\r\n");
      out.write("						<p>Trải nghiệm của bạn sẽ tuyệt vời hơn !</p>\r\n");
      out.write("						<div style=\"display: flex; justify-content: space-evenly;\">\r\n");
      out.write("							<h4 style=\"text-decoration: line-through;\">1.249.000 VND</h4>\r\n");
      out.write("							<button class=\"btn btn-light\"\r\n");
      out.write("								style=\"border-radius: 10px; color: red;\">Giảm 50%</button>\r\n");
      out.write("						</div>\r\n");
      out.write("						<hr>\r\n");
      out.write("						<h2>623.000 VND</h2>\r\n");
      out.write("						<h5 style=\"color: red;\">Thời gian sử dụng : 365 Ngày</h5>\r\n");
      out.write("						<h4 style=\"font-weight: bold;\">Các Quyền lợi khi mua vip</h4>\r\n");
      out.write("						<ul style=\"list-style: none;\">\r\n");
      out.write("							<li>Xem Phim ở độ phẩn giải 4K HDR 60fps</li>\r\n");
      out.write("							<li>Đặt quyền xem được những phim vip ở web</li>\r\n");
      out.write("							<li>Chia sẻ không bị giới hạn và lưu video yêu thích</li>\r\n");
      out.write("\r\n");
      out.write("						</ul>\r\n");
      out.write("						<a class=\"btn btn-success\" data-dismiss=\"modal\" aria-label=\"Close\">Mua\r\n");
      out.write("							Ngay</a>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("</div>\r\n");
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

  private boolean _jspx_meth_c_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    boolean _jspx_th_c_005furl_005f0_reused = false;
    try {
      _jspx_th_c_005furl_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005furl_005f0.setParent(null);
      // /views/bai1/Header.jsp(66,1) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setVar("app");
      // /views/bai1/Header.jsp(66,1) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005furl_005f0.setValue("/home");
      int _jspx_eval_c_005furl_005f0 = _jspx_th_c_005furl_005f0.doStartTag();
      if (_jspx_th_c_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005furl_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005furl_005f0);
      _jspx_th_c_005furl_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005furl_005f0, _jsp_getInstanceManager(), _jspx_th_c_005furl_005f0_reused);
    }
    return false;
  }
}
