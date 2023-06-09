/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package functions

// [START functions_helloworld_get]
import com.google.cloud.functions.HttpFunction
import com.google.cloud.functions.HttpRequest
import com.google.cloud.functions.HttpResponse
import java.io.IOException
import java.util.logging.Logger

class HelloWorld : HttpFunction {
    // Simple function to return "Hello World"
    @Throws(IOException::class)
    override fun service(request: HttpRequest, response: HttpResponse) {
        response.writer.write("Hello World!")
        print("123");
    }
}
// [END functions_helloworld_get]