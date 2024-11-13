package com.build;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AutomationController {
@GetMapping(value="auto")
public String get() {
	return "Automation build successfully";
}
}
