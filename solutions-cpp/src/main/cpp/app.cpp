/*
 * This C++ source file was generated by the Gradle 'init' task.
 */

#include <iostream>
#include <stdlib.h>
#include "app.h"

std::string solutions_cpp::Greeter::greeting() {
    return std::string("Hello, World!");
}

int main () {
    solutions_cpp::Greeter greeter;
    std::cout << greeter.greeting() << std::endl;
    return 0;
}
