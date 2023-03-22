package com.nino.ioc;

import java.util.HashMap;
import java.util.Map;

/**
 * 对象注册器
 * 这里用于单例bean的缓存，大幅简化，默认所有bean都是单例的
 * @author zengzhongjie
 * @date 2023/3/22
 */
public class BeanRegister {

    /**
     * 单例缓存
     */
    private Map<String, Object> singletonMap = new HashMap<>(32);

    /**
     * 获取单例Bean
     * @param beanName
     * @return
     */
    public Object getSingletonBean(String beanName) {
        return singletonMap.get(beanName);
    }

    /**
     * 注册单例bean
     * @param beanName
     * @param bean
     */
    public void registerSingletonBean(String beanName, Object bean) {
        if(singletonMap.containsKey(beanName)) {
            return;
        }
        singletonMap.put(beanName, bean);
    }
}
