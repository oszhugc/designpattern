/**
 * @author oszhugc
 * @Date 2019\4\13 0013 16:43
 **/
public class Rectangle extends Shape {

    public Rectangle(){
        type = "rectangle";
    }

    @Override
    void draw() {
        System.out.println("inside rectanble::draw() method");
    }
}
