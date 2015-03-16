# CookCC Documentation #

CookCC is a [lexer](http://en.wikipedia.org/wiki/Lexical_analysis) and [parser](http://en.wikipedia.org/wiki/Parsing) ([LALR (1)](http://en.wikipedia.org/wiki/LALR_parser)) generator project, combined.  It is written in Java, but the [target languages](TargetLanguages.md) can vary.  It uses a template approach to generate source codes, so it is quite easy to add a new target language.  CookCC also comes with a suite of [test cases](http://code.google.com/p/cookcc/source/browse/trunk/tests/) to assist creating and testing new target languages.

A unique feature of CookCC is allowing lexer/parser to be [specified using Java annotation](JavaInput.md). This feature greatly simplifies and eases the writing of lexer and parser for Java.

CookCC requires JRE 1.5+ to run, although the generated Java code can be compiled by earlier versions of JDK.

## Command Line Options ##

| `-help` | Display available command line options. |
|:--------|:----------------------------------------|
| `-lang <language>` | Select the output language.  Default is java.  |
| `-quiet` | Suppress console messages. |
| `-debug` | Generate debugging code.  The effect depends on the target language code generator. |
| `-analysis` | Generate an [analysis file](http://code.google.com/p/cookcc/source/browse/trunk/tests/java/parser/calc/cookcc_parser_analysis.txt) for the parser grammar.  The file name is fixed to `cookcc_parser_analysis.txt`. |
| `-defaultreduce` | Generate a compact parser table (for compressed table format) by assuming that entries would be reduced by default, even in cases of unwanted look ahead.  |
| `-lexertable <format>` | Select lexer DFA table format.  Available choices are `ecs`, `full`, and `compressed`.  This option will override the table choice specified in the input file.  The default choice is `ecs`. |
| `-parsertable <format>` | Select parser DFA table format.  Available choices are `ecs`, and `compressed`.  This option will override the table choice specified in the input file.  The default choice is `ecs`. |

Language specific options can be found by specifying the language along with `-help`.  For example:

`cookcc -help -lang java`