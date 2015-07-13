package com.ztx.qa.learnSpring3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by s016374 on 15/7/13.
 */
public class InstancePhoneFactory {
    private Map<String, Phone> stringPhoneMap = null;

    public InstancePhoneFactory() {
        stringPhoneMap = new HashMap<String, Phone>();
        stringPhoneMap.put("Android", new Phone("sumsung from InstanceFactory", 3000));
        stringPhoneMap.put("iOS", new Phone("Apple from InstanceFactory", 5000));
    }

    public Phone getPhone(String name) {
        return stringPhoneMap.get(name);
    }
}
