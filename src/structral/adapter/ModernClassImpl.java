package src.structral.adapter;

public class ModernClassImpl implements ModernClass {
    private final LegacyClass legacyClass;

    public ModernClassImpl(LegacyClass legacyClass) {
        this.legacyClass = legacyClass;
    }

    @Override
    public JsonModel getData() {
        XmlModel dataFromLegacyService = legacyClass.getDataFromLegacyService();
        return this.convertToJson(dataFromLegacyService);
    }

    private JsonModel convertToJson(XmlModel dataFromLegacyService) {
        System.out.println(dataFromLegacyService.getName());
        String s = dataFromLegacyService.getName() + " Converted into Json";
        return new JsonModel(s);
    }
}