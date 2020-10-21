package com.eg.lolapi.local;

import com.alibaba.fastjson.JSON;
import com.eg.lolapi.bean.champion.all.ChampionAll;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class LoadChampion {

    public static ChampionAll loadChampionFull_en_Us() {
        File championFullFile = new File(PathConstants.VERSION_DATA_en_US_CHAMPION_FULL);
        String json = null;
        try {
            json = FileUtils.readFileToString(championFullFile, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return JSON.parseObject(json, ChampionAll.class);
    }

    public static ChampionAll loadChampionFull_zh_CN() {
        File championFullFile = new File(PathConstants.VERSION_DATA_zh_CN_CHAMPION_FULL);
        String json = null;
        try {
            json = FileUtils.readFileToString(championFullFile, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return JSON.parseObject(json, ChampionAll.class);
    }

    public static ChampionAll loadChampionFull_zh_TW() {
        File championFullFile = new File(PathConstants.VERSION_DATA_zh_TW_CHAMPION_FULL);
        String json = null;
        try {
            json = FileUtils.readFileToString(championFullFile, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return JSON.parseObject(json, ChampionAll.class);
    }

}
