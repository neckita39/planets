package ru.planets;

public enum Planet {
    MERCURY(87.969, 47.36, 3.1), VENUS(224.701, 35.02, 7.328), EARTH(365.25, 29.783, 7.91),
    MARS(686.98, 24.13, 3.55), JUPITER(4332.589, 13.07, 42.58), SATURN(10759.22, 9.69, 25.535),
    URANUS(30685.4, 6.81, 15606.0), NEPTUNE(60190.03, 5.4349, 16970.56);
    private double period;
    private double orbitalSpeed;
    private double firstSpaceSpeed;
    Planet(double x, double y, double z){
        period=x;
        orbitalSpeed=y;
        firstSpaceSpeed=z;
    }
    public void getInfo(){
        System.out.println("Период: "+period +" земных суток; "+ '\n'+"Орбитальная скорость: "+orbitalSpeed
        +" км/с"+'\n'+"Первая космическая скорость: "+firstSpaceSpeed+" км/с");;
    }

}
