package com.challenges.solutions.pointsandlines;

public class Line {
    private int x1Pos;
    private int y1Pos;
    private int x2Pos;
    private int y2Pos;
    private int length;

    public Line(int x1Pos, int y1Pos, int x2Pos, int y2Pos) {
        this.x1Pos = x1Pos;
        this.y1Pos = y1Pos;
        this.x2Pos = x2Pos;
        this.y2Pos = y2Pos;
        this.length = (int)calculateLength();
    }

    private double calculateLength(){
        double calculation = Math.sqrt(Math.pow(x2Pos-x1Pos,2)+Math.pow(y2Pos-y1Pos,2));
        return calculation;
    }

    public int getX1Pos() {
        return x1Pos;
    }

    public int getY1Pos() {
        return y1Pos;
    }

    public int getX2Pos() {
        return x2Pos;
    }

    public int getY2Pos() {
        return y2Pos;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "Line{" +
                "x1Pos=" + x1Pos +
                ", y1Pos=" + y1Pos +
                ", x2Pos=" + x2Pos +
                ", y2Pos=" + y2Pos +
                ", length=" + length +
                '}';
    }
}
