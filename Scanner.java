import java.util.ArrayList;
import java.util.List;

public class Scanner {
    private final String source;
    private final List<Token> tokens = new ArrayList<Token>();
    private final int start = 0;
    private final int current = 0;
    private final int line = 1;

    public Scanner(String source) {
        this.source = source;
    }

    List<Token> scanTokens() {
        // while (!isAtEnd()) {
        //     start = current;
        //     scanToken();
        // }

        // tokens.add(new Token(TokenType.EOF, "", null, line));
        return tokens;
    }

    
}
