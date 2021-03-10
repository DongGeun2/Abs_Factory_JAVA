package abs_Factory;

public class MAIN {
    public static void main(String args[]){
        FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
        factoryOfComputerFactory.createComputer("Samsung");
    }
}