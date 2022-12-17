package main;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import type.type03.fieldbasedDI.Boy;

public class AppInitilizer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        ctx.registerShutdownHook();

        Boy bean = ctx.getBean(Boy.class);
        bean.kissing();
    }

}
