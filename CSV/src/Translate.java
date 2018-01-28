import java.io.IOException;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.*;


public class Translate {
	
	public static void main(String[] args) throws IOException {
		ANTLRInputStream input = new ANTLRInputStream(System.in);
		CSVLexer lexer = new CSVLexer(input);
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		CSVParser parser = new CSVParser(tokens);
		ParseTree tree = parser.file();
		
		
		ParseTreeWalker walker = new ParseTreeWalker();
		LoadCSV loader = new LoadCSV();
		walker.walk(loader, tree);
		System.out.println(loader.rows);
		}

}
