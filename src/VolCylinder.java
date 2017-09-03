/**GNU GENERAL PUBLIC LICENSE
 Version 3, 29 June 2007
 Copyright (C) 2014  Author Akeem Prince Olass.
 Everyone is permitted to copy and distribute verbatim copies
 of this license document, but changing it is not allowed.
 *
 */


import   java.util.Scanner;
/** The class computes the volume of a cylinder*/
public class VolCylinder {
            public static float vol (float x, float y){
                /**computes area of a cylinder and
                 * uses the result to compute the volume of a cylinder. Displays result*/
                final float PI = 22/7;
                float area = x*x * PI;
                float volume = area * y;
                System.out.println("The area is " + area + "\n The " + "volume is " + volume);
                return volume;
            };

    public static void main(String[] args){
        /** Prompts user to enter radius and height*/
            Scanner input = new Scanner(System.in);

            System.out.println("Please enter the radius the cylinder " );
            float  radius = input.nextFloat();
            System.out.println("Please enter the height of the cylinder " );
            float  height = input.nextFloat();
            /** Calls the vol() with args radius and height*/
            vol(radius, height);
    };
};
