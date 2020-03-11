package com.枚举.emun;

public enum TypeEnum {
    FIREWALL("firewall"),
    SECRET("secretMac"),
    BALANCE("f5");
    private String typeName;

    TypeEnum(String typeName) {
        this.typeName = typeName;
    }

    /**
     * 根据类型的名称，返回类型的枚举实例。
     * @param typeName 类型名称
     */
    public static TypeEnum fromTypeName(String typeName) {
        for (TypeEnum type : TypeEnum.values()) {
            if (type.getTypeName().equals(typeName)) {
                return type;
            }
        }
        return null;
    }

    public String getTypeName() {
        return this.typeName;
    }


    public static void main(String[] args) {

     final    String typeName = "firewall";
        TypeEnum type = TypeEnum.fromTypeName(typeName);
        //type:是TypeEnum类实例化对象
        // typeName：实例化对象type的值
        // ordinal：实例化对象type的序号（int）
        // 排序值(默认自带的属性 ordinal 的值)
        // name：实化对象的名字（String） 枚举名称(即默认自带的属性 name 的值)
        System.out.println(type+",\ntypeName:====》"+type.getTypeName()+",\nordinal:=====》"+type.ordinal()+",\nname:====》"+type.name());
    }
}
