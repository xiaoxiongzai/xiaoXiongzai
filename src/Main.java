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
//         Scanner sc=new Scanner(System.in);
//        System.out.println("输入您的时髦度");
//         int man =sc.nextInt();
// while(true){
   
//   if(man>0&&man<10){
//     break;
//   }
//   System.out.println("输入异常，请重新输入!");
//   System.out.println("请输入您的时髦度");
//   man =sc.nextInt();
// }
        
//         System.out.println("输入您对象的时髦度");
//         int woman=sc.nextInt();
//         while(true){
   
//   if(woman>0&&woman<10){
//     break;
//   }
//   System.out.println("输入异常，请重新输入!");
//   System.out.println("请输入您的时髦度");
//   woman =sc.nextInt();
// }
// sc.close();
//         if(man>woman){
//             System.out.println("相亲成功！");
//         }
//         else{
//             System.out.println("相亲失败！");

//         }
//         boolean reault=man>woman;
//         System.out.println(reault);




// 伟大的6
// Scanner sc=new Scanner(System.in);
// System.out.println("请输入两个整数");
// int num01=sc.nextInt();
// int num02=sc.nextInt();
// if(num01==6||num02==6){
// System.out.println("ture");
// }else{
//     int sum=num01+num02;
//     if(sum%6==0){
//         System.out.println("ture");
//     }else{
//         System.out.println("false");
//     }
// }



// 三元运算符
// a>b? a:b  (true 取a flase 取b)
// 其判断结果必须要被使用 否则报错
// int num01=10;
// int num02=20;
// System.out.println(num01>num02? num01:num02);


// if语句
// Scanner sc=new Scanner(System.in);
// System.out.println("输入您的零花钱");
// int lhq=sc.nextInt();
// sc.close();
// if(lhq<20){
//     System.out.println("今天晚上吃沙县小吃");
// }else{
// System.out.println("今晚吃KFC");
// };



// 练习  电影院
// Scanner sc=new Scanner(System.in);
// System.out.println("请输入电影院票号");
// int numbers=sc.nextInt();
// sc.close();
// if(numbers<0||numbers<=100){
//     if(numbers%2==0){
//         System.out.println("您的位置在左边");
//     }else{
//     System.out.println("您的位置在右边");
// }

// }else{
//     System.out.print("喜欢买黄牛票？？");
// }



// switch语句练习
// String noodles="香辣牛肉面";
// switch(noodles){
//     case"酸菜牛肉面":
//     System.out.println("不想吃");
//     break;
//     case"红烧牛肉面":
//     System.out.println("不想吃");
//     break;
//     case"香辣牛肉面":
//     System.out.println("好吃");
//     break;
//     // 备胎，不匹配时执行它
//     default:
//     System.out.println("不吃了");
// }


// 机票预定
// Scanner sc=new Scanner(System.in);
// System.out.println("请输入您需要的服务：");
// int num=sc.nextInt();
// sc.close();
// switch(num){
//     case 1:
//     System.out.println("机票查询");
//     break;
//     case 2:
//     System.out.println("机票预定");
//     break;
//     case 3:
//     System.out.println("机票改签");
//     break;
//     case 4:
//     System.out.println("退出服务");
//     break;
//     default:
//     System.out.println("请输入正确的按键号码");

// }




// 循环结构
// for循环
// while循环


// int count=0; //初始化折叠次数
// double hight=8844430;
// double paper=0.1;

// while(paper<hight){
//     paper=paper*2;
//     count++;
// }
// System.out.println("折叠次数位："+count);



Scanner sc=new Scanner(System.in);
System.out.println("请输入一个数字");
// String num=sc.next();
// char [] arr=num.toCharArray();
int num=sc.nextInt();
// int num_arr=arr.length/2;
// System.out.println("半长为："+num_arr);
// for(int i=0;i<=num_arr;i++){
//     System.out.print(arr[i]);
//     System.out.println(i);
//     int m=arr.length-i;
//     System.out.println("倒叙"+ m);
//     if(arr[i]==arr[m]){
//         System.out.println("该数为回文");
//     }else{
//         System.out.println("普通数字");
//     }

// }
// System.out.println(num);
// int num_1=num;
// int x=0;
// while(num!=0){
//     int gw=num%10;
//     x=x*10+gw;
//     num=num/10;
// }
// System.out.println("反转后的数字："+x);
// if(num_1==x){
//     System.out.println("该数字为回文");
// }else{
//     System.out.println("该数字不是回文");
// }
System.out.println("请输入被除数：");
int cs=sc.nextInt();
sc.close();
int count=0;
while(num>cs){
num=num-cs;
count++;
}
System.out.println("商为："+count);
System.out.println("余数为："+num);









    }
    }
