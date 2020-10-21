/**
 * Copyright 2020 bejson.com
 */
package com.eg.lolapi.bean.champion;

import lombok.Data;

import java.util.List;

/**
 * Auto-generated: 2020-10-21 9:33:36
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class Blocks {

    private String type;
    private boolean recMath;
    private boolean recSteps;
    private int minSummonerLevel;
    private int maxSummonerLevel;
    private String showIfSummonerSpell;
    private String hideIfSummonerSpell;
    private String appendAfterSection;
    private List<String> visibleWithAllOf;
    private List<String> hiddenWithAnyOf;
    private List<Items> items;

}