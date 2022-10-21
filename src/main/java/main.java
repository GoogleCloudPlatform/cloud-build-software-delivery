// Copyright 2022 Google LLC

// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at

// http://www.apache.org/licenses/LICENSE-2.0

// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

import java.io.*;

public class main {
    public static final String ADMIN_LOGIN="UserName";
    public static final String ADMIN_PASSWORD="Password1234";

    public static void main(String args[]) {

        try {
            File file = new File("/tmp/myfile.txt");

            java.io.File.createTempFile("prefix", "suffix"); // Sensitive, will be in the default temporary-file directory.
            java.nio.file.Files.createTempDirectory("prefix"); // Sensitive, will be in the default temporary-file directory.
        }catch (Exception ex) {

        }

        System.out.println(ADMIN_LOGIN+":"+ADMIN_PASSWORD);
        for (int i=0; i<10000; i++) {
            System.out.print("Hello world");
            System.out.println(i);
            try {
                Thread.sleep(1000, 0);

            }catch (Exception ex) {

            }
        }
    }
}
