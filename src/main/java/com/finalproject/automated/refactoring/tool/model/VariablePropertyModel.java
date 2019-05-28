package com.finalproject.automated.refactoring.tool.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 28 May 2019
 */

@Data
@Builder(builderMethodName = "variablePropertyBuilder")
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
public class VariablePropertyModel extends PropertyModel {

    private Integer statementIndex;
}
