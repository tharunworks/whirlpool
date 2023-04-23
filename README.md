# Whirlpool
Java implementation for distributed systems challenges on [https://fly.io/dist-sys/](https://fly.io/dist-sys/)

## Prerequisites

- Java [17]
- Maven [4.0.0]
- [Maelstrom](https://github.com/jepsen-io/maelstrom)

## Building the Project

### Approach 1: Using Maven

1. Run the following command to compile and create an executable jar. If command execution fails, then issue could be with JAVA_HOME. Set JAVA_HOME to jdk17 path.

```sh
mvn clean compile assembly:single
```

### Approach 2: Using script (preferable)

1. Run the following command to compile and create an executable jar. The following script also sets the JAVA_HOME variable.

```sh
./build
```

## Providing permissions to fat executable jar
```sh
chmod 777 <executable_fat_jar_path>
```
#### Example:
```sh
chmod 777 ./target/whirlpool-1.0-SNAPSHOT-jar-with-dependencies.jar
```
## Running the jar with maelstrom
### Approach 1: Using maelstrom script
1. Go to maelstrom project root and execute below command.

```sh 
    ./<maelstrom_script_path> test --bin <server_bash_file_path> -w echo --time-limit 5 --node-count 1
```
#### Example:

```sh 
bash /Users/tharunk/installations/maelstrom/maelstrom test --bin server -w echo --time-limit 5 --node-count 1
```
#### Note:
the --bin parameter expects server_bash_file_path instead of executable_jar_path.