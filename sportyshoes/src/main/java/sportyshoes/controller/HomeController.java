package sportyshoes.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.User;
import org.apache.catalina.filters.AddDefaultCharsetFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.codec.AbstractDataBufferDecoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.mysql.fabric.xmlrpc.base.Data;

import sportyshoes.dao.UserDao;
import sportyshoes.model.Product;
import sportyshoes.service.UserService;

@Controller
public class HomeController {
	
	// after create service model
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserService userService;
	
	// this is Model practice
	@RequestMapping(path="/home" ,method=RequestMethod.GET)	
	public String home(Model model) {
			//System.out.println("This is home URL");
			
			
			model.addAttribute("msg","Please Sign-Up");
			
			return "index";
		}
		/*
		 * // this is ModelAndView practice
		 * 
		 * @RequestMapping("/help") public ModelAndView login() {
		 * System.out.println("This is login URL"); ModelAndView mView=new
		 * ModelAndView(); mView.addObject("name", "Ravikant"); List<Integer> list= new
		 * ArrayList<Integer>(); list.add(25); list.add(18); list.add(129);
		 * list.add(56); mView.addObject("number", list);
		 * 
		 * mView.setViewName("help"); return mView; }
		 */
	
	@RequestMapping(path= "/process", method = RequestMethod.POST)
	public String   loginprocess(@ModelAttribute sportyshoes.model.User user, Model model) {
		
		
		System.out.println("This is ModelAttribute");
		System.out.println(user);
		model.addAttribute("name",user.getUser_name());
		
		model.addAttribute("msg", "SignUp Sucessfull");
		this.userService.createUser(user);
		return "login";
		
	}
	
	// Admin Login
	@RequestMapping(path= "/login_admin", method = RequestMethod.GET)
	
	
	
	public String   admin(@ModelAttribute sportyshoes.model.User user, Model model) {
		String log_email=user.getUser_email();
		String log_pass=user.getUser_pass();
		System.out.println(log_email);
		System.out.println(log_pass);
		// User user2 =(User) this.userDao.getUser(log_email);
		 
	
		// 
		if (log_pass.equals("admin")) {
			return "redirect:/admin";
		}
		
		
		
		//model.addAttribute("products", dbuser);
		
	
		//model.addAttribute("name",user.getUser_name());
		
		//model.addAttribute("msg", "Home page of Admin");
		//this.userService.createUser(user);
		return "login";
		
	}
	
	// Admin process
	
	// Admin Login
		@RequestMapping(path= "/admin", method = RequestMethod.GET)
		public String   adminprocess(Model model) {
			
			
			System.out.println("This is Admin Home");
			List<Product>  products=userDao.getProducts();
	
			model.addAttribute("products", products);
			return "adminHome";
			
		}
	// add product come from add_product_form
		
				@RequestMapping(path= "/add-product", method = RequestMethod.GET)
				public String   addProduct(@ModelAttribute sportyshoes.model.Product product, Model model) {
					
					
					model.addAttribute("title", "Add Product");
					//this.userService.createProduct(product);
					return "add_product_form";
					
				}
				
				// add product come from add_product_form
				
				@RequestMapping(path= "/add", method = RequestMethod.GET)
				public String   addProduct1(@ModelAttribute sportyshoes.model.Product product, Model model) {
					
					
					model.addAttribute("title", "Add Product");
					this.userService.createProduct(product);
					return "redirect:/admin";
					
				}
				
		// delete handler
				@RequestMapping(path= ("/delete/{productId}"), method = RequestMethod.GET)
				public String deleteProduct(@PathVariable("productId") int productId,@ModelAttribute sportyshoes.model.Product product, Model model) {
					this.userDao.deleteProduct(productId);
					return "redirect:/admin";
					
					
				}
				
		// Update handler
				@RequestMapping(path= ("/update/{productId}"), method = RequestMethod.GET)
				public String updateProduct(@PathVariable("productId") int productId,@ModelAttribute sportyshoes.model.Product product, Model model) {
				
					Product  products= this.userDao.getProduct(productId);
					model.addAttribute("product", products);
					
					return "update_form";
					
					
				}

				// Update  final handler
				@RequestMapping(path= ("/update1"), method = RequestMethod.GET)
					public String   upateProduct1(@ModelAttribute sportyshoes.model.Product product, Model model) {
					
					
					
					this.userService.createProduct(product);
					return "redirect:/admin";
					
					
				}
				
	/*
	 * @RequestMapping(path= "/process", method = RequestMethod.POST) public String
	 * loginprocess(HttpServletRequest request, Model model) {
	 * 
	 * String email=request.getParameter("user_email"); System.out.println(email);
	 * model.addAttribute("name",email); return "index";
	 * 
	 * }
	 */

}
