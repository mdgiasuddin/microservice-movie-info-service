package io.microservice.movieinfoservice.resources;

import io.microservice.movieinfoservice.models.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestResource {

    @GetMapping("/{testId}")
    public Movie getTestMovie(@PathVariable String testId) {
        return new Movie(testId, "Test");
    }
}
