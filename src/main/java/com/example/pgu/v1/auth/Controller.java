package com.example.pgu.v1.auth;

import com.example.pgu.v1.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {



	
	@GetMapping("index")
	public String getIndex() {

		return "indeex.html";
	}


}
