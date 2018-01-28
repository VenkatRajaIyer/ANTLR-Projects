# ANTLR-Projects
**Compiler Design - Language Recognision and translation using ANTLR4**
This is an Application that can be used to translate *CSV input into a JSON input*. The Project makes used of ANTLR4 Jar and is written in Java. It uses the Listner approach to parse and translate the CSV structured input.

The initial step of developing a new language or interpreting a langauge is by creating what we call, a grammar file. A grammar file consists of a set of rules that define the syntax for the language. The CSV.g4 file provided has all the rules for a CSV file defined in it.
The rules specify what each row is composed of, and distincts itsef from a header row.

The Application code is written in Java. The LoadCSV.java file scans and adds all the row field values into the list of hash maps.
The file Translate.java has the main() which takes the input from the console and passes the input throough a scanner, generates tokens
and parse tree and finally walks the parse tree.

On running the application, the CSV input provided in the console is converted to JSON format.

Sample CSV Input:
  ```
  Details,Month,Amount
  Mid bonus,June,"$2000"
  ,January ,"Zippo"
  Total Bonuses,"","$5000"
  ```

JSON Output:

  ```
  [{Details=Mid bonus, Month=June, Amount="$2000"}, {Details=, Month=January , Amount="Zippo"}, 
  {Details=Total Bonuses, Month="", Amount="$5000"}]
  ```

