package com.demo;



import org.springframework.stereotype.Controller;
import org.springframework.util.SystemPropertyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WebController {
//	@RequestMapping("home")
//	public String show(HttpServletRequest req) {
//		
//		HttpSession session=req.getSession();
//		String name=req.getParameter("name");
//		System.out.println("name"+ name);
//		session.setAttribute("name", name);
//		return "home.jsp";
//	}
	
//	@RequestMapping("home")
//	public String show(String name,HttpSession session) {
//		
//		System.out.println("name"+ name);
//		session.setAttribute("name", name);
//		return "home.jsp";
//	}
	
	@RequestMapping("show")
	public ModelAndView show(@RequestParam("name")String Myname) {
		
		ModelAndView mv=new ModelAndView();
		System.out.println(Myname);
		mv.addObject("name",Myname);
	    
	    mv.setViewName("home");
		return  mv;
	}


}
