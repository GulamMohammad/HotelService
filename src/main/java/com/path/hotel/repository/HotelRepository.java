package com.path.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.path.hotel.entities.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String> {

}
