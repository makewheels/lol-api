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
public class Spells {

    private List<Double> cooldown;
    private String cooldownBurn;
    private List<Integer> cost;
    private String costBurn;
    private String costType;
    private Datavalues datavalues;
    private String description;
    private List<List<Integer>> effect;
    private List<String> effectBurn;
    private String id;
    private Image image;
    private Leveltip leveltip;
    private String maxammo;
    private int maxrank;
    private String name;
    private List<Integer> range;
    private String rangeBurn;
    private String resource;
    private String tooltip;
    private List<String> vars;

}