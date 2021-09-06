package com.tfy.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

public class User {
//    @Autowired  //byType自动装配
//    private Cat cat;
//    @Autowired
//    private Dog dog;

//    @Autowired
//    @Qualifier(value = "cat2") //byName自动装配，必须配合@Autowired
//    private Cat cat;
//    @Autowired
//    @Qualifier(value = "dog2")
//    private Dog dog;


//    @Resource如有指定的name属性，先按该属性进行byName方式查找装配；
//其次再进行默认的byName方式进行装配；
//如果以上都不成功，则按byType的方式自动装配。
//都不成功，则报异常。
    @Resource(name = "cat2")
    private Cat cat;
    @Resource
    private Dog dog;

    private String str;

    public Cat getCat() {
        return cat;
    }



    public Dog getDog() {
        return dog;
    }


    public String getStr() {
        return str;
    }


}
