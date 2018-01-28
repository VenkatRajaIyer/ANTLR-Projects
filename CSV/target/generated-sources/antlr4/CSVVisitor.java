// Generated from CSV.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface CSVVisitor<T> extends ParseTreeVisitor<T> {
	T visitText(CSVParser.TextContext ctx);

	T visitHdr(CSVParser.HdrContext ctx);

	T visitFile(CSVParser.FileContext ctx);

	T visitString(CSVParser.StringContext ctx);

	T visitEmpty(CSVParser.EmptyContext ctx);

	T visitRow(CSVParser.RowContext ctx);
}