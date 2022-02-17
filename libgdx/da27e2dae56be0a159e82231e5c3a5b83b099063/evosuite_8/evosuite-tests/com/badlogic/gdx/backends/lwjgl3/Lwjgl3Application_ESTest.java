/*
 * This file was automatically generated by EvoSuite
 * Mon Nov 08 16:20:36 GMT 2021
 */

package com.badlogic.gdx.backends.lwjgl3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Lwjgl3Application_ESTest extends Lwjgl3Application_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ApplicationListener applicationListener0 = mock(ApplicationListener.class, new ViolatedAssumptionAnswer());
      Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new Lwjgl3ApplicationConfiguration();
      // EXCEPTION DIFF:
      // The original version did not exhibit this exception:
      //     java.lang.IllegalArgumentException : object is not an instance of declaring class
      lwjgl3ApplicationConfiguration0.setInitialVisible(true);
      // EXCEPTION DIFF:
      // The modified version did not exhibit this exception:
      //     com.badlogic.gdx.utils.GdxRuntimeException : Couldn't load shared library 'libgdx64.so' for target: Linux, 64-bit
      Lwjgl3Application lwjgl3Application0 = null;
      try {
        lwjgl3Application0 = new Lwjgl3Application(applicationListener0, lwjgl3ApplicationConfiguration0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Couldn't load shared library 'libgdx64.so' for target: Linux, 64-bit
         //
         verifyException("com.badlogic.gdx.utils.SharedLibraryLoader", e);
         assertTrue(e.getMessage().equals("Couldn't load shared library 'libgdx64.so' for target: Linux, 64-bit"));   
      }
  }
}
