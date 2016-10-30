package com.lendmybook.dagorik.feelme.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Dagorik on 29/10/2016.
 */

public class Scores {

    @SerializedName("anger")
    private double anger;
    @SerializedName("contempt")
    private double contempt;
    @SerializedName("disgust")
    private double disgust;
    @SerializedName("fear")
    private double fear;
    @SerializedName("happiness")
    private double happiness;
    @SerializedName("neutral")
    private double neutral;
    @SerializedName("sadness")
    private double sadness;
    @SerializedName("surprise")
    private double surprise;

    /**
     * @return The anger
     */
    public double getAnger() {
        return anger;
    }

    /**
     * @param anger The anger
     */
    public void setAnger(double anger) {
        this.anger = anger;
    }

    /**
     * @return The contempt
     */
    public double getContempt() {
        return contempt;
    }

    /**
     * @param contempt The contempt
     */
    public void setContempt(double contempt) {
        this.contempt = contempt;
    }

    /**
     * @return The disgust
     */
    public double getDisgust() {
        return disgust;
    }

    /**
     * @param disgust The disgust
     */
    public void setDisgust(double disgust) {
        this.disgust = disgust;
    }

    /**
     * @return The fear
     */
    public double getFear() {
        return fear;
    }

    /**
     * @param fear The fear
     */
    public void setFear(double fear) {
        this.fear = fear;
    }

    /**
     * @return The happiness
     */
    public double getHappiness() {
        return happiness;
    }

    /**
     * @param happiness The happiness
     */
    public void setHappiness(double happiness) {
        this.happiness = happiness;
    }

    /**
     * @return The neutral
     */
    public double getNeutral() {
        return neutral;
    }

    /**
     * @param neutral The neutral
     */
    public void setNeutral(double neutral) {
        this.neutral = neutral;
    }

    /**
     * @return The sadness
     */
    public double getSadness() {
        return sadness;
    }

    /**
     * @param sadness The sadness
     */
    public void setSadness(double sadness) {
        this.sadness = sadness;
    }

    /**
     * @return The surprise
     */
    public double getSurprise() {
        return surprise;
    }

    /**
     * @param surprise The surprise
     */
    public void setSurprise(double surprise) {
        this.surprise = surprise;
    }

    @Override
    public String toString() {
        return "Scores{" +
                "anger=" + anger +
                ", contempt=" + contempt +
                ", disgust=" + disgust +
                ", fear=" + fear +
                ", happiness=" + happiness +
                ", neutral=" + neutral +
                ", sadness=" + sadness +
                ", surprise=" + surprise +
                '}';
    }
}
