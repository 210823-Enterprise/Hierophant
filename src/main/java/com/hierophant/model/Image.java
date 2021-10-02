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
	@OneToOne(mappedBy = "post_image_id")
	int image_id;
	
	String img_html;//html link to template
	
	String top_text;//text in the top half
	String bottom_text;//test in the bottom half
	

	
}
