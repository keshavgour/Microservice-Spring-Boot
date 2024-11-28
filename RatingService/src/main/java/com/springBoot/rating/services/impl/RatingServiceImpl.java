package com.springBoot.rating.services.impl;

import com.springBoot.rating.entities.Rating;
import com.springBoot.rating.repositories.RatingRepository;
import com.springBoot.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating createRating(Rating rating) {
        return ratingRepository.save(rating);

    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}
