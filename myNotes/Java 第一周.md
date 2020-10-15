# 计算机、程序和Java概述


```Java
public class Welcome {
    public static void main (String[] args) {
        System.out.println("Welcome to Java!");
       }
}
```

## 修饰符
    public static private final abstract protected
    限制其他程序访问权限

## 类
    类是对象的模板或蓝图
    程序是用一个或多个类定义的
## 方法
    主方法
    主方法控制整个程序的流程
    Java解释器通过调用主方法执行应用程序


```Java
public static void main(String[] args){
    //Statements;
}
```

# 基本程序设计
## 程序执行


```Java
public class ComputeArea {
/** Main method*/
    public static void main(String[] args){
    double radius;
    double area;
    
    // Assign a radius
    radius = 20;
    
    // Compute area
    area = radius * radius * 3.14159;
    
    // Display results
    System.out.println("The area for the circle of radius" + radius + "is" + area);
    }
}
```

## 从控制台读取输入
    1. 创建一个Scanner类型的对象


```Java
Scanner input = new Scanner(System.in);
```

    2. 使用方法来获取一个值


```Java
import java.util.Scanner;

System.out.print("Enter a double value: ");
Scanner input = new Scanner(System.in);
double d = input.nextDouble();
```

    Enter a double value: 

## 标识符
    由字母 数字 下划线 美元符号构成的字符序列


```Java
// 显示当前时间
System.currentTimeMillis()
```




    1600917271571



    自增和自减运算符
        ++var  使用var增加后的新值
        var++  使用var原来的值


```Java
int i = 1;
int k = ++i + i * 3;
k = i++ + i*3;
```

    * 类型转换


```Java

```
