package app07a.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.format.support.DefaultFormattingConversionService;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import app07a.domain.MovieStar;

@org.springframework.stereotype.Controller

public class MovieStarController {
	
	@Autowired
	ConversionService conversionService;
	
	@RequestMapping(value="movieStar_input")
	public String inputMovieStar(Model model) {
		model.addAttribute(new MovieStar());
		return "MovieStarForm";
	}

	@RequestMapping(value="movieStar_save")
	public String saveMovieStar(@ModelAttribute MovieStar movieStar, BindingResult bindingResult, Model model) {
		
		DefaultFormattingConversionService cs = (DefaultFormattingConversionService) conversionService;
		
		if (bindingResult.hasErrors()) {
			FieldError fieldError = bindingResult.getFieldError();
			return "MovieStarForm";
		}
	    model.addAttribute("movieStar", movieStar);
	    	   
		return "MovieStarDetails";
	}
	
	
	@InitBinder
    public void initBinder(WebDataBinder binder) {
        binder.initDirectFieldAccess();
        binder.setDisallowedFields("id");
    }
}
