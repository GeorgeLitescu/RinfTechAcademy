    **Third Part of Homework**
    
  I made 2 files, each with it's one main. One file is for the hobbies and the other one is for the conferences.

  I did a lot of research about maps, keys and other related stuff and this is the solution that i consider best.
  I made a "CompoundKey" class that gets the values that i want as key. I tried to use the class object directly as a key but it was 
no good since the map used the object's address instead of it's elements as key. So i decided to make a class method that converts it's elements 
to a string. I used that string as a key and it worked fine.
