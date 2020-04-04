package start;

import com.Bus;
import com.Dog;
import com.Human;

public class Main {

    public static void main(String[] args) {

        String station1 = "station 1";
        String station2 = "station 2";
        String station3 = "station 3";
        String station4 = "station 4";
        String station5  = "station 5";

        Human human1 = new Human();
        human1.name = "John";

        Human human2 = new Human();
        human2.name="jack";

        Human human3 = new Human();
        human3.name ="Nick";

        Human human4 = new Human();
        human4.name ="Marry";

        Human human5 = new Human();
        human5.name ="Hulk";

        Dog dog1 = new Dog();

        dog1.name = "Lessi";

        human2.addDog(dog1);


        Bus bus1 = new Bus();
        bus1.number=100;

        bus1.moveFrom(station1);
        bus1.moveTo(station2);

        bus1.stop(station2);
        human1.moveToBus(bus1);

        bus1.moveFrom(station2);
        bus1.moveTo(station3);
        bus1.moveFrom(station3);
        bus1.moveTo(station4);


        bus1.stop(station4);
        human1.movedFromBus(bus1);

        human2.moveToBus(bus1);
        human3.moveToBus(bus1);
        human4.moveToBus(bus1);
        human5.moveToBus(bus1);

        bus1.moveFrom(station4);
        bus1.moveTo(station5);
        bus1.moveFrom(station5);
    }
}
