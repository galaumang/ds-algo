# DS Algo Solutions - CPP

## How to add problem solution with tests
1) Create the source and test files in the respective packages and include the code
```
touch src/main/cpp/dsalgo/<package-name>/<src-file-name>.cpp
touch src/test/cpp/dsalgo/<package-name>/<test-file-name>.cpp
```
2) Configure the test for the new problem solution in CMakeLists.txt
```
# add executable
add_executable(<test-name> src/test/cpp/dsalgo/<package-name>/<test-file-name>.cpp src/main/cpp/dsalgo/<package-name>/<src-file-name>.cpp)

# link libraries
target_link_libraries(<test-name> gtest_main)

# discover tests
gtest_discover_tests(<test-name>)
```

## Build and Run Tests
1) Build the project -
```
mkdir build && cd build
cmake ..
make
```
**Note:** Any changes made to CMakeLists.txt file will require a rebuild using ```cmake ..```. Any changes made to cpp files will require a rebuild using ```make```.

2) Run the Tests -
```
ctest --output-on-failure
```
Running individual test binaries - ```./<test-name>```
```
./TwoSumTest
./ReverseStringTest
```