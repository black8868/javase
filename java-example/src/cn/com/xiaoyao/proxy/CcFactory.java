package cn.com.xiaoyao.proxy;

/**
 * @ProjectName: javase
 * @Package: cn.com.xiaoyao.proxy
 * @ClassName: CcFactory
 * @Author: jackzhang
 * @Description:
 * @Date: 2020/6/29
 * @Version: 1.0
 */
public class CcFactory implements ManToolsFactory {
    @Override
    public void saleManTools(String size) {
        System.out.println("历史不会重来"+size);
    }
}
