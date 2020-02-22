package org.example.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import java.util.*;
@Lazy(value = false)//单例情况下默认为value = false，可设置value = true，非懒加载
@Scope(value = "singleton") //value = "prototype（非单例）—/singleton(单例)"
@Component(value = "SpringBean")//@Component： 默认bean的id为类名首字母小写-springBean,可通过(value = "beanId")修改名称
public class SpringBean {
    @Value("${name}")
    private String name;
    @Value("${gender}")
    private String gender;
    @Value("${tag}")
    private String tag;

    /**
     * @Autowired：Spring提供的自动注解 默认按照byType, 如有多个同类型则按照byName
     * 方式1：结合@Qualifier("springBean")则按照byName
     * 方式2：@resource,JavaEE提供
     */


    @Autowired
    private OtherBean otherBean;


    @Autowired
    @Qualifier("list")
    private List list;

    @Resource
    private Integer[] array;

    @Resource
    private Map<String, String> map;

    @Resource
    private Set<String> set;

    @Resource
    private Properties properties;


    public SpringBean() {
        System.out.println();
        System.out.println("SpringBean()");
    }

    @PostConstruct
    public  void init(){
        System.out.println("init()");
        System.out.println();
    }

    @PreDestroy
    public  void destory(){
        System.out.println("init()");
    }

    @Override
    public String toString() {
        return "SpringBean{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", tag='" + tag + '\'' +
                ", otherBean=" + otherBean +
                ", list=" + list +
                ", array=" + Arrays.toString(array) +
                ", map=" + map +
                ", set=" + set +
                ", properties=" + properties +
                '}';
    }
}
