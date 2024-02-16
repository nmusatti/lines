package it.nmlab.lines.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.nmlab.lines.model.Point;
import it.nmlab.lines.service.SpaceService;

/**
 * A controller to handle all the endpoints. In a larger project I'd probably handle each endpoint
 * with a different class but given that the domain model is a single class it would be overkill
 * here.
 */
@RestController
@RequestMapping("/")
public class SpaceController {

	private SpaceService service;
	
	public SpaceController(SpaceService service) {
		this.service = service;
	}

	@PostMapping(value = "/point")
	public void add(@RequestBody(required = true) Point p) {
		service.add(p);
	}

	@GetMapping("/space")
	public Collection<Point> getPoints() {
		return service.getPoints();
	}

	@GetMapping("/lines/{points}")
	Collection<Collection<Point>> getLines(@PathVariable Integer points) {
		return service.getLines(points);
	}
	
	@DeleteMapping("/space")
	public void delete() {
		service.delete();
	}
}
