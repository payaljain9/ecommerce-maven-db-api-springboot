package org.jain.controller;

import java.util.List;

import org.jain.service.product.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
	
	@GetMapping("/name/{pname}")
	public List<String> getProductName(@PathVariable String pname)
	{
		return new ProductService().getName(pname);
	}
}
