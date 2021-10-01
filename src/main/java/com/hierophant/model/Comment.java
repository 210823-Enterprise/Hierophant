package com.hierophant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "comments")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {
	@Column(name = "com_id", nullable = false, unique = true, updatable = false) // non-nullable and unique =tru is
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int com_id;// unique id for each comment

	@ManyToOne(fetch = FetchType.LAZY)
	String com_owner;

	@ManyToOne(fetch = FetchType.LAZY)
	int com_post_id;

	String comm_text;

	int upvotes;
}
