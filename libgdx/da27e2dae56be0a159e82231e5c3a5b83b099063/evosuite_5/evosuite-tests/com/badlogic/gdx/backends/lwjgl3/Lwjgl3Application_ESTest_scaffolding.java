/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 08 16:14:07 GMT 2021
 */

package com.badlogic.gdx.backends.lwjgl3;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class Lwjgl3Application_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 10000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/libgdx/da27e2dae56be0a159e82231e5c3a5b83b099063/evosuite_5"); 
    java.lang.System.setProperty("user.home", "/home/CIN/lmps2"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "lmps2"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Lwjgl3Application_ESTest_scaffolding.class.getClassLoader() ,
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener",
      "com.badlogic.gdx.math.MathUtils",
      "org.lwjgl.system.MemoryAccess$MemoryAccessorJNI",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3Window$1",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3Window$4",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3Window$2",
      "com.badlogic.gdx.graphics.GL20",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3Window$3",
      "org.lwjgl.opengl.GL$4",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3NativesLoader",
      "org.lwjgl.glfw.GLFWWindowFocusCallback",
      "org.lwjgl.system.MemoryAccess",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics$Lwjgl3DisplayMode",
      "org.lwjgl.glfw.GLFWWindowIconifyCallback",
      "com.badlogic.gdx.math.RandomXS128",
      "com.badlogic.gdx.LifecycleListener",
      "com.badlogic.gdx.Files",
      "org.lwjgl.system.FunctionProvider",
      "org.lwjgl.opengl.GL11",
      "org.lwjgl.opengl.OpenGLException",
      "org.lwjgl.system.MemoryAccess$MemoryAccessorJava",
      "com.badlogic.gdx.utils.Clipboard",
      "org.lwjgl.system.Library",
      "com.badlogic.gdx.Application$ApplicationType",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration$HdpiMode",
      "com.badlogic.gdx.utils.GdxNativesLoader",
      "com.badlogic.gdx.Graphics",
      "com.badlogic.gdx.Net",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration",
      "com.badlogic.gdx.Graphics$BufferFormat",
      "org.lwjgl.glfw.GLFW",
      "com.badlogic.gdx.utils.SharedLibraryLoader",
      "org.lwjgl.system.Platform$1",
      "com.badlogic.gdx.utils.Disposable",
      "org.lwjgl.system.Platform$3",
      "org.lwjgl.system.Checks",
      "org.lwjgl.system.Platform$2",
      "com.badlogic.gdx.utils.ObjectMap",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3Clipboard",
      "com.badlogic.gdx.Graphics$Monitor",
      "org.lwjgl.system.Retainable",
      "org.lwjgl.system.Retainable$Default",
      "com.badlogic.gdx.files.FileHandle",
      "com.badlogic.gdx.graphics.glutils.GLVersion",
      "org.lwjgl.glfw.GLFWDropCallback",
      "com.badlogic.gdx.Graphics$DisplayMode",
      "com.badlogic.gdx.utils.Array",
      "org.lwjgl.glfw.GLFWErrorCallback",
      "org.lwjgl.system.Library$2",
      "org.lwjgl.system.Configuration",
      "com.badlogic.gdx.Application",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3Window",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3Input",
      "org.lwjgl.system.Library$1",
      "org.lwjgl.system.libffi.Closure$Void",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3FileHandle",
      "com.badlogic.gdx.utils.GdxRuntimeException",
      "org.lwjgl.opengl.GL$1FunctionProviderGL",
      "org.lwjgl.system.MemoryAccess$MemoryAccessorReflect",
      "org.lwjgl.system.Pointer",
      "org.lwjgl.system.Configuration$StateInit$2",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics$Lwjgl3Monitor",
      "org.lwjgl.system.FunctionProvider$Default",
      "org.lwjgl.system.Configuration$StateInit$1",
      "com.badlogic.gdx.Input",
      "org.lwjgl.glfw.GLFWWindowCloseCallback",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application",
      "org.lwjgl.system.Configuration$3",
      "org.lwjgl.system.Configuration$1",
      "org.lwjgl.system.Configuration$2",
      "com.badlogic.gdx.Preferences",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics",
      "com.badlogic.gdx.graphics.Color",
      "org.lwjgl.system.libffi.Closure",
      "org.lwjgl.system.MemoryAccess$MemoryAccessor",
      "org.lwjgl.system.Configuration$StateInit",
      "org.lwjgl.system.Library$LibraryLoader",
      "com.badlogic.gdx.ApplicationListener",
      "org.lwjgl.opengl.GL$3",
      "org.lwjgl.opengl.GL$2",
      "org.lwjgl.opengl.GL$1",
      "com.badlogic.gdx.Files$FileType",
      "org.lwjgl.system.Platform",
      "com.badlogic.gdx.Audio",
      "org.lwjgl.opengl.GL"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.badlogic.gdx.ApplicationListener", false, Lwjgl3Application_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Lwjgl3Application_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application",
      "com.badlogic.gdx.utils.GdxNativesLoader",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3NativesLoader",
      "com.badlogic.gdx.utils.SharedLibraryLoader",
      "org.lwjgl.system.Retainable$Default",
      "org.lwjgl.system.Configuration$StateInit",
      "org.lwjgl.system.Configuration",
      "org.lwjgl.system.Library$1",
      "org.lwjgl.system.Library$2",
      "org.lwjgl.system.Checks",
      "org.lwjgl.system.Library",
      "org.lwjgl.system.MemoryUtil",
      "org.lwjgl.system.libffi.Closure",
      "org.lwjgl.Version$BuildType",
      "org.lwjgl.Version",
      "org.lwjgl.system.APIUtil$1",
      "org.lwjgl.system.APIUtil",
      "org.lwjgl.system.SharedLibraryLoader$Library",
      "org.lwjgl.system.SharedLibraryLoader",
      "org.lwjgl.system.Platform",
      "org.lwjgl.system.libffi.LibFFIConstants",
      "org.lwjgl.system.libffi.LibFFI",
      "org.lwjgl.system.MemoryAccess",
      "org.lwjgl.system.Pointer",
      "org.lwjgl.system.APIUtil$2",
      "org.lwjgl.glfw.GLFW",
      "com.badlogic.gdx.Gdx",
      "org.lwjgl.system.macosx.ObjCRuntime",
      "com.badlogic.gdx.utils.Array",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3Cursor",
      "com.badlogic.gdx.Application$ApplicationType",
      "org.lwjgl.opengl.GL$4",
      "org.lwjgl.opengl.GL",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration",
      "com.badlogic.gdx.graphics.Color",
      "com.badlogic.gdx.utils.ObjectMap",
      "com.badlogic.gdx.math.RandomXS128",
      "com.badlogic.gdx.math.MathUtils",
      "com.badlogic.gdx.utils.GdxRuntimeException",
      "org.lwjgl.BufferUtils$2",
      "org.lwjgl.BufferUtils",
      "org.lwjgl.opengl.GL11",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3Window",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowConfiguration",
      "com.badlogic.gdx.graphics.glutils.GLVersion",
      "com.badlogic.gdx.graphics.glutils.GLVersion$Type",
      "com.badlogic.gdx.Graphics$DisplayMode",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3Graphics$Lwjgl3DisplayMode",
      "com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowAdapter",
      "com.badlogic.gdx.utils.NumberUtils"
    );
  }
}
