package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import com.clases.Pedido;

public final class verPedidos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_scope_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_scope_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_scope_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("        <title>Tabla de Pedidos</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/foundation.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/normalize.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"large-only-text-center medium-only-text-center small-only-text-center\">\n");
      out.write("            <h1>Tabla de Pedidos</h1>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <form action=\"listaPedidos\" method=\"post\">\n");
      out.write("            \n");
      out.write("            <div class=\"large-2 columns\"></div>\n");
      out.write("    \n");
      out.write("            <div class=\"large-10 large-centered columns\">\n");
      out.write("        \n");
      out.write("                <table style=\"width: 100%\">\n");
      out.write("                    <tr>\n");
      out.write("                        \n");
      out.write("                        <th>ID del Pedido</th>\n");
      out.write("                        <th>Nombre del Cliente</th>\n");
      out.write("                        <th>Costo total</th>\n");
      out.write("                        <th>Detalles</th>\n");
      out.write("                        \n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    ");
      out.write("                    \n");
      out.write("                    ");
 for(int i = 0; i < 6; i+=1) { 
      out.write("\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        \n");
      out.write("                        <td>Pedido #x</td>\n");
      out.write("                        ");
      out.write("\n");
      out.write("                        \n");
      out.write("                        <td>100.0</td>\n");
      out.write("                        ");
      out.write("\n");
      out.write("                        \n");
      out.write("                        <td>Jotade</td>\n");
      out.write("                        ");
      out.write("\n");
      out.write("                        \n");
      out.write("                        ");
      out.write("\n");
      out.write("                        \n");
      out.write("                        <td><a href=\"#\">Detalles</a></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    ");
      out.write("\n");
      out.write("                    \n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("            <div class=\"large-2 columns\"></div>\n");
      out.write("            \n");
      out.write("                <div class=\"large-only-text-center medium-only-text-center small-only-text-center\">                    \n");
      out.write("                <input type=\"submit\" value=\"Cargar nuevos pedidos\"/>\n");
      out.write("                \n");
      out.write("                ");
      out.write("\n");
      out.write("                                \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_scope_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("usuario");
    _jspx_th_c_set_0.setScope("session");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.usuario}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_scope_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }
}
