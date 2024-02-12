package it.nmlab.lines.controller;

import java.util.List;
import java.util.Set;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.nmlab.lines.model.Line;
import it.nmlab.lines.model.Point;
import it.nmlab.lines.service.SpaceService;

@RestController
@RequestMapping("/")
//@Api(tags = { "address" })
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
	public Set<Point> getPoints() {
		return service.getPoints();
	}

	@GetMapping("/lines/{points}")
	List<Line> getLines(@PathVariable Integer points) {
		return service.getLines(points);
	}
	
	@DeleteMapping("/space")
	public void delete() {
		service.delete();
	}
}
