package com.path.hotel.service;

import java.util.List;

import com.path.hotel.entities.Hotel;

public interface HotelService {
	
	//create Hotel
	Hotel createHotel(Hotel hotel);
	
	//get All HotelList
	
	List<Hotel> getAllHotelData();
	
	//get Single Hotel
	Hotel getHotelByHotelId(String hotelId);

}
