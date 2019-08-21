package com.qzj.begin.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 配置文件注入：将配置文件中配置的每一个属性的值映射到这个组件中
 *
 * @ConfigurationProperties 告诉SpringBoot将本类中所有属性与配置文件的配置进行绑定
 *     默认从全局配置文件获取(application.yml或application.properties)
 * prefix = "ymltest" 告诉SpringBoot配置文件中要映射的前缀
 * @Component 将YmlTest组件添加到容器中，才能映射配置文件
 * @Validated JSR303数据校验
 * @PropertySource 加载指定的配置文件（只能用于properties文件）
 */
@Component
@ConfigurationProperties(prefix = "ymltest")
@Validated
//@PropertySource(value = {"classpath:appTest.properties"})
public class YmlTest {
    /**
     * <bean class="ymltest">
     *     <property name="str_test1">
     *         <value>
     *              "字面量/${key}从环境变量、配置文件中获取值/#{SpEL}"
     *         </value>
     *     </property>
     * </bean>
     */
//    @Value("${ymltest.str_test1}")
    @NotEmpty
    private String str_test1;
    private String str_test2;
    private String str_test3;
    private Date date;
    private Device device;
    private Map<Integer, String> user_map;
    private List<String> brw_list;

    @Override
    public String toString() {
        return "YmlTest{" +
                "str_test1='" + str_test1 + '\'' +
                ", str_test2='" + str_test2 + '\'' +
                ", str_test3='" + str_test3 + '\'' +
                ", date=" + date +
                ", device=" + device +
                ", user_map=" + user_map +
                ", brw_list=" + brw_list +
                '}';
    }

    public String getStr_test1() {
        return str_test1;
    }

    public void setStr_test1(String str_test1) {
        this.str_test1 = str_test1;
    }

    public String getStr_test2() {
        return str_test2;
    }

    public void setStr_test2(String str_test2) {
        this.str_test2 = str_test2;
    }

    public String getStr_test3() {
        return str_test3;
    }

    public void setStr_test3(String str_test3) {
        this.str_test3 = str_test3;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Map<Integer, String> getUser_map() {
        return user_map;
    }

    public void setUser_map(Map<Integer, String> user_map) {
        this.user_map = user_map;
    }

    public List<String> getBrw_list() {
        return brw_list;
    }

    public void setBrw_list(List<String> brw_list) {
        this.brw_list = brw_list;
    }
}
