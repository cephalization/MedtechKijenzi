package com.medtech.kijenzi.medtechkijenzi;

/**
 * Created by nick on 3/20/17.
 */

public class PartInfo {
    private String partName;
    private Integer thumbId;
    private String gcode;
    private String description;

    PartInfo(String partName, Integer thumbId, String gcode, String description){
        this.partName = partName;
        this.thumbId = thumbId;
        this.gcode = gcode;
        this.description = description;
    }

    public Integer getThumbId() {
        return thumbId;
    }

    public String getPartName() {
        return partName;
    }

    public String getDescription() {
        return description;
    }

    public String getGcode() {
        return gcode;
    }
}
