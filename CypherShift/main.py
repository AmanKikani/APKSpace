# Imports functions used for the program
import random
import itertools
import string
import sys
from pathlib import Path
import warnings
import time
warnings.filterwarnings("ignore", category=DeprecationWarning)

# Initializes the only 2 global variables
numMin = 1
a = []


# Function for formatting fies (.txt or other) and making it into a simple array
def formatFile(fileExt):
    # Globalizes the variable "a". At this point a should be an empty array, but just in case it's not I
    # re-initialize "a" to be an empty array
    global a
    a = []
    # Opens the file with the given filename. We know "filename" not only exists but is a valid path from the checking
    # stage of the main function
    with open(fileExt) as file:
        # Iterates through each line of the file
        for line in file:
            # The variable "content" gets the data of "line" assigned to it, then the formatting of line gets
            # removed and saved back to content again
            content = line
            content = content.replace("\n", "")
            # Initializes the iteration variable inside the loop so it doesn't need to be reset with another line
            runner = 0
            while runner < len(content):
                # Iterates through the content string and appends each index to the "a" array
                a.append(content[runner].lower())
                runner += 1


# File Output Function
# This takes in any array and writes its content to the file "output.txt"
def outputFile(arr2):
    # Opens the "output.txt" file and overwrites its content
    f = open("output.txt", "w")

    # Initializes the iteration variable
    runner = 0

    # Iterates through the entire array and writes each character to the file
    while runner < len(arr2):
        f.write(arr2[runner])
        runner += 1

    # Close the file and exit
    f.close()


# Vigenere Encryption/Decryption function
# This is a really cool encryption function that is the brain child of a substitution cipher and a shift cipher
# This function works by taking in a "keyword". Once the function has the keyword, it shifts the inputted strings
# by the ordinance of the index of the keyword it's at. The keyword then loops after it is over to make sure all data
# is properly encrypted
def vigenereEncrypt(choice):
    # Pulls the global "a" array which at this point should contain the file we intend to encrypt and decrypt
    global a

    # Makes "a" array containing all the letters so we not only know if the char we're looking at is in the english
    # alphabet but also to help with character swapping
    letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
               'v', 'w', 'x', 'y', 'z']

    # Makes an empty array to put the encryption of "a" into
    arr2 = []

    # Creates and initializes the iteration variable but also the offset variable. When the keyword loops infinitely, it
    # does not encrypt the spaces so the offset variable is needed to account for the index loss
    runner = 0
    offset = 0
    keyword = ""
    if choice == 'E':
        # Asks the user for a keyword and converts it to a string
        keyword = str(input("Enter keyword: "))
    elif choice == 'D':
        keyword = "a"

    # **ENCRYPTION FUNCTION**
    # This while loop iterates through the entire length of a and encrypts all the data
    while runner < len(a):
        # Uses the python equivalent of a ternary operator to check and decide 3 main things:
        # 1. Is the given character even a letter?
        # 2. What letter is the given character
        # 3. Where does the given character map to via the vigenere cipher

        # From these 3 things, we can decide what we want to do with the letter and what it should be encrypted as. For
        # case number 1 "Is the given character even a letter?", if the character is a letter, it proceeds through the
        # encryption as normal but if it is not a character, it appends a space instead and adds one to the offset to
        # account for such. When it comes to case number 2, we convert the current character in the "a" array to its
        # ordinal equivalent (a = 97...) as well as converting the index of the keyword the encryption is at to its
        # ordinal equivalent as well. Then we add them together and take the modulus of 26 to make sure it's not out of
        # range. Then we take that number and put it as the index of the array for "letters" and append that letter
        # to arr2(d2)
        arr2.append(letters[((ord(keyword[((runner-offset) % (len(keyword)))])-97) + ord(a[runner])-97) % 26]) \
            if a[runner] in letters else arr2.append(" ")
        # If we appended a space, increase offset by one to account for the shift
        if arr2[runner] == " ":
            offset += 1
        # Iterate by one
        runner += 1

    # Once the function has run., print out both the original plaintext and the encrypted ciphertext to show the change
    print(a)
    print(arr2)
    if choice == "D":
        print("Decrypting")

        # This part of the function is the decryption system. It allows the user to enter a test keyword to try and
        # decrypt the recently encrypted plaintext
        keyword = str(input("Enter Test Word: "))

        # Resets and initializes the variables
        runner = 0
        offset = 0

        # Makes a third empty array to put the decrypted text into
        arr3 = []

        # **DECRYPTION FUNCTION**
        # This is the while loop that iterates through the ciphertext and attempts to decrypt it
        while runner < len(arr2):
            # This component also uses another ternary operator for the same purpose of the one above. This entire section
            # works in essentially the same way as above except in reverse. Instead of shifting the text with a word
            # and moving it up the alphabet, we just move it down which, if the test word is correct, will decrypt the
            # ciphertext back into the plaintext.
            arr3.append(letters[((ord(arr2[runner]) - 97) - (ord(keyword[((runner - offset) % (len(keyword)))]) - 97)) %
                                26]) if a[runner] in letters else arr3.append(" ")
            # Adds one to the offset if a space was added
            if arr3[runner] == " ":
                offset += 1
            # Iterates
            runner += 1

        # Prints out the (hopefully) decrypted ciphertext
        print(arr3)
        outputFile(arr3)
    else:
        outputFile(arr2)


