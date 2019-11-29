package com.botiga.whiteCollars.Pictures;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PictureRepository extends CrudRepository<Picture, String>{
	public List<Picture> findByShopShopName(String shopId);
}
