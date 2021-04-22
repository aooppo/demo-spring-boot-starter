package cc.voox.hi.service;


import cc.voox.hi.config.HiConfigProperties;
import org.springframework.beans.factory.annotation.Autowired;


public class HiService {
    @Autowired
    HiConfigProperties hiConfigProperties;

    public String hi() {
        return "Hi, my name is " + hiConfigProperties.getName() + " and age: "+ hiConfigProperties.getAge();
    }
}
