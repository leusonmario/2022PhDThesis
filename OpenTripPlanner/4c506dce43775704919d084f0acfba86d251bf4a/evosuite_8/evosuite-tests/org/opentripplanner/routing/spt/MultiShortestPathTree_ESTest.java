/*
 * This file was automatically generated by EvoSuite
 * Thu Nov 04 17:45:06 GMT 2021
 */

package org.opentripplanner.routing.spt;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.opentripplanner.routing.spt.MultiShortestPathTree;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultiShortestPathTree_ESTest extends MultiShortestPathTree_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MultiShortestPathTree multiShortestPathTree0 = new MultiShortestPathTree();
      // Undeclared exception!
      try { 
        multiShortestPathTree0.dump();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.opentripplanner.routing.spt.MultiShortestPathTree", e);
      }
  }
}
