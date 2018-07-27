package com.klm;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KlmController {

	@PostMapping(path="/chickens_feed", produces="application/json")
	public @ResponseBody Domain chicken_feed()
	{
		Domain domain = new Domain();
		domain.setAction("Chicken-feed");
		domain.setSuccess("true");
		domain.setMassage("your chickens are now full and happy");
		return domain;
	}
}