# WORK IN PROGRESS
# STILL MODIFYING
def vigenereAutoDecrypt(arr2):
    letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
               'v', 'w', 'x', 'y', 'z']
    keyLen = 2
    keeper = False

    while not keeper:
        offset = 0
        offestCheck = False
        arr3 = []
        runner = 0
        while runner < len(arr2):
            arr3.append(arr2[runner])
            runner = runner + keyLen
        y = 0
        while y < 26:
            x = 0
            while x < len(arr2):
                x = x + offset
                if arr2[x] in letters:
                    z = ord(arr2[x]) - y
                    if z < 97:
                        z = z + 26
                    arr3[x] = chr(z)
                else:
                    arr3[x] = "_"
                x = x + keyLen
            if analyze(arr3, str(y)):
                offset += 1
                offestCheck = False
                keeper = True
                print("Possible key: " + str(chr(y+97)))
                break
            else:
                y = y + 1
        if offestCheck:
            keyLen += 1

    #find keyword length
    #use keyword length for decryption
    #IOC

# Affine Cipher Encryption and Decryption
# This is a fascinating cipher that combines the idea of a hash table as well as the shift cipher. What it does,
# is that it takes two numbers, a mult amount and a move amount. In function the program takes in the first number and
# multiplies it with the ordinance of the plaintext and then moving it horizontally by the shift amount
def affineEncrypt(choice):
    # Globalizes the "a" array and makes it available for modifications
    global a

    # This array is called "allowedKeys", here we store all the values that are coprime to 26, which is faster and
    # pre-processed to save time on startup
    allowedKeys = [1, 3, 5, 7, 9, 11, 15, 17, 19, 21, 23, 25]

    # Creates an array of the valid letters in the english alphabet
    letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
               'v', 'w', 'x', 'y', 'z']
    shiftAmount = 1
    moveAmount = 0
    if choice == "E":
        # Takes in the user input and checks to see if it's an integer. This only allows int values to be inputted
        shiftAmount = int(input("Enter in mult amount here: "))

        # Checks to see if the given input is an integer, if it is then we allow it through, otherwise we keep looping
        # until the user inputs in something valid
        while shiftAmount != int(shiftAmount):
            print("Invalid input type, try again!")
            shiftAmount = input("Enter in mult amount here: ")

        # Here we make it so that the program is able to tell if the inputted shift amount is co prime of 26, if the
        # inputted integer is not coprime of 26, it simply randomly chooses one on its own for simplicity's sake
        if shiftAmount not in allowedKeys:
            print("Invalid choice, choosing random")
            shiftAmount = allowedKeys[random.randint(0, 11)]
            print("New shift amount: " + str(shiftAmount))

        # Asks the user for the "moveAmount" and takes it in as an input
        moveAmount = int(input("Enter in move amount here: "))

        # Checks to see if "moveAmount" is the same as the integer translation of "moveAmount", essentially working
        # to see if the input is only an integer
        while moveAmount != int(moveAmount):
            print("Invalid input, please enter an integer!")
            moveAmount = input("Enter in move amount here: ")
    elif choice == "D" or choice == "A":
        shiftAmount = 1
        moveAmount = 0

    # Initializes an empty array to put the cipher text into
    arr2 = []

    # Creates the iteration variable
    runner = 0

    # **ENCRYPTION FUNCTION**
    # This is a while loop that iterates through the entirety of "a" and continues until the entire cipher text is done
    while runner < len(a):
        # **AFFINE CIPHER**
        # Here we have another "one line function" which completes the entire affine ciphers code in a *single* line
        # by using yet another ternary operator. The way this component works is by taking the integer index of the
        # current position of the array. In more simple terms, it puts a number to the letter we are currently at. Once
        # we have that, we take that number and multiply it by the shift amount and adding the move amount. Finally, we
        # take that number and modulus it by 26, getting only the remainder and staying in range as well. We take that
        # remainder and append onto "arr2" the letter in the "letters" array at the index of the remainder.

        # However, if the current position in the plaintext reveals itself to not be a letter, we don't want to encrypt
        # it and assume it to be a space, appending that to the array instead
        arr2.append(letters[((int(letters.index(a[runner])) * shiftAmount) + moveAmount) % 26]) if a[runner] in letters else arr2.append(" ")

        # Iterate through the array/plaintext
        runner += 1

    # Once the plaintext is properly encrypted, we print out the ciphertext for reference
    print(arr2)
    print("")
    if choice == "D":
        # Here we enter into the manual auto decryption part of the program. Here you
        print("Decrypting")

        # Same thing here as above, simply checking to make sure it's an integer
        shiftAmount = int(input("Enter in mult amount here: "))

        # Instead of having the random function built in here as well, the user is forced to enter a valid decryption key
        while shiftAmount not in allowedKeys:
            print("Invalid")
            shiftAmount = int(input("Enter in mult amount here: "))

        # Asks the user for the move amount as well
        moveAmount = int(input("Enter in move amount here: "))

        # Creates an empty array to use for potential deciphered plaintext
        arr3 = []

        # Creates the iteration variable
        runner = 0

        # This while loop does the opposite of the one above, this one removes the move amount first and then multiplies it
        # by the new shift amount. Then we take the modulus and append the according letter
        while runner < len(arr2):
            arr3.append(letters[((shiftAmount*(letters.index(arr2[runner])-moveAmount)) % 26)])\
                if arr2[runner] in letters else arr3.append(" ")
            runner += 1

        # Prints out the (hopefully) decrypted plaintext
        outputFile(arr3)
        print(arr3)
        print("")
        print("Auto Cracking")
    elif choice == "A":
        # Attempts to auto decrypt the plaintext
        affineAutoDecrypt(arr2)
    else:
        outputFile(arr2)

