package src.structral.adapter;

public class AdapterMain {

    public static void main(String[] args) {
        LegacyClass legacyClass=new LegacyClassImpl();
        ModernClass modernClass=new ModernClassImpl(legacyClass);
        System.out.println(modernClass.getData().getName());
    }
}
