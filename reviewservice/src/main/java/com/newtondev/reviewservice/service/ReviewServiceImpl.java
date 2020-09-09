package com.newtondev.reviewservice.service;

import com.newtondev.reviewservice.model.Review;
import com.newtondev.reviewservice.repository.ReviewRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    private ReviewRepository repository;

    public ReviewServiceImpl(ReviewRepository repository) {
        this.repository = repository;
    }

    public Optional<Review> findById(String id) {
        return repository.findById(id);
    }

    public Optional<Review> findByProductId(Integer productId) {
        return repository.findByProductId(productId);
    }

    @Override
    public List<Review> findAll() {
        return repository.findAll();
    }

    @Override
    public Review save(Review review) {
        review.setVersion(1);
        return repository.save(review);
    }

    @Override
    public Review update(Review review) {
        review.setVersion(review.getVersion() + 1);
        return repository.save(review);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

}
