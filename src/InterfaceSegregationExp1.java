
/**
 *SOLID Principles
 * SOLID is an acronym for the first five object-oriented design (ODD)
 * principles by Robert C. Martin
 *-----
 * S ->
 * O ->
 * L ->
 * I -> Interface Segregation Principle -
 *              A client should never be forced to implement an interface that it does not use.
 * D ->
 */

public class InterfaceSegregationExp1 {
    public static void main(String[] args) {

    }
}

interface VegRestaurant{
    void vegMeals();
}
interface NonVegRestaurant{
    void nonVegMeals();
}

class ABCVegRestaurant implements VegRestaurant{

    @Override
    public void vegMeals() {
        System.out.println("Veg meals available...");
    }
}
class XYZNonVegRestaurant implements NonVegRestaurant{

    @Override
    public void nonVegMeals() {
        System.out.println("Non Veg meals available...");
    }
}
