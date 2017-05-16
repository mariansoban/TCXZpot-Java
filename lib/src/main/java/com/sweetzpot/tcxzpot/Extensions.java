package com.sweetzpot.tcxzpot;

public class Extensions implements TCXSerializable {

    public static Extensions extensions(Integer watts) {
        return new Extensions(watts);
    }

    private final Integer watts;

    public Extensions(Integer watts) {
        this.watts = watts;
    }

    @Override
    public void serialize(Serializer serializer) {
    	if (watts != null && watts.intValue() >= 0) {
    		serializer.print("<Extensions><TPX xmlns=\"http://www.garmin.com/xmlschemas/ActivityExtension/v2\"><Watts>" + watts.intValue() + "</Watts></TPX></Extensions>");
    	}
    }
}
