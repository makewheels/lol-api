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
public class Recommended {

    private String champion;
    private String title;
    private String map;
    private String mode;
    private String type;
    private String customTag;
    private int sortrank;
    private boolean extensionPage;
    private boolean useObviousCheckmark;
    private String customPanel;
    private List<Blocks> blocks;
}