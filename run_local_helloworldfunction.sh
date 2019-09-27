#!/bin/bash

sbt assembly
sam local invoke HelloScalaFunction -t ./template.yaml -e ./event/HelloScalaFunction.json --skip-pull-image