def affineAutoDecrypt(arr2):
    # Keeper is the boolean variable responsible for running the
    keeper = False
    # This stores all the co-primes of 26 as well as where they should be inverse-wise, not fully implemented
    # right now, but soon it should correlate a bit more
    # allowedKeys = [1, 3, 5, 7, 9, 11, 15, 17, 19, 21, 23, 25]
    allowedKeys = [1, 9, 21, 15, 3, 19, 7, 23, 11, 5, 17, 25]

    # Initializes an array of letter in the english alphabet
    letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
               'v', 'w', 'x', 'y', 'z']

    # Creates 2 new variables, x and y. These two have the main function of running through all possible permutations
    # of what the key could be
    x = 0
    y = 0

    # Creates "arr3" which is used for storing the plaintext
    # arr3 = []

    # Creates the iterative variables
    # shiftAmount = 0
    numTries = 0

    # This while loop will run indefinitely until the keeper variable is turned to true
    while not keeper:
        # This section of the code is built to increment every single combination of the keys, if the "y" (move amount)
        # variable gets to 25, then it gets back to 0 and iterates "x" by one. When "x" gets to 11, it sets itself back
        # to zero
        if y > 25:
            y = 0
            x += 1
        if x > 11:
            x = 0

        # "x" only contains a number 0 to 11, but we need numbers ranging and jumping between 1 and 25. To do this we
        # use the "allowedKeys" array and use "x" as an index instead of as an integer, from this we are now able to
        # convert 1-11 to 1-25
        shiftAmount = allowedKeys[x]
        moveAmount = y

        # Resets the output array before each attempt so that we can append it regardless of what the lenght is
        arr3 = []

        # Resets the iteration variables
        runner = 0

        # Same function as the one found in the decryption of affineEncrypt
        while runner < len(arr2):
            arr3.append(letters[((shiftAmount * (letters.index(arr2[runner]) - moveAmount)) % 26)])\
                if arr2[runner] in letters else arr3.append(" ")
            runner += 1

        # Iterates
        y += 1
        numTries += 1

        # This part is something quite interesting. Here we have the bypass statement. Normally I wouldn't want to have
        # any sort of bypass but in this case when running a frequency analysis, you never know how offset the text is
        # going to be. Because of this, we can calculate the total number of possible permutations (less than 350 total)
        # and then once we go over that amount, we just take the key with the *lowest* offset, otherwise if we are not
        # at 350, it still gives it the full analysis
        if numTries > 350:
            keeper = analyze(arr3, "123TOTALBYPASS123")
            print(arr3)
        else:
            keeper = analyze(arr3, shiftAmount + ((y-1)*.001))
    '''
    print(arr3)
    print("Key = " + str(shiftAmount) + "x + " + str(y-1))
    '''


