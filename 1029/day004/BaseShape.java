package day004;

/**
 * @ClassName 形状抽象类
 * @Description TODO
 * @Author apple
 * @Date 2020/10/29
 **/
public abstract class BaseShape {


    /*
    *
    * 求面积
    * @return double
    * */


   public abstract double getArea();  //声明

    public void print(){
        System.out.println("this is a test");
    }
}
