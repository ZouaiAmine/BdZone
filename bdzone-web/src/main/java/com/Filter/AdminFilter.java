package filtres;
//protéger l'espace admin

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.managedbean.LoginBean;

import entities.Admin;



@WebFilter(urlPatterns = "/admin/*")
public class AdminFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse resp = (HttpServletResponse) response;
LoginBean loginBean = (LoginBean) req.getSession()
				.getAttribute("loginBean");
		System.out.println("auth "+loginBean);
		System.out.println("emp  "+loginBean.getUser().getLogin());
		if (loginBean.getUser() instanceof Admin) {
			System.out.println("is admin");
			chain.doFilter(request, response);
		} else {
			System.out.println("is not admin");
			resp.sendRedirect(req.getContextPath() + "/login/login.jsf?faces-redirect=true");
		}

	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
