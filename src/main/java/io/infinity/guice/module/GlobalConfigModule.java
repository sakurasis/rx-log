package io.infinity.guice.module;

import com.alibaba.druid.pool.ha.PropertiesUtils;
import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import lombok.AllArgsConstructor;

import java.util.Properties;

/**
 *
 * @function all common configurations in this class.
 * @author sakurayang
 * @date 2022-05-21 22:22
 */
@AllArgsConstructor
public class GlobalConfigModule extends AbstractModule{
    private Properties bootstrap;


    public GlobalConfigModule(String configurationFilePath)
    {
        if (configurationFilePath != null) {
            this.bootstrap = PropertiesUtils.loadProperties(configurationFilePath);
        }
    }

    @Override
    protected void configure()
    {
        Names.bindProperties(binder(), bootstrap);
    }
}
