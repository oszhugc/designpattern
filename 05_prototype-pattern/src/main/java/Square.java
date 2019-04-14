/**
 * @author oszhugc
 * @Date 2019\4\13 0013 16:44
 **/
public class Square extends Shape {

    public Square(){
        type = "square";
    }

    @Override
    void draw() {
        System.out.println("inside square::draw method");
    }
}
