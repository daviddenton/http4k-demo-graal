# http4k-demo-graal

Instructions for osx:

1. get graalvm archive - open http://download.oracle.com/otn/utilities_drivers/oracle-labs/graalvm-ee-1.0.0-rc4-macos-amd64.tar.gz

2. expand the archive and put the expanded folder in this root folder. rename it to `graalvm`

3. install zlib-dev: `xcode-select --install`

4. run the build: `./buildExe`

5. run the server: `./http4kGraal`

6. login to server with `graal/graal`:`open http://localhost:5000`