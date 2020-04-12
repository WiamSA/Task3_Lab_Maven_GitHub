import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class Class1 {

    public static void main(String[] args) {

        Pair<String, String> pair = new ImmutablePair<String, String>( "Hello" , "World" );
        System. out .println(pair.getKey() + " " + pair.getValue());

    }

}
