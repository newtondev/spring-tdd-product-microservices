package com.newtondev.reviewservice.repository;

import com.newtondev.reviewservice.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ReviewRepository extends MongoRepository<Review, String> {

    Optional<Review> findByProductId(Integer productId);

}
