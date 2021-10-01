package com.hierophant.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ForeignKey;
import org.hibernate.validator.constraints.Length;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "posts")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Post {
	@Column(name = "post_id", nullable = false, unique = true, updatable = false) // non-nullable and unique =tru is
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@OneToMany(mappedBy = "com_post_id", cascade = CascadeType.ALL, orphanRemoval = true)
	int post_id;// unique id for each post

	String post_title;

	@OneToMany(mappedBy = "user_id", cascade = CascadeType.ALL, orphanRemoval = true)
	int post_owner_id;

	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "post_image_id", referencedColumnName = "image_id")
	int post_image_id;
	
	int upvotes;
	
	@OneToMany(mappedBy = "com_id", cascade = CascadeType.ALL, orphanRemoval = true)
	List<Comment> comments = new ArrayList<>();
	
	public void addComment(Comment comment) {
        comments.add(comment);
    }
 
    public void removeComment(Comment comment) {
        comments.remove(comment);
    }
}
