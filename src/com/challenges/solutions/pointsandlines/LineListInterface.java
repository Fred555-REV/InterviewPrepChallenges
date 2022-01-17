package com.challenges.solutions.pointsandlines;

import java.util.Vector;

public interface LineListInterface {
    //I dont think interfaces can have fields or constructors?
    Line getLineWithMaxLength();//returns the FIRST longest line from the list of lines
    Vector<Line> getLinesStartingFromPoint(Point p);//returns a list of all lines from the given point p
}
