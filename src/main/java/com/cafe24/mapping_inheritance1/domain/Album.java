package com.cafe24.mapping_inheritance1.domain;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@DiscriminatorValue("A")
@PrimaryKeyJoinColumn(name = "ALBUM_ID")
public class Album extends Item {

	private String artist;

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	@Override
	public String toString() {
		return "Album [artist=" + artist + ", getId()=" + getId() + ", getName()=" + getName() + ", getPrice()="
				+ getPrice() + "]";
	}

}
