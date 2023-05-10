package br.com.fraseadotec.fraseadoteclist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fraseadotec.fraseadoteclist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
