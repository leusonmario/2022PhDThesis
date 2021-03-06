/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 07 05:01:14 GMT 2021
 */

package quickdt.experiments;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class OutOfTimeCrossValidatorRunner_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 10000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "quickdt.experiments.OutOfTimeCrossValidatorRunner"; 
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
    java.lang.System.setProperty("user.dir", "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/quickml/bae968d9a85c0501ba8842a6f88e7fc2c6b78693/evosuite_1"); 
    java.lang.System.setProperty("user.home", "/home/CIN/lmps2"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "lmps2"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(OutOfTimeCrossValidatorRunner_ESTest_scaffolding.class.getClassLoader() ,
      "quickdt.experiments.OutOfTimeCrossValidatorRunner",
      "quickdt.crossValidation.OutOfTimeCrossValidator",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableEnumMap",
      "com.google.common.collect.Collections2",
      "quickdt.crossValidation.StationaryCrossValidator",
      "quickdt.crossValidation.CrossValidator",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "quickdt.crossValidation.DateTimeExtractor",
      "quickdt.predictiveModels.PredictiveModel",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "com.google.common.collect.ImmutableList",
      "quickdt.experiments.TrainingDataGenerator2",
      "quickdt.data.AbstractInstance",
      "quickdt.predictiveModels.randomForest.RandomForest",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.common.collect.BiMap",
      "com.google.common.base.Function",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "quickdt.crossValidation.CrossValLoss",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.Maps$1",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.Maps",
      "com.google.common.collect.SortedMapDifference",
      "quickdt.data.Instance",
      "quickdt.predictiveModels.PredictiveModelBuilder",
      "com.google.common.collect.MapDifference",
      "com.google.common.collect.Maps$EntryTransformer",
      "quickdt.data.Attributes",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.collect.Lists$2",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "quickdt.data.HashMapAttributes",
      "com.google.common.collect.Lists$1",
      "com.google.common.base.Joiner"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(OutOfTimeCrossValidatorRunner_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "quickdt.experiments.OutOfTimeCrossValidatorRunner",
      "quickdt.experiments.TrainingDataGenerator2",
      "com.google.common.collect.Lists",
      "quickdt.data.HashMapAttributes",
      "com.google.common.base.Joiner",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Joiner$1",
      "com.google.common.collect.Collections2",
      "com.google.common.base.Joiner$MapJoiner",
      "com.google.common.collect.Maps",
      "quickdt.data.AbstractInstance",
      "quickdt.data.Instance"
    );
  }
}
