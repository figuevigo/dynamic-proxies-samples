/*
 * Copyright (C) 2000-2019 Heinz Max Kabutz
 *
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.  Heinz Max Kabutz licenses
 * this file to you under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.javaspecialists.books.dynamicproxies.ch06;

import eu.javaspecialists.books.dynamicproxies.*;

import java.util.*;

// tag::listing[]
public interface Composite<T> {
    default void add(T t) {}
    default boolean remove(T t) { return false; }

    /**
     * Any subinterfaces can define a static getMergers() method to
     * return a map of methods to their result merge function.  Keys
     * are MethodKeys that identify the methods by name and parameter
     * types.  Values are Reducer objects containing an identity and a
     * BinaryOperator defined on Object.
     */
    static Map<MethodKey, Reducer> getMergers() { return Map.of();}
}
// end::listing[]