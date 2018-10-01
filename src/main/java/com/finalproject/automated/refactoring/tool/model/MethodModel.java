package com.finalproject.automated.refactoring.tool.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 1 October 2018
 */

@Data
@Builder
@ToString(exclude = {"body"})
@EqualsAndHashCode(exclude = {"body"})
public class MethodModel {

    private String modifiers;

    private Boolean staticMethod;

    private String returnType;

    private String name;

    private List<PropertyModel> parameters;

    private List<String> exceptions;

    private String body;

    private Long loc;
}
