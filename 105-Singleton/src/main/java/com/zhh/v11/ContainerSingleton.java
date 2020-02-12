package com.zhh.v11;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhh
 * @description 容器单例
 * @date 2020-02-12 16:28
 */
public class ContainerSingleton {

    private static Map<String, Object> map = new HashMap<String, Object>();

    private ContainerSingleton() {}

    public static void putInstance(String key, Object instance) {
        if (StringUtils.isNotBlank(key) && instance != null) {
            if (!map.containsKey(key)) {
                map.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return map.get(key);
    }
}
