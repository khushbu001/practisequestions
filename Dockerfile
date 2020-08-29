FROM openjdk:8-jdk-alpine
WORKDIR .
COPY src/com/own/practisequestions/DecimalToBinary.java DecimalToBinary.java
RUN mkdir -p /tmp/classfile && touch /tmp/classfile/files 
RUN javac DecimalToBinary.java >> /tmp/classfile/DecimalToBinary.class
#CMD java -classpath  src/com/own/practisequestions DecimalToBinary
#CMD java -classpath DecimalToBinary
CMD["java", "DecimalToBinary"]