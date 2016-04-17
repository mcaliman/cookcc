---
title: Input Encoding Detection
keywords: CookCC
---
## Detection Methods ##
Encoding detection is mostly a guess work.

* [BOM](https://en.wikipedia.org/wiki/Byte_order_mark) is obviously the most useful in detecting the input incoding stream.
* [XML](http://www.w3.org/TR/REC-xml/#charencoding) has encoding declaration.
* [HTML](http://www.w3.org/TR/html5/syntax.html#encoding-sniffing-algorithm) has an encoding sniffing algorithm.

## Java Libraries ##

* [juniversalchardet](https://code.google.com/p/juniversalchardet/)
* [jChardet](http://jchardet.sourceforge.net/)
* [cpdetector](http://cpdetector.sourceforge.net/)
* [ICU4J](http://userguide.icu-project.org/conversion/detection)
* [Apache Tika](http://tika.apache.org/) - uses a combination of above libraries.
