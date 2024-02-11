package it.nmlab.lines;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import it.nmlab.lines.model.Space;
import it.nmlab.lines.service.LineService;
import it.nmlab.lines.service.PointService;
import it.nmlab.lines.service.SpaceService;

@Configuration
public class LinesConfiguration {

	@Bean
	@SessionScope
	Space space() {
		return new Space();
	}
	
	@Bean
	SpaceService spaceService(Space space) {
		return new SpaceService(space);
	}
	
	@Bean
	LineService lineService(Space space) {
		return new LineService(space);
	}
	
	@Bean
	PointService pointService(Space space) {
		return new PointService(space);
	}
}
