{ pkgs, ... }: {
  channel = "stable-23.11";

  packages = [
    pkgs.jdk21
    pkgs.gradle
    pkgs.gcc13
    pkgs.cmake
    pkgs.gnumake
    pkgs.python311
    pkgs.python311Packages.pip
  ];
}
