package io.infinity.guice.module;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Objects;

/**
 * @author sakura
 * @descprition
 * @function TestGobalConfigModule
 * @date 2022/5/20 11:51
 */
@RunWith(JUnit4.class)
public class TestGobalConfigModule {

    private Injector injector;

    @Before
    public void before() {
        String path = Objects.requireNonNull(this.getClass().getResource("/db.properties")).getPath();
        injector = Guice.createInjector(new GlobalConfigModule(path));
    }

    @Test
    public void testConfig() {
        boolean flag = injector.getBindings().toString().contains("1");
        System.out.println(flag);
    }
}
