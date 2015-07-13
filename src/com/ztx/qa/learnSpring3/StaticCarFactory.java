package com.ztx.qa.learnSpring3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by s016374 on 15/7/13.
 */
public class StaticCarFactory {
    private static Map<String, Phone> stringPhoneMap = new HashMap<String, Phone>();

    static {
        stringPhoneMap.put("Android", new Phone("Sumsung", 3000));
        stringPhoneMap.put("iOS", new Phone("Apple", 5000));
    }

    public static Phone getPhone(String name) {
        return stringPhoneMap.get(name);
    }
}
