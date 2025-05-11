package src.structral.proxy;

public class ProxyServiceImpl implements ProxyService{

    @Override
    public String getData() {
        DownStreamServer downStreamServer=new DownStreamServerImpl();
        return downStreamServer.getDataFromBackend();
    }
}