# **SUBSTITUTION ENCRYPTION/DECRYPTION**
# This is a really interesting cipher tool which is honestly quite strong to use when the text is quite short. The way
# that the cipher works is that it takes in a certain keyword and stores it. We take those letters out of the alphabet
# and puts them at the front (i.e. "bad" makes [a,b,c,d,e,f,g,h,i]  go to -> [b,a,d,c,e,f,g,h,i]). Then once the *new*
# alphabet is made, you remap all of the letters accordingly. While this is really strong in general, it is still very
# vulnerable to frequency analysis and cryptanalysis.
def subEncrypt(choice):
    # Globalizes the array to be used as the plaintext
    global a

    # Creates the array of letters in the english alphabet
    letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
               'v', 'w', 'x', 'y', 'z']

    # Creates a second array to put the new array/alphabet into
    letters2 = []

    # Creates the empty array to put the ciphertext into
    arr2 = []
    keyword = ""
    choice = "E"
    if choice == "E":
        # Asks the user for the keyword for the cipher and take in the input
        keyword = str(input("Enter keyword here: "))
    else:
        keyword = "a"
    # Creates the interative variable
    runner = 0

    # This function takes the letter of the keyword out and takes the according letters out of the "alphabet" too
    while runner < len(keyword):
        if str(keyword[runner]) in letters:
            letters.remove(str(keyword[runner]))
        runner = runner + 1
    runner = 0

    # This function then takes the keyword and adds its letters back into the beginning of the new alphabet while alsp
    # checking the array to make sure theres no doubling of letters
    while runner < len(keyword):
        if keyword[runner] not in letters2:
            letters2.append(keyword[runner])
        runner = runner + 1
    runner = 0

    # Here we finally take the original "letters" array and adding it to the end of the new alphabet array
    # DEV NOTE: Add in double security
    while runner < len(letters):
        letters2.append(letters[runner])
        runner = runner + 1

    # This is the encryption script. Here it takes the current letter in the array and figures out the numerical value
    # of that letter, then once it has that number, it finds the according letter via the *new* alphabet and maps it
    # where needed. Another function of this encryption is that it changes all non letter codes into a "_" character
    runner = 0

    # Runs through the lenght of the array
    while runner < len(a):

        # Checks to see if the currently indexed array is even a letter, if it is then it encrypts, otherwise it
        # appends a space
        if a[runner] in letters2:
            arr2.append(letters2[(ord(a[runner])-97)])
        else:
            arr2.append(' ')
        # Iterates
        runner = runner + 1
    # Prints out the ciphertext
    print(arr2)
    choice = "D"
    if choice == "D":
        # Starts the decryption protocols
        print("Decrypting")

        # Allows the user to enter in a keyword to be used for decryption
        keyword = str(input("Enter in test phrase here: "))
        keyword = keyword.lower()

        # Initializes the arrays used for the alphabet and for making the new alphabet
        letters0 = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
                    'v', 'w', 'x', 'y', 'z']
        letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
                   'v', 'w', 'x', 'y', 'z']
        letters2 = []

        # Makes an empty array to put the (hopefully) decrypted ciphertext
        arr3 = []

        # Creates the iteration variable
        runner = 0

        # Iterates through the keyword and takes each one of the letters out of the old alphabet
        while runner < len(keyword):
            if str(keyword[runner]) in letters:
                letters.remove(str(keyword[runner]))
            # Iterates
            runner = runner + 1

        # Changes to adding the keyword into the second array without doubling up any letters and resets runner
        runner = 0
        while runner < len(keyword):
            if keyword[runner] not in letters2:
                letters2.append(keyword[runner])
            # Iterates
            runner = runner + 1

        # Resets runner to 0 and adds the remaining letters of the alphabet to the new alphabet
        runner = 0
        while runner < len(letters):
            letters2.append(letters[runner])
            # Iterates
            runner = runner + 1

        # This section of the code works to use the new alphabet to try and decrypt the ciphertext, it just works in the
        # same manner as above
        runner = 0
        print(letters0)
        print(letters2)
        while runner < len(arr2):
            if arr2[runner] in letters2:
                arr3.append(letters0[letters2.index(arr2[runner])])
            else:
                # DEV NOTE: append arr2[x]
                arr3.append('_')
            runner = runner + 1

        # Send the file to the output file function
        outputFile(arr3)
        print(arr3)
    elif choice == "A":
        # Work on this a bit more
        '''
        print("Auto Cracking...")
        subAutoDecrypt(arr2)
        '''
    else:
        outputFile(arr2)

