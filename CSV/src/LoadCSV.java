import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.tree.ParseTreeWalker;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.Loader;


public class LoadCSV extends CSVBaseListener{
	public static final String EMPTY = "";
	List<Map<String, String>> rows = new ArrayList<Map<String, String>>();
	List<String> header;
	List<String> currentRowFieldValues;
	
	public void exitString(CSVParser.StringContext ctx){
		currentRowFieldValues.add(ctx.STRING().getText());
	}
	public void exitText(CSVParser.TextContext ctx){
		currentRowFieldValues.add(ctx.TEXT().getText());
	}
	public void exitEmpty(CSVParser.EmptyContext ctx){
		currentRowFieldValues.add(EMPTY);
	}
	
	public void exitHdr(CSVParser.HdrContext ctx) { 
		header = new ArrayList<String>();
		header.addAll(currentRowFieldValues);
	}
	public void enterRow(CSVParser.RowContext ctx) {
		currentRowFieldValues = new ArrayList<String>();
	}
	public void exitRow(CSVParser.RowContext ctx) { 
		if (ctx.getParent().getRuleIndex() == CSVParser.RULE_hdr)
			return;
		Map<String, String> m = new LinkedHashMap<String, String>();
		int i = 0;
		for (String v: currentRowFieldValues ){
			m.put(header.get(i), v);
			i++;
		}
		rows.add(m);
		}
}

