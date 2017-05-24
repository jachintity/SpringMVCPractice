package app08.validator;

import java.util.Date;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import app08.domain.MovieStar;

public class MovieStarValidator implements Validator {

    @Override
    public boolean supports(Class<?> klass) {
        return MovieStar.class.isAssignableFrom(klass);
    }

    @Override
    public void validate(Object target, Errors errors) {
        MovieStar movieStar = (MovieStar) target;
        ValiationUtils.rejectIfEmpty(errors, "name", "movieStarName.required");
        ValiationUtils.rejectIfEmpty(errors, "sex", "movieStarSex.required");
        ValiationUtils.rejectIfEmpty(errors, "birthDate", "movieStarBirthDate.required");
        
        Date movieStarBirthDate = movieStar.getMovieStarBirthDate();
        if (movieStarBirthDate != null) {
            if (movieStarBirthDate.after(new Date())) {
                errors.rejectValue("movieStarBirthDate", "movieStarBirthDate.invalid");
            }
        }
    }
}