package io.infinity;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Promise;
import io.vertx.rxjava.core.AbstractVerticle;
import io.vertx.rxjava.core.Vertx;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;

/**
 * @author sakurayang
 */
@Slf4j
public class RxLogApplication extends AbstractVerticle {



    @Override
    public void start(Promise<Void> startFuture) throws Exception {
        super.start(startFuture);
    }

    @Override
    public void start() throws Exception {
        Consumer<Vertx> consumer = vertx -> {
            DeploymentOptions options = new DeploymentOptions();
            // deploymentOptions.setInstances();

        };
        Vertx vertx = Vertx.vertx();
        consumer.accept(vertx);
    }

    public static void main(String[] args) throws Exception {
        RxLogApplication application = new RxLogApplication();
        application.start();

    }
}
