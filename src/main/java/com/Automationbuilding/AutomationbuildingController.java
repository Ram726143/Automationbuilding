package com.Automationbuilding;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomationbuildingController {
	@GetMapping("getAutomationapp")
	public String getAutomationapp() {
		return "Thalapathy Goat";
	}

}
