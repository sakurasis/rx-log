package io.infinity.common.util;

import lombok.NoArgsConstructor;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author sakura
 * @descprition
 * @function YamlFileUtil
 * @date 2022/5/15 23:32
 */
@NoArgsConstructor
public class PropertyUtil {

    /**
     * 读取property文件
     *
     * @param resourcesPaths 资源文件地址
     * @return {@link Properties}
     */
    public static Properties loadProperties(String... resourcesPaths) {
        Properties props = new Properties();
        for (String location : resourcesPaths) {
            File propertiesFile = new File(location);
            try (InputStream inputStream = new FileInputStream(propertiesFile)) {
                props.load(inputStream);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        return props;
    }

    /**
     * 获取property文件中指定key对应value转换为Integer
     *
     * @param properties    property文件
     * @param key           key
     * @param defaultValue 设置默认值
     * @return {@link java.lang.Integer}
     */
    public static Integer getIntValue(Properties properties, String key, Integer defaultValue) {
        return Integer.valueOf(getStringValue(properties, key, String.valueOf(defaultValue)));
    }

    /**
     * 获取property文件中指定key对应value转换为String
     *
     * @param properties    property文件
     * @param key           key
     * @param defaultValue 设置默认值
     * @return {@link java.lang.String}
     */
    public static String getStringValue(Properties properties, String key, String defaultValue) {
        if (properties == null) {
            return defaultValue;
        }
        if (!properties.containsKey(key)) {
            return defaultValue;
        }
        return String.valueOf(properties.getOrDefault(key, defaultValue));
    }

    /**
     * 获取property文件中指定key对应value转换为Boolean
     *
     * @param properties    property文件
     * @param key           key
     * @param defaultValue 设置默认值
     * @return {@link java.lang.Boolean}
     */
    public static Boolean getBoolValue(Properties properties, String key, Boolean defaultValue) {
        return Boolean.valueOf(getStringValue(properties, key, String.valueOf(defaultValue)));
    }
}
