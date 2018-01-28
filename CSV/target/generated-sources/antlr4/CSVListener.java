// Generated from CSV.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface CSVListener extends ParseTreeListener {
	void enterText(CSVParser.TextContext ctx);
	void exitText(CSVParser.TextContext ctx);

	void enterHdr(CSVParser.HdrContext ctx);
	void exitHdr(CSVParser.HdrContext ctx);

	void enterFile(CSVParser.FileContext ctx);
	void exitFile(CSVParser.FileContext ctx);

	void enterString(CSVParser.StringContext ctx);
	void exitString(CSVParser.StringContext ctx);

	void enterEmpty(CSVParser.EmptyContext ctx);
	void exitEmpty(CSVParser.EmptyContext ctx);

	void enterRow(CSVParser.RowContext ctx);
	void exitRow(CSVParser.RowContext ctx);
}