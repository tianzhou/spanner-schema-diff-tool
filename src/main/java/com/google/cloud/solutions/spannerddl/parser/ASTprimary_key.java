/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.solutions.spannerddl.parser;

import com.google.cloud.solutions.spannerddl.diff.ASTTreeUtils;
import com.google.common.base.Joiner;

/** Abstract Syntax Tree parser object for "primary_Key" token */
public class ASTprimary_key extends SimpleNode {

  public ASTprimary_key(int id) {
    super(id);
  }

  public ASTprimary_key(DdlParser p, int id) {
    super(p, id);
  }

  @Override
  public String toString() {
    return "PRIMARY KEY ("
        + Joiner.on(", ").join(ASTTreeUtils.getChildrenAssertType(children, ASTkey_part.class))
        + ")";
  }
}
