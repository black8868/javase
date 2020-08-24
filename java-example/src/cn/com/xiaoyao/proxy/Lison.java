package cn.com.xiaoyao.proxy;

/**
 * @ProjectName: javase
 * @Package: cn.com.xiaoyao.proxy
 * @ClassName: Lison
 * @Author: jackzhang
 * @Description:
 * @Date: 2020/6/29
 * @Version: 1.0
 */
public class Lison implements ManToolsFactory {

    //被包含的真实对象
    public ManToolsFactory factory;

    public Lison(ManToolsFactory factory) {
        super();

    }
    @Override
    public void saleManTools(String size) {
            dosomeThingBefore();
            factory.saleManTools(size);
            dosomeThingEnd();
    }

    private void dosomeThingEnd() {
        System.out.println("精美包装，快递一条龙服务");
    }

    private void dosomeThingBefore() {
        System.out.println("根据您的需求，进行市场调研和分析");
    }

}
