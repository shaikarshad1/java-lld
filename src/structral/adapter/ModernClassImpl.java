package src.structral.adapter;

public class ModernClassImpl implements ModernClass {

    @Override
    public JsonModel getData(XmlModel dataFromLegacyService) {
        return this.convertToJson(dataFromLegacyService);
    }

    private JsonModel convertToJson(XmlModel dataFromLegacyService) {
        System.out.println(dataFromLegacyService.getName());
        String s = dataFromLegacyService.getName() + " Converted into Json";
        return new JsonModel(s);
    }
}