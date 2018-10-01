package com.finalproject.automated.refactoring.tool.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 1 October 2018
 */

@Data
@Builder
public class PropertyModel {

    private String type;

    private String name;
}
