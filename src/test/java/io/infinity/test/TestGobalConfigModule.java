package io.infinity.test;

import com.google.inject.Guice;
import com.google.inject.Injector;
import io.infinity.guice.module.GobalConfigurationModule;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author sakura
 * @descprition
 * @function TestGobalConfigModule
 * @date 2022/5/20 11:51
 */
public class TestGobalConfigModule {
    private String path;

    private Injector injector;

    @Before
    public void before() {
        path = this.getClass().getResource("db.properties").getPath();
        injector = Guice.createInjector(new GobalConfigurationModule(path));
    }

    @After
    public void after() {

    }

    @Test
    public void test() {
        Assert.assertTrue(injector.getBindings().toString().contains("rx-log"));
    }
}
