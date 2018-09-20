package com.niit.quickstart.controller;

import com.niit.quickstart.entity.Shao;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 高展 on 2018/9/10.
 */
@Controller
public class ShaoController {
    @Resource
    private List<Shao>shaoList;
    @GetMapping("shao")
    public String shao(ModelMap map){
       shaoList=new ArrayList<>();
       Shao shao=new Shao();
        shao.setAvator("https://cdn.sspai.com/attachment/origin/2015/01/15/215332.jpg?imageMogr2/quality/95/thumbnail/!80x80r/gravity/Center/crop/80x80");
        shao.setWriter("洛世");
        shao.setTime("02月04日");
        shao.setPic("https://cdn.sspai.com/2018/07/23/521dfa9b74e80cd38b6b1a6fbb1f2467.jpg?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220");
        shao.setTitle("简单三步");
        shao.setContent("我们身边不少人习惯过农历生日，但是农历日期很难记住，其实iPhone自带了农历功能，这篇文章开始叫你如何开启隐藏的农历生日提醒");
        shao.setMtitle("玩转workflow");
        shao.setMpic("https://cdn.sspai.com/other/136_1490237571570.jpg?imageMogr2/quality/95/thumbnail/!828x442r/gravity/Center/crop/828x442");
        shao.setMcontent("workflow是ios上一款被称为【效率神器】app");

       Shao shao1=new Shao();
        shao1.setAvator("https://cdn.sspai.com/attachment/origin/2017/02/01/365918.jpg?imageMogr2/quality/95/thumbnail/!80x80r/gravity/Center/crop/80x80");
        shao1.setWriter("Navis");
        shao1.setTime("02月12日");
        shao1.setPic("https://cdn.sspai.com/2018/07/27/14f6df1cca005e5ecabddd3e47f9aaa2.jpg?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220");
        shao1.setTitle("福利派丨夹在显示器上的台灯，美观实用的完美照明解决方案：明基 ScreenBar Plus 屏幕挂灯");
        shao1.setContent("明基 ScreenBar Plus 不仅提供了高素质的光源条件，还能根据环境光自动调整亮度，夹挂设计也解决了传统桌面台灯高度调节有限挡住屏幕的问题，我愿意把它称为多显示器 / 紧凑桌面空间的终极照明解决方案。");
        shao1.setMpic("https://cdn.sspai.com/other/705956_1490770613690.jpg?imageMogr2/quality/95/thumbnail/!828x442r/gravity/Center/crop/828x442");
        shao1.setMtitle("提升效率之路");
        shao1.setMcontent("一个优秀的效率工具能让你在提升效率的路上事半功倍");

       Shao shao2=new Shao();
        shao2.setAvator("https://cdn.sspai.com/2018/07/20/178714f8312ff28c6e5cc743e1a145fd.jpg?imageMogr2/quality/95/thumbnail/!80x80r/gravity/Center/crop/80x80");
        shao2.setWriter("大飞bigfly");
        shao2.setTime("03月23日");
        shao2.setPic("https://cdn.sspai.com/2018/07/15/17ef4fe0943f250dde344880ccdb5717.jpg?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220");
        shao2.setTitle("智能家居初体验 | 带你认识我家的赵狗剩、赵铁柱和赵小爱");
        shao2.setContent("快到家时自动开启空调、定时关灯提醒自己睡觉、语音查快递……我打造了一套智能家居，在独居生活中享受自动化带来的便利。");
        shao2.setMpic("https://cdn.sspai.com/other/718855_1493173455255.png?imageMogr2/quality/95/thumbnail/!828x442r/gravity/Center/crop/828x442");
        shao2.setMtitle("装了啥？");
        shao2.setMcontent("你的手机装了哪些常见的或小众app？");

        Shao shao3=new Shao();
         shao3.setAvator("https://cdn.sspai.com/2018/03/25/ce2a784deb3097acb6ee9d37ea0c13ea.jpg?imageMogr2/quality/95/thumbnail/!80x80r/gravity/Center/crop/80x80");
         shao3.setWriter("Tp");
         shao3.setTime("03月05日");
         shao3.setPic("https://cdn.sspai.com/2018/09/07/7453f4472eb69423dd8ca3495f63e6c5.png?imageMogr2/quality/95/thumbnail/!360x220r/gravity/Center/crop/360x220");
         shao3.setTitle("别让「每天 XX 分钟」吓到你，习惯养成其实可以很简单：Continuo | App+1");
         shao3.setContent("如果你在养成习惯的过程中也感受到了无形的压力，那么不妨试试这款无需设定目标的 Continuo，帮助你在改变的同时减轻焦虑");
         shao3.setMpic("https://cdn.sspai.com/other/58_1488221603223.jpg?imageMogr2/quality/95/thumbnail/!828x442r/gravity/Center/crop/828x442");
         shao3.setMtitle("我想推荐这个app");
         shao3.setMcontent("你用过哪些app，爱上了哪些app？无论平台不妨现在就分享出来");


       shaoList.add(shao);
       shaoList.add(shao1);
       shaoList.add(shao2);
       shaoList.add(shao3);
        map.addAttribute("shaoList",shaoList);
       return "shao";
    }
}
