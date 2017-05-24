package app05.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import app05.domain.MovieStar;
import app05.form.MovieStarForm;
import app05.service.hobby;

@Controller
public class MovieStarController {

    private static final Log logger = LogFactory.getLog(MovieStarController.class);

    @Autowired
    private Hobby hobby;

    @RequestMapping(value="/movieStar_input")
    public String inputMovieStar() {
        logger.info("inputMovieStar called");
        return "MovieStarForm";
    }

    @RequestMapping(value="/movieStar_save")
    public String saveMovieStar(MovieStarForm movieStarForm, Model model) {
        logger.info("saveMovieStar called");
        MovieStar movieStar = new MovieStar();
        movieStar.setName(movieStarForm.getName());
        movieStar.setDescription(movieStsrForm.getDescription());
        movieStar.setSex(movieStarForm.getSex());
        
        model.addAttribute("movieStar", movieStar);
        return "MovieStarDetails";
    }
}
