package guru.springframework.joke.controllers;

import guru.springframework.joke.services.JokeCollection;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Nikolay Horushko
 */
@Controller
public class JokesController {

    JokeCollection jokeCollection;

    public JokesController(JokeCollection jokeCollection) {
        this.jokeCollection = jokeCollection;
    }

    @RequestMapping("/")
    public String getJoke(Model model){
        model.addAttribute("joke", jokeCollection.getRandomJoke());
        return "chucknorris";
    }
}
