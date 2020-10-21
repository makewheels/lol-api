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
public class Spells {

    private String id;
    private String name;
    private String description;
    private String tooltip;
    private Leveltip leveltip;
    private int maxrank;
    private List<Integer> cooldown;
    private String cooldownBurn;
    private List<Integer> cost;
    private String costBurn;
    private Datavalues datavalues;
    private List<String> effect;
    private List<String> effectBurn;
    private List<String> vars;
    private String costType;
    private String maxammo;
    private List<Integer> range;
    private String rangeBurn;
    private Image image;
    private String resource;
}