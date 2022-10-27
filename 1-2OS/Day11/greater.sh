#!/bin/bash

echo "Enter First Number"
read a
echo "Enter Second Number"
read b
echo "Enter Third Number"
read c

if [[ ( $a -gt $b ) && ( $a -gt $c ) ]];
then
	echo "First Number is Greater"
else
if [[ ( $b -gt $c ) ]]
then
	echo "Second Number is Greater"
else
	echo "Third Number is Greater"

fi
fi
