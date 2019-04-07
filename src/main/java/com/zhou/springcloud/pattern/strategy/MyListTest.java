/**
 * Date:     2019/3/2522:57
 * AUTHOR:   Administrator
 */
package com.zhou.springcloud.pattern.strategy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 结果是一样的，但是过程是不一样的  这就是策略模式
 * 2019/3/25  22:57
 * created by zhoumb
 */
public class MyListTest {
    public static void main(String[] args) {
        List<Long> numbers = new ArrayList<>();
        Collections.sort(numbers, new Comparator<Long>() {
            /**
             * 最终返回的值是固定的(小于0 等于0 大于0)
             * 但是比较的逻辑的不定的，这就是策略模式
             * @param o1
             * @param o2
             * @return
             */
            @Override
            public int compare(Long o1, Long o2) {
                return 0;
            }
        });
    }
}
