package models;

import java.util.ArrayList;

/**
 * Created by Guest on 8/9/17.
 */
public class Rectangle {
    private int height;
    private int width;
    private static ArrayList<Rectangle> mInstances = new ArrayList();
    private Boolean shape;

    public Rectangle(int height, int width){
        this.height = height;
        this.width = width;
        this.shape = isRectSquare();
        mInstances.add(this);
    }

    public int getHeight(){
        return height;
    }

    public int getWidth() {
        return width;
    }
    public static ArrayList<Rectangle> getAll() {
        return mInstances;
    }

    public boolean getShape(){
        return shape;
    }

    public boolean isRectSquare(){
        if (height == width){
            return true;
        }
        else {
            return false;
        }
    }


}
