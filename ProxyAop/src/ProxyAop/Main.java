package ProxyAop;

public class Main {

    /**
     *  proxy 实现Aop,
     * @param args
     */
    public static void main(String[] args) {
        /**
         * S1 目标对象
         */
     StudentInterface S1=new StudentBean("end");

     ProxyFactory proxyFactory=new ProxyFactory();
        /**
         *  代理对象
         */
     StudentInterface S2=(StudentInterface)proxyFactory.creatStudentProxy(S1);
     S2.pritn();
    }
}
