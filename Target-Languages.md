---
title: Target Languages
keywords: CookCC
---
CookCC is written in Java to take the advantage of numerous tools available, such as the string template engine [FreeMarker](http://freemarker.org/), that makes it very easy to add new target languages.

Currently, the following languages are currently supported.

| **Language** | **Description** |
|:-------------|:----------------|
| **Java** | This is the main language output. |
| [Plain](Target-Language-Plain.html) | This is a simple text format that produces computed tables in CSV format. |
| [XML](Target-Language-XML.html) | This is a debugging only output format that dumps the internal tree representation of the user input. |
| [Yacc](Target-Language-Yacc.html) | This is a debugging only output format that dumps the parser grammar to Yacc format. |
