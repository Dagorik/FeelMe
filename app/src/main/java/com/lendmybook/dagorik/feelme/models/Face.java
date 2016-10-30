package com.lendmybook.dagorik.feelme.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Dagorik on 29/10/2016.
 */

public class Face {

    @SerializedName("faceRectangle")
    private FaceRectangle faceRectangle;
    @SerializedName("scores")
    private Scores scores;

    /**
     * @return The faceRectangle
     */
    public FaceRectangle getFaceRectangle() {
        return faceRectangle;
    }

    /**
     * @param faceRectangle The faceRectangle
     */
    public void setFaceRectangle(FaceRectangle faceRectangle) {
        this.faceRectangle = faceRectangle;
    }

    /**
     * @return The scores
     */
    public Scores getScores() {
        return scores;
    }

    /**
     * @param scores The scores
     */
    public void setScores(Scores scores) {
        this.scores = scores;
    }

    @Override
    public String toString() {
        return "Face{" +
                "faceRectangle=" + faceRectangle +
                ", scores=" + scores +
                '}';
    }
}

