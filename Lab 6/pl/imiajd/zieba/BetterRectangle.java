package pl.imiajd.zieba;

import java.awt.Rectangle;

public class BetterRectangle extends Rectangle {
    public BetterRectangle(int x, int y, int w, int h){
        super();
        this.setLocation(x,y);
        this.setSize(w,h);
    }
    public double getPerimeter(){
        return 2*(this.height+this.width);
    }
    public double getArea(){
        return this.height*this.width;
    }
}