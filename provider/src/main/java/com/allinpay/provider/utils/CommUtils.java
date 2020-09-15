package com.allinpay.provider.utils;

public class CommUtils {

    public static boolean isNotEmpty(Object obj) {
        if (obj == null || "null".equals(obj) || "".equals(obj)) {
            return false;
        }
        return true;
    }
}
