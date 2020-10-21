package com.eg.lolapi.local;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.eg.lolapi.bean.champion.ChampionMapItem;
import com.eg.lolapi.bean.champion.Spells;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

public class ReadFiles {
    public static void main(String[] args) throws IOException {
        String dataPath = "C:\\Users\\thedoflin\\Downloads\\dragontail-10.21.1\\10.21.1\\data\\en_US";
        String championPath = dataPath + "\\" + "champion";
        File championFolder = new File(championPath);
        File[] files = championFolder.listFiles();
        if (files != null) {
            for (File file : files) {
                String json = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
                JSONObject jsonObject = JSON.parseObject(json);

                String dataJson = JSON.toJSONString(jsonObject.get("data"));
                Map<String, ChampionMapItem> championMap
                        = JSON.parseObject((dataJson), Map.class);
                String key = championMap.keySet().iterator().next();
                ChampionMapItem championMapItem = JSON.parseObject(JSON.toJSONString(championMap.get(key)),
                        ChampionMapItem.class);
                List<Spells> spells = championMapItem.getSpells();
                for (Spells spell : spells) {
                    String name = spell.getName();
                    String description = spell.getDescription();
                    System.out.println("name = " + name + " description=" + description);
                }
            }
        }
    }
}
