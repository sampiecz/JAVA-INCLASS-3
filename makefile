JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class: ; $(JC) $(JFLAGS) $*.java

CLASSES = \
TextFieldFrame.java\
TextFieldTest.java

default: classes

classes: $(CLASSES:.java=.class)

clean: ; $(RM) *.class
