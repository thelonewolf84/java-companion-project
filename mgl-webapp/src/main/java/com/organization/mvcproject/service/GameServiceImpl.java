package com.organization.mvcproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.organization.mvcproject.dao.MockDAO;
import com.organization.mvcproject.model.Game;

@Service
public class GameServiceImpl implements GameService{

	/**
	 * TODO 2.0 The class that interacts with persistent data is called a Data Access Object(DAO)
	 *  or a Repository class. The private static list is mocking our persistance of games.
	 *   
	 *  Move this list, and methods operating on this list to an appropriately named package and class.
	 */
	
	@Autowired
	private MockDAO mockDAO;
	
	
	public List<Game> retrieveAllGames(){
		return mockDAO.retrieveAllGames();
	}
	
	public Game findGameById(Long id) {
		return mockDAO.findGameById(id);
	}
	
	public Game saveGame(Game game) {
		return mockDAO.saveGame(game);
	}
	
	public List<Game> findGamesByGenre(String genre) {
		return mockDAO.findGamesByGenre(genre);
	}
	
	public Game updateGame(Long id) {
		return mockDAO.updateGame(id);
	}
	
	public boolean deleteGame(Long id) {
		return mockDAO.deleteGame(id);
	}
}