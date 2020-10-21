package com.eg.lolapi.local;

import com.alibaba.fastjson.JSON;
import com.eg.lolapi.bean.champion.Champion;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadFiles {
    public static void main(String[] args) throws IOException {
        String dataPath = "C:\\Users\\thedoflin\\Downloads\\dragontail-10.21.1\\10.21.1\\data\\en_US";
        String championPath = dataPath + "\\" + "champion";
        File championFolder = new File(championPath);
        File[] files = championFolder.listFiles();
        if (files != null) {
            for (File file : files) {
                String json = FileUtils.readFileToString(file, StandardCharsets.UTF_8);
                Champion champion = JSON.parseObject(json, Champion.class);
                System.out.println(champion);
            }
        }
    }
}
