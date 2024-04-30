package com.learning.entity;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity(name="Telusko")
public class Telusko {
	
	@Id
	@Column(name="ID")
	
	private Integer id;
	
	@Column(name="NAME")
	
	private String name;
	
	@Lob //@Lob annotation stands for Large Object and is used to indicate that the corresponding column should be treated as a binary large object
	//(BLOB). The image and file fields are of type byte[], which allows you to store binary data such as images or files.
	@Column(name="IMG")
	//Image cannot be stored in one single thing. so we store it in bytes of streams
	private byte[] img;
	
	@Lob
	@Column(name="DOC")
	private char[] characters;// If i want to work with some files or document
	
	public Telusko() {
		System.out.println("constructor is created");// so this only executes when obje is created
	}

	@Override
	public String toString() {
		return "Telusko [id=" + id + ", name=" + name + ", img=" + Arrays.toString(img) + ", characters="
				+ Arrays.toString(characters) + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getImg() {
		return img;
	}

	public void setImg(byte[] img) {
		this.img = img;
	}

	public char[] getCharacters() {
		return characters;
	}

	public void setCharacters(char[] characters) {
		this.characters = characters;
	}
	
	
	
	
	

}
