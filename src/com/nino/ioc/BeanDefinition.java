package com.nino.ioc;

/**
 * bean定义类，
 * 配置文件中bean定义对应的实体
 * @author zengzhongjie
 * @date 2023/3/22
 */
public class BeanDefinition {

    private String beanName;

    private Class beanClass;

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}
