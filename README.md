# mdubbo
注意点：
    1.dubbo-admin启动如果报Error creating bean with name 'uriBrokerService': Cannot create inner bean '(inner bean)' of type 错误，是由于JDK版本过高，对于1.8支持不够，改用1.7解决



    2.如果dubbo-admin管理端看不到，需要添加分组，修改两个位置
    A----dubbo.properties中添加dubbo.registry.group=mdubbo
    B----dubbo-admin.xml中修改<dubbo:registry>项为：  <dubbo:registry group="${dubbo.registry.group}" address="${dubbo.registry.address}" check="false" file="false" />  



    3.整合springMVC框架报错：
    java.lang.NullPointerException
    at org.springframework.core.SerializableTypeWrapper$TypeProxyInvocationHandler.invoke
    原因为dubbo本身集成了spring2.5与项目中spring导入的jar包冲突，做如下修改：
        <dependency>
            <groupId>com.alibaba</groupId>
            <artifactId>dubbo</artifactId>
            <version>2.5.3</version>
            <exclusions>
                <exclusion>
                    <artifactId>spring</artifactId>
                    <groupId>org.springframework</groupId>
                </exclusion>
            </exclusions>
        </dependency>
