package app03.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloWorldController implements Controller {

    private static final Log logger = LogFactory
            .getLog(InputProductController.class);

    @Override
    public ModelAndView handleRequest(HttpServletRequest req, HttpServletResponse resp) throws Exception {   
       ModelAndView mv = new ModelAndView(); 
       mv.addObject("message", "Hello World!"); 
       mv.setViewName("hello");  
       return mv;  
    }  

}
