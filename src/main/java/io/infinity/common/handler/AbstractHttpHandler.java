package io.infinity.common.handler;

import io.vertx.core.Handler;
import io.vertx.rxjava.core.MultiMap;
import io.vertx.rxjava.core.http.HttpServerRequest;
import io.vertx.rxjava.ext.web.RoutingContext;
import lombok.extern.slf4j.Slf4j;

/**
 * @author sakura
 * @descprition
 * @function AbstractHttpHandler
 * @date 2022/5/15 20:43
 */
@Slf4j
public abstract class AbstractHttpHandler<T> implements Handler<RoutingContext> {


    @Override
    public void handle(RoutingContext context) {
        HttpServerRequest request = context.request();
        MultiMap params = request.params();
        MultiMap headers = request.headers();

    }
}
