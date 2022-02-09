def mymap = ['a':'aaa']
assert mymap.size() == 1

def map = ['name':'Bashar','age':25, 'skill':['Java','Groovy']]
map['state'] = 'AZ'
map += ['city':'Moscow']

map.each {it -> println "${it.key}: ${it.value}"}