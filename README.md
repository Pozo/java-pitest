## What is it?

An experimental mutation testing with [pitest](http://pitest.org/)

#### Usage
The mutation coverage goal analyses all classes in the codebase that match the target tests and target classes filters.
It can be run directly from the commandline

    mvn org.pitest:pitest-maven:mutationCoverage

This will output an html report to target/pit-reports/YYYYMMDDHHMI.

#### Highlighted version of basic concepts
https://www.highly.co/hl/bVn27e2z4jY0rd