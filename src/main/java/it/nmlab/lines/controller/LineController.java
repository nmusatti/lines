package it.nmlab.lines.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.nmlab.lines.model.Line;
import it.nmlab.lines.service.LineService;

@RestController
@RequestMapping("/lines")
public class LineController {

	private LineService service;
	
	public LineController(LineService service) {
		this.service = service;
	}

	@GetMapping
	List<Line> get(@PathVariable int points) {
		return service.get(points);
	}
}
