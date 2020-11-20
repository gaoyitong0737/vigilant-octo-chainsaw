public class Test  {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

class Animal {
    Animal(){
        System.out.println("这是动物！");
    }
    
    void moSystem.ve .){
        System.out.println("动物会动！");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.("这是马匹！");
    }
}
    
/*多态练习，编程实现以下内容：

（1）编写一个类Animal，无参数的构造方法输出“这是动物”，方法void move()输出“动物会动"。

（2）编写Animal的子类Horse，无参数的构造方法中输出“这是一匹马”，重写move()方法，输出“马儿跑”；

（3）编写Animal的子类Bird，无参数的构造方法中输出“这是一只鸟”，重写move()方法，输出“鸟儿飞”。

（4）编写主类Test，用Animal声明变量animal，分别用Horse和Bird的实例赋值，并调用move()方法。*/