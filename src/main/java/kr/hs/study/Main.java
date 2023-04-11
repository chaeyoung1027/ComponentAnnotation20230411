package kr.hs.study;

import kr.hs.study.beans.TestBean1;
import kr.hs.study.beans.Train;
import kr.hs.study.config.BeanConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfig.class);

        TestBean1 a = ctx.getBean(TestBean1.class);

        System.out.println(a.getData1().getN());
        System.out.println(a.getData2().getName());
        //System.out.println(T1.getData3());
        //System.out.println(T1.getData4());
        //System.out.println(T1.getData5());

        ctx.close();
    }
}