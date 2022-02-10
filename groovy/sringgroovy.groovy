#!/usr/bin/env groovy

def text = 'Welcome to Groovy'

assert text as java.lang.String

def lang = 'Groovy'
text = "Welcome to ${lang}"
assert text as groovy.lang.GString

def text_multiline = '''\n-----------------
Welcome to Groovy
-----------------
'''
def fmt = "${'-'*17}"
assert fmt.size() && fmt.length() == 17
assert fmt.substring(0, 4) == '----'
assert text.contains('Welcome')
assert fmt.count('-') == 17
assert text.isNumber() == false

def text_g_multiline = """\n${fmt}
Welcome to ${lang}\n${fmt}
"""
text_g_multiline += '''Groovy is an object oriented language which is based on Java platform.
Groovy 1.0 was released in January 2, 2007 with Groovy 2.4 as the current major release.
Groovy is distributed via the Apache License v 2.0.
In this tutorial, we would explain all the fundamentals of Groovy and how to put it into practice.
'''

print(text_multiline)
print(text_g_multiline)
text += '\nthe end'
println text.reverse()
println fmt
print(text.replace('the', 'flap'))

//regex

def pattern = /abc/
assert pattern == 'abc'

pattern = /\s\d/
assert pattern == '\\s\\d'

pattern = /\b\d\.\d\b/

def matched = []
text_g_multiline.eachMatch(pattern) { match -> matched += match }
println matched
