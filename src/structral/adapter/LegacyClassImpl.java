package src.structral.adapter;

public class LegacyClassImpl implements LegacyClass {
    @Override
    public XmlModel getDataFromLegacyService() {
        return new XmlModel("Name in Xml");
    }
}


