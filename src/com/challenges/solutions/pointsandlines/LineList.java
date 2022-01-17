package com.challenges.solutions.pointsandlines;

import java.util.Vector;

public class LineList implements LineListInterface{
    Vector<Line> listOfLines;

    public LineList(Vector<Line> listOfLines) {
        this.listOfLines = listOfLines;
    }

    @Override
    public Line getLineWithMaxLength() {
        Line longestLine = listOfLines.get(0);
        for (Line currentLine : listOfLines) {
            if (currentLine.getLength() > longestLine.getLength()) {
                longestLine = currentLine;
            }
        }
        System.out.println(longestLine);
        return longestLine;
    }

    @Override
    public Vector<Line> getLinesStartingFromPoint(Point p) {
        Vector<Line> linesFromPointP = new Vector<>();
        for(Line currentLine : listOfLines){
            if(currentLine.getX1Pos()==p.getxPos()&&currentLine.getY1Pos()==p.getyPos()){
                linesFromPointP.add(currentLine);
            }
        }
        System.out.println(linesFromPointP);
        return linesFromPointP;
    }
}
