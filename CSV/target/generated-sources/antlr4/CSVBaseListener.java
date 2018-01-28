// Generated from CSV.g4 by ANTLR 4.0

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class CSVBaseListener implements CSVListener {
	@Override public void enterText(CSVParser.TextContext ctx) { }
	@Override public void exitText(CSVParser.TextContext ctx) { }

	@Override public void enterHdr(CSVParser.HdrContext ctx) { }
	@Override public void exitHdr(CSVParser.HdrContext ctx) { }

	@Override public void enterFile(CSVParser.FileContext ctx) { }
	@Override public void exitFile(CSVParser.FileContext ctx) { }

	@Override public void enterString(CSVParser.StringContext ctx) { }
	@Override public void exitString(CSVParser.StringContext ctx) { }

	@Override public void enterEmpty(CSVParser.EmptyContext ctx) { }
	@Override public void exitEmpty(CSVParser.EmptyContext ctx) { }

	@Override public void enterRow(CSVParser.RowContext ctx) { }
	@Override public void exitRow(CSVParser.RowContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}