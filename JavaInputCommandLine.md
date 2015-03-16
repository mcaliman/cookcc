# Java Input Command Line #

CookCC Java input requires to be used with Java APT, which is a tool comes with JDK 1.5+.

The basic command line on Windows is like this

```
apt -nocompile -cp tool\cookcc-0.3.jar;src -s src package\Code.java
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

It is actually far easier simply using the CookCC [Ant task](AntTask.md), which has a lot of things taken cared.