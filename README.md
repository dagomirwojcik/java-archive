# Java Archive

A collection of small Java exercises and experiments covering games, simulations,
data analysis, and data processing. Each exercise is intentionally self-contained
and currently uses the Java default package rather than a shared build system.

## Repository layout

```text
data-analysis/
  rainfall-statistics/       Interactive rainfall statistics program and JUnit tests
data-processing/
  phone-data-parser/         Phone data parser and Pareto-best phone selection
games/
  number-guessing-game/      Number-guessing game model
simulations/
  vending-machine/           Vending-machine model, demo, and tests
```

## Requirements

- Java Development Kit (JDK) 8 or newer
- JUnit 4 for `RainfallStatsTest.java` and JUnit 5 for
  `VendingMachineJUnitTest.java`, if you want to run the tests

There is no Maven or Gradle build file, so commands are run from each exercise's
directory.

## Running the examples

### Vending machine

```text
cd simulations/vending-machine
javac src/VendingMachine.java src/VendingMachineMain.java
java -cp src VendingMachineMain
```

The demo inserts three coins and attempts to vend a candy bar.

### Rainfall statistics

```text
cd data-analysis/rainfall-statistics
javac src/InvalidRainfallStats.java src/RainfallStats.java src/RainfallProgram.java
java -cp src RainfallProgram
```

Enter non-negative measurements one at a time. Enter `end` to display the count,
mean, and maximum.

### Phone data parser

```text
cd data-processing/phone-data-parser
javac src/Phone.java src/PhoneParser.java src/FindBestPhones.java
cd data
java -cp ../src FindBestPhones
```

The input file contains one phone per line in the format:

```text
model price performance
```

`FindBestPhones` prints the models that are not dominated by another phone in
the input data.

## Tests

The test sources use JUnit annotations and assertions. Because the repository
does not manage dependencies, provide the required JUnit and supporting JARs
on the classpath when compiling and running them. For example, with the JUnit 4
JARs in a local `lib` directory:

```text
cd data-analysis/rainfall-statistics
javac -cp "lib/*" src/*.java
java -cp "src;lib/*" org.junit.runner.JUnitCore RainfallStatsTest
```

On macOS or Linux, replace the semicolon in the runtime classpath with a colon.

## Project status

These are learning exercises and archives, not a unified production application.
Some source files are models or partial exercises without a command-line entry
point; inspect the relevant `src` directory before assuming an example is
complete.

## License

This project is released under the [MIT License](LICENSE).
