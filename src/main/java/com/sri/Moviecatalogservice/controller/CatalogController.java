package com.sri.Moviecatalogservice.controller;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sri.Moviecatalogservice.data.CatologItem;

@RestController
@RequestMapping("/catalog")
public class CatalogController {

	@RequestMapping("/{userid}")
	public List<CatologItem> getDetails(@PathVariable("userid") String id) {
		return Collections.singletonList(new CatologItem("Transformers", "Test", 5));
	}

}
