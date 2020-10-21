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
public class ChampionMapItem {

    private String id;
    private String key;
    private String name;
    private String title;
    private Image image;
    private List<Skins> skins;
    private String lore;
    private String blurb;
    private List<String> allytips;
    private List<String> enemytips;
    private List<String> tags;
    private String partype;
    private Info info;
    private Stats stats;
    private List<Spells> spells;
    private Passive passive;
    private List<Recommended> recommended;

}