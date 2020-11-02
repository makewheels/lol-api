package com.eg.lolapi.local;

import com.eg.lolapi.bean.champion.all.ChampionAll;
import com.eg.lolapi.bean.champion.all.ChampionMapItem;
import com.eg.lolapi.bean.champion.all.Spells;
import com.eg.lolapi.local.constants.LanguageConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Controller
@RequestMapping("/page")
public class PageController {

    @RequestMapping("/championEnglishAndChinese")
    public String championEnglishAndChinese(Model model) {
        ChampionAll championAll_en_US = LoadUtil.loadChampionFull(LanguageConstants.en_US);
        ChampionAll championAll_zh_CN = LoadUtil.loadChampionFull(LanguageConstants.zh_CN);

        Map<String, ChampionMapItem> championAll_en_usData = championAll_en_US.getData();
        Map<String, ChampionMapItem> championAll_zh_cnData = championAll_zh_CN.getData();
        Set<String> keySet = championAll_en_usData.keySet();

        List<ChampionBean> championBeanList = new ArrayList<>();
        for (String key : keySet) {
            ChampionMapItem championMapItem_en_US = championAll_en_usData.get(key);
            String id = championMapItem_en_US.getId();
            ChampionMapItem championMapItem_zh_CN = championAll_zh_cnData.get(id);

            List<Spells> spellsList_en_US = championMapItem_en_US.getSpells();
            List<Spells> spellsList_zh_CN = championMapItem_zh_CN.getSpells();

            for (int i = 0; i < spellsList_en_US.size(); i++) {
                Spells spells_en_US = spellsList_en_US.get(i);
                Spells spells_zh_CN = spellsList_zh_CN.get(i);
                ChampionBean championBean = new ChampionBean();
                String qwer;
                if (i == 0) {
                    qwer = "Q";
                } else if (i == 1) {
                    qwer = "W";
                } else if (i == 2) {
                    qwer = "E";
                } else {
                    qwer = "R";
                }
                championBean.setQwer(qwer);
                championBean.setImg(spells_en_US.getImage().getFull());
                championBean.setSpellName_en_US(spells_en_US.getName());
                championBean.setSpellName_zh_CN(spells_zh_CN.getName());
                championBean.setDescription_en_US(spells_en_US.getDescription());
                championBean.setDescription_zh_CN(spells_zh_CN.getDescription());
                championBeanList.add(championBean);
            }
        }
        model.addAttribute("championBeanList", championBeanList);
        return "championEnglishAndChinese";
    }

}
