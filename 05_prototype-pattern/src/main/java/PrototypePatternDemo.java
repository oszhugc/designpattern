/**
 * @author oszhugc
 * @Date 2019\4\13 0013 16:50
 **/
public class PrototypePatternDemo {

    public static void main(String[] args) {
        ShapeCache.loadCache();


        System.out.println(ShapeCache.getShape("1").getType());
        System.out.println(ShapeCache.getShape("2").getType());
    }
}
