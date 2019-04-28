/*
 * Copyright 2012-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.amarcel.tutorial_spring_cloud.azure;

import org.amarcel.tutorial_spring_cloud.hello.Person;
import org.amarcel.tutorial_spring_cloud.hello.WelcomeMessage;
import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import org.springframework.cloud.function.adapter.azure.AzureSpringBootRequestHandler;

import java.util.Optional;

import org.amarcel.tutorial_spring_cloud.hello.HelloFunction;

/**
 * SpringBoot : POST http://localhost:8080/hello       { "name: "bob" }
 * Azure      : POST http://localhost:7071/api/hello   { "name: "bob" }
 */
@SuppressWarnings("unused") // entry point
public class HelloAzureFunction extends AzureSpringBootRequestHandler<Person, WelcomeMessage> {

    @FunctionName(HelloFunction.FUNCTION_NAME)
    public WelcomeMessage execute(
            @HttpTrigger(name = "req", methods = {HttpMethod.GET,
                    HttpMethod.POST}, authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Optional<Person>> request,
            ExecutionContext context) {

        return
                request.getBody()
                        .map(person -> handleRequest(person, context))
                        .orElseGet(() -> new WelcomeMessage("HTTP Body missing, e.g. { \"name\": \"Alain\" }"));
    }

}
