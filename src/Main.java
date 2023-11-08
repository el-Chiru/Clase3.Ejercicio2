import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> nombres = Arrays.asList("Gabriel", "PABLO", "Cesar", "Claudia", "Eduardo", "Ariel");
        List<String> nombreCorto = nombres.stream()
                .mapToLong(() > 5)
                .collect(Collectors.joining(": "));
                  }
    }
