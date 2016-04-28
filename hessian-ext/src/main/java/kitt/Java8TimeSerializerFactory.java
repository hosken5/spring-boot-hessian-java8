package kitt;


import com.caucho.hessian.io.AbstractSerializerFactory;
import com.caucho.hessian.io.Deserializer;
import com.caucho.hessian.io.HessianProtocolException;
import com.caucho.hessian.io.Serializer;
import kitt.deserializer.Java8LocalDateDeserializer;
import kitt.deserializer.Java8LocalDateTimeDeserializer;
import kitt.serializer.Java8LocalDateSerializer;
import kitt.serializer.Java8LocalDateTimeSerializer;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/*

 */
@SuppressWarnings("unchecked")
public class Java8TimeSerializerFactory extends AbstractSerializerFactory {
    private static final Map<Class<?>, Serializer> Serializers = new HashMap<Class<?>, Serializer>();
    private static final Map<Class<?>, Deserializer> Deserializers = new HashMap<Class<?>, Deserializer>();

    static {
        Serializers.put(LocalDateTime.class, new Java8LocalDateTimeSerializer());
        Deserializers.put(LocalDateTime.class, new Java8LocalDateTimeDeserializer());
        Serializers.put(LocalDate.class, new Java8LocalDateSerializer());
        Deserializers.put(LocalDate.class, new Java8LocalDateDeserializer());
    }

    @Override
    public Serializer getSerializer(final Class a_class) throws HessianProtocolException {
        return Serializers.get(a_class);
    }

    @Override
    public Deserializer getDeserializer(final Class a_class) throws HessianProtocolException {
        return Deserializers.get(a_class);
    }
}