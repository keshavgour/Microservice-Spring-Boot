package com.springBoot.hotel.services.impl;

import com.springBoot.hotel.entities.Hotel;
import com.springBoot.hotel.exceptions.ResourceNotFoundException;
import com.springBoot.hotel.repositories.HotelRepository;
import com.springBoot.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    HotelRepository hotelRepository;

    @Override
    public Hotel createHotel(Hotel hotel) {
      String hotelId = UUID.randomUUID().toString();
      hotel.setId(hotelId);
      return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAllHotels() {
       return hotelRepository.findAll();
    }

    @Override
    public Hotel getHotel(String id) {
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id not found !!"));
    }
}
