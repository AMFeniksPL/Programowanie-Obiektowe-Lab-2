package main;






public class World {
    public static void main (String[] args){
        Vector2d position1 = new Vector2d(1,2);
        System.out.println(position1);
        Vector2d position2 = new Vector2d(-2,1);
        System.out.println(position2);
        System.out.println(position1.add(position2));


        MapDirection movement = MapDirection.NORTH;
        System.out.println(movement.next());
        System.out.println(movement.previous());
        System.out.println(movement.toUnitVector());
        System.out.println(movement.previous().toUnitVector());
        System.out.println(movement.previous().previous().toUnitVector());
        System.out.println(movement.previous().previous().previous().toUnitVector());
    }
}
