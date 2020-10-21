/**
 * Copyright 2020 bejson.com
 */
package com.eg.lolapi.bean.champion.all;

import java.util.List;

/**
 * Auto-generated: 2020-10-21 21:7:7
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
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

    public List<Double> getCooldown() {
        return cooldown;
    }

    public void setCooldown(List<Double> cooldown) {
        this.cooldown = cooldown;
    }

    public String getCooldownBurn() {
        return cooldownBurn;
    }

    public void setCooldownBurn(String cooldownBurn) {
        this.cooldownBurn = cooldownBurn;
    }

    public List<Integer> getCost() {
        return cost;
    }

    public void setCost(List<Integer> cost) {
        this.cost = cost;
    }

    public String getCostBurn() {
        return costBurn;
    }

    public void setCostBurn(String costBurn) {
        this.costBurn = costBurn;
    }

    public String getCostType() {
        return costType;
    }

    public void setCostType(String costType) {
        this.costType = costType;
    }

    public Datavalues getDatavalues() {
        return datavalues;
    }

    public void setDatavalues(Datavalues datavalues) {
        this.datavalues = datavalues;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<List<Integer>> getEffect() {
        return effect;
    }

    public void setEffect(List<List<Integer>> effect) {
        this.effect = effect;
    }

    public List<String> getEffectBurn() {
        return effectBurn;
    }

    public void setEffectBurn(List<String> effectBurn) {
        this.effectBurn = effectBurn;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Leveltip getLeveltip() {
        return leveltip;
    }

    public void setLeveltip(Leveltip leveltip) {
        this.leveltip = leveltip;
    }

    public String getMaxammo() {
        return maxammo;
    }

    public void setMaxammo(String maxammo) {
        this.maxammo = maxammo;
    }

    public int getMaxrank() {
        return maxrank;
    }

    public void setMaxrank(int maxrank) {
        this.maxrank = maxrank;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getRange() {
        return range;
    }

    public void setRange(List<Integer> range) {
        this.range = range;
    }

    public String getRangeBurn() {
        return rangeBurn;
    }

    public void setRangeBurn(String rangeBurn) {
        this.rangeBurn = rangeBurn;
    }

    public String getResource() {
        return resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String getTooltip() {
        return tooltip;
    }

    public void setTooltip(String tooltip) {
        this.tooltip = tooltip;
    }

    public List<String> getVars() {
        return vars;
    }

    public void setVars(List<String> vars) {
        this.vars = vars;
    }

}