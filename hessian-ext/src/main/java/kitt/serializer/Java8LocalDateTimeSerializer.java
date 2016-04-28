package kitt.serializer;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
//import org.joda.time.LocalDateTime;

/**
 * Serializes LocalDateTime objects in the Joda Time API.
 *
 */
public class Java8LocalDateTimeSerializer extends AbstractJodaSerializer {

    @Override
    protected String jodaObjectToString(Object obj) {
        return ((LocalDateTime) obj).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
    }
}