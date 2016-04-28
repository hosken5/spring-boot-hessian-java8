package kitt.deserializer;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 */
public class Java8LocalDateTimeDeserializer extends AbstractJodaDeserializer {

    @Override
    public Class<?> getType() {
        return LocalDateTime.class;
    }

    @Override
    protected Object stringToJodaObject(String value) {
        return LocalDateTime.parse(value, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}
