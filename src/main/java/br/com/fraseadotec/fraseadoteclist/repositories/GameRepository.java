package br.com.fraseadotec.fraseadoteclist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fraseadotec.fraseadoteclist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
