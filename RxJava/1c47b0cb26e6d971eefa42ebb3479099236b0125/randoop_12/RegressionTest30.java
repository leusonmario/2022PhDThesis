import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest30 {

    public static boolean debug = false;

    @Test
    public void test15001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15001");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        long long2 = testScheduler0.time;
        testScheduler0.triggerActions((long) 0);
        testScheduler0.time = 100L;
        long long7 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test15002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15002");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime10 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = compareActionsByTime9.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime10);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = compareActionsByTime10.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime10);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime14 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime15 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = compareActionsByTime14.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime15);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime15.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime18.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator17.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = compareActionsByTime19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = compareActionsByTime19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = wildcardTimedActionComparator24.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime26 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime27 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = compareActionsByTime26.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime27);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = compareActionsByTime27.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime31 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime30.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime31);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = compareActionsByTime31.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = wildcardTimedActionComparator29.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime31);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime31.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime37 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime36.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime37);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = compareActionsByTime31.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime37);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime40 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime41 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = compareActionsByTime40.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime41);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = compareActionsByTime41.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime44 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime45 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = compareActionsByTime44.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime45);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = compareActionsByTime45.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = wildcardTimedActionComparator43.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime45);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = compareActionsByTime45.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime50 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime51 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = compareActionsByTime50.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime51);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = compareActionsByTime45.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime51);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = wildcardTimedActionComparator53.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = compareActionsByTime37.thenComparing(wildcardTimedActionComparator54);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime56 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime57 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = compareActionsByTime56.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime57);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = compareActionsByTime57.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime60 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime61 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = compareActionsByTime60.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime61);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = compareActionsByTime61.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = wildcardTimedActionComparator59.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime61);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator65 = wildcardTimedActionComparator55.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime61);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = wildcardTimedActionComparator24.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime61);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime67 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime68 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator69 = compareActionsByTime67.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime68);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime70 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime71 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator72 = compareActionsByTime70.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime71);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator73 = compareActionsByTime71.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime74 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime75 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = compareActionsByTime74.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime75);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = compareActionsByTime75.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = wildcardTimedActionComparator73.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime75);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime79 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime80 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator81 = compareActionsByTime79.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime80);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator82 = compareActionsByTime80.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator83 = wildcardTimedActionComparator73.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime80);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator84 = compareActionsByTime68.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime80);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator85 = compareActionsByTime68.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator86 = wildcardTimedActionComparator66.thenComparing(wildcardTimedActionComparator85);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator87 = compareActionsByTime10.thenComparing(wildcardTimedActionComparator66);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator88 = compareActionsByTime10.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator89 = compareActionsByTime10.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator90 = wildcardTimedActionComparator89.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator91 = wildcardTimedActionComparator89.reversed();
        java.lang.Class<?> wildcardClass92 = wildcardTimedActionComparator89.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator65);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator69);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator72);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator73);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator81);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator82);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator83);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator84);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator85);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator86);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator87);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator88);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator89);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator90);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator91);
        org.junit.Assert.assertNotNull(wildcardClass92);
    }

    @Test
    public void test15003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15003");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        long long4 = testScheduler0.time;
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        long long9 = testScheduler0.time;
        testScheduler0.settime(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
    }

    @Test
    public void test15004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15004");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        testScheduler0.time = ' ';
        long long11 = testScheduler0.gettime();
        testScheduler0.settime(52L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.getqueue();
        testScheduler0.settime((long) (byte) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.queue;
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        rx.util.functions.Action0 action0_21 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler0.schedulePeriodically(action0_21, (long) (byte) 0, (long) '4', timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test15005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15005");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.time = (short) 100;
        long long12 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        testScheduler0.settime((long) 'a');
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test15006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15006");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (-1);
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long5 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        testScheduler0.settime(97L);
        testScheduler0.settime(32L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
    }

    @Test
    public void test15007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15007");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        long long4 = testScheduler0.gettime();
        testScheduler0.time = 1L;
        long long7 = testScheduler0.gettime();
        testScheduler0.settime((long) ' ');
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.gettime();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
    }

    @Test
    public void test15008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15008");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.time;
        testScheduler0.time = 0L;
        long long8 = testScheduler0.now();
        testScheduler0.settime(0L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        long long12 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test15009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15009");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.settime((long) 10);
        testScheduler0.triggerActions();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
    }

    @Test
    public void test15010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15010");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) (byte) 10);
        testScheduler0.time = (short) 100;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
    }

    @Test
    public void test15011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15011");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.triggerActions(35L);
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_5 = null;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription9 = testScheduler0.schedulePeriodically(action0_5, (long) '4', 32L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
    }

    @Test
    public void test15012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15012");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) (byte) 1);
        long long8 = testScheduler0.gettime();
        long long9 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.time = ' ';
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedulePeriodically(action0_16, (long) 100, (long) '4', timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test15013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15013");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        testScheduler0.settime((long) (short) -1);
        long long7 = testScheduler0.now();
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.gettime();
        long long10 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test15014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15014");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime17 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime16.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime17);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = wildcardTimedActionComparator15.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime17);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime8.thenComparing(wildcardTimedActionComparator20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator2.thenComparing(wildcardTimedActionComparator20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator22.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = wildcardTimedActionComparator23.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime25 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime26 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime25.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime26);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime28 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime29 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = compareActionsByTime28.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime29);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = compareActionsByTime29.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime32 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = compareActionsByTime32.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime33);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = wildcardTimedActionComparator31.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime33);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime37 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime38 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = compareActionsByTime37.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime38);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = compareActionsByTime38.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime41 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime42 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = compareActionsByTime41.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime42);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = compareActionsByTime42.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = wildcardTimedActionComparator40.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime42);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = compareActionsByTime33.thenComparing(wildcardTimedActionComparator45);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = wildcardTimedActionComparator27.thenComparing(wildcardTimedActionComparator45);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = wildcardTimedActionComparator47.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = wildcardTimedActionComparator48.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = wildcardTimedActionComparator48.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = wildcardTimedActionComparator24.thenComparing(wildcardTimedActionComparator48);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = wildcardTimedActionComparator24.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime53 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime54 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = compareActionsByTime53.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime54);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = compareActionsByTime54.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime57 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime58 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = compareActionsByTime57.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime58);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator60 = compareActionsByTime58.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = wildcardTimedActionComparator56.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime58);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = compareActionsByTime58.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime63 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime64 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator65 = compareActionsByTime63.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime64);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = compareActionsByTime58.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime64);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime67 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime68 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator69 = compareActionsByTime67.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime68);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = compareActionsByTime68.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime71 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime72 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator73 = compareActionsByTime71.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime72);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = compareActionsByTime72.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator75 = wildcardTimedActionComparator70.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime72);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = compareActionsByTime72.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = compareActionsByTime64.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime72);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = compareActionsByTime64.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = wildcardTimedActionComparator24.thenComparing(wildcardTimedActionComparator78);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = wildcardTimedActionComparator24.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator60);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator65);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator69);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator73);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator75);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
    }

    @Test
    public void test15015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15015");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        testScheduler0.settime((long) 1);
        testScheduler0.triggerActions((long) 10);
        long long8 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.time;
        long long13 = testScheduler0.now();
        testScheduler0.time = (short) -1;
        java.lang.Class<?> wildcardClass16 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test15016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15016");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.time;
        testScheduler0.triggerActions((long) ' ');
        long long8 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) '#');
        testScheduler0.time = '#';
        testScheduler0.triggerActions();
        long long18 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test15017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15017");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        long long4 = testScheduler0.gettime();
        testScheduler0.time = (byte) 1;
        long long7 = testScheduler0.time;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test15018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15018");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.time = (short) 100;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        testScheduler0.settime((long) (byte) 0);
        long long17 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) 0);
        long long20 = testScheduler0.now();
        rx.util.functions.Action0 action0_21 = null;
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription25 = testScheduler0.schedulePeriodically(action0_21, (long) (byte) 10, (long) '#', timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test15019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15019");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.time = (short) -1;
        long long5 = testScheduler0.time;
        testScheduler0.settime(10L);
        long long8 = testScheduler0.gettime();
        testScheduler0.settime((long) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
    }

    @Test
    public void test15020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15020");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        testScheduler0.settime((long) (short) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        long long10 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test15021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15021");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.queue;
        long long3 = testScheduler0.now();
        testScheduler0.triggerActions(52L);
        testScheduler0.settime((long) (short) -1);
        long long8 = testScheduler0.gettime();
        testScheduler0.time = 35L;
        testScheduler0.settime(1L);
        testScheduler0.time = 1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.getqueue();
        long long16 = testScheduler0.gettime();
        testScheduler0.time = (short) 0;
        long long19 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_21 = null;
        java.util.concurrent.TimeUnit timeUnit23 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription24 = testScheduler0.schedule(action0_21, 100L, timeUnit23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 1L + "'", long16 == 1L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test15022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15022");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.settime((-1L));
        testScheduler0.triggerActions(1L);
        testScheduler0.triggerActions((long) '#');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        long long13 = testScheduler0.time;
        long long14 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue17 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedule(action0_18, (long) 100, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 35L + "'", long14 == 35L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
    }

    @Test
    public void test15023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15023");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.time = ' ';
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) (byte) 1);
        long long7 = testScheduler0.time;
        testScheduler0.triggerActions();
        long long9 = testScheduler0.gettime();
        long long10 = testScheduler0.gettime();
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) -1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test15024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15024");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        testScheduler0.triggerActions();
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        long long9 = testScheduler0.time;
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) (short) 0, (long) 0, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
    }

    @Test
    public void test15025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15025");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (-1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        testScheduler0.time = 10;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        testScheduler0.settime((long) ' ');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test15026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15026");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) (short) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        long long13 = testScheduler0.time;
        testScheduler0.settime(1L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.getqueue();
        long long17 = testScheduler0.time;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test15027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15027");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime5.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime10 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime11 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = compareActionsByTime10.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime11);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime5.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime11);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime14 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime15 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = compareActionsByTime14.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime15);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime15.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime18.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator17.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = compareActionsByTime19.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime24 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime25 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = compareActionsByTime24.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime25);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime25);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = wildcardTimedActionComparator13.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime31 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime30.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime31);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = compareActionsByTime31.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime35 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime34.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime35);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = compareActionsByTime35.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = wildcardTimedActionComparator33.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime35);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = compareActionsByTime35.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = wildcardTimedActionComparator13.thenComparing(wildcardTimedActionComparator39);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime41 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime42 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = compareActionsByTime41.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime42);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = compareActionsByTime41.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = compareActionsByTime41.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = wildcardTimedActionComparator13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime41);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = wildcardTimedActionComparator13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = wildcardTimedActionComparator47.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = wildcardTimedActionComparator48.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = wildcardTimedActionComparator48.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
    }

    @Test
    public void test15028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15028");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        long long3 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.gettime();
        long long7 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        testScheduler0.settime(52L);
        testScheduler0.settime(10L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test15029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15029");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.time = ' ';
        long long4 = testScheduler0.now();
        testScheduler0.time = (short) -1;
        testScheduler0.time = (byte) 10;
        long long9 = testScheduler0.time;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test15030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15030");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        long long4 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.settime((long) (byte) 0);
        testScheduler0.time = 0L;
        testScheduler0.settime((long) 1);
        long long12 = testScheduler0.gettime();
        long long13 = testScheduler0.time;
        testScheduler0.triggerActions((long) (byte) 10);
        long long16 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        long long19 = testScheduler0.time;
        testScheduler0.settime((long) (byte) -1);
        long long22 = testScheduler0.now();
        rx.util.functions.Action0 action0_23 = null;
        rx.Subscription subscription24 = testScheduler0.schedule(action0_23);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(subscription24);
    }

    @Test
    public void test15031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15031");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        long long4 = testScheduler0.gettime();
        testScheduler0.time = 1L;
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(action0_8, (long) (byte) 100, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
    }

    @Test
    public void test15032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15032");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        long long4 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        long long6 = testScheduler0.time;
        testScheduler0.settime((long) (short) 0);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10L + "'", long6 == 10L);
    }

    @Test
    public void test15033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15033");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.queue;
        long long3 = testScheduler0.now();
        long long4 = testScheduler0.time;
        testScheduler0.time = (-1);
        long long7 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test15034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15034");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        testScheduler0.settime((long) (short) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        testScheduler0.triggerActions((long) ' ');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        testScheduler0.triggerActions(52L);
        long long16 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test15035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15035");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        long long4 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, (long) 100, (-1L), timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(subscription8);
    }

    @Test
    public void test15036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15036");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long8 = testScheduler0.gettime();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        long long13 = testScheduler0.now();
        testScheduler0.triggerActions((long) (short) -1);
        testScheduler0.settime((long) 100);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test15037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15037");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime18.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime19.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime22 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime23 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = compareActionsByTime22.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator21.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = compareActionsByTime13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = compareActionsByTime23.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime31 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime30.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime31);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime33.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime34);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime34.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime37 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime38 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = compareActionsByTime37.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime38);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = compareActionsByTime38.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = wildcardTimedActionComparator36.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime38);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime42 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime43 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = compareActionsByTime42.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime43);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = compareActionsByTime43.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime46 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime47 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = compareActionsByTime46.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = compareActionsByTime47.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = wildcardTimedActionComparator45.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = compareActionsByTime38.thenComparing(wildcardTimedActionComparator50);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = wildcardTimedActionComparator32.thenComparing(wildcardTimedActionComparator50);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = wildcardTimedActionComparator32.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = wildcardTimedActionComparator29.thenComparing(wildcardTimedActionComparator53);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = wildcardTimedActionComparator54.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime56 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime57 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = compareActionsByTime56.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime57);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = compareActionsByTime57.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime60 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime61 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = compareActionsByTime60.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime61);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = compareActionsByTime61.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = wildcardTimedActionComparator59.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime61);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator65 = compareActionsByTime61.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = wildcardTimedActionComparator54.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime61);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator67 = compareActionsByTime61.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime68 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime69 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = compareActionsByTime68.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime69);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = compareActionsByTime68.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime72 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime73 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = compareActionsByTime72.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime73);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator75 = compareActionsByTime72.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = compareActionsByTime68.thenComparing(wildcardTimedActionComparator75);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = wildcardTimedActionComparator75.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = wildcardTimedActionComparator75.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = wildcardTimedActionComparator75.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = compareActionsByTime61.thenComparing(wildcardTimedActionComparator79);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator81 = compareActionsByTime61.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator65);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator67);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator75);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator81);
    }

    @Test
    public void test15038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15038");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.settime((-1L));
        testScheduler0.triggerActions(1L);
        testScheduler0.triggerActions((long) '#');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        long long13 = testScheduler0.time;
        testScheduler0.triggerActions();
        long long15 = testScheduler0.time;
        testScheduler0.time = 100;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 100, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 35L + "'", long15 == 35L);
    }

    @Test
    public void test15039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15039");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) (byte) 1);
        long long8 = testScheduler0.gettime();
        long long9 = testScheduler0.gettime();
        testScheduler0.settime((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.settime((long) 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test15040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15040");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.time = (short) -1;
        long long5 = testScheduler0.time;
        testScheduler0.time = 0L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test15041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15041");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.settime((long) ' ');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.time;
        long long8 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions(1L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 32L + "'", long7 == 32L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
    }

    @Test
    public void test15042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15042");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        long long4 = testScheduler0.gettime();
        testScheduler0.time = 1L;
        long long7 = testScheduler0.gettime();
        testScheduler0.settime((long) 0);
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        long long15 = testScheduler0.gettime();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
    }

    @Test
    public void test15043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15043");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long8 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(action0_12, (long) '4', 32L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test15044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15044");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        long long4 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.settime((long) (byte) 0);
        testScheduler0.time = 0L;
        testScheduler0.settime((long) 1);
        long long12 = testScheduler0.gettime();
        long long13 = testScheduler0.time;
        long long14 = testScheduler0.now();
        testScheduler0.triggerActions((long) (byte) 1);
        long long17 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.getqueue();
        long long19 = testScheduler0.time;
        testScheduler0.triggerActions();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1L + "'", long19 == 1L);
    }

    @Test
    public void test15045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15045");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        long long8 = testScheduler0.time;
        long long9 = testScheduler0.time;
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test15046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15046");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
    }

    @Test
    public void test15047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15047");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        long long3 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        testScheduler0.settime((long) 10);
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) -1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test15048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15048");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.time = 'a';
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        testScheduler0.settime((long) (short) 0);
        rx.util.functions.Action0 action0_11 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedulePeriodically(action0_11, (-1L), (long) 100, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test15049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15049");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 0;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        long long8 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) 10);
        testScheduler0.time = (short) 100;
        long long13 = testScheduler0.time;
        testScheduler0.time = (byte) 10;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13 == 100L);
    }

    @Test
    public void test15050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15050");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.triggerActions((-1L));
        testScheduler0.time = (-1L);
        long long12 = testScheduler0.now();
        testScheduler0.settime(32L);
        long long15 = testScheduler0.time;
        testScheduler0.time = (-1L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.getqueue();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
    }

    @Test
    public void test15051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15051");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.time;
        testScheduler0.time = 1;
        testScheduler0.settime((long) (short) 10);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test15052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15052");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        long long4 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        long long8 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test15053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15053");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        testScheduler0.time = '4';
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test15054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15054");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (-1);
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.settime((long) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) (byte) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) '#');
        testScheduler0.triggerActions((long) (short) 1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test15055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15055");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        testScheduler0.settime((long) 1);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.time;
        testScheduler0.triggerActions();
        long long9 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        testScheduler0.time = (-1);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test15056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15056");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        testScheduler0.time = (byte) -1;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) 1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        testScheduler0.settime(52L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        long long12 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        testScheduler0.time = '#';
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.queue;
        long long17 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.queue;
        testScheduler0.triggerActions((long) ' ');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 35L + "'", long17 == 35L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
    }

    @Test
    public void test15057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15057");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = compareActionsByTime0.thenComparing(wildcardTimedActionComparator7);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime10 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = compareActionsByTime9.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime10);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = compareActionsByTime10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime14 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime14);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = compareActionsByTime14.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = wildcardTimedActionComparator12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime14);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime14.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime14.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = wildcardTimedActionComparator19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = wildcardTimedActionComparator7.thenComparing(wildcardTimedActionComparator19);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime22 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime23 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = compareActionsByTime22.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime23.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime26 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime27 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = compareActionsByTime26.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime27);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = compareActionsByTime27.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator25.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime27);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = compareActionsByTime27.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime32 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = compareActionsByTime32.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime33);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime27.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime33);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime37 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime36.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime37);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = compareActionsByTime37.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime40 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime41 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = compareActionsByTime40.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime41);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = compareActionsByTime41.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = wildcardTimedActionComparator39.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime41);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = compareActionsByTime41.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime46 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime47 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = compareActionsByTime46.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = compareActionsByTime41.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = wildcardTimedActionComparator49.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = compareActionsByTime33.thenComparing(wildcardTimedActionComparator50);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime52 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime53 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = compareActionsByTime52.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime53);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = compareActionsByTime53.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime56 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime57 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = compareActionsByTime56.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime57);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = compareActionsByTime57.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator60 = wildcardTimedActionComparator55.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime57);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = wildcardTimedActionComparator51.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime57);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = wildcardTimedActionComparator19.thenComparing(wildcardTimedActionComparator61);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = wildcardTimedActionComparator19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = wildcardTimedActionComparator63.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator60);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
    }

    @Test
    public void test15058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15058");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.time;
        long long6 = testScheduler0.time;
        testScheduler0.triggerActions(35L);
        testScheduler0.time = 0L;
        long long11 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test15059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15059");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        long long4 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test15060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15060");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.time = (byte) -1;
        testScheduler0.time = (short) -1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.time;
        testScheduler0.settime((long) (byte) 1);
        testScheduler0.triggerActions((long) (byte) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.queue;
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
        org.junit.Assert.assertNotNull(subscription18);
    }

    @Test
    public void test15061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15061");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        testScheduler0.time = (byte) -1;
        long long5 = testScheduler0.time;
        testScheduler0.settime((long) 1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        testScheduler0.time = 0L;
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test15062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15062");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (-1);
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        java.util.concurrent.TimeUnit timeUnit8 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(10L, timeUnit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
    }

    @Test
    public void test15063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15063");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime5.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime10 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime11 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = compareActionsByTime10.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime11);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime5.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime11);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime14 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime15 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = compareActionsByTime14.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime15);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime15.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime18.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator17.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = compareActionsByTime19.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime24 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime25 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = compareActionsByTime24.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime25);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime25);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = wildcardTimedActionComparator13.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime31 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime30.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime31);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = compareActionsByTime31.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime35 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime34.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime35);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = compareActionsByTime35.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = wildcardTimedActionComparator33.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime35);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime39 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime40 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = compareActionsByTime39.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime40);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = compareActionsByTime40.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime43 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime44 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = compareActionsByTime43.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime44);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = compareActionsByTime44.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = wildcardTimedActionComparator42.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime44);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = compareActionsByTime35.thenComparing(wildcardTimedActionComparator47);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime49 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime50 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = compareActionsByTime49.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime50);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = compareActionsByTime49.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = wildcardTimedActionComparator48.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime49);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = wildcardTimedActionComparator13.thenComparing(wildcardTimedActionComparator53);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = wildcardTimedActionComparator54.reversed();
        java.lang.Class<?> wildcardClass56 = wildcardTimedActionComparator55.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardClass56);
    }

    @Test
    public void test15064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15064");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        testScheduler0.settime((long) 0);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test15065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15065");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        testScheduler0.settime((long) 1);
        long long6 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test15066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15066");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.gettime();
        long long6 = testScheduler0.now();
        testScheduler0.settime(10L);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        testScheduler0.settime((-1L));
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, (long) 'a', timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test15067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15067");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.settime((long) (short) -1);
        long long8 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long10 = testScheduler0.gettime();
        long long11 = testScheduler0.gettime();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-1L) + "'", long11 == (-1L));
    }

    @Test
    public void test15068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15068");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 0;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        long long8 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) 'a');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) (short) 0);
        long long14 = testScheduler0.time;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test15069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15069");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime18.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime19.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime22 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime23 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = compareActionsByTime22.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator21.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = compareActionsByTime13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator29.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator29.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = wildcardTimedActionComparator29.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime33.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime34);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime37 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime36.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime37);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = compareActionsByTime37.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime40 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime41 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = compareActionsByTime40.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime41);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = compareActionsByTime41.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = wildcardTimedActionComparator39.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime41);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime45 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime46 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = compareActionsByTime45.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime46);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = compareActionsByTime46.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = wildcardTimedActionComparator39.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime46);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = compareActionsByTime34.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime46);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime51 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime52 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = compareActionsByTime51.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime52);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = compareActionsByTime52.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime55 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime56 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = compareActionsByTime55.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime56);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = compareActionsByTime56.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = wildcardTimedActionComparator54.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime56);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator60 = compareActionsByTime56.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = compareActionsByTime46.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime56);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = compareActionsByTime56.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = wildcardTimedActionComparator62.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = wildcardTimedActionComparator62.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator65 = wildcardTimedActionComparator62.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = wildcardTimedActionComparator29.thenComparing(wildcardTimedActionComparator65);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator67 = wildcardTimedActionComparator65.reversed();
        java.lang.Class<?> wildcardClass68 = wildcardTimedActionComparator65.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator60);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator65);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator67);
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test15070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15070");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 0;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        long long8 = testScheduler0.time;
        testScheduler0.triggerActions();
        testScheduler0.settime(97L);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test15071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15071");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator9.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator10.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = wildcardTimedActionComparator10.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
    }

    @Test
    public void test15072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15072");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.settime((-1L));
        testScheduler0.triggerActions(0L);
        testScheduler0.time = (short) 0;
        testScheduler0.settime((long) (byte) 100);
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test15073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15073");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.settime((long) (short) 10);
        testScheduler0.triggerActions();
        testScheduler0.settime((long) (byte) 0);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions((long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test15074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15074");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.time = (short) -1;
        rx.util.functions.Action0 action0_5 = null;
        rx.Subscription subscription6 = testScheduler0.schedule(action0_5);
        testScheduler0.time = (byte) 0;
        testScheduler0.time = (-1L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        testScheduler0.time = (short) 100;
        testScheduler0.time = (short) 100;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(subscription6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test15075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15075");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.now();
        testScheduler0.settime((long) (short) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        long long9 = testScheduler0.gettime();
        testScheduler0.time = (byte) 0;
        testScheduler0.triggerActions();
        testScheduler0.time = 1;
        testScheduler0.settime(35L);
        rx.util.functions.Action0 action0_17 = null;
        java.util.concurrent.TimeUnit timeUnit20 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription21 = testScheduler0.schedulePeriodically(action0_17, (long) '#', 1L, timeUnit20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test15076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15076");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.getqueue();
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.time = ' ';
        testScheduler0.settime((long) (short) 100);
        testScheduler0.time = (short) 10;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test15077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15077");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.time = 97L;
        testScheduler0.settime(10L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test15078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15078");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.time = (byte) -1;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        testScheduler0.triggerActions(0L);
        long long11 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        long long14 = testScheduler0.gettime();
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 10, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test15079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15079");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        testScheduler0.time = '4';
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        long long11 = testScheduler0.time;
        long long12 = testScheduler0.gettime();
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(action0_18, (long) (short) -1, (long) (-1), timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test15080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15080");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.time = (byte) -1;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.time = 0L;
        long long11 = testScheduler0.time;
        java.lang.Class<?> wildcardClass12 = testScheduler0.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test15081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15081");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        testScheduler0.time = ' ';
        testScheduler0.settime((long) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue17 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(action0_18, (long) '#', (long) '#', timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
    }

    @Test
    public void test15082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15082");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions(52L);
        long long10 = testScheduler0.gettime();
        long long11 = testScheduler0.time;
        long long12 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 52L + "'", long10 == 52L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test15083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15083");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        testScheduler0.triggerActions((long) ' ');
        testScheduler0.triggerActions();
        testScheduler0.settime((long) 1);
        long long10 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        long long12 = testScheduler0.time;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) '4', timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1L + "'", long12 == 1L);
    }

    @Test
    public void test15084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15084");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.time = ' ';
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.time = 52L;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long9 = testScheduler0.time;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
    }

    @Test
    public void test15085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15085");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        testScheduler0.settime((long) (short) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        testScheduler0.settime((long) 'a');
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        long long14 = testScheduler0.gettime();
        long long15 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 97L + "'", long14 == 97L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
    }

    @Test
    public void test15086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15086");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        long long9 = testScheduler0.gettime();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(10L, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test15087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15087");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.time = ' ';
        long long4 = testScheduler0.now();
        testScheduler0.time = (short) -1;
        testScheduler0.time = (byte) 10;
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        testScheduler0.triggerActions(1L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test15088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15088");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        long long3 = testScheduler0.gettime();
        testScheduler0.settime((long) '4');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        long long7 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test15089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15089");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.getqueue();
        testScheduler0.settime((long) (-1));
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        testScheduler0.settime(0L);
        testScheduler0.time = 1;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
    }

    @Test
    public void test15090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15090");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 0;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
    }

    @Test
    public void test15091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15091");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        testScheduler0.settime((long) 1);
        testScheduler0.time = (short) 100;
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        long long14 = testScheduler0.gettime();
        long long15 = testScheduler0.time;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test15092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15092");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.time;
        testScheduler0.triggerActions((long) (-1));
        long long10 = testScheduler0.gettime();
        testScheduler0.settime(100L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        long long14 = testScheduler0.gettime();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
    }

    @Test
    public void test15093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15093");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.time = 1L;
        long long6 = testScheduler0.gettime();
        long long7 = testScheduler0.gettime();
        long long8 = testScheduler0.gettime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
    }

    @Test
    public void test15094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15094");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        testScheduler0.settime((long) 1);
        testScheduler0.triggerActions((long) 10);
        long long8 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        long long11 = testScheduler0.gettime();
        testScheduler0.time = (short) 1;
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.time;
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(action0_16, 35L, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1L + "'", long15 == 1L);
    }

    @Test
    public void test15095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15095");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '#');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.time;
        testScheduler0.settime((long) (short) 100);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
    }

    @Test
    public void test15096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15096");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.settime((long) 0);
        long long5 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        long long7 = testScheduler0.now();
        testScheduler0.time = (byte) 0;
        long long10 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
    }

    @Test
    public void test15097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15097");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.time = (short) 100;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test15098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15098");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.triggerActions((long) (short) -1);
        long long8 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-1L) + "'", long8 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test15099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15099");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        long long9 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions(1L);
        long long13 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.queue;
        long long15 = testScheduler0.now();
        testScheduler0.triggerActions();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test15100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15100");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        testScheduler0.settime((long) 1);
        testScheduler0.triggerActions((long) 10);
        long long8 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.time;
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(action0_14, (long) (short) 1, 97L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test15101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15101");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.time = (byte) -1;
        testScheduler0.time = 0;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        testScheduler0.time = '#';
        long long12 = testScheduler0.time;
        testScheduler0.triggerActions(100L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 35L + "'", long12 == 35L);
    }

    @Test
    public void test15102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15102");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.now();
        testScheduler0.time = 0L;
        long long8 = testScheduler0.time;
        testScheduler0.settime((long) (-1));
        testScheduler0.time = 10;
        long long13 = testScheduler0.gettime();
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.gettime();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
    }

    @Test
    public void test15103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15103");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        long long9 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        long long11 = testScheduler0.time;
        testScheduler0.triggerActions(32L);
        long long14 = testScheduler0.time;
        long long15 = testScheduler0.gettime();
        long long16 = testScheduler0.time;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 32L + "'", long16 == 32L);
    }

    @Test
    public void test15104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15104");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.time;
        testScheduler0.triggerActions((long) ' ');
        long long8 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.time = 0L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        testScheduler0.triggerActions(100L);
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(action0_15, 0L, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test15105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15105");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.getqueue();
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.time = ' ';
        testScheduler0.settime((-1L));
        testScheduler0.settime((long) (short) 1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test15106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15106");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.time;
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        testScheduler0.settime((long) 'a');
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test15107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15107");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        testScheduler0.settime((long) 1);
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        testScheduler0.settime((long) (short) 1);
        long long10 = testScheduler0.gettime();
        testScheduler0.settime((long) 10);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
    }

    @Test
    public void test15108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15108");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (-1);
        testScheduler0.settime((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        long long7 = testScheduler0.now();
        testScheduler0.time = 32L;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) -1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test15109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15109");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime0.reversed();
        java.lang.Class<?> wildcardClass5 = compareActionsByTime0.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test15110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15110");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        long long4 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 0;
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedulePeriodically(action0_12, 97L, 0L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test15111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15111");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.settime((long) (byte) 100);
        testScheduler0.triggerActions((long) (byte) 1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.getqueue();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
    }

    @Test
    public void test15112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15112");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        long long4 = testScheduler0.time;
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        testScheduler0.settime((long) '4');
        testScheduler0.triggerActions((long) (byte) -1);
        long long12 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.settime((long) (byte) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.queue;
        long long17 = testScheduler0.now();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test15113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15113");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (-1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        testScheduler0.time = '4';
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        testScheduler0.time = 'a';
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        testScheduler0.time = 52L;
        long long16 = testScheduler0.now();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test15114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15114");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        testScheduler0.triggerActions();
        testScheduler0.time = 'a';
        long long8 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test15115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15115");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime0.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
    }

    @Test
    public void test15116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15116");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.settime((long) 10);
        testScheduler0.triggerActions(0L);
        long long9 = testScheduler0.gettime();
        testScheduler0.time = ' ';
        long long12 = testScheduler0.time;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
    }

    @Test
    public void test15117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15117");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.gettime();
        testScheduler0.settime((long) '4');
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.gettime();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 52L + "'", long9 == 52L);
    }

    @Test
    public void test15118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15118");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.time = (byte) -1;
        testScheduler0.time = (short) -1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        long long10 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) 0);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        testScheduler0.time = 32L;
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue19 = testScheduler0.queue;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions(35L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue19);
    }

    @Test
    public void test15119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15119");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.settime((long) ' ');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 0, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 32L + "'", long5 == 32L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test15120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15120");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) (-1));
        long long7 = testScheduler0.time;
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(action0_8, 32L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-1L) + "'", long7 == (-1L));
    }

    @Test
    public void test15121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15121");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (-1);
        testScheduler0.settime((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        long long7 = testScheduler0.now();
        testScheduler0.time = 32L;
        long long10 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        long long12 = testScheduler0.time;
        long long13 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 32L + "'", long12 == 32L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test15122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15122");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.now();
        testScheduler0.time = 0L;
        long long8 = testScheduler0.time;
        testScheduler0.settime((long) (short) 100);
        long long11 = testScheduler0.now();
        testScheduler0.time = 0L;
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(action0_14, 10L, (long) (byte) 1, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test15123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15123");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.time;
        testScheduler0.triggerActions((long) ' ');
        testScheduler0.triggerActions();
        long long9 = testScheduler0.time;
        testScheduler0.settime((long) (short) 10);
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.gettime();
        long long14 = testScheduler0.now();
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedule(action0_15, (long) (short) 100, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test15124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15124");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        testScheduler0.settime((long) (short) -1);
        long long7 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        testScheduler0.settime((long) '#');
        testScheduler0.time = 1L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test15125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15125");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime19.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime23 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime24 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime23.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime24);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime19.thenComparing(wildcardTimedActionComparator26);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime28 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime29 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = compareActionsByTime28.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime29);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = compareActionsByTime29.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime32 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = compareActionsByTime32.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime33);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = wildcardTimedActionComparator31.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime33);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = compareActionsByTime33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = wildcardTimedActionComparator38.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = wildcardTimedActionComparator26.thenComparing(wildcardTimedActionComparator38);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = wildcardTimedActionComparator18.thenComparing(wildcardTimedActionComparator26);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = wildcardTimedActionComparator41.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = wildcardTimedActionComparator41.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = wildcardTimedActionComparator43.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = wildcardTimedActionComparator44.reversed();
        java.lang.Class<?> wildcardClass46 = wildcardTimedActionComparator45.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test15126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15126");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_8 = null;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription11 = testScheduler0.schedule(action0_8, 97L, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
    }

    @Test
    public void test15127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15127");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        long long4 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.settime((long) (byte) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        long long9 = testScheduler0.time;
        long long10 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        long long12 = testScheduler0.now();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test15128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15128");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        testScheduler0.triggerActions(35L);
        testScheduler0.triggerActions();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
    }

    @Test
    public void test15129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15129");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.time;
        testScheduler0.settime(100L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test15130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15130");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.time = (byte) -1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.settime((long) 100);
        long long10 = testScheduler0.gettime();
        testScheduler0.time = 'a';
        long long13 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedule(action0_14, (long) (byte) 10, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 97L + "'", long13 == 97L);
    }

    @Test
    public void test15131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15131");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        testScheduler0.time = (byte) -1;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) 1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        testScheduler0.settime(52L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        long long12 = testScheduler0.time;
        testScheduler0.triggerActions();
        long long14 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.settime((long) '4');
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test15132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15132");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.time = (byte) -1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.settime((long) 100);
        testScheduler0.triggerActions(0L);
        long long12 = testScheduler0.time;
        testScheduler0.triggerActions();
        long long14 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
    }

    @Test
    public void test15133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15133");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.settime((long) ' ');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test15134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15134");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        testScheduler0.settime((long) 1);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.time;
        testScheduler0.triggerActions();
        long long9 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.now();
        testScheduler0.triggerActions(10L);
        testScheduler0.triggerActions(0L);
        long long18 = testScheduler0.now();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test15135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15135");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.time;
        testScheduler0.time = 0L;
        long long8 = testScheduler0.now();
        testScheduler0.settime(0L);
        testScheduler0.triggerActions((long) ' ');
        long long13 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        testScheduler0.triggerActions();
        long long17 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.getqueue();
        long long19 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
    }

    @Test
    public void test15136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15136");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.triggerActions((long) (short) 10);
        long long8 = testScheduler0.time;
        long long9 = testScheduler0.gettime();
        long long10 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
        org.junit.Assert.assertNotNull(subscription12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test15137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15137");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.settime((long) 0);
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions((long) (byte) 10);
        testScheduler0.triggerActions(10L);
        testScheduler0.time = (byte) 10;
        long long13 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test15138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15138");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator9.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator10.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = wildcardTimedActionComparator10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime14 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime14);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = compareActionsByTime14.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime14.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = wildcardTimedActionComparator17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = wildcardTimedActionComparator17.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime21 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime20.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime21);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = compareActionsByTime21.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime24 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime25 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = compareActionsByTime24.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime25);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime25.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator23.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime25);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = compareActionsByTime25.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime31 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime30.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime31);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = compareActionsByTime25.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime31);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime35 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime34.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime35);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = compareActionsByTime35.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime38 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime39 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = compareActionsByTime38.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime39);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = compareActionsByTime39.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = wildcardTimedActionComparator37.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime39);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = compareActionsByTime39.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = compareActionsByTime31.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime39);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = wildcardTimedActionComparator19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime31);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime46 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime47 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = compareActionsByTime46.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = wildcardTimedActionComparator45.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime50 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime51 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = compareActionsByTime50.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime51);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = compareActionsByTime51.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime54 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime55 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = compareActionsByTime54.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime55);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = compareActionsByTime55.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = wildcardTimedActionComparator53.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime55);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = compareActionsByTime55.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime60 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime61 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = compareActionsByTime60.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime61);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = compareActionsByTime55.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime61);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime64 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime65 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = compareActionsByTime64.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime65);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator67 = compareActionsByTime65.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime68 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime69 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = compareActionsByTime68.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime69);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = compareActionsByTime69.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator72 = wildcardTimedActionComparator67.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime69);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator73 = compareActionsByTime69.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime74 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime75 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = compareActionsByTime74.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime75);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = compareActionsByTime69.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime75);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = wildcardTimedActionComparator77.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = compareActionsByTime61.thenComparing(wildcardTimedActionComparator78);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime80 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime81 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator82 = compareActionsByTime80.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime81);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator83 = compareActionsByTime81.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime84 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime85 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator86 = compareActionsByTime84.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime85);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator87 = compareActionsByTime85.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator88 = wildcardTimedActionComparator83.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime85);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator89 = wildcardTimedActionComparator79.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime85);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator90 = wildcardTimedActionComparator89.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator91 = wildcardTimedActionComparator45.thenComparing(wildcardTimedActionComparator90);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator92 = wildcardTimedActionComparator12.thenComparing(wildcardTimedActionComparator90);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator67);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator72);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator73);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator82);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator83);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator86);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator87);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator88);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator89);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator90);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator91);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator92);
    }

    @Test
    public void test15139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15139");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.time;
        testScheduler0.time = 0L;
        long long8 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        testScheduler0.time = 52L;
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test15140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15140");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        testScheduler0.time = (byte) -1;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) 1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        testScheduler0.settime(52L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        long long12 = testScheduler0.time;
        testScheduler0.settime(10L);
        long long15 = testScheduler0.now();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test15141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15141");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.time;
        testScheduler0.time = 52L;
        long long10 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test15142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15142");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        testScheduler0.triggerActions((long) ' ');
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test15143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15143");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        testScheduler0.triggerActions(100L);
        long long9 = testScheduler0.time;
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.gettime();
        long long12 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test15144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15144");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        testScheduler0.settime((long) 1);
        long long6 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
    }

    @Test
    public void test15145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15145");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        testScheduler0.settime((long) 1);
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedule(action0_10, (long) (-1), timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test15146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15146");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 0;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        long long8 = testScheduler0.time;
        testScheduler0.triggerActions();
        testScheduler0.settime(97L);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test15147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15147");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        long long6 = testScheduler0.now();
        testScheduler0.time = (short) 100;
        long long9 = testScheduler0.time;
        testScheduler0.time = 52L;
        testScheduler0.settime(52L);
        testScheduler0.triggerActions();
        long long15 = testScheduler0.gettime();
        long long16 = testScheduler0.gettime();
        long long17 = testScheduler0.gettime();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 52L + "'", long16 == 52L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 52L + "'", long17 == 52L);
    }

    @Test
    public void test15148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15148");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        long long4 = testScheduler0.time;
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        testScheduler0.settime((long) '4');
        testScheduler0.time = 1L;
        testScheduler0.triggerActions(0L);
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.gettime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test15149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15149");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 0;
        long long7 = testScheduler0.time;
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
    }

    @Test
    public void test15150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15150");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 0;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        long long9 = testScheduler0.gettime();
        long long10 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test15151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15151");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.time = 'a';
        testScheduler0.time = (byte) 100;
        long long10 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        long long12 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test15152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15152");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = compareActionsByTime4.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = compareActionsByTime0.thenComparing(wildcardTimedActionComparator7);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime10 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = compareActionsByTime9.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime10);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = compareActionsByTime10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime14 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime14);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = compareActionsByTime14.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = wildcardTimedActionComparator12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime14);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime14.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime14.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = wildcardTimedActionComparator19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = wildcardTimedActionComparator7.thenComparing(wildcardTimedActionComparator19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator7.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime23 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime24 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime23.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime24);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = compareActionsByTime23.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime27 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime28 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = compareActionsByTime27.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime28);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = compareActionsByTime27.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = compareActionsByTime23.thenComparing(wildcardTimedActionComparator30);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = wildcardTimedActionComparator31.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime33.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime34);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime37 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime36.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime37);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = compareActionsByTime37.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime40 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime41 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = compareActionsByTime40.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime41);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = compareActionsByTime41.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = wildcardTimedActionComparator39.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime41);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime45 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime46 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = compareActionsByTime45.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime46);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = compareActionsByTime46.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = wildcardTimedActionComparator39.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime46);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = compareActionsByTime34.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime46);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = compareActionsByTime34.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = wildcardTimedActionComparator31.thenComparing(wildcardTimedActionComparator51);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime53 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime54 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = compareActionsByTime53.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime54);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = wildcardTimedActionComparator31.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime53);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = wildcardTimedActionComparator31.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = wildcardTimedActionComparator22.thenComparing(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
    }

    @Test
    public void test15153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15153");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime17 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime16.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime17);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = wildcardTimedActionComparator15.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime17);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime8.thenComparing(wildcardTimedActionComparator20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator2.thenComparing(wildcardTimedActionComparator20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator22.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = wildcardTimedActionComparator23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = wildcardTimedActionComparator23.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime26 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime27 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = compareActionsByTime26.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime27);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = compareActionsByTime27.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = compareActionsByTime27.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime31 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime32 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = compareActionsByTime31.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime32);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = compareActionsByTime31.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime35 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = compareActionsByTime35.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime36);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime35.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = compareActionsByTime31.thenComparing(wildcardTimedActionComparator38);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime40 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime41 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = compareActionsByTime40.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime41);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = compareActionsByTime41.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime44 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime45 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = compareActionsByTime44.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime45);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = compareActionsByTime45.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = wildcardTimedActionComparator43.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime45);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = compareActionsByTime45.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = compareActionsByTime45.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = wildcardTimedActionComparator50.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = wildcardTimedActionComparator38.thenComparing(wildcardTimedActionComparator50);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime53 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime54 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = compareActionsByTime53.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime54);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = compareActionsByTime54.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime57 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime58 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = compareActionsByTime57.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime58);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator60 = compareActionsByTime58.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = wildcardTimedActionComparator56.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime58);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = compareActionsByTime58.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime63 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime64 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator65 = compareActionsByTime63.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime64);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = compareActionsByTime58.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime64);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime67 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime68 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator69 = compareActionsByTime67.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime68);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = compareActionsByTime68.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime71 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime72 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator73 = compareActionsByTime71.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime72);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = compareActionsByTime72.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator75 = wildcardTimedActionComparator70.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime72);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = compareActionsByTime72.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime77 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime78 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = compareActionsByTime77.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime78);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = compareActionsByTime72.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime78);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator81 = wildcardTimedActionComparator80.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator82 = compareActionsByTime64.thenComparing(wildcardTimedActionComparator81);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime83 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime84 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator85 = compareActionsByTime83.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime84);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator86 = compareActionsByTime84.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime87 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime88 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator89 = compareActionsByTime87.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime88);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator90 = compareActionsByTime88.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator91 = wildcardTimedActionComparator86.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime88);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator92 = wildcardTimedActionComparator82.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime88);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator93 = wildcardTimedActionComparator50.thenComparing(wildcardTimedActionComparator92);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator94 = wildcardTimedActionComparator30.thenComparing(wildcardTimedActionComparator50);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator95 = wildcardTimedActionComparator30.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator96 = wildcardTimedActionComparator23.thenComparing(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator60);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator65);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator69);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator73);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator75);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator81);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator82);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator85);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator86);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator89);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator90);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator91);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator92);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator93);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator94);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator95);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator96);
    }

    @Test
    public void test15154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15154");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        long long2 = testScheduler0.time;
        testScheduler0.triggerActions((long) 0);
        testScheduler0.settime((long) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        long long10 = testScheduler0.time;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 10L + "'", long10 == 10L);
    }

    @Test
    public void test15155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15155");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (-1);
        testScheduler0.triggerActions();
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions(32L);
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        long long9 = testScheduler0.time;
        testScheduler0.triggerActions();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
    }

    @Test
    public void test15156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15156");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (-1);
        testScheduler0.settime((long) (byte) 100);
        testScheduler0.time = (short) 1;
        testScheduler0.time = 100L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit15 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription16 = testScheduler0.schedule(action0_13, 32L, timeUnit15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test15157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15157");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.time;
        testScheduler0.triggerActions((long) ' ');
        long long8 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long12 = testScheduler0.now();
        testScheduler0.time = (short) 1;
        testScheduler0.triggerActions();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test15158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15158");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime11 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime11.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime12);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator10.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime12);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime17 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime16.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime17);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime17.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime21 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime20.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime21);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = compareActionsByTime21.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = wildcardTimedActionComparator19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime21);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime12.thenComparing(wildcardTimedActionComparator24);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator6.thenComparing(wildcardTimedActionComparator24);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = wildcardTimedActionComparator26.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator26.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator26);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime31 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime30.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime31);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = compareActionsByTime31.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime35 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime34.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime35);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = compareActionsByTime35.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = wildcardTimedActionComparator33.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime35);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime39 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime40 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = compareActionsByTime39.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime40);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = compareActionsByTime40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = wildcardTimedActionComparator33.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime40);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = wildcardTimedActionComparator29.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime40);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = compareActionsByTime40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = wildcardTimedActionComparator45.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime47 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime48 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = compareActionsByTime47.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime48);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime50 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime51 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = compareActionsByTime50.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime51);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = compareActionsByTime51.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime54 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime55 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = compareActionsByTime54.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime55);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = compareActionsByTime55.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = wildcardTimedActionComparator53.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime55);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime59 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime60 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = compareActionsByTime59.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime60);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = compareActionsByTime60.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = wildcardTimedActionComparator53.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime60);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = compareActionsByTime48.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime60);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime65 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime66 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator67 = compareActionsByTime65.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime66);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator68 = compareActionsByTime66.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime69 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime70 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = compareActionsByTime69.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime70);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator72 = compareActionsByTime70.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator73 = wildcardTimedActionComparator68.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime70);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = compareActionsByTime70.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator75 = compareActionsByTime60.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime70);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = compareActionsByTime70.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = wildcardTimedActionComparator76.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = wildcardTimedActionComparator76.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = wildcardTimedActionComparator78.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = wildcardTimedActionComparator46.thenComparing(wildcardTimedActionComparator78);
        java.lang.Class<?> wildcardClass81 = wildcardTimedActionComparator78.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator67);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator68);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator72);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator73);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator75);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test15159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15159");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        testScheduler0.time = ' ';
        testScheduler0.settime((long) 0);
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 100, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription16);
    }

    @Test
    public void test15160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15160");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.time;
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        testScheduler0.settime((long) 'a');
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 100, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test15161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15161");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime17 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime16.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime17);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = wildcardTimedActionComparator15.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime17);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime8.thenComparing(wildcardTimedActionComparator20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator2.thenComparing(wildcardTimedActionComparator20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator22.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = wildcardTimedActionComparator23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = wildcardTimedActionComparator24.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime26 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime27 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = compareActionsByTime26.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime27);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime29 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = compareActionsByTime29.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime30);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime30.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime33.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime34);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime34.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = wildcardTimedActionComparator32.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime34);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime38 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime39 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = compareActionsByTime38.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime39);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = compareActionsByTime39.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = wildcardTimedActionComparator32.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime39);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = compareActionsByTime27.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime39);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime44 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime45 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = compareActionsByTime44.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime45);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = compareActionsByTime45.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime48 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime49 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = compareActionsByTime48.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime49);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = compareActionsByTime49.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = wildcardTimedActionComparator47.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime49);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = compareActionsByTime49.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = compareActionsByTime39.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime49);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime55 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime56 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = compareActionsByTime55.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime56);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = compareActionsByTime56.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime59 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime60 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = compareActionsByTime59.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime60);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = compareActionsByTime60.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = wildcardTimedActionComparator58.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime60);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = compareActionsByTime60.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime65 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime66 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator67 = compareActionsByTime65.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime66);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator68 = compareActionsByTime60.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime66);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator69 = compareActionsByTime66.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = compareActionsByTime66.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = compareActionsByTime39.thenComparing(wildcardTimedActionComparator70);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime72 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime73 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = compareActionsByTime72.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime73);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator75 = compareActionsByTime39.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime73);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = wildcardTimedActionComparator75.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = wildcardTimedActionComparator76.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = wildcardTimedActionComparator24.thenComparing(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator67);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator68);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator69);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator75);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
    }

    @Test
    public void test15162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15162");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        testScheduler0.settime((long) ' ');
        long long14 = testScheduler0.gettime();
        testScheduler0.time = 0L;
        testScheduler0.settime(32L);
        testScheduler0.time = 1;
        testScheduler0.triggerActions();
        long long22 = testScheduler0.now();
        testScheduler0.settime((long) (byte) 1);
        testScheduler0.triggerActions();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 32L + "'", long14 == 32L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
    }

    @Test
    public void test15163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15163");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime6 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = compareActionsByTime5.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime6);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = compareActionsByTime6.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime6.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator9.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator4.thenComparing(wildcardTimedActionComparator10);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime17 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime16.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime17);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = wildcardTimedActionComparator15.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime17);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = compareActionsByTime17.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime24 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime25 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = compareActionsByTime24.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime25);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime25.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = compareActionsByTime25.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = wildcardTimedActionComparator23.thenComparing(wildcardTimedActionComparator28);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator30.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = wildcardTimedActionComparator31.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime33.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime34);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime34.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = wildcardTimedActionComparator36.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = wildcardTimedActionComparator32.thenComparing(wildcardTimedActionComparator37);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = wildcardTimedActionComparator11.thenComparing(wildcardTimedActionComparator37);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime40 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime41 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = compareActionsByTime40.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime41);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = compareActionsByTime41.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime44 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime45 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = compareActionsByTime44.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime45);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = compareActionsByTime45.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = wildcardTimedActionComparator43.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime45);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = compareActionsByTime45.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime50 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime51 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = compareActionsByTime50.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime51);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = compareActionsByTime45.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime51);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = wildcardTimedActionComparator53.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime55 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime56 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = compareActionsByTime55.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime56);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime58 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime59 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator60 = compareActionsByTime58.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime59);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = compareActionsByTime59.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime62 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime63 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = compareActionsByTime62.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime63);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator65 = compareActionsByTime63.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = wildcardTimedActionComparator61.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime63);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime67 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime68 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator69 = compareActionsByTime67.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime68);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = compareActionsByTime68.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime71 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime72 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator73 = compareActionsByTime71.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime72);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = compareActionsByTime72.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator75 = wildcardTimedActionComparator70.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime72);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = compareActionsByTime63.thenComparing(wildcardTimedActionComparator75);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = wildcardTimedActionComparator57.thenComparing(wildcardTimedActionComparator75);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = wildcardTimedActionComparator75.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = wildcardTimedActionComparator53.thenComparing(wildcardTimedActionComparator75);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = wildcardTimedActionComparator75.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator81 = wildcardTimedActionComparator39.thenComparing(wildcardTimedActionComparator75);
        java.lang.Class<?> wildcardClass82 = wildcardTimedActionComparator39.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator60);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator65);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator69);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator73);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator75);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator81);
        org.junit.Assert.assertNotNull(wildcardClass82);
    }

    @Test
    public void test15164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15164");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.settime((-1L));
        testScheduler0.triggerActions(0L);
        testScheduler0.time = (short) 0;
        rx.util.functions.Action0 action0_12 = null;
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription15 = testScheduler0.schedule(action0_12, (long) '4', timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
    }

    @Test
    public void test15165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15165");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.time;
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        testScheduler0.time = 0L;
        rx.util.functions.Action0 action0_15 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedulePeriodically(action0_15, (long) 100, 10L, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
    }

    @Test
    public void test15166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15166");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        long long2 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions((long) 0);
        long long6 = testScheduler0.gettime();
        testScheduler0.triggerActions((-1L));
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        testScheduler0.time = (short) 100;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test15167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15167");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        testScheduler0.time = '4';
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.time;
        testScheduler0.time = 52L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 52L + "'", long7 == 52L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertNotNull(subscription13);
    }

    @Test
    public void test15168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15168");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        long long2 = testScheduler0.time;
        testScheduler0.triggerActions();
        testScheduler0.time = 'a';
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        testScheduler0.settime(35L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        long long10 = testScheduler0.time;
        long long11 = testScheduler0.gettime();
        testScheduler0.time = (byte) 0;
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 35L + "'", long10 == 35L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 35L + "'", long11 == 35L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
    }

    @Test
    public void test15169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15169");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) (byte) 1);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.time;
        testScheduler0.time = (short) 0;
        testScheduler0.triggerActions();
        long long14 = testScheduler0.time;
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 100;
        long long18 = testScheduler0.gettime();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1L + "'", long10 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test15170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15170");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        long long4 = testScheduler0.gettime();
        testScheduler0.time = 1L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        long long9 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions((long) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1L + "'", long9 == 1L);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test15171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15171");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.now();
        testScheduler0.settime((long) (short) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        long long9 = testScheduler0.gettime();
        testScheduler0.time = (byte) 0;
        testScheduler0.triggerActions();
        testScheduler0.time = 1;
        testScheduler0.settime(35L);
        testScheduler0.triggerActions();
        testScheduler0.time = 10L;
        rx.util.functions.Action0 action0_20 = null;
        java.util.concurrent.TimeUnit timeUnit22 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription23 = testScheduler0.schedule(action0_20, (long) (short) 10, timeUnit22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
    }

    @Test
    public void test15172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15172");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.now();
        testScheduler0.settime((long) (short) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        long long9 = testScheduler0.gettime();
        testScheduler0.time = (byte) 0;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.settime((long) (short) 100);
        long long16 = testScheduler0.time;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 10L + "'", long9 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
    }

    @Test
    public void test15173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15173");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.time;
        testScheduler0.triggerActions((long) ' ');
        long long8 = testScheduler0.now();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        testScheduler0.settime(0L);
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        long long16 = testScheduler0.gettime();
        long long17 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        testScheduler0.settime((long) ' ');
        rx.util.functions.Action0 action0_22 = null;
        rx.Subscription subscription23 = testScheduler0.schedule(action0_22);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(subscription19);
        org.junit.Assert.assertNotNull(subscription23);
    }

    @Test
    public void test15174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15174");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime18.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime21 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime22 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = compareActionsByTime21.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime22);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = compareActionsByTime22.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime25 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime26 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime25.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime26);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = compareActionsByTime26.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = wildcardTimedActionComparator24.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime26);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime31 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime30.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime31);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = compareActionsByTime31.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = wildcardTimedActionComparator24.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime31);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime31);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime19.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime37 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime38 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = compareActionsByTime37.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime38);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = compareActionsByTime37.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime41 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime42 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = compareActionsByTime41.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime42);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = compareActionsByTime41.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = compareActionsByTime37.thenComparing(wildcardTimedActionComparator44);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime46 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime47 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = compareActionsByTime46.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = compareActionsByTime47.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime50 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime51 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = compareActionsByTime50.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime51);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = compareActionsByTime51.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = wildcardTimedActionComparator49.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime51);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = compareActionsByTime51.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = compareActionsByTime51.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = wildcardTimedActionComparator56.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = wildcardTimedActionComparator44.thenComparing(wildcardTimedActionComparator56);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = wildcardTimedActionComparator36.thenComparing(wildcardTimedActionComparator44);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime60 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime61 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = compareActionsByTime60.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime61);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = compareActionsByTime61.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime64 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime65 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = compareActionsByTime64.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime65);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator67 = compareActionsByTime65.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator68 = wildcardTimedActionComparator63.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime65);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator69 = compareActionsByTime65.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = compareActionsByTime65.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = wildcardTimedActionComparator70.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator72 = wildcardTimedActionComparator44.thenComparing(wildcardTimedActionComparator71);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator73 = wildcardTimedActionComparator72.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = wildcardTimedActionComparator73.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator75 = wildcardTimedActionComparator74.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = compareActionsByTime1.thenComparing(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator67);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator68);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator69);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator72);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator73);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator75);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
    }

    @Test
    public void test15175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15175");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (-1);
        testScheduler0.settime((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        long long7 = testScheduler0.now();
        testScheduler0.time = 32L;
        long long10 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) 100);
        testScheduler0.settime((long) (byte) 0);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 32L + "'", long10 == 32L);
    }

    @Test
    public void test15176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15176");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime18.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime19.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime22 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime23 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = compareActionsByTime22.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator21.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = compareActionsByTime13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime29 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = compareActionsByTime29.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime30);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime30.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime33.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime34);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime34.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = wildcardTimedActionComparator32.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime34);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime34.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = compareActionsByTime34.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = wildcardTimedActionComparator39.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = compareActionsByTime23.thenComparing(wildcardTimedActionComparator40);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime42 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime43 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = compareActionsByTime42.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime43);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = compareActionsByTime43.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime46 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime47 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = compareActionsByTime46.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = compareActionsByTime47.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = wildcardTimedActionComparator45.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = compareActionsByTime47.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = compareActionsByTime47.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = wildcardTimedActionComparator52.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = compareActionsByTime23.thenComparing(wildcardTimedActionComparator53);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = wildcardTimedActionComparator53.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = wildcardTimedActionComparator55.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime57 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime58 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = compareActionsByTime57.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime58);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator60 = compareActionsByTime57.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime61 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime62 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = compareActionsByTime61.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime62);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = compareActionsByTime61.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator65 = compareActionsByTime57.thenComparing(wildcardTimedActionComparator64);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = wildcardTimedActionComparator65.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator67 = wildcardTimedActionComparator56.thenComparing(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator60);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator65);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator67);
    }

    @Test
    public void test15177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15177");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        long long5 = testScheduler0.now();
        long long6 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.triggerActions((-1L));
        testScheduler0.time = (-1L);
        long long12 = testScheduler0.now();
        testScheduler0.settime(32L);
        long long15 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
    }

    @Test
    public void test15178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15178");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.time;
        testScheduler0.triggerActions((long) ' ');
        testScheduler0.triggerActions();
        long long9 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        long long11 = testScheduler0.time;
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.lang.Class<?> wildcardClass14 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test15179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15179");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        long long4 = testScheduler0.time;
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        testScheduler0.settime((long) '4');
        testScheduler0.triggerActions((long) (byte) -1);
        long long12 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.queue;
        rx.util.functions.Action0 action0_17 = null;
        rx.Subscription subscription18 = testScheduler0.schedule(action0_17);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue19 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
        org.junit.Assert.assertNotNull(subscription18);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue19);
    }

    @Test
    public void test15180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15180");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime18.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime19.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime22 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime23 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = compareActionsByTime22.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator21.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = compareActionsByTime13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = compareActionsByTime13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = compareActionsByTime13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator30.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
    }

    @Test
    public void test15181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15181");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        long long6 = testScheduler0.time;
        testScheduler0.triggerActions();
        long long8 = testScheduler0.now();
        long long9 = testScheduler0.time;
        long long10 = testScheduler0.now();
        testScheduler0.time = 10L;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test15182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15182");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        testScheduler0.time = (short) 10;
        java.util.concurrent.TimeUnit timeUnit10 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 10, timeUnit10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
    }

    @Test
    public void test15183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15183");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.time = (byte) -1;
        testScheduler0.time = (short) -1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        long long10 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) '4');
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        long long18 = testScheduler0.gettime();
        long long19 = testScheduler0.gettime();
        long long20 = testScheduler0.gettime();
        long long21 = testScheduler0.now();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertNotNull(subscription17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 52L + "'", long18 == 52L);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 52L + "'", long19 == 52L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 52L + "'", long20 == 52L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test15184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15184");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        long long5 = testScheduler0.time;
        testScheduler0.time = 97L;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        testScheduler0.settime((long) (short) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
    }

    @Test
    public void test15185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15185");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        long long4 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        long long6 = testScheduler0.now();
        long long7 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (short) -1);
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((-1L), timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
    }

    @Test
    public void test15186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15186");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        long long8 = testScheduler0.gettime();
        long long9 = testScheduler0.now();
        long long10 = testScheduler0.now();
        testScheduler0.settime(0L);
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '#', timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test15187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15187");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        long long5 = testScheduler0.time;
        testScheduler0.time = 97L;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 100, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test15188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15188");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        testScheduler0.time = (byte) -1;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) 1);
        testScheduler0.triggerActions((long) '#');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test15189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15189");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        testScheduler0.settime((long) (short) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test15190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15190");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.settime((long) ' ');
        long long4 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        java.util.concurrent.TimeUnit timeUnit7 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo(100L, timeUnit7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 32L + "'", long4 == 32L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
    }

    @Test
    public void test15191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15191");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        testScheduler0.time = (short) -1;
        testScheduler0.settime((long) (byte) 10);
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        java.lang.Class<?> wildcardClass12 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test15192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15192");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        long long6 = testScheduler0.time;
        testScheduler0.triggerActions((long) (-1));
        long long9 = testScheduler0.now();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) 100, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test15193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15193");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.triggerActions((long) (short) 10);
        long long8 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions(52L);
        long long12 = testScheduler0.time;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
    }

    @Test
    public void test15194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15194");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 0;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.settime((long) (short) 1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
    }

    @Test
    public void test15195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15195");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.time = (short) 1;
        testScheduler0.triggerActions((long) (short) 100);
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription13 = testScheduler0.schedulePeriodically(action0_9, 97L, (long) (byte) 1, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
    }

    @Test
    public void test15196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15196");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) (short) -1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        testScheduler0.triggerActions((-1L));
        rx.util.functions.Action0 action0_14 = null;
        java.util.concurrent.TimeUnit timeUnit17 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription18 = testScheduler0.schedulePeriodically(action0_14, (long) 0, (long) (byte) 1, timeUnit17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
    }

    @Test
    public void test15197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15197");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.queue;
        testScheduler0.settime((long) (byte) 1);
        testScheduler0.settime((long) (byte) 0);
        long long7 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        testScheduler0.triggerActions((long) ' ');
        java.util.concurrent.TimeUnit timeUnit12 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(0L, timeUnit12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test15198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15198");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.triggerActions((long) ' ');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        testScheduler0.triggerActions();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test15199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15199");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        testScheduler0.settime((long) 1);
        testScheduler0.settime((long) (short) -1);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test15200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15200");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime17 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime16.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime17);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime17.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = wildcardTimedActionComparator15.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime17);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime17.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime22 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime23 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = compareActionsByTime22.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime17.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime26 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime27 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = compareActionsByTime26.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime27);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = compareActionsByTime27.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime31 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime30.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime31);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = compareActionsByTime31.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = wildcardTimedActionComparator29.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime31);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime31.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime37 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime36.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime37);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = compareActionsByTime31.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime37);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = wildcardTimedActionComparator39.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = compareActionsByTime23.thenComparing(wildcardTimedActionComparator40);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime42 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime43 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = compareActionsByTime42.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime43);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = compareActionsByTime43.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime46 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime47 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = compareActionsByTime46.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = compareActionsByTime47.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = wildcardTimedActionComparator45.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = wildcardTimedActionComparator41.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = wildcardTimedActionComparator10.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime53 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime54 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = compareActionsByTime53.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime54);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime56 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime57 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = compareActionsByTime56.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime57);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = compareActionsByTime57.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime60 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime61 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = compareActionsByTime60.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime61);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = compareActionsByTime61.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = wildcardTimedActionComparator59.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime61);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime65 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime66 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator67 = compareActionsByTime65.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime66);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator68 = compareActionsByTime66.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator69 = wildcardTimedActionComparator59.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime66);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = compareActionsByTime54.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime66);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = compareActionsByTime54.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator72 = wildcardTimedActionComparator52.thenComparing(wildcardTimedActionComparator71);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator73 = wildcardTimedActionComparator71.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = wildcardTimedActionComparator71.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator75 = wildcardTimedActionComparator71.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator67);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator68);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator69);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator72);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator73);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator75);
    }

    @Test
    public void test15201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15201");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime11 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator13 = compareActionsByTime11.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime12);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = wildcardTimedActionComparator10.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime12);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime16 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime17 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime16.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime17);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime17.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime21 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime20.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime21);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = compareActionsByTime21.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = wildcardTimedActionComparator19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime21);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime12.thenComparing(wildcardTimedActionComparator24);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator6.thenComparing(wildcardTimedActionComparator24);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = wildcardTimedActionComparator26.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator26.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = wildcardTimedActionComparator3.thenComparing(wildcardTimedActionComparator26);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime31 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime30.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime31);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime33.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime34);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime34.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime37 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime38 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = compareActionsByTime37.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime38);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = compareActionsByTime38.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = wildcardTimedActionComparator36.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime38);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime42 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime43 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = compareActionsByTime42.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime43);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = compareActionsByTime43.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime46 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime47 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = compareActionsByTime46.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = compareActionsByTime47.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = wildcardTimedActionComparator45.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = compareActionsByTime38.thenComparing(wildcardTimedActionComparator50);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = wildcardTimedActionComparator32.thenComparing(wildcardTimedActionComparator50);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = wildcardTimedActionComparator32.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime54 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime55 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = compareActionsByTime54.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime55);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = compareActionsByTime55.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime58 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime59 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator60 = compareActionsByTime58.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime59);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = compareActionsByTime59.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = wildcardTimedActionComparator57.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime59);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = compareActionsByTime59.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime64 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime65 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = compareActionsByTime64.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime65);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator67 = compareActionsByTime59.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime65);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime68 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime69 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = compareActionsByTime68.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime69);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = compareActionsByTime69.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime72 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime73 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = compareActionsByTime72.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime73);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator75 = compareActionsByTime73.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = wildcardTimedActionComparator71.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime73);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = compareActionsByTime73.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime78 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime79 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = compareActionsByTime78.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime79);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator81 = compareActionsByTime73.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime79);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator82 = wildcardTimedActionComparator67.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime73);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator83 = wildcardTimedActionComparator32.thenComparing(wildcardTimedActionComparator82);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator84 = wildcardTimedActionComparator29.thenComparing(wildcardTimedActionComparator82);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator85 = wildcardTimedActionComparator29.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator13);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator60);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator67);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator75);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator81);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator82);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator83);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator84);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator85);
    }

    @Test
    public void test15202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15202");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime18.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime19.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime22 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime23 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = compareActionsByTime22.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator21.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime23.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime28 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime29 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = compareActionsByTime28.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime29);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = compareActionsByTime23.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime29);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime13.thenComparing(wildcardTimedActionComparator31);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = wildcardTimedActionComparator31.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = wildcardTimedActionComparator33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = wildcardTimedActionComparator34.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = wildcardTimedActionComparator35.reversed();
        java.lang.Class<?> wildcardClass37 = wildcardTimedActionComparator35.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test15203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15203");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime6 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = compareActionsByTime5.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime6);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = compareActionsByTime6.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime6.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = wildcardTimedActionComparator9.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator4.thenComparing(wildcardTimedActionComparator10);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime12.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = compareActionsByTime12.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime17 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime17.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime18);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime21 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime20.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime21);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = compareActionsByTime21.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime24 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime25 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = compareActionsByTime24.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime25);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime25.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator23.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime25);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime29 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = compareActionsByTime29.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime30);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime30.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = wildcardTimedActionComparator23.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime30);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = compareActionsByTime18.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime30);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime35 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = compareActionsByTime35.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime36);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime36.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime39 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime40 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = compareActionsByTime39.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime40);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = compareActionsByTime40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = wildcardTimedActionComparator38.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime40);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = compareActionsByTime40.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime45 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime46 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = compareActionsByTime45.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime46);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = compareActionsByTime40.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime46);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = compareActionsByTime30.thenComparing(wildcardTimedActionComparator48);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = wildcardTimedActionComparator16.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime30);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = wildcardTimedActionComparator50.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = wildcardTimedActionComparator4.thenComparing(wildcardTimedActionComparator50);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime53 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime54 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = compareActionsByTime53.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime54);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime56 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime57 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = compareActionsByTime56.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime57);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = compareActionsByTime57.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime60 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime61 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = compareActionsByTime60.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime61);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = compareActionsByTime61.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = wildcardTimedActionComparator59.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime61);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime65 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime66 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator67 = compareActionsByTime65.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime66);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator68 = compareActionsByTime66.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator69 = wildcardTimedActionComparator59.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime66);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = compareActionsByTime54.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime66);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime71 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime72 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator73 = compareActionsByTime71.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime72);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = compareActionsByTime72.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime75 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime76 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = compareActionsByTime75.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime76);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = compareActionsByTime76.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = wildcardTimedActionComparator74.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime76);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = compareActionsByTime76.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator81 = compareActionsByTime66.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime76);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator82 = compareActionsByTime76.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator83 = wildcardTimedActionComparator82.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator84 = wildcardTimedActionComparator83.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator85 = wildcardTimedActionComparator84.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator86 = wildcardTimedActionComparator85.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator87 = wildcardTimedActionComparator4.thenComparing(wildcardTimedActionComparator86);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator67);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator68);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator69);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator73);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator81);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator82);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator83);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator84);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator85);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator86);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator87);
    }

    @Test
    public void test15204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15204");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.now();
        testScheduler0.time = 0L;
        long long8 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.settime(35L);
        testScheduler0.triggerActions((long) 10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test15205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15205");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        testScheduler0.time = ' ';
        testScheduler0.settime((long) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        testScheduler0.triggerActions((long) (byte) 100);
        testScheduler0.triggerActions(97L);
        testScheduler0.settime((long) ' ');
        testScheduler0.time = '4';
        testScheduler0.settime((long) ' ');
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test15206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15206");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.time;
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        testScheduler0.triggerActions((long) '4');
        long long13 = testScheduler0.time;
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        testScheduler0.time = (byte) -1;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
        org.junit.Assert.assertNotNull(subscription15);
    }

    @Test
    public void test15207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15207");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.time;
        testScheduler0.time = 0L;
        long long8 = testScheduler0.now();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        testScheduler0.settime((-1L));
        testScheduler0.time = 'a';
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(subscription10);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
    }

    @Test
    public void test15208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15208");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
    }

    @Test
    public void test15209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15209");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        long long4 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        testScheduler0.settime((long) (short) 1);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.now();
        testScheduler0.time = 10;
        testScheduler0.time = ' ';
        long long15 = testScheduler0.time;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 32L + "'", long15 == 32L);
    }

    @Test
    public void test15210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15210");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.time;
        testScheduler0.triggerActions((long) ' ');
        long long8 = testScheduler0.now();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        long long11 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.settime((long) (byte) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
    }

    @Test
    public void test15211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15211");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.time = (short) 100;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        testScheduler0.time = (byte) 1;
        testScheduler0.triggerActions(97L);
        long long17 = testScheduler0.time;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 97L + "'", long17 == 97L);
    }

    @Test
    public void test15212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15212");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime20 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime20);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime19.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime23 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime24 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime23.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime24);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime19.thenComparing(wildcardTimedActionComparator26);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime28 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime29 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = compareActionsByTime28.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime29);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = compareActionsByTime29.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime32 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = compareActionsByTime32.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime33);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = wildcardTimedActionComparator31.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime33);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = compareActionsByTime33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime33.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = wildcardTimedActionComparator38.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = wildcardTimedActionComparator26.thenComparing(wildcardTimedActionComparator38);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = wildcardTimedActionComparator18.thenComparing(wildcardTimedActionComparator26);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = wildcardTimedActionComparator41.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = wildcardTimedActionComparator41.reversed();
        java.lang.Class<?> wildcardClass44 = wildcardTimedActionComparator43.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test15213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15213");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        testScheduler0.time = 0L;
        long long6 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test15214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15214");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.queue;
        testScheduler0.settime((long) (byte) 1);
        testScheduler0.settime((long) (byte) 0);
        long long7 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        testScheduler0.settime((long) 10);
        testScheduler0.time = (-1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
    }

    @Test
    public void test15215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15215");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.time = ' ';
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.concurrent.TimeUnit timeUnit6 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (short) 10, timeUnit6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test15216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15216");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.time = (byte) 0;
        testScheduler0.time = 100;
        long long12 = testScheduler0.now();
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        testScheduler0.settime((long) (short) 100);
        rx.util.functions.Action0 action0_17 = null;
        java.util.concurrent.TimeUnit timeUnit19 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription20 = testScheduler0.schedule(action0_17, 10L, timeUnit19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(subscription14);
    }

    @Test
    public void test15217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15217");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime18.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime19.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime22 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime23 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = compareActionsByTime22.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator21.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = compareActionsByTime13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime29 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = compareActionsByTime29.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime30);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime30.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime33.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime34);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime34.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = wildcardTimedActionComparator32.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime34);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime34.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime39 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime40 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = compareActionsByTime39.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime40);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = compareActionsByTime34.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime40);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = compareActionsByTime40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = compareActionsByTime40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = compareActionsByTime13.thenComparing(wildcardTimedActionComparator44);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime46 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime47 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = compareActionsByTime46.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = compareActionsByTime13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime50 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime51 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = compareActionsByTime50.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime51);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = compareActionsByTime50.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator54 = compareActionsByTime50.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime55 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime56 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator57 = compareActionsByTime55.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime56);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator58 = compareActionsByTime56.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime59 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime60 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = compareActionsByTime59.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime60);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator62 = compareActionsByTime60.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = wildcardTimedActionComparator58.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime60);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = compareActionsByTime60.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime65 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime66 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator67 = compareActionsByTime65.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime66);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator68 = compareActionsByTime60.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime66);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime69 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime70 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = compareActionsByTime69.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime70);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator72 = compareActionsByTime70.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime73 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime74 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator75 = compareActionsByTime73.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime74);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = compareActionsByTime74.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = wildcardTimedActionComparator72.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime74);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = compareActionsByTime74.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = compareActionsByTime66.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime74);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = wildcardTimedActionComparator54.thenComparing(wildcardTimedActionComparator79);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator81 = compareActionsByTime47.thenComparing(wildcardTimedActionComparator54);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator82 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator83 = wildcardTimedActionComparator81.thenComparing(wildcardTimedActionComparator82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator54);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator57);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator58);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator62);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator67);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator68);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator72);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator75);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator81);
    }

    @Test
    public void test15218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15218");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_2 = null;
        rx.Subscription subscription3 = testScheduler0.schedule(action0_2);
        long long4 = testScheduler0.now();
        long long5 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        testScheduler0.settime((long) 0);
        testScheduler0.settime((long) (-1));
        long long12 = testScheduler0.time;
        testScheduler0.triggerActions();
        long long14 = testScheduler0.gettime();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(subscription3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
    }

    @Test
    public void test15219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15219");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime10 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = compareActionsByTime9.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime10);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = compareActionsByTime10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime14 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime14);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = compareActionsByTime14.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = wildcardTimedActionComparator12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime14);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = compareActionsByTime5.thenComparing(wildcardTimedActionComparator17);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = wildcardTimedActionComparator22.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
    }

    @Test
    public void test15220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15220");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        long long4 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        long long8 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        long long10 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_11 = null;
        rx.Subscription subscription12 = testScheduler0.schedule(action0_11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(subscription12);
    }

    @Test
    public void test15221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15221");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime0.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime6 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = compareActionsByTime6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime7);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime10 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = compareActionsByTime9.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime10);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = compareActionsByTime10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime14 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime14);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = compareActionsByTime14.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = wildcardTimedActionComparator12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime14);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime18.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime19.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime22 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime23 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = compareActionsByTime22.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator21.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime14.thenComparing(wildcardTimedActionComparator26);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = wildcardTimedActionComparator8.thenComparing(wildcardTimedActionComparator26);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator29 = wildcardTimedActionComparator28.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = wildcardTimedActionComparator29.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = wildcardTimedActionComparator29.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = wildcardTimedActionComparator5.thenComparing(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator29);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
    }

    @Test
    public void test15222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15222");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        testScheduler0.time = '4';
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.gettime();
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.triggerActions();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
    }

    @Test
    public void test15223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15223");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        long long3 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.gettime();
        long long7 = testScheduler0.now();
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        testScheduler0.triggerActions(0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(subscription11);
    }

    @Test
    public void test15224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15224");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        testScheduler0.settime((long) 1);
        long long6 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        long long8 = testScheduler0.time;
        testScheduler0.time = 0L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        testScheduler0.settime(10L);
        long long14 = testScheduler0.time;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 1L + "'", long8 == 1L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test15225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15225");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        long long4 = testScheduler0.now();
        testScheduler0.triggerActions(10L);
        long long7 = testScheduler0.gettime();
        testScheduler0.settime((long) (byte) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test15226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15226");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) ' ');
        long long12 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test15227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15227");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        testScheduler0.settime((long) (short) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        long long10 = testScheduler0.now();
        testScheduler0.triggerActions();
        long long12 = testScheduler0.time;
        testScheduler0.time = 32L;
        testScheduler0.time = '4';
        testScheduler0.time = 0L;
        testScheduler0.triggerActions((long) (short) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue21 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue21);
    }

    @Test
    public void test15228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15228");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        testScheduler0.time = '4';
        long long6 = testScheduler0.now();
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        long long11 = testScheduler0.time;
        long long12 = testScheduler0.gettime();
        long long13 = testScheduler0.now();
        rx.util.functions.Action0 action0_14 = null;
        rx.Subscription subscription15 = testScheduler0.schedule(action0_14);
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        rx.util.functions.Action0 action0_18 = null;
        java.util.concurrent.TimeUnit timeUnit21 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription22 = testScheduler0.schedulePeriodically(action0_18, (long) (short) 0, 0L, timeUnit21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 52L + "'", long11 == 52L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 52L + "'", long12 == 52L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertNotNull(subscription15);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test15229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15229");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        testScheduler0.settime((long) (short) 0);
        testScheduler0.settime(32L);
        testScheduler0.settime((long) (short) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
    }

    @Test
    public void test15230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15230");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.settime(100L);
        testScheduler0.settime((long) (byte) 0);
        long long14 = testScheduler0.now();
        long long15 = testScheduler0.time;
        rx.util.functions.Action0 action0_16 = null;
        rx.Subscription subscription17 = testScheduler0.schedule(action0_16);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertNotNull(subscription17);
    }

    @Test
    public void test15231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15231");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) (short) 0);
        testScheduler0.triggerActions((long) (short) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.queue;
        testScheduler0.triggerActions(1L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
    }

    @Test
    public void test15232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15232");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        testScheduler0.triggerActions(35L);
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, 100L, (long) (short) 10, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test15233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15233");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.time = ' ';
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_9 = null;
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription12 = testScheduler0.schedule(action0_9, (-1L), timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
    }

    @Test
    public void test15234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15234");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        testScheduler0.settime((long) 1);
        testScheduler0.triggerActions((long) 10);
        long long8 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        long long11 = testScheduler0.now();
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        testScheduler0.time = 52L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue16 = testScheduler0.getqueue();
        long long17 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 10L + "'", long8 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
    }

    @Test
    public void test15235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15235");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        testScheduler0.time = (byte) -1;
        long long5 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.time = 0L;
        long long10 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.queue;
        testScheduler0.time = '#';
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + (-1L) + "'", long5 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test15236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15236");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        long long6 = testScheduler0.now();
        testScheduler0.time = (short) 100;
        long long9 = testScheduler0.time;
        testScheduler0.settime((long) 1);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        testScheduler0.settime(1L);
        long long16 = testScheduler0.now();
        long long17 = testScheduler0.gettime();
        testScheduler0.time = 1L;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1L + "'", long17 == 1L);
    }

    @Test
    public void test15237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15237");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.queue;
        long long3 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) 10);
        testScheduler0.settime(35L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test15238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15238");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.time;
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        long long8 = testScheduler0.time;
        testScheduler0.settime(0L);
        long long11 = testScheduler0.now();
        testScheduler0.time = (byte) -1;
        testScheduler0.settime((long) (byte) 0);
        long long16 = testScheduler0.time;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test15239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15239");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        long long9 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) 1);
        rx.util.functions.Action0 action0_12 = null;
        rx.Subscription subscription13 = testScheduler0.schedule(action0_12);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        testScheduler0.time = 'a';
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(subscription13);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
    }

    @Test
    public void test15240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15240");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.settime(97L);
        long long10 = testScheduler0.gettime();
        long long11 = testScheduler0.now();
        testScheduler0.triggerActions();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 97L + "'", long10 == 97L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test15241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15241");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.settime((-1L));
        testScheduler0.triggerActions(1L);
        testScheduler0.triggerActions((long) '#');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.getqueue();
        testScheduler0.settime((long) (short) 0);
        rx.util.functions.Action0 action0_18 = null;
        rx.Subscription subscription19 = testScheduler0.schedule(action0_18);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertNotNull(subscription19);
    }

    @Test
    public void test15242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15242");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.settime((long) 10);
        testScheduler0.triggerActions((long) (short) 10);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        testScheduler0.time = 35L;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        long long15 = testScheduler0.now();
        testScheduler0.triggerActions();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test15243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15243");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        java.lang.Class<?> wildcardClass9 = wildcardTimedActionQueue8.getClass();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test15244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15244");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        long long4 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_7 = null;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription10 = testScheduler0.schedule(action0_7, 32L, timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 0L + "'", long4 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
    }

    @Test
    public void test15245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15245");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.time;
        testScheduler0.triggerActions((long) ' ');
        testScheduler0.triggerActions();
        long long9 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        long long12 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 32L + "'", long9 == 32L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test15246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15246");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        long long6 = testScheduler0.now();
        testScheduler0.triggerActions((long) (byte) 100);
        long long9 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.queue;
        long long11 = testScheduler0.now();
        testScheduler0.triggerActions();
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) 100, timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test15247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15247");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime18.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime19.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime22 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime23 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = compareActionsByTime22.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator21.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = compareActionsByTime13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime29 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = compareActionsByTime29.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime30);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime30.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime33.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime34);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime34.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = wildcardTimedActionComparator32.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime34);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime34.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator39 = compareActionsByTime34.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator40 = wildcardTimedActionComparator39.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = compareActionsByTime23.thenComparing(wildcardTimedActionComparator40);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = wildcardTimedActionComparator40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = wildcardTimedActionComparator42.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = wildcardTimedActionComparator43.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = wildcardTimedActionComparator44.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = wildcardTimedActionComparator44.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator39);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator40);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
    }

    @Test
    public void test15248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15248");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        testScheduler0.time = ' ';
        testScheduler0.settime((long) 0);
        long long13 = testScheduler0.now();
        testScheduler0.settime((long) 10);
        rx.util.functions.Action0 action0_16 = null;
        java.util.concurrent.TimeUnit timeUnit18 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription19 = testScheduler0.schedule(action0_16, (long) (short) 100, timeUnit18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test15249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15249");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (-1);
        rx.util.functions.Action0 action0_3 = null;
        rx.Subscription subscription4 = testScheduler0.schedule(action0_3);
        testScheduler0.time = '4';
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.gettime();
        org.junit.Assert.assertNotNull(subscription4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 52L + "'", long13 == 52L);
    }

    @Test
    public void test15250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15250");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        long long4 = testScheduler0.time;
        testScheduler0.triggerActions();
        testScheduler0.time = 52L;
        testScheduler0.settime((long) '4');
        testScheduler0.time = 1L;
        testScheduler0.triggerActions(0L);
        testScheduler0.time = 0L;
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
    }

    @Test
    public void test15251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15251");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        long long3 = testScheduler0.time;
        testScheduler0.triggerActions((long) (byte) -1);
        testScheduler0.settime((-1L));
        testScheduler0.triggerActions(1L);
        testScheduler0.triggerActions((long) '#');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        long long13 = testScheduler0.gettime();
        testScheduler0.triggerActions(35L);
        long long16 = testScheduler0.time;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 35L + "'", long13 == 35L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 35L + "'", long16 == 35L);
    }

    @Test
    public void test15252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15252");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions((long) (byte) 1);
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        long long13 = testScheduler0.gettime();
        long long14 = testScheduler0.gettime();
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (byte) 1, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1L + "'", long13 == 1L);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1L + "'", long14 == 1L);
    }

    @Test
    public void test15253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15253");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.time = (byte) -1;
        testScheduler0.time = (short) -1;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        long long10 = testScheduler0.gettime();
        testScheduler0.triggerActions((long) (byte) 0);
        testScheduler0.triggerActions((long) (short) -1);
        long long15 = testScheduler0.time;
        long long16 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue17 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue18 = testScheduler0.getqueue();
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-1L) + "'", long15 == (-1L));
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue17);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue18);
    }

    @Test
    public void test15254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15254");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.settime((long) ' ');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        long long8 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 32L + "'", long8 == 32L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test15255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15255");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime0.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = wildcardTimedActionComparator3.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
    }

    @Test
    public void test15256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15256");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        long long3 = testScheduler0.gettime();
        testScheduler0.settime((long) '4');
        testScheduler0.time = (-1L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        long long9 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue10 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) (byte) -1);
        java.util.concurrent.TimeUnit timeUnit14 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((-1L), timeUnit14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue10);
    }

    @Test
    public void test15257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15257");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.time = (short) 100;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        rx.util.functions.Action0 action0_13 = null;
        rx.Subscription subscription14 = testScheduler0.schedule(action0_13);
        testScheduler0.settime((long) (byte) 0);
        testScheduler0.settime((long) '#');
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        long long21 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue22 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(subscription14);
        org.junit.Assert.assertNotNull(subscription20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 35L + "'", long21 == 35L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue22);
    }

    @Test
    public void test15258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15258");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.time = (byte) -1;
        testScheduler0.time = 0;
        testScheduler0.triggerActions(100L);
        long long11 = testScheduler0.gettime();
        long long12 = testScheduler0.gettime();
        testScheduler0.time = (byte) 10;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 100L + "'", long11 == 100L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 100L + "'", long12 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
    }

    @Test
    public void test15259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15259");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        long long3 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_4 = null;
        rx.Subscription subscription5 = testScheduler0.schedule(action0_4);
        long long6 = testScheduler0.gettime();
        long long7 = testScheduler0.now();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        testScheduler0.settime(52L);
        long long11 = testScheduler0.now();
        long long12 = testScheduler0.now();
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(subscription5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test15260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15260");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.settime((long) (-1));
        rx.util.functions.Action0 action0_8 = null;
        rx.Subscription subscription9 = testScheduler0.schedule(action0_8);
        long long10 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.queue;
        long long12 = testScheduler0.gettime();
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 10L + "'", long5 == 10L);
        org.junit.Assert.assertNotNull(subscription9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
    }

    @Test
    public void test15261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15261");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        rx.util.functions.Action0 action0_6 = null;
        rx.Subscription subscription7 = testScheduler0.schedule(action0_6);
        testScheduler0.settime(0L);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        testScheduler0.settime((long) (-1));
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.queue;
        long long15 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(subscription7);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
    }

    @Test
    public void test15262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15262");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        testScheduler0.settime(10L);
        long long4 = testScheduler0.gettime();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.queue;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.settime(0L);
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
    }

    @Test
    public void test15263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15263");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (-1);
        testScheduler0.settime((long) (byte) 100);
        testScheduler0.time = (short) 1;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        long long9 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test15264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15264");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        testScheduler0.triggerActions();
        testScheduler0.time = (byte) 0;
        long long7 = testScheduler0.time;
        testScheduler0.triggerActions((long) (byte) 10);
        rx.util.functions.Action0 action0_10 = null;
        rx.Subscription subscription11 = testScheduler0.schedule(action0_10);
        long long12 = testScheduler0.time;
        testScheduler0.time = (short) 100;
        long long15 = testScheduler0.time;
        testScheduler0.time = 97L;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(subscription11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
    }

    @Test
    public void test15265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15265");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue2 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        long long5 = testScheduler0.gettime();
        testScheduler0.time = (short) 1;
        testScheduler0.triggerActions(97L);
        long long10 = testScheduler0.now();
        long long11 = testScheduler0.now();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue2);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
    }

    @Test
    public void test15266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15266");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.triggerActions();
        long long7 = testScheduler0.time;
        testScheduler0.triggerActions((long) (-1));
        long long10 = testScheduler0.gettime();
        testScheduler0.triggerActions(52L);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) (byte) -1);
        long long16 = testScheduler0.gettime();
        testScheduler0.settime((long) ' ');
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 100L + "'", long7 == 100L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-1L) + "'", long10 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-1L) + "'", long16 == (-1L));
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test15267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15267");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime1.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator4 = compareActionsByTime1.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime6 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = compareActionsByTime6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime7);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime9 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime10 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = compareActionsByTime9.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime10);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator12 = compareActionsByTime10.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime14 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime14);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = compareActionsByTime14.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = wildcardTimedActionComparator12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime14);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime18.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime19.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator22 = wildcardTimedActionComparator12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator23 = compareActionsByTime7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime24 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime25 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = compareActionsByTime24.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime25);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime25.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime28 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime29 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator30 = compareActionsByTime28.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime29);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = compareActionsByTime29.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = wildcardTimedActionComparator27.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime29);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator33 = compareActionsByTime29.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator34 = compareActionsByTime19.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime29);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime35 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime36 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = compareActionsByTime35.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime36);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime36.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime39 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime40 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = compareActionsByTime39.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime40);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = compareActionsByTime40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = wildcardTimedActionComparator38.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime40);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = compareActionsByTime40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = compareActionsByTime40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator46 = wildcardTimedActionComparator45.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator47 = compareActionsByTime29.thenComparing(wildcardTimedActionComparator46);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = wildcardTimedActionComparator46.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = wildcardTimedActionComparator48.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator50 = wildcardTimedActionComparator49.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator51 = wildcardTimedActionComparator50.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = wildcardTimedActionComparator5.thenComparing(wildcardTimedActionComparator50);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator53 = wildcardTimedActionComparator50.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime54 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime55 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = compareActionsByTime54.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime55);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime57 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime58 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = compareActionsByTime57.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime58);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator60 = compareActionsByTime58.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime61 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime62 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator63 = compareActionsByTime61.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime62);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = compareActionsByTime62.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator65 = wildcardTimedActionComparator60.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime62);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime66 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime67 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator68 = compareActionsByTime66.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime67);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator69 = compareActionsByTime67.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = wildcardTimedActionComparator60.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime67);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = compareActionsByTime55.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime67);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime72 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime73 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = compareActionsByTime72.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime73);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator75 = compareActionsByTime73.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime76 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime77 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator78 = compareActionsByTime76.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime77);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator79 = compareActionsByTime77.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = wildcardTimedActionComparator75.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime77);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator81 = compareActionsByTime77.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator82 = compareActionsByTime67.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime77);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator83 = compareActionsByTime77.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator84 = wildcardTimedActionComparator83.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator85 = wildcardTimedActionComparator84.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator86 = wildcardTimedActionComparator85.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator87 = wildcardTimedActionComparator86.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator88 = wildcardTimedActionComparator50.thenComparing(wildcardTimedActionComparator87);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator89 = wildcardTimedActionComparator50.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator4);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator12);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator22);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator23);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator30);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator33);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator34);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator46);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator47);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator50);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator51);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator53);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator60);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator65);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator68);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator69);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator75);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator78);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator79);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator81);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator82);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator83);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator84);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator85);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator86);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator87);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator88);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator89);
    }

    @Test
    public void test15268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15268");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        testScheduler0.time = (byte) -1;
        testScheduler0.settime((long) (byte) 0);
        long long7 = testScheduler0.now();
        testScheduler0.triggerActions((long) (byte) 10);
        long long10 = testScheduler0.now();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_13 = null;
        java.util.concurrent.TimeUnit timeUnit16 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription17 = testScheduler0.schedulePeriodically(action0_13, (long) 1, (long) (byte) 10, timeUnit16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test15269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15269");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.time;
        testScheduler0.time = 0L;
        long long8 = testScheduler0.now();
        testScheduler0.settime(0L);
        testScheduler0.triggerActions((long) ' ');
        long long13 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue15 = testScheduler0.queue;
        testScheduler0.settime(1L);
        testScheduler0.triggerActions();
        rx.util.functions.Action0 action0_19 = null;
        rx.Subscription subscription20 = testScheduler0.schedule(action0_19);
        testScheduler0.settime((long) (short) -1);
        java.util.concurrent.TimeUnit timeUnit24 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) (short) 10, timeUnit24);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 32L + "'", long13 == 32L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue15);
        org.junit.Assert.assertNotNull(subscription20);
    }

    @Test
    public void test15270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15270");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        long long1 = testScheduler0.now();
        long long2 = testScheduler0.time;
        testScheduler0.settime((long) ' ');
        testScheduler0.settime((long) '4');
        testScheduler0.settime((long) 'a');
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + 0L + "'", long1 == 0L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
    }

    @Test
    public void test15271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15271");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions();
        long long2 = testScheduler0.now();
        long long3 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.queue;
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        testScheduler0.triggerActions();
        testScheduler0.time = (short) 100;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue12 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        long long14 = testScheduler0.time;
        rx.util.functions.Action0 action0_15 = null;
        rx.Subscription subscription16 = testScheduler0.schedule(action0_15);
        long long17 = testScheduler0.time;
        long long18 = testScheduler0.now();
        testScheduler0.triggerActions(35L);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 0L + "'", long2 == 0L);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue12);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(subscription16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
    }

    @Test
    public void test15272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15272");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        testScheduler0.settime((long) (short) 10);
        testScheduler0.triggerActions();
        testScheduler0.settime((long) (byte) 0);
        rx.util.functions.Action0 action0_10 = null;
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            rx.Subscription subscription14 = testScheduler0.schedulePeriodically(action0_10, (long) (byte) 100, (long) (short) -1, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
    }

    @Test
    public void test15273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15273");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.settime((long) ' ');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        testScheduler0.triggerActions();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        rx.util.functions.Action0 action0_9 = null;
        rx.Subscription subscription10 = testScheduler0.schedule(action0_9);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(subscription10);
    }

    @Test
    public void test15274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15274");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.time = (-1);
        testScheduler0.settime((long) (byte) 100);
        testScheduler0.time = (short) 1;
        testScheduler0.triggerActions();
        testScheduler0.settime((long) ' ');
        testScheduler0.triggerActions();
    }

    @Test
    public void test15275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15275");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.getqueue();
        java.util.concurrent.TimeUnit timeUnit11 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeTo((long) (byte) 1, timeUnit11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test15276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15276");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue6 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue7 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.getqueue();
        testScheduler0.triggerActions((long) (short) -1);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue11 = testScheduler0.getqueue();
        long long12 = testScheduler0.time;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue13 = testScheduler0.getqueue();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue6);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue7);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-1L) + "'", long12 == (-1L));
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue13);
    }

    @Test
    public void test15277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15277");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        long long5 = testScheduler0.time;
        long long6 = testScheduler0.time;
        rx.util.functions.Action0 action0_7 = null;
        rx.Subscription subscription8 = testScheduler0.schedule(action0_7);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue9 = testScheduler0.queue;
        testScheduler0.settime((long) 100);
        java.util.concurrent.TimeUnit timeUnit13 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy(52L, timeUnit13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 100L + "'", long6 == 100L);
        org.junit.Assert.assertNotNull(subscription8);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue9);
    }

    @Test
    public void test15278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15278");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue1 = testScheduler0.getqueue();
        testScheduler0.settime((long) ' ');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue4 = testScheduler0.getqueue();
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue5 = testScheduler0.getqueue();
        testScheduler0.time = (short) 1;
        java.util.concurrent.TimeUnit timeUnit9 = null;
        // The following exception was thrown during execution in test generation
        try {
            testScheduler0.advanceTimeBy((long) '4', timeUnit9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue1);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue4);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue5);
    }

    @Test
    public void test15279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15279");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.settime((long) (short) 0);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        testScheduler0.time = ' ';
        long long11 = testScheduler0.gettime();
        testScheduler0.settime(52L);
        testScheduler0.time = 100L;
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 32L + "'", long11 == 32L);
    }

    @Test
    public void test15280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15280");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator3 = compareActionsByTime1.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime5 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator7 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator8 = wildcardTimedActionComparator3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime5);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime5.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = compareActionsByTime5.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = compareActionsByTime13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = wildcardTimedActionComparator11.thenComparing(wildcardTimedActionComparator16);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator18 = wildcardTimedActionComparator11.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator19 = wildcardTimedActionComparator18.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = wildcardTimedActionComparator18.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = wildcardTimedActionComparator18.reversed();
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator3);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator7);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator8);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator18);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator19);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
    }

    @Test
    public void test15281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15281");
        rx.concurrency.TestScheduler testScheduler0 = new rx.concurrency.TestScheduler();
        testScheduler0.triggerActions((long) (byte) 100);
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue3 = testScheduler0.queue;
        long long4 = testScheduler0.time;
        long long5 = testScheduler0.gettime();
        testScheduler0.time = 'a';
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue8 = testScheduler0.queue;
        testScheduler0.settime((long) (-1));
        long long11 = testScheduler0.now();
        testScheduler0.triggerActions((long) 'a');
        java.util.Queue<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionQueue14 = testScheduler0.getqueue();
        long long15 = testScheduler0.time;
        long long16 = testScheduler0.gettime();
        java.lang.Class<?> wildcardClass17 = testScheduler0.getClass();
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 100L + "'", long5 == 100L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue8);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(wildcardTimedActionQueue14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 97L + "'", long15 == 97L);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test15282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest30.test15282");
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime0 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime1 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator2 = compareActionsByTime0.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime1);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime3 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime4 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator5 = compareActionsByTime3.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime4);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator6 = compareActionsByTime4.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime7 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime8 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator9 = compareActionsByTime7.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator10 = compareActionsByTime8.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator11 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime8);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime12 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime13 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator14 = compareActionsByTime12.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator15 = compareActionsByTime13.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator16 = wildcardTimedActionComparator6.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator17 = compareActionsByTime1.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime13);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime18 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime19 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator20 = compareActionsByTime18.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime19);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator21 = compareActionsByTime19.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime22 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime23 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator24 = compareActionsByTime22.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator25 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator26 = wildcardTimedActionComparator21.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator27 = compareActionsByTime23.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator28 = compareActionsByTime13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime23);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime29 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime30 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator31 = compareActionsByTime29.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime30);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator32 = compareActionsByTime30.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime33 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime34 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator35 = compareActionsByTime33.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime34);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator36 = compareActionsByTime34.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator37 = wildcardTimedActionComparator32.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime34);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator38 = compareActionsByTime34.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime39 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime40 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator41 = compareActionsByTime39.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime40);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator42 = compareActionsByTime34.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime40);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator43 = compareActionsByTime40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator44 = compareActionsByTime40.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator45 = compareActionsByTime13.thenComparing(wildcardTimedActionComparator44);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime46 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime47 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator48 = compareActionsByTime46.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator49 = compareActionsByTime13.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime47);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime50 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime51 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator52 = compareActionsByTime50.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime51);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime53 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime54 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator55 = compareActionsByTime53.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime54);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator56 = compareActionsByTime54.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime57 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime58 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator59 = compareActionsByTime57.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime58);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator60 = compareActionsByTime58.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator61 = wildcardTimedActionComparator56.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime58);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime62 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime63 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator64 = compareActionsByTime62.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime63);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator65 = compareActionsByTime63.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator66 = wildcardTimedActionComparator56.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime63);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator67 = compareActionsByTime51.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime63);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime68 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime69 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator70 = compareActionsByTime68.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime69);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator71 = compareActionsByTime69.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime72 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime73 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator74 = compareActionsByTime72.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime73);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator75 = compareActionsByTime73.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator76 = wildcardTimedActionComparator71.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime73);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator77 = compareActionsByTime73.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime78 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime79 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator80 = compareActionsByTime78.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime79);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator81 = compareActionsByTime73.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime79);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator82 = compareActionsByTime63.thenComparing(wildcardTimedActionComparator81);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime83 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime84 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator85 = compareActionsByTime83.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime84);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator86 = compareActionsByTime84.reversed();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime87 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime88 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator89 = compareActionsByTime87.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime88);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator90 = compareActionsByTime88.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator91 = wildcardTimedActionComparator86.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime88);
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime92 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        rx.concurrency.TestScheduler.CompareActionsByTime compareActionsByTime93 = new rx.concurrency.TestScheduler.CompareActionsByTime();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator94 = compareActionsByTime92.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime93);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator95 = compareActionsByTime93.reversed();
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator96 = wildcardTimedActionComparator86.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime93);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator97 = compareActionsByTime63.thenComparing(wildcardTimedActionComparator86);
        java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>> wildcardTimedActionComparator98 = compareActionsByTime47.thenComparing((java.util.Comparator<rx.concurrency.TestScheduler.TimedAction<?>>) compareActionsByTime63);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator2);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator5);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator6);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator9);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator10);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator11);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator14);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator15);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator16);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator17);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator20);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator21);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator24);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator25);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator26);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator27);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator28);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator31);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator32);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator35);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator36);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator37);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator38);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator41);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator42);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator43);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator44);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator45);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator48);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator49);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator52);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator55);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator56);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator59);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator60);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator61);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator64);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator65);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator66);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator67);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator70);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator71);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator74);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator75);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator76);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator77);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator80);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator81);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator82);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator85);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator86);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator89);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator90);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator91);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator94);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator95);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator96);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator97);
        org.junit.Assert.assertNotNull(wildcardTimedActionComparator98);
    }
}

