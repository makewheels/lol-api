/**
 * Copyright 2020 bejson.com
 */
package com.eg.lolapi.bean.champion.all;

import lombok.Data;

import java.util.List;

/**
 * Auto-generated: 2020-10-21 21:7:7
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
@Data
public class Blocks {

    private String hideIfSummonerSpell;
    private List<Items> items;
    private int maxSummonerLevel;
    private int minSummonerLevel;
    private boolean recMath;
    private boolean recSteps;
    private String showIfSummonerSpell;
    private String type;

}