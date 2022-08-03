# hardcoded-creds
Simple Java app intentionally using a hardcoded password

## Building

After cloning this repository build it by issuing the following command
from the root directory:

```bash
$ ./gradlew clean build
```

## Expected Analysis

```bash
 ✗ [Medium] Use of Hardcoded Credentials 
   Path: app/src/main/java/com/application/App.java, line 74 
   Info: Do not hardcode passwords in code. Found password string
```