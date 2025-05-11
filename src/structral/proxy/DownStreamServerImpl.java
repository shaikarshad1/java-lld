package src.structral.proxy;

public class DownStreamServerImpl implements DownStreamServer{
    @Override
    public String getDataFromBackend() {
        return "Response From Backend";
    }
}
