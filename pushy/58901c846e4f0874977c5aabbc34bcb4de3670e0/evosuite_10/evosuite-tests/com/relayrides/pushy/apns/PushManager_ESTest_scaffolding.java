/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 07 07:05:46 GMT 2021
 */

package com.relayrides.pushy.apns;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PushManager_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 10000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.relayrides.pushy.apns.PushManager"; 
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
    java.lang.System.setProperty("user.dir", "/home/CIN/lmps2/semantic-conflict-study/SMAT/output-test-dest/pushy/58901c846e4f0874977c5aabbc34bcb4de3670e0/evosuite_10"); 
    java.lang.System.setProperty("user.home", "/home/CIN/lmps2"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "lmps2"); 
    java.lang.System.setProperty("user.timezone", "America/Recife"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PushManager_ESTest_scaffolding.class.getClassLoader() ,
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "io.netty.util.concurrent.EventExecutor",
      "io.netty.util.concurrent.DefaultPromise$1",
      "io.netty.util.internal.logging.JdkLoggerFactory",
      "com.relayrides.pushy.apns.ApnsConnectionPool",
      "io.netty.util.AttributeMap",
      "io.netty.util.internal.JavassistTypeParameterMatcherGenerator",
      "io.netty.channel.MultithreadEventLoopGroup",
      "io.netty.util.internal.PlatformDependent0",
      "com.relayrides.pushy.apns.RejectedNotificationReason",
      "io.netty.channel.ChannelPropertyAccess",
      "com.relayrides.pushy.apns.ApnsEnvironment",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.internal.logging.Slf4JLogger",
      "com.relayrides.pushy.apns.SendableApnsPushNotification",
      "io.netty.util.concurrent.BlockingOperationException",
      "com.relayrides.pushy.apns.FeedbackConnectionException",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "com.relayrides.pushy.apns.RejectedNotificationListener",
      "com.relayrides.pushy.apns.ApnsConnection",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.concurrent.AbstractFuture",
      "com.relayrides.pushy.apns.PushManager",
      "io.netty.channel.EventLoopGroup",
      "io.netty.util.concurrent.Promise",
      "io.netty.util.internal.logging.Slf4JLoggerFactory$1",
      "io.netty.util.internal.logging.Log4JLoggerFactory",
      "com.relayrides.pushy.apns.ApnsConnectionListener",
      "io.netty.util.concurrent.GenericFutureListener",
      "com.relayrides.pushy.apns.KnownBadPushNotification",
      "io.netty.util.concurrent.EventExecutorGroup",
      "io.netty.channel.nio.NioEventLoopGroup",
      "com.relayrides.pushy.apns.ApnsPushNotification",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.channel.Channel",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.util.internal.logging.InternalLogger",
      "io.netty.channel.ChannelOutboundInvoker",
      "io.netty.channel.ChannelHandler",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.concurrent.Future",
      "io.netty.util.Signal",
      "com.relayrides.pushy.apns.SentNotificationBuffer",
      "com.relayrides.pushy.apns.FeedbackServiceClient"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PushManager_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.relayrides.pushy.apns.PushManager",
      "com.relayrides.pushy.apns.PushManager$1",
      "com.relayrides.pushy.apns.PushManager$DispatchThreadExceptionHandler",
      "com.relayrides.pushy.apns.PushManager$2",
      "com.relayrides.pushy.apns.PushManager$3",
      "com.relayrides.pushy.apns.ApnsEnvironment",
      "io.netty.util.concurrent.AbstractEventExecutorGroup",
      "io.netty.util.concurrent.MultithreadEventExecutorGroup",
      "io.netty.util.internal.logging.Slf4JLoggerFactory",
      "io.netty.util.internal.logging.Slf4JLoggerFactory$1",
      "io.netty.util.internal.logging.AbstractInternalLogger",
      "io.netty.util.internal.logging.Slf4JLogger",
      "io.netty.util.internal.logging.InternalLoggerFactory",
      "io.netty.util.internal.SystemPropertyUtil",
      "io.netty.channel.MultithreadEventLoopGroup",
      "io.netty.channel.nio.NioEventLoopGroup",
      "io.netty.util.concurrent.AbstractFuture",
      "io.netty.util.concurrent.DefaultPromise$1",
      "io.netty.util.internal.PlatformDependent0",
      "io.netty.util.internal.PlatformDependent",
      "io.netty.util.Signal",
      "io.netty.util.concurrent.DefaultPromise",
      "io.netty.util.concurrent.DefaultThreadFactory",
      "com.relayrides.pushy.apns.ApnsConnectionPool",
      "com.relayrides.pushy.apns.FeedbackServiceClient",
      "com.relayrides.pushy.apns.ExpiredToken",
      "com.relayrides.pushy.apns.KnownBadPushNotification",
      "io.netty.channel.ChannelHandlerAdapter",
      "io.netty.channel.ChannelInboundHandlerAdapter",
      "io.netty.channel.ChannelDuplexHandler",
      "io.netty.channel.CombinedChannelDuplexHandler",
      "io.netty.util.concurrent.AbstractEventExecutor",
      "io.netty.util.concurrent.CompleteFuture",
      "io.netty.util.concurrent.FailedFuture",
      "io.netty.util.concurrent.GlobalEventExecutor",
      "io.netty.util.concurrent.ImmediateEventExecutor",
      "io.netty.util.DefaultAttributeMap",
      "io.netty.util.internal.EmptyArrays",
      "io.netty.channel.AbstractChannel",
      "io.netty.channel.ChannelMetadata",
      "io.netty.channel.AbstractServerChannel",
      "io.netty.channel.local.LocalServerChannel",
      "io.netty.util.internal.ThreadLocalRandom$2",
      "io.netty.util.internal.ThreadLocalRandom",
      "io.netty.util.internal.ThreadLocalRandom$1",
      "io.netty.channel.ChannelOutboundHandlerAdapter",
      "io.netty.channel.local.LocalChannel$1",
      "io.netty.channel.local.LocalChannel"
    );
  }
}
