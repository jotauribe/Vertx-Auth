package co.onebrain.auth.interfaces.http;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;

public class MainVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        Router router = Router.router(vertx);
        router.get("/home").handler(routingContext -> routingContext.response().end("This is home!"));


        vertx.createHttpServer()
                .requestHandler(router::accept)
                .listen(8080);
    }
}
