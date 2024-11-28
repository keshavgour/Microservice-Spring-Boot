package com.springBoot.hotel.services;

import com.springBoot.hotel.entities.Hotel;

import java.util.List;

public interface HotelService {

    Hotel createHotel(Hotel hotel);

    List<Hotel> getAllHotels();

    Hotel getHotel(String id);
}
