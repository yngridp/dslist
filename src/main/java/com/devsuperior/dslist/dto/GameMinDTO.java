package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
// A classe DTO serve para customizar o formato que eu quero que mostre os dados da minha API
//através do molde da model , posso criar um 2° molde DTO
public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
    private String imgUrl;
    private String shortDescription;
   
    public GameMinDTO() {
    }
    
    public GameMinDTO(Game entity) {
    	id = entity.getId();
    	title = entity.getTitle();
    	year = entity.getYear();
    	imgUrl = entity.getImgUrl();
    	shortDescription = entity.getShortDescription();	
    }

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
    
    
}
