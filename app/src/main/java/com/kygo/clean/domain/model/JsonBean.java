package com.kygo.clean.domain.model;

import org.parceler.Parcel;

import java.util.List;

/**
 * Created by kygo on 2016/5/11 0011.
 */
@Parcel
public class JsonBean {


    /**
     * msg : success
     * result : [{"airCondition":"良","city":"成都","coldIndex":"低发期","date":"2016-05-11","distrct":"成都","dressingIndex":"薄短袖类","exerciseIndex":"不适宜","future":[{"date":"2016-05-11","dayTime":"晴","night":"晴","temperature":"33°C / 19°C","week":"今天","wind":"南风 小于3级"},{"date":"2016-05-12","dayTime":"中雨","night":"中雨","temperature":"27°C / 18°C","week":"星期四","wind":"北风 小于3级"},{"date":"2016-05-13","dayTime":"小雨","night":"小雨","temperature":"26°C / 18°C","week":"星期五","wind":"北风 小于3级"},{"date":"2016-05-14","dayTime":"阴","night":"阴","temperature":"23°C / 16°C","week":"星期六","wind":"北风 小于3级"},{"date":"2016-05-15","dayTime":"晴","night":"晴","temperature":"25°C / 17°C","week":"星期日","wind":"北风 小于3级"},{"date":"2016-05-16","dayTime":"多云","night":"阴","temperature":"26°C / 17°C","week":"星期一","wind":"南风 小于3级"},{"date":"2016-05-17","dayTime":"局部多云","night":"阴天","temperature":"27°C / 17°C","week":"星期二","wind":"东南偏东风 2级"},{"date":"2016-05-18","dayTime":"阴天","night":"多云","temperature":"27°C / 17°C","week":"星期三","wind":"东北偏东风 2级"},{"date":"2016-05-19","dayTime":"多云","night":"零散阵雨","temperature":"26°C / 18°C","week":"星期四","wind":"东北偏东风 2级"},{"date":"2016-05-20","dayTime":"零散阵雨","night":"阴天","temperature":"26°C / 19°C","week":"星期五","wind":"东北偏东风 2级"}],"humidity":"湿度：14%","pollutionIndex":"97","province":"四川","sunrise":"06:12","sunset":"19:49","temperature":"29℃","time":"13:43","updateTime":"20160511135534","washIndex":"不适宜","weather":"晴","week":"周三","wind":"无持续风向1级"}]
     * retCode : 200
     */

    String msg;
    String retCode;
    List<ResultEntity> result;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public void setResult(List<ResultEntity> result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public String getRetCode() {
        return retCode;
    }

    public List<ResultEntity> getResult() {
        return result;
    }


}
