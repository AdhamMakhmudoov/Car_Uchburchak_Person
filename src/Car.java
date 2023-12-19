public class Car {
    String color;
    String model;
    float price;
    String autoMech;

    @Override
    public String toString() {
        return " color=" + color + '\n' +
                " model=" + model + '\n' +
                " price=" + price +'\n'+
                " autoMech=" + autoMech ;
    }
}