# **SHIFT CIPHER**
# This is one of the simplest and easiest to decrypt system. What it simply does is that it moves the letters right or
# left by a certain amount. This is extremely vulnerable to frequency analysis but is even more weak because there are
# only 26 possible combinations of encryption codes so its trivial to decrypt even by hand
def encrypt(choice):
    # Globalizes the array to use as the plaintext
    global a

    # Creates an array used as the english alphabet
    letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
               'v', 'w', 'x', 'y', 'z']

    # Creates the iteration variable
    testRunner = 0

    # Creates the second array to store the plaintext in again so that when we deshift, we can use that to store the
    # attempted decryption without appending
    arr2 = []

    # Iterates through the plaintext and deep copies it to the arr2 array
    while testRunner < len(a):
        arr2.append(a[testRunner])
        # Iterates
        testRunner += 1
    w = 0

    if choice == "E":
        # Asks the user to enter in how much they want to shift by
        w = int(input("Enter in your shift amount: "))
    else:
        w = 0
    # Checks to see if the user has entered in a valid number to shift by, if it does not, then it simply assigns a
    # random number to it.
    # DEV IDEA: Maybe instead of running a random sort of thing, we could just modulus by 26
    # DEV NOTE: Honestly we dont even really need this part of the code, even if we let them run a number higher than
    # 26, if we just change the "if" into a "while" then we wont need to care what the number they inputted was
    if w > 26 or w < 0:
        # Tells the user their input is invalid and assigns a random number to it instead, then prints out the new num
        print("Invalid")
        w = random.randint(0, 25)
        print("New shift amount: " + str(w))
    else:
        print("Shift amount: " + str(w))

    # This works as the encryption function. Here we take all the letters and find their ordinance, then from there
    # we add to that ordinance the shift amount stored in the "w" variable. Then we check to make sure that if it goes
    # over the letter limit, we wrap it back around sliding door style
    x = 0
    print("Encrypting")

    # DEV NOTE: We can def condense this into like a line or two, theres no reason affine can work in a line and this
    # needs like 10
    while x < len(a):
        # Checks to see if the current index is a letter
        if a[x] in letters:
            # Shifts forward by the specified shift amount
            z = ord(a[x]) + w
            # Checks to see if its out of range, if it is then decrease it back around
            # DEV NOTE: This can be a while loop and then it would make it work a lot better, in case anything goes
            # wrong somewhere else in the code, this would fix it
            if z > 122:
                z = z - 26
            # Converts the letter back to a character
            a[x] = chr(z)
        else:
            a[x] = "_"
        # Iterates
        x = x + 1

    # This is part of the auto decryption. I decided to not allow the usage of any test decryption in favor of just auto
    # decrypting it for them
    if choice == "A" or choice == "D":
        print("Decrypting All")
        y = 0
        if choice == "D":
            y = int(input("Enter in your shift amount: "))
            # Runs through all shifts
            x = 0
            # Iterates through the array
            while x < len(a):
                # Checks to see if the letter is in the alphabet
                if a[x] in letters:
                    # De-shifts the letter
                    z = ord(a[x]) - y
                    # Rolls the letter back to the front if it is below the range
                    if z < 97:
                        z = z + 26
                    # Adds it to the array
                    arr2[x] = chr(z)
                else:
                    # If the letter is not a letter, then enter in an underscore
                    arr2[x] = "_"
                # Iterate
                x = x + 1
            outputFile(arr2)
        else:
            # Runs the auto decryption protocol, Here we run through all of the possible combos and runs all of them into a
            # frequency analysis to see which one matches the most
            keeper = False
            while y < 26:
                # Runs through all shifts
                x = 0
                # Iterates through the array
                while x < len(a):
                    # Checks to see if the letter is in the alphabet
                    if a[x] in letters:
                        # De-shifts the letter
                        z = ord(a[x]) - y
                        # Rolls the letter back to the front if it is below the range
                        if z < 97:
                            z = z + 26
                        # Adds it to the array
                        arr2[x] = chr(z)
                    else:
                        # If the letter is not a letter, then enter in an underscore
                        arr2[x] = "_"
                    # Iterate
                    x = x + 1
                # Checks and analyzes the text to see if it matches with the frequency analysis
                if analyze(arr2, str(y)):
                    # If it did match, then print out what the shift number was
                    print("Shift by: " + str(y))
                    # Since we now have the correct output, print out the file to the output.txt
                    outputFile(arr2)
                    # Exit the loop
                    keeper = True
                    # Exit the loop
                    break
                else:
                    # Iterate
                    y = y + 1
            # This functions as a failsafe. For code simplicity sake, I'm using one analysis function for the whole program...
            # Because of this, we do not know how many permutations of the key there can be. Since the total "distance" to the
            # normal may not be under the specified parameter amount we can use the keyword value to specify whether or not
            # we want to manualy choose a value. What were doing here is simple, if weve run through all 26 different shifts and
            # none of them are below the specified parameter amount then we can just send the bypass cade which returns the key
            # with the lowest "distance" to normal
            if not keeper:
                analyze(arr2, "123TOTALBYPASS123")
                print("Bypassing")

