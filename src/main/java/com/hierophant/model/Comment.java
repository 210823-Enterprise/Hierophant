package com.hierophant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@Id
	@Column(name = "comId", nullable = false, unique = true, updatable = false) // non-nullable and unique =tru is
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int comId;// unique id for each comment

	@ManyToOne(fetch = FetchType.LAZY, targetEntity=User.class)
	private User userId;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity=Post.class)
	private Post postId;
	
	private String commText;

	private int upvotes;
}
