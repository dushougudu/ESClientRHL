package org.zxp.esclientrhl.config;

import org.zxp.esclientrhl.annotation.ESMetaData;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import java.util.Set;

/**
 * @program: esdemo
 * @description: 扫描ESMetaData的注解的bean（就是es数据结构的实体类）给spring管理
 * @author: X-Pacific zhang
 * @create: 2019-01-24 15:24
 **/
public class ESEntityScanner extends ClassPathBeanDefinitionScanner {
    public ESEntityScanner(BeanDefinitionRegistry registry) {
        super(registry);
    }

    public void registerDefaultFilters() {
        this.addIncludeFilter(new AnnotationTypeFilter(ESMetaData.class));
    }

    public Set<BeanDefinitionHolder> doScan(String... basePackages) {
        Set<BeanDefinitionHolder> beanDefinitions = super.doScan(basePackages);
        return beanDefinitions;
    }

    public boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
        return super.isCandidateComponent(beanDefinition) && beanDefinition.getMetadata()
                .hasAnnotation(ESMetaData.class.getName());
    }
}
