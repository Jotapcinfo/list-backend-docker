package br.com.fraseadotec.fraseadoteclist.projections;

public interface GameMinProjection {
	
	Long getId();
	String getTitle();
	Integer getGameYear();
	String getImgUrl();
	String getShortDescription();
	Integer getPosition();

}
