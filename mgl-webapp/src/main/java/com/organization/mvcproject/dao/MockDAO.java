/**
 * 
 */
/**
 * @author perry.stroud
 *
 */
package com.organization.mvcproject.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.organization.mvcproject.model.Game;

@Repository
public class MockDAO{
	
	private static Long gameId = new Long(0);
	//private static Long companyId = new Long(0);
	private static List<Game> games = new ArrayList<Game>();
	
	static {
		games = populateGames();
	}
	
	private static List<Game> populateGames() {

		Game game1 = new Game();
		game1.setId(++gameId);
		game1.setGenre("Sport");
		game1.setName("Rocket League");

		Game game2 = new Game();
		game2.setId(++gameId);
		game2.setGenre("Shooter");
		game2.setName("Halo 3");

		Game game3 = new Game();
		game3.setId(++gameId);
		game3.setGenre("MMORPG");
		game3.setName("Runescape");

		games.add(game1);
		games.add(game2);
		games.add(game3);

		return games;
	}
	
	
	public List<Game> retrieveAllGames() {
		return games;
	}
	
	public Game findGameById(Long id) {
		for(Game game : games) {
			if(game.getId() == id) {
				return game;
			}	
		}
		
		return null;
	}

	
	public Game saveGame(Game game) {
		game.setId(++gameId);
		games.add(game);
		return game;
	}
	
	public List<Game> findGamesByGenre(String genre){
		List<Game> gameGenreList = new ArrayList<>();
		
		for(Game game : games) {
			if(game.getGenre().equals(genre)) {
				gameGenreList.add(game);
			}
		}
		
		return gameGenreList;
	}
	
	public Game updateGame(Long id) {
		for(Game game : games) {
			if(game.getId().equals(id)) {
				return game;
			}
		}
		return null;
	}
	
	public boolean deleteGame(Long id) {
		for(int i = 0; i < games.size(); i++) {
			if(games.get(i).getId().equals(id)) {
				games.remove(games.get(i));
				return true;
			}
		}
		
		return false;
	}
	
}