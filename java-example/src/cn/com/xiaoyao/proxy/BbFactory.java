package cn.com.xiaoyao.proxy;

/**
 * @ProjectName: javase
 * @Package: cn.com.xiaoyao.proxy
 * @ClassName: BbFactory
 * @Author: jackzhang
 * @Description:
 * @Date: 2020/6/29
 * @Version: 1.0
 */
public class BbFactory implements WomanToolsFactory {
    @Override
    public void saleWomanTools(float length) {
        System.out.println("为你定制高度为"+length+"的男模特");
    }
}
