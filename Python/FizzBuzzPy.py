# ================================================
# FizzBuzz Python Edition :D :D :D :D :D
# ================================================

# Set variables for fizz, buzz, and duration
fizzWhen = 3
buzzWhen = 5
fizzBuzzFor = 100

# loop through the duration and find all the fizzes, buzzes, and fizzbuzzes
for i in range(1, fizzBuzzFor + 1):
    if i % buzzWhen == 0 and i % fizzWhen == 0:
        print("FizzBuzz!")
    elif i % fizzWhen == 0:
        print("Fizz")
    elif i % buzzWhen == 0:
        print("Buzz")
    else:
        print(i)
