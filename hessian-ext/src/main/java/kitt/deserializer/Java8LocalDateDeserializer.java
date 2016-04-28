package kitt.deserializer;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


/**
 *
 */
public class Java8LocalDateDeserializer extends AbstractJodaDeserializer {

    @Override
    public Class<?> getType() {
        return LocalDateTime.class;
    }

    @Override
    protected Object stringToJodaObject(String value) {
        return LocalDate.parse(value, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}
