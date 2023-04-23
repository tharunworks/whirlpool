# Eddy
Java implementation for distributed systems challenges on [https://fly.io/dist-sys/](https://fly.io/dist-sys/)

## Prerequisites

- Java [17]
- Maven [4.0.0]
- Maelstrom

## Building the Project

### Approach 1: Using Maven

1. Run the following command to compile and create an executable jar.

```sh
mvn clean compile assembly:single
```

### Approach 2: Using script

1. Run the following command to compile and create an executable jar.

```sh
./build
```

## Providing permissions to fat executable jar
```sh
chmod 777 ./target/whirlpool-1.0-SNAPSHOT-jar-with-dependencies.jar
```

## Running the jar with maelstrom
1. Go to maelstrom project root and execute below command.

```sh 
    ./maelstrom test --bin <server_bash_file_path> -w echo --time-limit 5 --node-count 1
```
Note: the --bin parameter expects server_bash_file_path instead of executable_jar_path.