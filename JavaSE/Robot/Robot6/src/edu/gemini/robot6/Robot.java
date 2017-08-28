package edu.gemini.robot6;

import edu.gemini.robot6.exception.RobotException;

public interface Robot {

    public void forward(int distance) throws RobotException;
    public void turnLeft(int angle) throws RobotException;
    public void turnRight(int angle) throws RobotException;
}
