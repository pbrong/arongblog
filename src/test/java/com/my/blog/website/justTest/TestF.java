package com.my.blog.website.justTest;

import org.junit.Test;

public class TestF {

    @Test
    public void fun1(){
        //初始化Rectangle对象
        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle(10, 20, 35, 45);
        //打印对象观察
        System.out.println("rect1->"+rect1.x+","+rect1.y+","+rect1.width+","+rect1.height
                +","+"----"+rect1);
        System.out.println("rect2->"+rect2.x+","+rect2.y+","+rect2.width+","+rect2.height
                +","+"----"+rect2);
        //将rect2的内存引用“复制给rect1”，此时rect1和rect2指向同一内存空间
        //rect1的原内存被gc
        rect1 = rect2;
        //打印rect1
        System.out.println("rect1->"+rect1.x+","+rect1.y+","+rect1.width+","+rect1.height
                +","+"----"+rect1);
        //比较内存地址
        System.out.print("内存地址比较结果->");
        System.out.println(rect1 == rect2);
        //修改rect2的数据，rect1的数据也改变，说明指向同一内存空间
        rect2.x = 30;
        System.out.println("rect1->"+rect1.x+","+rect1.y+","+rect1.width+","+rect1.height
                +","+"----"+rect1);
        System.out.println("rect2->"+rect2.x+","+rect2.y+","+rect2.width+","+rect2.height
                +","+"----"+rect2);

    }
}
