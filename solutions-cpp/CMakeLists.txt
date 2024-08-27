cmake_minimum_required(VERSION 3.10)
project(ds-algo-cpp)

set(CMAKE_CXX_STANDARD 11)

# Fetch Google Test
include(FetchContent)
FetchContent_Declare(
  googletest
  URL https://github.com/google/googletest/archive/release-1.11.0.zip
)
# For Windows: Prevent overriding the parent project's compiler/linker settings
set(gtest_force_shared_crt ON CACHE BOOL "" FORCE)
FetchContent_MakeAvailable(googletest)

enable_testing()

# Add the executables for the main application
add_executable(TwoSumTest src/test/cpp/dsalgo/array/lc_0001_two_sum_test.cpp src/main/cpp/dsalgo/array/lc_0001_two_sum.cpp)
add_executable(LC0387FirstUniqueCharTest src/test/cpp/dsalgo/string/lc_0387_first_unique_char_test.cpp src/main/cpp/dsalgo/string/lc_0387_first_unique_char.cpp)

# Link Google Test libraries
target_link_libraries(TwoSumTest gtest_main)
target_link_libraries(LC0387FirstUniqueCharTest gtest_main)

include(GoogleTest)
gtest_discover_tests(TwoSumTest)
gtest_discover_tests(LC0387FirstUniqueCharTest)
