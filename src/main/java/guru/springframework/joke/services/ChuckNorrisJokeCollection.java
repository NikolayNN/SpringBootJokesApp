package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author Nikolay Horushko
 */
@Service
public class ChuckNorrisJokeCollection implements JokeCollection {

    ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisJokeCollection() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
