---
title: CookCC
keywords: CookCC
---
CookCC is a [lexer](http://en.wikipedia.org/wiki/Lexical_analysis) and [parser](http://en.wikipedia.org/wiki/Parsing) ([LALR (1)](http://en.wikipedia.org/wiki/LALR_parser)) generator project, combined.  It is written in Java, but the [target languages](Target-Languages.html) can vary.

CookCC comes with two unique features, which were the original motivations for this work.

* CookCC uses a unique approach of storing and loading DFA tables in Java that significantly reduces the starting up time. Many efforts have been made to maximize the generated Java lexer and parser performances, painstakingly line-by-line, case-by-case fine turning the lexer and parser code. I believe that CookCC is the fastest lexer for Java (see the performance test).
* CookCC allows lexer/parser patterns and rules to be specified using Java annotation. This feature greatly simplifies and eases the writing of lexer and parser for Java.

Other Features

* CookCC can produce highly compressed DFA tables for both the lexer and parser, using the similar compression algorithm found in [Flex](http://flex.sourceforge.net/).
* For the lexer, DFA states constructed were minimal. In contrast, Flex does not construct minimal DFA states.

CookCC requires JRE 1.7+ to run, but the generated Java code can be compiled and run with earlier versions of Java. There are **zero dependencies** for the generated Java code. So it is light and fast.

Note: the BSD license of the project only applies to CookCC itself. The code generated belongs to you.

The current release is 0.3.3 which requires 1.5+ to run.

0.4 has a number of features already implemented and tested.  It requires JDK 1.7+ mainly due to the annotation processing API.  I still have a few things to add before I feel it is a "complete* release.
