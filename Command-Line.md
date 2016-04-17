---
title: "Command Line Execution"
keywords: CookCC
---
CookCC jar can be directly executed.  The general usage is the following.

```bash
java -jar cookcc.jar [options] [files]
```

## Command Line Options ##

| Option | Description |
|:--------|:----------------------------------------|
| `-help` | Display available command line options. |
| `-lang <language>` | Select the output language.  Default is java.  |
| `-quiet` | Suppress console messages. |
| `-debug` | Generate debugging code.  The effect depends on the target language code generator. |
| `-analysis` | Generate an [analysis file](https://github.com/coconut2015/cookcc/blob/master/tests/java/parser/calc/cookcc_parser_analysis.txt) for the parser grammar.  The file name is fixed to `cookcc_parser_analysis.txt`. |
| `-defaultreduce` | Generate a compact parser table (for compressed table format) by assuming that entries would be reduced by default, even in cases of unwanted look ahead.  |
| `-lexertable <format>` | Select lexer DFA table format.  Available choices are `ecs`, `full`, and `compressed`.  This option will override the table choice specified in the input file.  The default choice is `ecs`. |
| `-parsertable <format>` | Select parser DFA table format.  Available choices are `ecs`, and `compressed`.  This option will override the table choice specified in the input file.  The default choice is `ecs`. |

Language specific options can be found by specifying the language along with `-help`.  For example:

```bash
java -jar cookcc.jar -help -lang java
```

## Annotation Processing ##

It is far easier simply using the [Ant task](AntTask.html), which has a lot of things taken cared.  The documentation here is just for people have to run it on command line.

### APT ###
CookCC 0.3 series Java input requires to be used with Java APT, which is a tool that comes with JDK 1.5 and JDK 1.6.

The basic command line execution is like the following.

```bash
apt -nocompile -cp tool/cookcc-0.3.jar:src -s src package/Code.java
```

It is necessary to add CookCC jar file to the class path since it contains CookCC annotation classes, `CookCCByte`, etc.  It also contains the CookCC annotation processing tool.  It is not necessary to specify the CookCC annotation processor factory since this information is embedded in the jar file.

`src` directory in this case should be the source code directory where package\Code.java is located in.  It is necessary to specify this directory both the class path and as the source directory (`-s` option).

Multiple Java files can be specified.  CookCC annotation processor can deal with multiple input files at a time.

To specify CookCC specific options, it requires an approach that serves not to confuse the APT, which has its own set of options.

Examples of specifying CookCC options using APT:

| **CookCC Option** | **Command line using APT** |
|:------------------|:---------------------------|
| `-d src` | -Ad=src |
| `-defaultreduce` | -Adefaultreduce |
| `-lang xml` | -Alang=xml |

### Java Compiler ###

TODO
