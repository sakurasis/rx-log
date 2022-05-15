package io.infinity.guice.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import io.infinity.common.util.YamlFileUtil;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.guice.MyBatisModule;
import org.mybatis.guice.datasource.druid.DruidDataSourceProvider;

import java.io.File;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description
 * @function
 * @author sakurayang
 */
public class MybatisConfigModule extends AbstractModule {

    @Override
    protected void configure() {
        Map<String, Object> propertyMap = YamlFileUtil.readYaml(new File("db.yml"));
        Map<String, String> settingMap = new ConcurrentHashMap<>(16);
        propertyMap.forEach((key, value) -> {
            settingMap.put(key, String.valueOf(value));
        });
        Names.bindProperties(binder(), settingMap);
        this.install(new MyBatisModule() {
            @Override
            protected void initialize() {
                bindDataSourceProviderType(DruidDataSourceProvider.class);
                bindTransactionFactoryType(JdbcTransactionFactory.class);
                addMapperClasses("io.infinity.mapper");
            }
        });
    }


}
