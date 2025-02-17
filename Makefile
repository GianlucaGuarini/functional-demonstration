run:
	@echo "Running Functional Implementation"
	@java -classpath target/classes ex.func.Functional
	@echo "\n------"
	@echo "Running the Imperative Implementation"
	@java -classpath target/classes ex.func.Imperative

run-fancy:
	@echo "Running Fancy Implementation"
	@java -classpath target/classes ex.func.FancyFunctional


.PHONY: run run-fancy