# **WIP**
# DEV NOTE: NEED TO ADD BASICALY EVERYTHING
# THIS SHIT BARELY WORKS AND ONLY FOR KEYS OF LIKE 4 OR LESS LETTERS
# IDEAS:
# 1. Word detection: Find words in the text and see if it matches.
# 2. Jitter funtion: This *was* sorta working until I (Aman Kikani) decided to condense like 200 lines into 15 lines
# of code. Basically this would only work if we also got word dectection working. Heres how it would go: First we run
# through the whole text and count up the frequncy of each letter like normal. Since its only a substitution cipher, we
# know that its a one to one and onto relationship with the letters. Its all simply just jumbled up, not really that
# encrypted. Then what we do is sort based on frequency and see how it matches up to
def subAutoDecrypt(arr2):
    print("Decrypting")
    generator = generate_permutations()
    keeper = True
    keyword = ""
    arr3 = []
    while keeper:
        keyword = next(generator)
        letters0 = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                    'u', 'v', 'w', 'x', 'y', 'z']
        letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                   'u', 'v', 'w', 'x', 'y', 'z']
        letters2 = []
        arr3 = []
        runner = 0
        while runner < len(keyword):
            if str(keyword[runner]) in letters:
                letters.remove(str(keyword[runner]))
            runner = runner + 1
        runner = 0
        while runner < len(keyword):
            if keyword[runner] not in letters2:
                letters2.append(keyword[runner])
            runner = runner + 1
        runner = 0
        while runner < len(letters):
            letters2.append(letters[runner])
            runner = runner + 1

        runner = 0
        while runner < len(arr2):
            if arr2[runner] in letters2:
                arr3.append(letters0[letters2.index(arr2[runner])])
            else:
                arr3.append('_')
            runner = runner + 1
        if analyze(arr3, keyword):
            keeper = False
        else:
            keeper = True
    print(keyword)
    print(arr3)

# Code from online, used in the system for making all the possible permutations of letters. I presume that if i were
# to write this code on my own and not using any libraries it would run orders of magnitudes faster but I havent tried
# doing that yet. TLDR idk how it works
def generate_permutations():
    alphabet = string.ascii_lowercase
    length = 1
    while True:
        for permutation in itertools.product(alphabet, repeat=length):
            yield ''.join(permutation)
        length += 1

