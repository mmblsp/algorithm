#!/usr/bin/env groovy

file = new File('groovy/readme.md')

file.eachLine { println it }

def getPi() {
    3.14
}

assert getPi() in BigDecimal
assert getPi() == 3.14
