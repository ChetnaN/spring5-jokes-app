package cnegi.springframework.joke.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeServicesImpl implements JokeServices {

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	public JokeServicesImpl() {
		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
	}
	@Override
	public String getJoke() {
		// TODO Auto-generated method stub
		return chuckNorrisQuotes.getRandomQuote();
	}

}
