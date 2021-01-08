public class ObjectPool {

    private final int MAX_OBJECTS = 10;
    private final int MIN_OBJECTS = 0;
    private final int SLOT = 1;

    private static Object[] objects;

    private static ObjectPool single_instance = null;

    public ObjectPool() {
        if(single_instance != null) {
            return;
        }

        objects = new Object[MAX_OBJECTS];
        single_instance = this;
    }

    public ObjectPool getInstance()
    {
        if (single_instance == null) {
            single_instance = this;
        }

        return single_instance;
    }

    public void adquire(Object obj, int index) {
       if (objects.length < this.MAX_OBJECTS) {
           objects[index] = obj;
       }
       else
       {
           objects[index] = obj;
       }
    }

    public Object dispose(int index) {
        if (index < this.MIN_OBJECTS ||
                index >= this.MAX_OBJECTS - this.SLOT) {
            return null;
        }

        Object obj = objects[index];
        objects[index - this.SLOT] = null;
        return obj;
    }

    public static void main(String[] args) {
        ObjectPool pool = new ObjectPool();
        pool.getInstance().adquire(new String("Leandro"),
                                                1);

        System.out.println(pool.getInstance()
                               .dispose(1));
    }
}
