package org.maxwell.jokes.services;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokesServiceImpl implements JokesService {

	@Override
	public String tellAJoke() {
		ChuckNorrisQuotes quotes = new ChuckNorrisQuotes();
		return quotes.getRandomQuote();
	}

}
