package io.microservices.learning.ratingdataservice.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import io.microservices.learning.ratingdataservice.model.RatingOfItem;

@Repository
public interface RatingInfoRepository extends PagingAndSortingRepository<RatingOfItem, Integer>{

}
