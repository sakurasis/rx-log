package io.infinity.guice.module;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;
import io.infinity.common.util.PropertyUtil;
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

        Names.bindProperties(binder(), PropertyUtil.loadProperties(""));
        //
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
