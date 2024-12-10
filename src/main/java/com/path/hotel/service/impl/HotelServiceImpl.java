package com.path.hotel.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.path.hotel.entities.Hotel;
import com.path.hotel.exceptions.ResourceNotFoundException;
import com.path.hotel.repository.HotelRepository;
import com.path.hotel.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	
	@Autowired
	private HotelRepository repository;

	@Override
	public Hotel createHotel(Hotel hotel) {

		//String id = UUID.randomUUID().toString();
		hotel.setHotelId(UUID.randomUUID().toString());
		return repository.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotelData() {

		return repository.findAll();
	}

	@Override
	public Hotel getHotelByHotelId(String hotelId) {

		return repository.findById(hotelId).orElseThrow(() -> new ResourceNotFoundException("Hotel Details with given id :'"+hotelId+"' not found !!!"));
	}

}
