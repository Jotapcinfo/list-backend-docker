package br.com.fraseadotec.fraseadoteclist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.fraseadotec.fraseadoteclist.dto.GameListDTO;
import br.com.fraseadotec.fraseadoteclist.entities.GameList;
import br.com.fraseadotec.fraseadoteclist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
}
