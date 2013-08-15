package org.jay.samples.mustache.services;

import org.jay.samples.mustache.domain.Shop;
import org.jay.samples.mustache.repository.StaticBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 
 * @author Jay
 *
 */
@Service
public class ShopService {
	
	@Autowired
	public StaticBookRepository staticBookRepository;

	/**
	 * 
	 * @return Shop
	 */
	public Shop getShop() {
		Shop shop = new Shop("My Shop", staticBookRepository.getBooks());
		return shop;
	}
	
	
	
}
