package tisdaleproject2;
/******************************************************
***  Class Name: Car
***  Class Author: Chris Tisdale 
******************************************************
*** Purpose of the class:
*** This class contains attributes for the car as well as some methods.
*** The methods allow for the attributes to be set and retrieved.
*** It also contains a constructor as well as accelerate and brake methods.
****************************************************** 
*** September 19, 2017
******************************************************
*** August 30:      Reviewed assignment and created design for my program and
***                 implemented with pseudocode.
*** August 31:      Created TisdaleProject2, CarCreaterGui and Car classes.
***                 Tested the input and verified the output of the program, as well as error catching.
*** September 7:    Added comments and final testing.
******************************************************
***  
*******************************************************/
import java.awt.Color;

public final class Car {

    private String make;
    private String model;
    private Color color;
    private int speed = 0; //default speed

/*****************************************************
*** Constructor: Car
*** Author: Chris Tisdale
******************************************************
*** Purpose: Creates Car object with passed arguments.
***             Throws IllegalArgumentException if any of the parameters are null.
*** Constructor parameters: String make, String model, Color color.
*** Return value: none
******************************************************
*** Date: August 31
******************************************************/
    Car(String make, String model, Color color) throws Exception {
        setMake(make);
        setModel(model);
        setColor(color);
        
        if (this.make == null) {
            throw new IllegalArgumentException("Make must be a string of at least two characters.");
        }
        if (this.model == null) {
            throw new IllegalArgumentException("Model must be a string of at least two characters.");
        }
        if (this.color == null) {
            throw new IllegalArgumentException("Select a color from the drop down menu.");
        }        
    }

/*****************************************************
*** Method Name: getMake
*** Author: Chris Tisdale
******************************************************
*** Purpose of the Method: get make string for the car
*** Method parameters: none
*** Return value: String
******************************************************
*** Date: August 31
******************************************************/
    String getMake() {
        return make;
    }

/*****************************************************
*** Method Name: setMake
*** Author: Chris Tisdale
******************************************************
*** Purpose of the Method: set make string for the car
***                         if it is greater than one char long.
*** Method parameters: String make
*** Return value: none
******************************************************
*** Date: August 31
******************************************************/
    void setMake(String make) {
        if (make.length() > 1) {
            this.make = make;
        }
    }

/*****************************************************
*** Method Name: getModel
*** Author: Chris Tisdale
******************************************************
*** Purpose of the Method: get model string for the car
*** Method parameters: none
*** Return value: String
******************************************************
*** Date: August 31
******************************************************/
    String getModel() {
        return model;
    }

/*****************************************************
*** Method Name: setModel
*** Author: Chris Tisdale
******************************************************
*** Purpose of the Method: set model string for the car
***                         if it is greater than one char long.
*** Method parameters: String model
*** Return value: none
******************************************************
*** Date: August 31
******************************************************/
    void setModel(String model) {
        if (model.length() > 1) {
            this.model = model;
        }
    }

/*****************************************************
*** Method Name: getColor
*** Author: Chris Tisdale
******************************************************
*** Purpose of the Method: get java color class RGB value for the car
*** Method parameters: none
*** Return value: Color
******************************************************
*** Date: August 31
******************************************************/
    Color getColor() {
        return color;
    }

/*****************************************************
*** Method Name: setColor
*** Author: Chris Tisdale
******************************************************
*** Purpose of the Method: set color for the car
***                         using java Color class.
*** Method parameters: Color myColor
*** Return value: none
******************************************************
*** Date: August 31
******************************************************/
    void setColor(Color color) {
        this.color = color;
    }

/*****************************************************
*** Method Name: getSpeed
*** Author: Chris Tisdale
******************************************************
*** Purpose of the Method: get speed as int for the car
*** Method parameters: none
*** Return value: int
******************************************************
*** Date: August 31
******************************************************/
    int getSpeed() {
        return speed;
    }

/*****************************************************
*** Method Name: accelerate
*** Author: Chris Tisdale
******************************************************
*** Purpose of the Method: increments speed of car by 5.
*** Method parameters: none
*** Return value: none
******************************************************
*** Date: August 31
******************************************************/
    void accelerate() {
        speed += 5;
    }

/*****************************************************
*** Method Name: brake
*** Author: Chris Tisdale
******************************************************
*** Purpose of the Method: decrements speed of car by 5.
***                         If it would be below 0, sets to 0.
*** Method parameters: none
*** Return value: none
******************************************************
*** Date: August 31
******************************************************/
    void brake() {
        speed -= 5;
        
        if (speed < 0) {
            speed = 0;
        }
    }
}
