package com.springBoot.hotel.repositories;

import com.springBoot.hotel.entities.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, String> {
}
