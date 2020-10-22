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
public class Recommended {

    private List<Blocks> blocks;
    private String champion;
    private String customTag;
    private boolean extensionPage;
    private String map;
    private String mode;
    private String requiredPerk;
    private int sortrank;
    private String title;
    private String type;

}