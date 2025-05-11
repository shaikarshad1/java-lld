package src.structral.adapter;

public class AdapterMain {

    public static void main(String[] args) {
        LegacyClass legacyClass=new LegacyClassImpl();
        XmlModel xmlModel=legacyClass.getDataFromLegacyService();
        ModernClass modernClass=new ModernClassImpl();
        System.out.println(modernClass.getData(xmlModel).getName());
    }
}
