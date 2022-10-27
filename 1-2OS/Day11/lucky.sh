#!/bin/bash
echo "Enter Your Number"
read a

if [[ ( $a -ge 15 ) && ( $a -le 45 ) ]];
then
	echo "You Win A Gift ..."
else
	echo "You Lose A Gift ..."
fi
