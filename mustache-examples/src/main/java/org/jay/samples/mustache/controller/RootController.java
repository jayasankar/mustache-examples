package org.jay.samples.mustache.controller;

import org.jay.samples.mustache.domain.Shop;
import org.jay.samples.mustache.extension.DynamicValueResolver;
import org.jay.samples.mustache.services.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author Jay
 *
 */
@Controller
public class RootController {

	@Autowired
	private ShopService shopService;
	
	/**
	 * 
	 * @return view 
	 */
	@RequestMapping(value  = "/root")
	public String home(Model model) {
		System.out.println("test");
		DynamicValueResolver dynamicValueResolver = new DynamicValueResolver();
        Shop shop = shopService.getShop();
        model.addAttribute("shop", shop);
        model.addAttribute("dynamicValueResolver", dynamicValueResolver);
		return "home";
	}
	
}
