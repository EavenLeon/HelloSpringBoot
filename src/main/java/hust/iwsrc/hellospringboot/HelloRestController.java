package hust.iwsrc.hellospringboot;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Value;
/*
 * Copyright 2017 Makoto Consulting Group, Inc.
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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
  @Value(value = "${book}")
  private String name;

  @RequestMapping("/hello")
  public String hello() {
    return "Hello. All your base are belong to us."+name;
  }
  
  @RequestMapping("/hello2")
  public Set<String> hello2() {
	  String[] staffs = new String[]{"Tom", "Bob", "Jane"};
	  Set<String> staffsSet = new HashSet<>(Arrays.asList(staffs));
	  staffsSet.add("Mary"); // ok
	  staffsSet.remove("Tom"); // ok
	  return staffsSet;
  }
}
