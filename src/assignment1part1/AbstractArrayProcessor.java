/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1part1;
import java.util.Arrays;

/**
 *
 * @author darklord
 */
public abstract class AbstractArrayProcessor implements ArrayProcessor {

    private String name;
    private String description;
    
    public AbstractArrayProcessor(String name, String description) {
        this.name = name;
        this.description = description;
    }    

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public String example() {
        double[] a = new double[]{10.0, 20.0, 30.0, 40.0, 35.0, 25.0, 45.0, 15.0, 5.0, 22.0,
                                  47.0, 16.0, 28.0, 12.0, 15.0, 27.0, 33.0,  9.1, 3.4, 44.0};
        return "The input array \n" + Arrays.toString(a) + "\n would return \n" + Arrays.toString(execute(a));
    }
    
    public String toString() {
        return this.name + ": " + this.description + "\nFor example:\n" + example();
    }
}
