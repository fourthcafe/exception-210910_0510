package dev.fourthcafe.exception210910_0510.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class HomeController {

	@GetMapping
	public ResponseEntity<?> index() {
		Map<String, Object> entity = new HashMap<>();
		entity.put("title", "exception-200910_0510");
		return ResponseEntity.ok(entity);
	}
}