import basicAntlr.BasicLexer;
import basicAntlr.BasicParser;
import basicInterpreter.BasicVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        try {
            System.out.print("Podaj nazwę pliku do interpretacji: ");
            Scanner S=new Scanner(System.in);
            String filename=S.nextLine();
            System.out.print("\n\n");
            CharStream input = CharStreams.fromFileName(filename);
            BasicLexer lexer = new BasicLexer(input);
            BasicParser parser = new BasicParser(new CommonTokenStream(lexer));
            ParseTree tree = parser.program();
            BasicVisitor visitor = new BasicVisitor();
            visitor.visit(tree);
        } catch (IOException ex) {
            Logger.getLogger(BasicVisitor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
