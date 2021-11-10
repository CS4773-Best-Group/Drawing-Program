MAIN := src/Main
CANVAS := src/Canvas
COMMANDS := src/Commands
HANDLERS := src/Handlers
MEMENTO := src/Memento
SHAPES := src/Shapes

CP := classes

all: build_jar clean

build_jar:Shapes Memento Handlers Commands Canvas Main
	cd $(CP); jar -cfv ../hw3.jar *;

Shapes: $(SHAPES)
	javac -sourcepath src -d $(CP) $(SHAPES)/*.java

Memento: $(MEMENTO)
	javac -sourcepath src -d $(CP) $(MEMENTO)/*.java

Handlers: $(HANDLERS)
	javac -sourcepath src -d $(CP) $(HANDLERS)/*.java

Commands: $(COMMANDS)
	javac -sourcepath src -d $(CP) $(COMMANDS)/*.java

Canvas: $(CANVAS)
	javac -sourcepath src -d $(CP) $(CANVAS)/*.java

Main: $(MAIN)
	javac -sourcepath src -d $(CP) $(MAIN)/*.java
 
clean:
	rm -r $(CP)/*
