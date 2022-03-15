package com.organization.mvcproject.service;

import java.util.List;

import com.organization.mvcproject.model.Game;


public interface GameService {

	List<Game> retrieveAllGames();
	
	Game findGameById(Long id);

	Game saveGame(Game game);
	
	List<Game> findGamesByGenre(String genre);
	
	Game updateGame(Long id);
	
	boolean deleteGame(Long id);
	
	
}
