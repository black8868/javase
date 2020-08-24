package cn.com.xiaoyao.example;

/**
 * @ProjectName: javase
 * @Package: cn.com.xiaoyao.example
 * @ClassName: example1
 * @Author: zhangkaixuan
 * @Description:
 * @Date: 2020/5/19
 * @Version: 1.0
 */
public class Example1 {
    int i;
    int j;

    public void test(){
        j=10-i;
        System.out.println(j);
    }

    public static void main(String[] args) {
      int i=100;
      if(i>9){
          System.out.println(4);
      }
      if (i>99){
          System.out.println(3);
      }
      if (i>999){
          System.out.println(2);
      }else {
          System.out.println(1);
      }
        System.out.println("完毕");
    }

}
