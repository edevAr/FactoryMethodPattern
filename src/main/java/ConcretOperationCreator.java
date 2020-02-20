public class ConcretOperationCreator extends CreatorOperation {
    public AritmeticOperation createOperation(String type) {
        switch (type){
            case "Addition":
                return new Addition();
            case "Subtraction":
                return new Subtraction();
            default:
                return null;
        }
    }
}
