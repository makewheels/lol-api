package com.eg.lolapi.local;

import com.eg.lolapi.bean.champion.all.ChampionAll;
import com.eg.lolapi.bean.champion.all.ChampionMapItem;
import com.eg.lolapi.bean.champion.all.Spells;
import com.eg.lolapi.local.constants.LanguageConstants;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Run {
    public static void main(String[] args) {
        ChampionAll championAll_en_US = LoadUtil.loadChampionFull(LanguageConstants.en_US);
        ChampionAll championAll_zh_CN = LoadUtil.loadChampionFull(LanguageConstants.zh_CN);

        Map<String, ChampionMapItem> championAll_en_usData = championAll_en_US.getData();
        Map<String, ChampionMapItem> championAll_zh_cnData = championAll_zh_CN.getData();
        Set<String> keySet = championAll_en_usData.keySet();
        for (String key : keySet) {
            ChampionMapItem championMapItem_en_US = championAll_en_usData.get(key);
            String id = championMapItem_en_US.getId();
            ChampionMapItem championMapItem_zh_CN = championAll_zh_cnData.get(id);

            List<Spells> spellsList_en_US = championMapItem_en_US.getSpells();
            List<Spells> spellsList_zh_CN = championMapItem_zh_CN.getSpells();

            for (int i = 0; i < spellsList_en_US.size(); i++) {
                Spells spells_en_US = spellsList_en_US.get(i);
                Spells spells_zh_CN = spellsList_zh_CN.get(i);

                System.out.println(spells_en_US.getId() + " " + spells_zh_CN.getName());
                System.out.println(spells_en_US.getDescription());
                System.out.println(spells_zh_CN.getDescription());
                System.out.println();
            }
        }

    }
}
