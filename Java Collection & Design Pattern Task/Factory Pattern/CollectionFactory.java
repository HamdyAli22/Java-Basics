import java.lang.reflect.InvocationTargetException;
import java.util.Collection;


public class CollectionFactory {
    public static <T> Collection<T> getCollection(String type){
        Class<?> collection;
        try {
            collection = Class.forName(type);
            try {
                return  (Collection<T>)collection.getDeclaredConstructor().newInstance();
            } catch (InstantiationException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e);
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
