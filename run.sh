#!/bin/bash
file_name=$1
class_name=$2
  
# First, compile the Java program into a Java class
javac file_name
  
# Now pass the arguments to the Java classes
java class_name