package cn.goodman;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Shaun on 2017/3/8.
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();

        System.in.read(); // 按任意键退出
    }
}
