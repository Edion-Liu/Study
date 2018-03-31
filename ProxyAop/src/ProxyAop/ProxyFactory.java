package ProxyAop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @作者 刘宝军
 * Created by Edion on 2018/3/30.
 */
public class ProxyFactory implements InvocationHandler {
    private Object stu;

    /**
     * 生成student 的代理对象
     * @param stu
     * @return
     */
    public Object creatStudentProxy(Object stu){
        this.stu=stu;
        /**
         *  stu.getClass().getClassLoader() 目标对象类加载器
         *  stu.getClass().getInterfaces()  目标对象实现的接口
         *  this InvocationHandler的实例
         */
        return Proxy.newProxyInstance(stu.getClass().getClassLoader(),stu.getClass().getInterfaces(),this);
    }

    /**
     *  当调用目标对象的方法时，调用InvocationHandler类的回调函数invoke
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        StudentBean s=(StudentBean)stu;
        Object object=null;
        if(s.getName()!=null){
            /**
             * 通过代理返回新的对象
             */
            object=method.invoke(stu,args);
        }else {
            System.out.println("名字为空，代理类已进行拦截。");
        }
        return object;
    }

}
