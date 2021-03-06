#!/usr/bin/python
"""
Truncatable primes
https://projecteuler.net/problem=37
"""


def ispalindrome(n):
    return n == n[::-1]


def int2bin(n):
    return "{0:b}".format(n)


def main():
    total = 0
    for i in range(1000000):
        if ispalindrome(str(i)) and ispalindrome(str(int2bin(i))):
            total = total + i
    print(total)


if __name__ == "__main__":
    main()
