import sys

i = 1
while i <= len(sys.argv):
    sys.stdout.write(str(sys.argv[i]+" ").upper())
    i += 1