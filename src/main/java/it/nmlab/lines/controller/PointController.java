package it.nmlab.lines.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.nmlab.lines.model.Point;
import it.nmlab.lines.service.PointService;

@RestController
@RequestMapping("/point")
public class PointController {

	private PointService service;
	
	public PointController(PointService service) {
		this.service = service;
	}

	@PostMapping
	public void add(@RequestBody Point p) {
		service.add(p);
	}
}
