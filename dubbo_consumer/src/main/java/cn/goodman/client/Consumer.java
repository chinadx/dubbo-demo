package cn.goodman.client;

import cn.goodman.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Shaun on 2017/3/8.
 */
public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();

        HelloService helloService = (HelloService)context.getBean("helloService"); // 获取远程服务代理
        String hello = helloService.sayHello(); // 执行远程方法

        System.out.println( hello ); // 显示调用结果
    }
}
