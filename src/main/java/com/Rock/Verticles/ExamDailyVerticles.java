package com.Rock.Verticles;

import org.springframework.stereotype.Component;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;
import io.vertx.ext.web.handler.CookieHandler;

/**
 * 
 * @author Ragland
 *
 */

@Component
public class ExamDailyVerticles extends AbstractVerticle {

	public void start() throws Exception {
		Router router = Router.router(vertx);
		vertx.createHttpServer().requestHandler(router::accept).listen(config().getInteger("http.port", 8585));

		router.route().handler(CookieHandler.create());
		router.route().handler(BodyHandler.create());

		router.post("/api/upload").handler(this::first);

	}

	private void first(final RoutingContext routingContext) {
		System.out.println("Rock");
	}

}
