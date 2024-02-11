package it.nmlab.lines.controller;

import java.util.Set;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.nmlab.lines.model.Point;
import it.nmlab.lines.service.SpaceService;

@RestController
@RequestMapping("/space")
//@Api(tags = { "address" })
public class SpaceController {

	private SpaceService service;
	
	public SpaceController(SpaceService service) {
		this.service = service;
	}

	@GetMapping
	public Set<Point> get() {
		return service.get();
	}
	
	@DeleteMapping
	public void delete() {
		service.delete();
	}
}
