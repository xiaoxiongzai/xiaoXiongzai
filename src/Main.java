import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //键盘输入练习
        // Scanner sc=new Scanner(System.in);
        // System.out.println("请输入一个整数");
        // int num=sc.nextInt();
        // sc.close();
        // System.out.println("您输入的整数为："+num);


        //数值拆分
        // Scanner sc=new Scanner(System.in);
        // System.out.println("请输入一个三位数");
        // int num=sc.nextInt();
        // sc.close();
        // int gw=num%10;
        // int sw=num/10%10;
        // int bw=num/100%10;
        // System.out.println("你输入的数字的个位是："+gw+"   十位是："+sw+"   百位是："+bw);


        //隐式转换和强制转换
        // byte<short<int<long<float<double
        // byte和char和short 三种类型在数据运算时都是提升为int类型


        // 关系运算符
        // 相亲
        Scanner sc=new Scanner(System.in);
       System.out.println("输入您的时髦度");
        int man =sc.nextInt();
while(true){
   
  if(man>0&&man<10){
    break;
  }
  System.out.println("输入异常，请重新输入!");
  System.out.println("请输入您的时髦度");
  man =sc.nextInt();
}
        
        System.out.println("输入您对象的时髦度");
        int woman=sc.nextInt();
        while(true){
   
  if(woman>0&&woman<10){
    break;
  }
  System.out.println("输入异常，请重新输入!");
  System.out.println("请输入您的时髦度");
  woman =sc.nextInt();
}
sc.close();
        if(man>woman){
            System.out.println("相亲成功！");
        }
        else{
            System.out.println("相亲失败！");

        }
        boolean reault=man>woman;
        System.out.println(reault);









    }
    }
