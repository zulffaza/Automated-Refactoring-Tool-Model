package com.finalproject.automated.refactoring.tool.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 1 October 2018
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyModel {

    @Builder.Default
    private List<String> keywords = new ArrayList<>();

    private String type;

    private String name;
}
