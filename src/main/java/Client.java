public class Client {
    public static void main(String[]args){
        ConcretOperationCreator concretOperationCreator = new ConcretOperationCreator();
        AritmeticOperation addition = concretOperationCreator.createOperation("Addition");
        System.out.println("El resultado de sumar 6+2 ="+addition.calculate(6, 2));
        AritmeticOperation substraction = concretOperationCreator.createOperation("Subtraction");
        System.out.println("El resultado de sumar 6+2 ="+substraction.calculate(6, 2));
    }
}