# ** ANALYSIS FUNCTION**
# This part of the code is quite cool in my opinion. Here what we have going on is a system that takes in whatever text
# is given and computes how close to the normal distribution it is. The way it does this is by simply iterating through
# all the parts of the array and storing only the letter values while keeping count of the non-letter values as well for
# a count offset. Then we find the frequency of each letter compared to the lenght (minus the offset) and then stores
# that in an array. Once we do that, we compare that array to one which already has the predicted frequency and computes
# the total distance between the two. Then, until either a bypass code is put in as the keyword or until the distance
# hits the specified threshold, it keeps iterating through and only breaks once one of those two get put in. It then
# outputs the frequency and the expected frequency
def analyze(arr, keyword):
    # Gloabliazes numMin (Why?? It's only used in here...)
    global numMin

    # Creates an array of the english letters
    letters = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
               'u', 'v', 'w', 'x', 'y', 'z']

    # Creates the iterable variables
    runner = 0

    # Creates the variables to store the count and frequency of all letters as well as the offset counter
    aCount = b = c = d = e = f = g = h = i = j = k = l = m = n = o = p = q = r = s = t = u = v = w = x = y = z = 0
    afreq = bfreq = cfreq = dfreq = efreq = ffreq = gfreq = hfreq = ifreq = jfreq = kfreq = lfreq = mfreq = nfreq = \
        ofreq = pfreq = qfreq = rfreq = sfreq = tfreq = ufreq = vfreq = wfreq = xfreq = yfreq = zfreq = 0
    letters2 = [aCount, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t,
                u, v, w, x, y, z]
    counter = 0

    # Iterates through the array
    while runner < len(arr):
        # Checks to see if the current spot is a letter
        if arr[runner] in letters:
            # Increases the count of that letter
            letters2[letters.index(arr[runner])] += 1
        else:
            # Increases the offset variable
            counter += 1
        # Iterates
        runner += 1
    # Calculates the new length by removing the number on non letter characters from true length
    newLen = len(arr) - counter

    # Creates an array of the frequencies
    lettersort = [afreq, bfreq, cfreq, dfreq, efreq, ffreq, gfreq, hfreq, ifreq, jfreq, kfreq, lfreq, mfreq, nfreq,
                  ofreq, pfreq, qfreq, rfreq, sfreq, tfreq, ufreq, vfreq, wfreq, xfreq, yfreq, zfreq]

    # Resets the iteration variable
    runner = 0

    # Takes the count of the letter, divded by the number of total characters and saves that to the array
    while runner < len(lettersort):
        lettersort[runner] = letters2[runner] / newLen
        runner += 1
    # This used to work until I tried to condense 100-200 lines into about 15. The error is "0 is not in list"
    '''
    ls2 = [afreq, bfreq, cfreq, dfreq, efreq, ffreq, gfreq, hfreq, ifreq, jfreq, kfreq, lfreq, mfreq, nfreq, ofreq,
           pfreq, qfreq, rfreq, sfreq, tfreq, ufreq, vfreq, wfreq, xfreq, yfreq, zfreq]
    ls3 = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
           'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z']
    lfl = ['e', 't', 'a', 'o', 'i', 'n', 's', 'h', 'r', 'd', 'l', 'c', 'u', 'm', 'w',
           'f', 'g', 'y', 'p', 'b', 'v', 'k', 'j', 'x', 'q', 'z']
    
    if str(keyword) == 'a':
        ls2.sort(reverse=True)
        arrIndex = 0
        while arrIndex < len(ls2):
            indexMatch = lfl[arrIndex]
            print(str(indexMatch) + " = " + str(letters2[lettersort.index(ls2[arrIndex])]))
            ls3[ord(indexMatch)-97] = letters2[lettersort.index(ls2[arrIndex])]
            arrIndex += 1
        print(ls3)
    '''

    # This is the expected frequency for each one of the letters in alphabetical order
    trueList = [0.082, 0.015, 0.028, 0.043, 0.127, 0.022, 0.02, 0.06, 0.07,
                0.0015, 0.0077, 0.04, 0.024, 0.067, 0.075, 0.019, 0.00095, 0.06,
                0.063, 0.091, 0.028, 0.0098, 0.024, 0.0015, 0.02, 0.00074]

    # Creates a variable to store the total distance
    num = 0

    # Creates the iteration variable
    x = 0

    # Iterates through each letter and finds the distance between the calculated frequency and the expected frequency.
    # We then take the absolute value and add it to avoid really poor distances being counted as better
    # i.e. let = [1,1,-1,-1] let2 = [.1,.1,.1,.1] trueList = [0,0,0,0]. In this scenario, without the abs(), "let" would
    # be considered to be a better distance than "let2" even though its actually farther away
    while x < 26:
        # Adds to num
        num = num + abs(lettersort[x] - trueList[x])
        # Iterates
        x = x + 1
    # Stores the lowest distance
    if num < numMin:
        # Stores the value
        numMin = num
        # Writes the current best attempt to the terminal
        sys.stdout.write(f"\rCurrent Best Test Case: {str(keyword)}, Distance from Normal: {numMin}")
        # Wipes and overwrites the last terminal output from this loop. This allows us to have a modulating terminal
        # instead of printing out millions of test cases
        sys.stdout.flush()

    # Threshold and bypass statement. Here is where we decide if we want to continue the analysis
    if numMin <= 0.088 or keyword == "123TOTALBYPASS123":
        # Prints out the distance, the calculated frequency and the expected frequency
        print("")
        print(numMin)
        print(lettersort)
        print(trueList)
        # Breaks
        return True
    else:
        # Continues
        return False

