package app08.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import app08.domain.MovieStar;
import app08.validator.MovieStarValidator;

@Controller
public class MovieStarController {

    @RequestMapping(value = "/movieStar_input")
    public String inputMovieStar(Model model) {
        model.addAttribute("movieStar", new MovieStar());
        return "MovieStarForm";
    }

    @RequestMapping(value = "/movieStar_save")
    public String saveMovieStar(@ModelAttribute MovieStar movieStar,
            BindingResult bindingResult, Model model) {
        MovieStarValidator movieStarValidator = new MovieStarValidator();
        movieStarValidator.validate(movieStar, bindingResult);

        if (bindingResult.hasErrors()) {
            System.out.println(bindingResult.getFieldError().getCode());
            return "MovieStarForm";
        }

        model.addAttribute("movieStar", movieStar);
        return "MovieStarDetails";
    }
}
