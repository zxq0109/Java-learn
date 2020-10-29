package day004;

/**
 * @ClassName SuperStar
 * @Description TODO
 * @Author apple
 * @Date 2020/10/29
 **/


public class SuperStar implements Filmable,Singable,Tvable{
 private String name;
 public  String getName(){return name;}
 public  void setName(String name){this.name=name;}
 public SuperStar(){super();}
 public SuperStar(String name){
     super();
     this.name=name;
 }
@Override
    public void actFilm(){
     System.out.println(this.name+"会演电影");
 }

@Override
    public void sing(){
        System.out.println(this.name+"会唱歌");
    }

@Override
    public void showTv(){
        System.out.println(this.name+"会演电视");
    }

    public void introduce(){
     System.out.println(name+"是三栖明星");
    }
    }

