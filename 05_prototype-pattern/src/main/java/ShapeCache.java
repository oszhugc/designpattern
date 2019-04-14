import java.util.HashMap;

/**
 * @author oszhugc
 * @Date 2019\4\13 0013 16:45
 **/
public class ShapeCache {

    private static HashMap<String,Shape> shapeMap
            = new HashMap<String, Shape>();

    public static Shape getShape(String shapeId){
        Shape cacheShape = shapeMap.get(shapeId);
        return (Shape) cacheShape.clone();
    }

    public static void loadCache(){
        Square square = new Square();
        square.setId("1");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(),rectangle);
    }

}
