package cn.com.xiaoyao.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ProjectName: javase
 * @Package: cn.com.xiaoyao.proxy
 * @ClassName: LisonCompay
 * @Author: jackzhang
 * @Description:
 * @Date: 2020/6/29
 * @Version: 1.0
 */
public class LisonCompay implements InvocationHandler {

    private Object factory;

    public Object getFactory(){
        return factory;
    }

    public void setFactory(Object factory){
        this.factory = factory;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(factory.getClass().getClassLoader(),factory.getClass().getInterfaces(),this);
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        dosomeBefore();
        Object ret = method.invoke(factory,args);
        dosomeEnd();

        return null;
    }

    private void dosomeEnd() {
        System.out.println("完成");
    }

    private void dosomeBefore() {
        System.out.println("开始");
    }
}
