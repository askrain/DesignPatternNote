package com.company.Singleton;


import java.util.HashMap;
import java.util.Map;

/**
 * 使用容器实现单例模式
 * 优点：使用统一的管理类，可以通过统一的接口进行获取操作，降低了用户的使用成本，对用户隐藏了实现，降低了耦合度
 */
public class ContainerSingleton {
    private static Map<String, Object> objectMap = new HashMap<>();

    private ContainerSingleton() {

    }

    public static void registerService(String key, Object instance) {
        if (!objectMap.containsKey(key)) {
            objectMap.put(key, instance);
        }
    }

    public static Object getService(String key) {
        return objectMap.get(key);
    }
}
