package SolarSystemProject;

import sun.security.provider.Sun;

public class Main {
    public static void main(String[] args) {
        solarSystem inception = new solarSystem();
        inception.sun = 1;
        inception.moon = 4;
        inception.planets = 2;

        System.out.println("the basic structure is ready");

        // developing the feature SUN

        SUN omaro = new SUN();
        omaro.temperature = "12334433kj";
        omaro.name = "ferro";
        omaro.radius = 1234455;
        omaro.color = "pink";

        //developing planet1

        Planet1 superplanet=new Planet1();
        superplanet.color="magenta";
        superplanet.name="hash";
        superplanet.size="545488km";

    }
}