# **MAIN FUNCTION**
# Here is where we let the user decide what they want to do. They can choose between all the different ciphers, and ask
# them if they want to encrypt or (both manually and automatically) decrypt their text. It also allows them to give
# a different input file so they can work with anything within the scope

if __name__ == "__main__":
    # Asks the user for the filename
    filename = input("Enter the filename and extension: ")

    # Gets the path of the file
    myFile = Path(filename)

    # Checks to see if the file exists
    if not myFile.exists():
        # Tells the user their filename was invalid and makes them enter in one that is valid
        print("Invalid file name or file does not exist")
        filename = input("Enter the filename and extension: ")
        myFile = Path(filename)
        # Checks to see if they put in a valid file this time
        while not myFile.exists():
            print("Invalid file name or file does not exist")
            filename = input("Enter the filename and extension: ")
            myFile = Path(filename)
    # Sends the file to the formatFile function that strips it into a character array
    formatFile(filename)

    # Asks the user for the type of encryption protocol they want to use. Here we convert everything to an uppercase
    # as well as making sure that their value is valid
    print("What encryption would you like to try today?")
    print("[V]igenere, [A]ffine, [S]ubstitution, [C]easer/Shift?")

    # Takes in the input
    choice = input("Enter letter choice here: ")

    # Converts to uppercase
    choice = choice.upper()

    # Forces the user to enter in a valid value
    while choice != "V" and choice != "A" and choice != "S" and choice != "C":
        # Takes in the input
        choice = input("Enter letter choice here: ")
        # Converts to uppercase
        choice = choice.upper()

    # Asks the user if they want to encrypt or decrypt
    print("Would you like to encrypt or decrypt?")
    print("[E]ncrypt, [D]ecrypt, or [A]uto Decrypt?")

    # Takes in their input and converts it to an uppercase
    secChoice = input("Enter letter choice here: ")
    secChoice = secChoice.upper()

    # Makes sure the value is valid
    while secChoice != "E" and secChoice != "D" and secChoice != "A":
        # Takes in their input and converts it to an uppercase
        secChoice = input("Enter letter choice here: ")
        secChoice = secChoice.upper()

    # Uses their choice and runs the according protocol, it then passes in the "secChoice" so that the function knows
    # what part they want to do (Encryption, Decryption, Auto-Decryption)
    if choice == "V":
        vigenereEncrypt(secChoice)
    elif choice == "A":
        affineEncrypt(secChoice)
    elif choice == "S":
        # Warns the user that substitution ciphers are not fully supported yet
        if secChoice == "A":
            x = 0
            while x < 100:
                # Makes a cool flashing warning
                if x % 2 == 0:
                    sys.stdout.write(f"\r* * Warning * * THIS MAY NOT WORK. DO YOU WISH TO PROCEED?")
                else:
                    sys.stdout.write(f"\r *  Warning  *  THIS MAY NOT WORK. DO YOU WISH TO PROCEED?")
                time.sleep(0.02)
                sys.stdout.flush()
                x+=1
            print("")
            print("This may take a while. Results not guaranteed")
            # Confirms if they want to waste their own time with my substitution brute force algorithm
            confirm = input("Would you like to proceed? [Y/N]: ")
            if confirm == "Y":
                subEncrypt(secChoice)
            else:
                print("Thank you! Continuing with manual decryption")
                subEncrypt("D")
        else:
            subEncrypt(secChoice)
    else:
        encrypt(secChoice)
