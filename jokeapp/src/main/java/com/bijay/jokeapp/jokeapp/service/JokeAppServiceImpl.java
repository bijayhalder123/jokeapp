/**
 * 
 */
package com.bijay.jokeapp.jokeapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

/**
 * @author $bijay$
 *
 */
@Service
public class JokeAppServiceImpl implements JokeAppService {

	
	private ChuckNorrisQuotes chuchNorrisQuotes;
	
	public JokeAppServiceImpl()
	{
		this.chuchNorrisQuotes = new ChuckNorrisQuotes();
	}
	
	
	@Override
	public String getJoke() {
		// TODO Auto-generated method stub
		return chuchNorrisQuotes.getRandomQuote();
	}
	
	

}
