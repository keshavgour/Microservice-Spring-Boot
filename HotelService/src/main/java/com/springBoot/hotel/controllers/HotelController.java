package com.springBoot.hotel.controllers;

import com.springBoot.hotel.entities.Hotel;
import com.springBoot.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hotels")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping
    public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel) {
        return ResponseEntity.status(HttpStatus.CREATED).body(hotelService.createHotel(hotel));
    }

    @GetMapping("/{hotelId}")
    public ResponseEntity<Hotel> getHotel(@PathVariable String hotelId) {
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getHotel(hotelId));
    }

    @GetMapping
    public ResponseEntity<List<Hotel>> getAllHotel() {
        return ResponseEntity.status(HttpStatus.OK).body(hotelService.getAllHotels());
    }
}
