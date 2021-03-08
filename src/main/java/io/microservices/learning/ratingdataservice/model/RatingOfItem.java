package io.microservices.learning.ratingdataservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="ratings")
@Getter
@Setter
@NoArgsConstructor
public class RatingOfItem {

	@Id
	private Integer id;
	private Integer movieid;
	private Integer rating;
	
}
