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
public class ChampionMapItem {

    private List<String> allytips;
    private String blurb;
    private List<String> enemytips;
    private String id;
    private Image image;
    private Info info;
    private String key;
    private String lore;
    private String name;
    private String partype;
    private Passive passive;
    private List<Recommended> recommended;
    private List<Skins> skins;
    private List<Spells> spells;
    private Stats stats;
    private List<String> tags;
    private String title;

}