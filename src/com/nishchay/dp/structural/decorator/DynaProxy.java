package com.nishchay.dp.structural.decorator;

import com.nishchay.dp.structural.decorator.entity.Circle;
import com.nishchay.dp.structural.decorator.entity.Shape;
import com.nishchay.dp.structural.decorator.features.GreenShapeDecorator;

import java.lang.reflect.Proxy;


/*
 * Dynamic Proxies implementing Decorators
 *
 * Proxy - creating a proxy object using reflexion and exposing a hook of Invocation handler
 * Invocation handler - intercepting all the method invocation, can add the extra things at run-time
 * Wherever we have the Delegator use case we can use this.
 *
 * https://www.logicbig.com/tutorials/core-java-tutorial/java-dynamic-proxies/generic-cache-decorator.html
 * */
public class DynaProxy {

    public static void main(String[] argv) {

        Circle circle = new Circle();
        System.out.println("Original object behaviour -");
        circle.draw();

        Shape greenDecorator = new GreenShapeDecorator(circle);
        System.out.println("Decorated object behaviour -");
        greenDecorator.draw();

        Shape dynamicProxy = (Shape) Proxy.newProxyInstance(Shape.class.getClassLoader(),
                new Class[]{Shape.class}, (proxy, method, args) -> {
                    method.invoke(greenDecorator, args);
                    doingExtraThings();
                    return null;
                });
        System.out.println("Further Decorated object(using dynamic proxy) behaviour -");
        dynamicProxy.draw();

    }

    private static void doingExtraThings() {
            System.out.println("Area filled with blue");
    }

}
