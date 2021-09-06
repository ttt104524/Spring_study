package com.tfy.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("user")  // 相当于配置文件中 <bean id="user" class="当前注解的类"/>
@Scope
public class User {
    // 相当于配置文件中 <property name="name" value="秦疆"/>
    @Value("秦疆")
    public String name;



}