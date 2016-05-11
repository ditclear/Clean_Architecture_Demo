package com.kygo.clean.domain.model;

import java.io.Serializable;

/**
 * Created by kygo on 2016/5/10 0010.
 * 天气
 */
public class ResultEntity implements Serializable{

    private static final long serialVersionUID = 6008615284826064489L;


    /**
     * airCondition : 中度污染
     * city : 成都
     * coldIndex : 低发期
     * date : 2016-05-11
     * distrct : 成都
     * dressingIndex : 薄短袖类
     * exerciseIndex : 不适宜
     */

    private String airCondition;
    private String city;
    private String coldIndex;
    private String date;
    private String distrct;
    private String dressingIndex;
    private String exerciseIndex;
    /**
     * humidity : 湿度：14%
     * pollutionIndex : 97
     * province : 四川
     * sunrise : 06:12
     * sunset : 19:49
     * temperature : 29℃
     * time : 13:43
     * updateTime : 20160511135534
     * washIndex : 不适宜
     * weather : 晴
     * week : 周三
     * wind : 无持续风向1级
     */

    private String humidity;
    private String pollutionIndex;
    private String province;
    private String sunrise;
    private String sunset;
    private String temperature;
    private String time;
    private String updateTime;
    private String washIndex;
    private String weather;
    private String week;
    private String wind;


    public void setAirCondition(String airCondition) {
        this.airCondition = airCondition;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setColdIndex(String coldIndex) {
        this.coldIndex = coldIndex;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDistrct(String distrct) {
        this.distrct = distrct;
    }

    public void setDressingIndex(String dressingIndex) {
        this.dressingIndex = dressingIndex;
    }

    public void setExerciseIndex(String exerciseIndex) {
        this.exerciseIndex = exerciseIndex;
    }

    public String getAirCondition() {
        return airCondition;
    }

    public String getCity() {
        return city;
    }

    public String getColdIndex() {
        return coldIndex;
    }

    public String getDate() {
        return date;
    }

    public String getDistrct() {
        return distrct;
    }

    public String getDressingIndex() {
        return dressingIndex;
    }

    public String getExerciseIndex() {
        return exerciseIndex;
    }

    @Override
    public String toString() {
        return "ResultEntity{" +'\n'+
                "airCondition='" + airCondition + '\n' +
                ", city='" + city + '\n' +
                ", coldIndex='" + coldIndex + '\n' +
                ", date='" + date + '\n' +
                ", distrct='" + distrct + '\n' +
                ", dressingIndex='" + dressingIndex + '\n' +
                ", exerciseIndex='" + exerciseIndex + '\n' +
                ", humidity='" + humidity + '\n' +
                ", pollutionIndex='" + pollutionIndex + '\n' +
                ", province='" + province + '\n' +
                ", sunrise='" + sunrise + '\n' +
                ", sunset='" + sunset + '\n' +
                ", temperature='" + temperature + '\n' +
                ", time='" + time + '\n' +
                ", updateTime='" + updateTime + '\n' +
                ", washIndex='" + washIndex + '\n' +
                ", weather='" + weather + '\n' +
                ", week='" + week + '\n' +
                ", wind='" + wind + '\n' +
                '}';
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public void setPollutionIndex(String pollutionIndex) {
        this.pollutionIndex = pollutionIndex;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public void setWashIndex(String washIndex) {
        this.washIndex = washIndex;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    public String getHumidity() {
        return humidity;
    }

    public String getPollutionIndex() {
        return pollutionIndex;
    }

    public String getProvince() {
        return province;
    }

    public String getSunrise() {
        return sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public String getTemperature() {
        return temperature;
    }

    public String getTime() {
        return time;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public String getWashIndex() {
        return washIndex;
    }

    public String getWeather() {
        return weather;
    }

    public String getWeek() {
        return week;
    }

    public String getWind() {
        return wind;
    }
}
