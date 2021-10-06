package com.hierophant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "images")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Image {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int imageId;
	
	private String imgHtml;//html link to template
	
	private String topText;//text in the top half
	private String bottomText;//test in the bottom half
	

	
}
