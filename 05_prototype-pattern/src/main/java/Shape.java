/**
 * @author oszhugc
 * @Date 2019\4\13 0013 16:40
 **/
public abstract class Shape implements Cloneable{

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public Object clone(){
        Object clone = null;
        try {
            clone = super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return clone;
    }

}
