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


        planetX1 fr=new planetX1();
        fr.color="red";
        fr.radius="23232323";
        fr.size="23232km";

        PlanetX2 pp=new PlanetX2();
        pp.color="pink";
        pp.radius="39i4394km";
        pp.size="343434";

    }
}