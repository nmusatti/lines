package it.nmlab.lines;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import it.nmlab.lines.model.Space;
import it.nmlab.lines.service.SpaceService;

@Configuration
public class LinesConfiguration {

	@Value( "${lines.usePermutations}" )
	boolean usePermutations;
	
	@Bean
	@SessionScope
	Space space() {
		return new Space(usePermutations);
	}
	
	@Bean
	SpaceService spaceService(Space space) {
		return new SpaceService(space);
	}
}
