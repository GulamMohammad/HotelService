package com.path.hotel.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.path.hotel.entities.Hotel;
import com.path.hotel.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	
	@Autowired
	private HotelService service;
	
	//Create New Hotel
	@PostMapping
	public ResponseEntity<Hotel> createNewHotel(@RequestBody Hotel hotel){
		
		System.out.println("Hotel Data :"+hotel);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(service.createHotel(hotel));
	}
	
	//get All Hotel details
	@GetMapping
	public ResponseEntity<List<Hotel>> getAllHotels(){
		
		return ResponseEntity.ok(service.getAllHotelData());
	}
	
	//Get Single Hotel by hotelId
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getHotelById(@PathVariable String hotelId){
		return ResponseEntity.status(HttpStatus.OK).body(service.getHotelByHotelId(hotelId));
	}

}
