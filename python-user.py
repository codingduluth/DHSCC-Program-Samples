

# Greet the user
print("Hello! Welcome to Python programming!")

# Ask the user for their name
name = input("What's your name? ")

# Ask the user for their age
age = int(input(f"Nice to meet you, {name}! How old are you? "))

# Calculate the user's age in 10 years
future_age = age + 10
print(f"In 10 years, you will be {future_age} years old!")

# Conditional: Give a different message based on their current age
if age < 18:
    print("You have so much time to learn and grow!")
else:
    print("It's never too late to start learning something new!")

# Loop: Print a motivational message
for i in range(3):
    print(f"{i+1}. Keep coding and never give up, {name}!")

# Function: Create a custom message for the user
def custom_message(user_name):
    return f"{user_name}, Python is a powerful tool that can help you achieve great things!"

# Call the function and print the custom message
print(custom_message(name))
