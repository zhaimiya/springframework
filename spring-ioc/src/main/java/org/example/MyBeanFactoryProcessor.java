package org.example;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.beans.PropertyEditor;
import java.util.Map;

public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {
    Map<Class,Class <? extends PropertyEditor>> editors;

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory factory) throws BeansException {
        System.out.println("postProcessBeanFactory");
        for (Map.Entry<Class,Class<? extends PropertyEditor>> entry: editors.entrySet()){
            factory.registerCustomEditor(entry.getKey(),entry.getValue());
        }
    }

    public Map<Class, Class<? extends PropertyEditor>> getEditors() {
        return editors;
    }

    public void setEditors(Map<Class, Class<? extends PropertyEditor>> editors) {
        this.editors = editors;
    }
}
