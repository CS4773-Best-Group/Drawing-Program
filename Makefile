MAIN := main
CANVAS := src/Canvas
COMMANDS := src/Commands
HANDLERS := src/Handlers
MEMENTO := src/Memento
SHAPES := src/Shapes

CP := classes

all: build_jar clean

build_jar:Shapes Memento Handlers Commands Canvas main
	cd $(CP); jar -cfv ../hw3.jar *;

models: $(SHAPES)
	javac -sourcepath src -d $(CP) $(SHAPES)/*.java

models: $(MEMENTO)
	javac -sourcepath src -d $(CP) $(MEMENTO)/*.java

models: $(HANDLERS)
	javac -sourcepath src -d $(CP) $(HANDLERS)/*.java

models: $(COMMANDS)
	javac -sourcepath src -d $(CP) $(COMMANDS)/*.java

game: $(CANVAS)
	javac -sourcepath src -d $(CP) $(CANVAS)/*.java

main: $(MAIN)
	javac -sourcepath src -d $(CP) $(MAIN)/*.java

clean:
	rm -r $(CP)/*
