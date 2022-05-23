package com.example.Vintud;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="announcement")
public class AnnouncementImpl {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@Column(name="user_id")
	long user_id;
	@Column(name="category_id")
	long category_id;
	@Column(name="view_number")
	int view_number;
	
	@Column(name="title")
	String title ;
	@Column(name="description")
	String description;
	@Column(name="localisation")
	String localisation;
	@Column(name="publication_date")
	Date publication_date;
	@Column(name="picture")
	String picture;
	@Column(name="is_available")
	boolean is_available;
	@Column(name="price")
	double price;
	
	
	
	public AnnouncementImpl() {
		
	}
	
	public AnnouncementImpl(long idUser,long cat,String title ,String desc ,double price ,String pic ,Date publication_date, boolean is_available,String localisation){
	setTitle(title);setDescription(desc);setPrice(price);setPicture(pic);setPublication_date(publication_date);setIs_available(is_available);setLocalisation(localisation);setView_number(0);setUser_id(idUser);setCategory_id(cat);	
		}
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUser_id() {
		return user_id;
	}

	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}

	public long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(long category_id) {
		this.category_id = category_id;
	}

	public int getView_number() {
		return view_number;
	}

	public void setView_number(int view_number) {
		this.view_number = view_number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLocalisation() {
		return localisation;
	}

	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}

	public Date getPublication_date() {
		return publication_date;
	}

	public void setPublication_date(Date publication_date) {
		this.publication_date = publication_date;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public boolean isIs_available() {
		return is_available;
	}

	public void setIs_available(boolean is_available) {
		this.is_available = is_available;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

}