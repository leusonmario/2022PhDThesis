/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Nov 08 05:55:08 GMT 2021
 */

package rx.concurrency;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TestScheduler_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "rx.concurrency.TestScheduler"; 
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
    java.lang.System.setProperty("user.dir", "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/RxJava/1c47b0cb26e6d971eefa42ebb3479099236b0125/evosuite_3"); 
    java.lang.System.setProperty("user.home", "/home/CIN/lmps2"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "lmps2"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TestScheduler_ESTest_scaffolding.class.getClassLoader() ,
      "rx.Scheduler$3",
      "rx.Scheduler$4",
      "rx.operators.OperationSubscribeOn$ScheduledSubscription",
      "rx.Scheduler$1",
      "rx.Scheduler$2",
      "rx.operators.SafeObservableSubscription",
      "rx.Scheduler$5",
      "rx.operators.OperatorTester$UnitTest$ForwardingScheduler",
      "rx.concurrency.ImmediateScheduler$1",
      "rx.subscriptions.Subscriptions",
      "rx.util.functions.Action0",
      "rx.concurrency.ExecutorScheduler",
      "rx.operators.OperatorTester",
      "rx.concurrency.TestScheduler$1",
      "rx.util.functions.Func1",
      "rx.util.functions.Func2",
      "rx.concurrency.ImmediateScheduler",
      "rx.concurrency.SleepingAction",
      "rx.operators.OperationMerge$MergeObservable$MergeSubscription",
      "rx.concurrency.ExecutorScheduler$1",
      "rx.util.functions.Action",
      "rx.concurrency.ExecutorScheduler$4",
      "rx.concurrency.DiscardableAction",
      "rx.util.CompositeException",
      "rx.Scheduler",
      "rx.concurrency.TestScheduler",
      "rx.concurrency.TestScheduler$TimedAction",
      "rx.subscriptions.CompositeSubscription",
      "rx.subscriptions.Subscriptions$1",
      "rx.util.functions.Function",
      "rx.concurrency.CurrentThreadScheduler$UnitTest",
      "rx.operators.OperationMergeDelayError$MergeDelayErrorObservable$MergeSubscription",
      "rx.concurrency.TestScheduler$CompareActionsByTime",
      "rx.subscriptions.Subscriptions$3",
      "rx.concurrency.NewThreadScheduler",
      "rx.operators.OperationToObservableSortedList$ToObservableSortedList$DefaultComparableFunction",
      "rx.concurrency.CurrentThreadScheduler$1",
      "rx.concurrency.CurrentThreadScheduler$TimedAction",
      "rx.Subscription",
      "rx.subjects.ReplaySubject$RepeatSubjectSubscription",
      "rx.operators.OperatorTester$UnitTest",
      "rx.operators.SafeObservableSubscription$1",
      "rx.Scheduler$1$1",
      "rx.subscriptions.BooleanSubscription",
      "rx.concurrency.CurrentThreadScheduler"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TestScheduler_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "rx.Scheduler",
      "rx.concurrency.TestScheduler",
      "rx.concurrency.TestScheduler$CompareActionsByTime",
      "rx.concurrency.TestScheduler$TimedAction",
      "rx.subscriptions.Subscriptions$3",
      "rx.subscriptions.Subscriptions",
      "rx.Scheduler$5",
      "rx.Scheduler$1",
      "rx.Scheduler$2",
      "rx.subscriptions.Subscriptions$1",
      "rx.Scheduler$11",
      "rx.subscriptions.Subscriptions$4",
      "rx.Scheduler$3",
      "rx.concurrency.CurrentThreadScheduler",
      "rx.concurrency.NewThreadScheduler",
      "rx.concurrency.DiscardableAction",
      "rx.operators.SafeObservableSubscription$1",
      "rx.operators.SafeObservableSubscription",
      "rx.concurrency.CurrentThreadScheduler$TimedAction",
      "rx.util.AtomicObservableSubscription$1",
      "rx.util.AtomicObservableSubscription",
      "rx.concurrency.ExecutorScheduler",
      "rx.concurrency.ImmediateScheduler",
      "rx.concurrency.SleepingAction",
      "rx.Scheduler$4",
      "rx.subscriptions.CompositeSubscription",
      "rx.concurrency.ExecutorScheduler$1",
      "rx.Scheduler$7",
      "rx.Scheduler$1$1",
      "rx.concurrency.ExecutorScheduler$4",
      "rx.subscriptions.BooleanSubscription"
    );
  }
}
