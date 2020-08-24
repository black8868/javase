package cn.com.xiaoyao.proxy;

/**
 * @ProjectName: javase
 * @Package: cn.com.xiaoyao.proxy
 * @ClassName: AaFactory
 * @Author: jackzhang
 * @Description:
 * @Date: 2020/6/29
 * @Version: 1.0
 */
public class AaFactory implements ManToolsFactory {
    @Override
    public void saleManTools(String size) {
        System.out.println("定制了一个size:"+size);
    }
}
