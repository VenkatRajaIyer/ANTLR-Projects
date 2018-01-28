// Generated from CSV.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.ParserRuleContext;

public class CSVBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CSVVisitor<T> {
	@Override public T visitText(CSVParser.TextContext ctx) { return visitChildren(ctx); }

	@Override public T visitHdr(CSVParser.HdrContext ctx) { return visitChildren(ctx); }

	@Override public T visitFile(CSVParser.FileContext ctx) { return visitChildren(ctx); }

	@Override public T visitString(CSVParser.StringContext ctx) { return visitChildren(ctx); }

	@Override public T visitEmpty(CSVParser.EmptyContext ctx) { return visitChildren(ctx); }

	@Override public T visitRow(CSVParser.RowContext ctx) { return visitChildren(ctx); }
}