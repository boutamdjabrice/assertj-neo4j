/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 * 
 * Copyright 2013-2013 the original author or authors.
 */
package org.assertj.neo4j.api;

import org.neo4j.graphdb.Node;
import org.neo4j.graphdb.PropertyContainer;

/**
 * The entry point for all Neo4j assertions.
 * 
 * @author Joel Costigliola
 * @author Florent Biville
 */
public class Assertions {

  public static PropertyContainerAssert assertThat(PropertyContainer propertyContainer) {
    return new PropertyContainerAssert(propertyContainer);
  }

  public static NodeAssert assertThat(Node node) {
    return new NodeAssert(node);
  }

  /** Creates a new </code>{@link Assertions}</code>. */
  protected Assertions() {
    // empty
  }
}