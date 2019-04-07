/**
 * Date:     2019/4/522:33
 * AUTHOR:   Administrator
 */
package com.zhou.springjava8.base.collection;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * 2019/4/5  22:33
 * created by zhoumb
 */
public class MapTest {

    @Test
    public void testMap() {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(null, "haha");
        System.out.println(hashMap.get(null));

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("trr", "tree");
        System.out.println(treeMap.get("trr"));
    }
}
