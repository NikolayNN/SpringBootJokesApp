package guru.springframework.joke.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author Nikolay Horushko
 */
@Service
public class JokeCollectionImpl implements JokeCollection {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public JokeCollectionImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    @Override
    public String getRandomJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }
}
