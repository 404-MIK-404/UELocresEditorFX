package com.mik.unreal.editor.tool.uelocreseditorfx.model.internal;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class LocresFileModel {

    @JsonProperty("key")
    public String key;

    @JsonProperty("source")
    public String source;

    @JsonProperty("target")
    public String target;

}
