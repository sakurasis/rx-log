package io.infinity.guice.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import io.infinity.common.util.PropertyUtil;
import org.apache.commons.lang3.StringUtils;

import java.util.Properties;

/**
 * @author sakura
 * @descprition
 * @function GobalConfigurationModule
 * @date 2022/5/20 11:46
 */
public class GobalConfigurationModule extends AbstractModule {

    private Properties bootstrapProperties;

    public GobalConfigurationModule(Properties bootstrapProperties) {
        this.bootstrapProperties = bootstrapProperties;
    }

    public GobalConfigurationModule(String filePath) {
        if (StringUtils.isNotBlank(filePath)) {
            this.bootstrapProperties = PropertyUtil.loadProperties(filePath);
        }
    }

    @Override
    protected void configure() {
        Names.bindProperties(binder(), bootstrapProperties);
    }
}
