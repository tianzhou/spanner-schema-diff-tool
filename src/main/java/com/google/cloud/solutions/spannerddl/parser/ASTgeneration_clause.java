/* Generated By:JJTree: Do not edit this line. ASTgeneration_clause.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=false,TRACK_TOKENS=true,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.google.cloud.solutions.spannerddl.parser;

public class ASTgeneration_clause extends SimpleNode {

  public ASTgeneration_clause(int id) {
    super(id);
  }

  public ASTgeneration_clause(DdlParser p, int id) {
    super(p, id);
  }

  public String toString() {
    return " AS ( " + ((ASTexpression) children[0]).toString() + " ) STORED";
  }
}
/* JavaCC - OriginalChecksum=8d4a14cdc58fa8a2b3c220f5954bad5a (do not edit this line) */
