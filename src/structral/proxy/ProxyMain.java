package src.structral.proxy;

public class ProxyMain {

    public static void main(String[] args) {
        ProxyService proxyService=new ProxyServiceImpl();
        System.out.println(proxyService.getData());
    }
}
