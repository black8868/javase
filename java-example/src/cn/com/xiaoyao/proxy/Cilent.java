package cn.com.xiaoyao.proxy;

/**
 * @ProjectName: javase
 * @Package: cn.com.xiaoyao.proxy
 * @ClassName: Cilent
 * @Author: jackzhang
 * @Description:
 * @Date: 2020/6/29
 * @Version: 1.0
 */
public class Cilent {

    public static void main(String[] args) {
//        ManToolsFactory factory = new AaFactory();
//
//        Lison lison = new Lison(factory);
//
//        lison.saleManTools("D");

        ManToolsFactory aactory = new AaFactory();
        BbFactory bbFactory = new BbFactory();
        LisonCompay compay = new LisonCompay();

        compay.setFactory(aactory);

        ManToolsFactory lison1 = (ManToolsFactory) compay.getProxyInstance();

        lison1.saleManTools("A");
        System.out.println("=====================================");
        compay.setFactory(bbFactory);
        WomanToolsFactory lison2 = (WomanToolsFactory) compay.getProxyInstance();
        lison2.saleWomanTools(1.8F);

    }
}
