package kitt.serializer;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
//import org.joda.time.LocalDateTime;

/**
 * Serializes LocalDateTime objects in the Joda Time API.
 *
 */
public class Java8LocalDateSerializer extends AbstractJodaSerializer {

    @Override
    protected String jodaObjectToString(Object obj) {
        return ((LocalDate) obj).format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
    }
}