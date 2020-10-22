package com.eg.lolapi.local;

import com.alibaba.fastjson.JSON;
import com.eg.lolapi.bean.champion.all.ChampionAll;
import com.eg.lolapi.local.constants.PathConstants;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class LoadUtil {

    public static ChampionAll loadChampionFull(String language) {
        String filePath = null;
        if (language.equals("en_US")) {
            filePath = PathConstants.VERSION_DATA_en_US_CHAMPION_FULL;
        } else if (language.equals("zh_CN")) {
            filePath = PathConstants.VERSION_DATA_zh_CN_CHAMPION_FULL;
        } else if (language.equals("zh_TW")) {
            filePath = PathConstants.VERSION_DATA_zh_TW_CHAMPION_FULL;
        }
        File championFullFile = new File(filePath);
        String json = null;
        try {
            json = FileUtils.readFileToString(championFullFile, StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return JSON.parseObject(json, ChampionAll.class);
    }

}
