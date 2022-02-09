"""Декоратор обычная функция"""


from datetime import datetime


def decorator(func):
    def decorated(*args, **kwargs):
        print('before')
        func(*args, **kwargs)
        print('after')
    return decorated


def sumfunc(a, b):
    print(a + b)


print('первый вариант использования')
s = decorator(sumfunc)
s(1, 3)

print('\nвторой вариант использования')


@decorator
def sumfunc1(a, b):
    print(a+b)


sumfunc1(5, 6)

print('\nМожно и несколько')


def time_now(func):
    def dec(*args, **kwargs):
        print(f'задача стартовала: {datetime.now()}')
        func(*args, **kwargs)
        print(f'задача выполнена: {datetime.now()}')
    return dec


@time_now
@decorator
def sumfunc1(a, b):
    print(a+b)


sumfunc1(5, 6)
