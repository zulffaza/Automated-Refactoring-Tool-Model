package com.finalproject.automated.refactoring.tool.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Faza Zulfika P P
 * @version 1.0.0
 * @since 13 April 2019
 */

@Data
@Builder
@EqualsAndHashCode(callSuper = false)
public class BlockModel extends StatementModel {

    @Builder.Default
    private List<StatementModel> statements = new ArrayList<>();
}
