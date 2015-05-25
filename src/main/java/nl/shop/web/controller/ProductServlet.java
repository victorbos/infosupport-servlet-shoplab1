package nl.shop.web.controller;

import java.io.IOException;
import java.util.List;

import javax.inject.Inject;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import nl.shop.domain.Product;
import nl.shop.srv.ProductService;

/**
 * Servlet implementation class ProductServlet
 */
@WebServlet(urlPatterns = "/products")
public class ProductServlet extends HttpServlet {
    @Inject
    private ProductService productService;
	private static final long serialVersionUID = 1L;

	public ProductServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		List<Product> productList=productService.listProducts();
        request.setAttribute("products", productList);
        RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/views/products.jsp");
        requestDispatcher.forward(request,response);
		//products ophalen

		//op het request als attribuut zetten

		//forwarden naar WEB-INF/views/products.jsp

	}

}
