/*
 * This file was automatically generated by EvoSuite
 * Wed Nov 03 13:05:06 GMT 2021
 */

package org.activiti.engine.impl.persistence.entity;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.activiti.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DeploymentEntityManager_ESTest extends DeploymentEntityManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StandaloneProcessEngineConfiguration standaloneProcessEngineConfiguration0 = new StandaloneProcessEngineConfiguration();
      // EXCEPTION DIFF:
      // Different Exceptions were thrown:
      // Original Version:
      //     org.activiti.engine.ActivitiException : Error while building ibatis SqlSessionFactory: Error parsing SQL Mapper Configuration. Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error parsing Mapper XML. Cause: org.evosuite.runtime.TooManyResourcesException: Loop has been executed more times than the allowed 10000
      // Modified Version:
      //     org.activiti.engine.ActivitiException : Error while building ibatis SqlSessionFactory: Error parsing SQL Mapper Configuration. Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Unable to find a usable constructor for class org.activiti.engine.impl.persistence.ByteArrayRefTypeHandler
      // Undeclared exception!
      try { 
        standaloneProcessEngineConfiguration0.buildProcessEngine();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error while building ibatis SqlSessionFactory: Error parsing SQL Mapper Configuration. Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error parsing Mapper XML. Cause: org.evosuite.runtime.TooManyResourcesException: Loop has been executed more times than the allowed 10000
         //
         verifyException("org.activiti.engine.impl.cfg.ProcessEngineConfigurationImpl", e);
         assertTrue(e.getMessage().equals("Error while building ibatis SqlSessionFactory: Error parsing SQL Mapper Configuration. Cause: org.evosuite.runtime.mock.java.lang.MockThrowable: Error parsing Mapper XML. Cause: org.evosuite.runtime.TooManyResourcesException: Loop has been executed more times than the allowed 10000"));   
      }
  }
}
