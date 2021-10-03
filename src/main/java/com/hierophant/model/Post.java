package com.hierophant.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	@Id
	@Column(name = "postId", nullable = false, unique = true, updatable = false) // non-nullable and unique =tru is
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int postId;// unique id for each post

	private String title;
	
	@OneToOne(cascade = CascadeType.ALL, targetEntity=User.class)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
	private User userId;

	@OneToOne(cascade = CascadeType.ALL, targetEntity=Image.class)
    @JoinColumn(name = "postImageId", referencedColumnName = "imageId")
	private Image image;

	private int upvotes;
	
	@OneToMany(mappedBy = "postId", cascade = CascadeType.ALL, orphanRemoval = true, targetEntity=Comment.class)
	private List<Comment> comments = new ArrayList<>();
	
	public void addComment(Comment comment) {
        comments.add(comment);
    }
 
    public void removeComment(Comment comment) {
        comments.remove(comment);
    }
}
