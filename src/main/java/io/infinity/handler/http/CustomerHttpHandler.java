package io.infinity.handler.http;

import io.infinity.handler.AbstractHttpHandler;
import io.vertx.rxjava.core.MultiMap;
import io.vertx.rxjava.core.http.HttpServerRequest;
import io.vertx.rxjava.ext.web.RoutingContext;
import rx.Observable;

/**
 * @author sakura
 * @descprition 自定义http请求拦截器
 * @function CustomerHttpHandler
 * @date 2022/5/22 20:42
 */
public class CustomerHttpHandler extends AbstractHttpHandler {
    @Override
    public Observable handleInternal(RoutingContext event, HttpServerRequest req, MultiMap headers, MultiMap params) {
        return null;
    }

}
