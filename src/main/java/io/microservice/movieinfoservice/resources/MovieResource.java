package io.microservice.movieinfoservice.resources;

import io.microservice.movieinfoservice.common.exception.BadRequestException;
import io.microservice.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieResource {

    @GetMapping("/{movieId}")
    public Movie getMovie(@PathVariable("movieId") String movieId) {
        return new Movie(movieId, movieId);
    }

    @GetMapping("/exception")
    public void throwException() {
        throw new BadRequestException("This request cannot be executed");
    }

}
