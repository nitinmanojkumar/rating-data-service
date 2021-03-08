package io.microservices.learning.ratingdataservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.microservices.learning.ratingdataservice.dao.RatingInfoRepository;
import io.microservices.learning.ratingdataservice.model.RatingOfItem;

@RestController
@RequestMapping("/ratingInfo")
public class RatingInfoResources {

	@Autowired
	private RatingInfoRepository repo;
	
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	@GetMapping("/{userid}")
	public ResponseEntity<?> getMovieRating(@PathVariable("userid") Integer userid){
		RatingOfItem r1=repo.findById(userid).get();
		return ResponseEntity.ok(r1);
	}
	
}
