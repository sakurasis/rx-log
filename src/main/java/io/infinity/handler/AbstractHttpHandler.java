package io.infinity.handler;

import io.vertx.core.Handler;
import io.vertx.rxjava.core.MultiMap;
import io.vertx.rxjava.core.http.HttpServerRequest;
import io.vertx.rxjava.ext.web.RoutingContext;
import lombok.extern.slf4j.Slf4j;
import rx.Observable;

/**
 * @author sakura
 * @descprition
 * @function AbstractHttpHandler
 * @date 2022/5/22 21:05
 */
@Slf4j
public abstract class AbstractHttpHandler<T> implements Handler<RoutingContext> {

    @Override
    public void handle(RoutingContext context) {

    }

    public abstract Observable<T> handleInternal(RoutingContext event, HttpServerRequest req, MultiMap headers,
                                                 MultiMap params);
}
