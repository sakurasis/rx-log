package io.infinity.common.util;

import org.yaml.snakeyaml.Yaml;

import java.io.*;
import java.util.Map;

/**
 * @author sakura
 * @descprition
 * @function YamlFileUtil
 * @date 2022/5/15 23:32
 */
public class YamlFileUtil {

    public static Map<String, Object> readYaml(File file) {
        Map<String, Object> data = null;
        try {
            InputStream inputStream = new FileInputStream(file);

            Yaml yaml = new Yaml();
            data = yaml.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return data;
    }

    public static void writeYaml(Map<String, Object> data, String filePath) {
        Yaml yaml = new Yaml();
        try {
            PrintWriter writer = new PrintWriter(filePath);
            yaml.dump(data, writer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
