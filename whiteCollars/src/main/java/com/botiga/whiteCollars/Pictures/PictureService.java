package com.botiga.whiteCollars.Pictures;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PictureService {
	
	@Autowired
	private PictureRepository pictureRepository;
	/*
	private List<Shop> myShops = new ArrayList<>(Arrays.asList( 
		new Shop("Name1",1),
		new Shop("Name2",2))
	);
	*/
	public PictureService() {
		
	}

	///GET ALL PICTURES BY Shop Id ///CHECK
	public List<Picture> getAllPictures(String shopId) {
		List<Picture> allPictures = new ArrayList<>();
		pictureRepository.findByShopShopName(shopId).forEach(allPictures::add);
		return allPictures;
	}
	
	//POST -ADD NEW
	public void addPicture(Picture picture) {
		pictureRepository.save(picture);
	}
	//PUT or UPDATE shop
	public void updatePicture(Picture shop) {
		pictureRepository.save(shop);
	}
	//DELETE by Id in Path Variable /shops/{id}
	public void deletePicture(String id) {
		pictureRepository.deleteById(id);		
	}
	//GET PICTURE by Id in Path Variable /shops/{shopId}/pictures/{id}
	public Optional<Picture> getPictureById(String id) {
		Optional<Picture> requestedPicture = pictureRepository.findById(id);
		return requestedPicture;
	}
	
	
	
	
	

}
