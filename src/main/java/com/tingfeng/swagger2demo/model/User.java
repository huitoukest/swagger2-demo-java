package com.tingfeng.swagger2demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;

@ApiModel(value = "User得实体，----》",reference = "我是参考")
public class User {

    @ApiParam(value = "姓名--------------",required = true)
    private String name;
    //在swagger-ui.html#页面中如果返回User，ModelModel Schema选项卡可见
    @ApiModelProperty(value = "id",dataType = "String")
    private String id;
    @ApiModelProperty(value = "年龄----------",required = true)
    private Integer age;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Integer getAge() {
        return age;
    }
    public void setAge(Integer age) {
        this.age = age;
    }

    
}
