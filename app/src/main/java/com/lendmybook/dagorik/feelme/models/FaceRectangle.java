package com.lendmybook.dagorik.feelme.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Dagorik on 29/10/2016.
 */

public class FaceRectangle {

    @SerializedName("height")
    private int height;
    @SerializedName("left")
    private int left;
    @SerializedName("top")
    private int top;
    @SerializedName("width")
    private int width;

    /**
     * @return The height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height The height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return The left
     */
    public int getLeft() {
        return left;
    }

    /**
     * @param left The left
     */
    public void setLeft(int left) {
        this.left = left;
    }

    /**
     * @return The top
     */
    public int getTop() {
        return top;
    }

    /**
     * @param top The top
     */
    public void setTop(int top) {
        this.top = top;
    }

    /**
     * @return The width
     */
    public int getWidth() {
        return width;
    }

    /**
     * @param width The width
     */
    public void setWidth(int width) {
        this.width = width;
    }

}
