import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer7 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer7 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords3 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>> kafkaSpoutMessageIdComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdComparatorKafkaSpout0.emit();
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig14 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (short) -1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        int int3 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        wildcardClassKafkaSpout0.maxRetries = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        long long14 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        long long14 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet15 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        wildcardClassKafkaSpout0.maxRetries = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords9 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        wildcardClassKafkaSpout0.maxRetries = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>> kafkaSpoutMessageIdComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = kafkaSpoutMessageIdComparatorKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdComparatorKafkaSpout0.emit();
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap3 = wildcardClassKafkaSpout0.acked;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        long long14 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.nextTuple();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        long long14 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean15 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords8 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        long long14 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        wildcardClassKafkaSpout0.nextTuple();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str16 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        boolean boolean6 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords7 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig7 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        int int3 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        int int3 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap3 = wildcardClassKafkaSpout0.acked;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        long long14 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.nextTuple();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        int int6 = wildcardClassKafkaSpout0.maxRetries;
        int int7 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        kafkaSpoutMessageIdSetKafkaSpout0.maxRetries = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = kafkaSpoutMessageIdSetKafkaSpout0.poll();
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> strConsumerRecordKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = strConsumerRecordKafkaSpout0.commit();
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.numUncommittedOffsets = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer7 = wildcardClassKafkaSpout0.kafkaConsumer;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout14 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = wildcardClassKafkaSpout14.kafkaSpoutStreams;
        wildcardClassKafkaSpout14.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder18 = wildcardClassKafkaSpout14.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout19 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy20 = wildcardClassKafkaSpout19.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet21 = wildcardClassKafkaSpout19.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray22 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet23 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet23, kafkaSpoutMessageIdArray22);
        wildcardClassKafkaSpout19.emitted = kafkaSpoutMessageIdSet23;
        wildcardClassKafkaSpout14.emitted = kafkaSpoutMessageIdSet23;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet23;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap4 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        int int6 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        boolean boolean7 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>> kafkaSpoutMessageIdComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = kafkaSpoutMessageIdComparatorKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer5 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        boolean boolean4 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = wildcardClassKafkaSpout0.collector;
        java.lang.String str8 = wildcardClassKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        boolean boolean6 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        boolean boolean7 = wildcardClassKafkaSpout0.initialized;
        boolean boolean8 = wildcardClassKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords9 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = wildcardClassKafkaSpout0.collector;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        wildcardClassKafkaSpout0.maxRetries = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords2 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 0;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder10 = wildcardClassKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> offsetEntryKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        offsetEntryKafkaSpout0.close();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        long long5 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        boolean boolean1 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        boolean boolean9 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor1 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        wildcardClassKafkaSpout0.nextTuple();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        boolean boolean7 = wildcardClassKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory8 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.nextTuple();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        int int6 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        boolean boolean6 = wildcardClassKafkaSpout0.waitingToEmit();
        java.lang.String str7 = wildcardClassKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> strComparableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strComparableKafkaSpout0.shutdown();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        wildcardClassKafkaSpout0.maxRetries = (byte) 100;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap8 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.nextTuple();
        wildcardClassKafkaSpout0.nextTuple();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        boolean boolean4 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords5 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        boolean boolean1 = wildcardClassKafkaSpout0.initialized;
        long long2 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        java.lang.String str3 = wildcardClassKafkaSpout0.toString();
        wildcardClassKafkaSpout0.consumerAutoCommitMode = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray1 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet2, kafkaSpoutMessageIdArray1);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet2;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = wildcardClassKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        boolean boolean7 = wildcardClassKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory8 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        boolean boolean6 = wildcardClassKafkaSpout0.waitingToEmit();
        java.lang.String str7 = wildcardClassKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = kafkaSpoutMessageIdSetKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor1 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        wildcardClassKafkaSpout0.maxRetries = (byte) 100;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap8 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> strConsumerRecordKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strConsumerRecordKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        long long5 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        boolean boolean4 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        long long14 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet15 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean16 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        boolean boolean9 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        java.lang.String str3 = wildcardClassKafkaSpout0.toString();
        wildcardClassKafkaSpout0.consumerAutoCommitMode = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        wildcardClassKafkaSpout0.maxRetries = (byte) 100;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdSetKafkaSpout0.activate();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.spout.ISpout>.KafkaSpoutConsumerRebalanceListener, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> kafkaSpoutConsumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.spout.ISpout>.KafkaSpoutConsumerRebalanceListener, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = kafkaSpoutConsumerRebalanceListenerKafkaSpout0.poll();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = wildcardClassKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer8 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        boolean boolean7 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        java.lang.String str3 = wildcardClassKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        boolean boolean7 = wildcardClassKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = wildcardClassKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig10 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        boolean boolean14 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        long long15 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray1 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet2, kafkaSpoutMessageIdArray1);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet2;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap14 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        wildcardClassKafkaSpout0.maxRetries = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdListKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = kafkaSpoutMessageIdListKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = wildcardClassKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig10 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        boolean boolean1 = kafkaSpoutMessageIdComparatorKafkaSpout0.waitingToEmit();
        kafkaSpoutMessageIdComparatorKafkaSpout0.nextTuple();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdComparatorKafkaSpout0.close();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean14 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.nextTuple();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder6 = wildcardClassKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>> kafkaSpoutMessageIdComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = kafkaSpoutMessageIdComparatorKafkaSpout0.poll();
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.nextTuple();
        wildcardClassKafkaSpout0.nextTuple();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        boolean boolean4 = wildcardClassKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> offsetEntryKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>>();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory1 = offsetEntryKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        offsetEntryKafkaSpout0.emit();
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strComparableKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        wildcardClassKafkaSpout0.maxRetries = (short) 10;
        wildcardClassKafkaSpout0.nextTuple();
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        wildcardClassKafkaSpout0.nextTuple();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.nextTuple();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        int int6 = wildcardClassKafkaSpout0.maxRetries;
        int int7 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer7 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout8 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = wildcardClassKafkaSpout8.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = wildcardClassKafkaSpout8.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray11 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet12 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet12, kafkaSpoutMessageIdArray11);
        wildcardClassKafkaSpout8.emitted = kafkaSpoutMessageIdSet12;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet12;
        wildcardClassKafkaSpout0.maxRetries = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> wildcardClassKafkaSpout18 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray19 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet20 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet20, kafkaSpoutMessageIdArray19);
        wildcardClassKafkaSpout18.emitted = kafkaSpoutMessageIdSet20;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout2 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = wildcardClassKafkaSpout2.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = wildcardClassKafkaSpout2.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray5 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet6, kafkaSpoutMessageIdArray5);
        wildcardClassKafkaSpout2.emitted = kafkaSpoutMessageIdSet6;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet6;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = wildcardClassKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer7 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout8 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = wildcardClassKafkaSpout8.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = wildcardClassKafkaSpout8.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray11 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet12 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet12, kafkaSpoutMessageIdArray11);
        wildcardClassKafkaSpout8.emitted = kafkaSpoutMessageIdSet12;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet12;
        wildcardClassKafkaSpout0.maxRetries = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords18 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        int int3 = wildcardClassKafkaSpout0.maxRetries;
        int int4 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = wildcardClassKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap14 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        int int4 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords7 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = wildcardClassKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig6 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = wildcardClassKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        boolean boolean6 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        boolean boolean7 = wildcardClassKafkaSpout0.initialized;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap8 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.nextTuple();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory5 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        int int6 = wildcardClassKafkaSpout0.maxRetries;
        int int7 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor1 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        int int6 = wildcardClassKafkaSpout0.maxRetries;
        boolean boolean7 = wildcardClassKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        wildcardClassKafkaSpout0.maxRetries = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        boolean boolean9 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        kafkaSpoutMessageIdSetKafkaSpout0.maxRetries = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdSetKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.lang.Comparable<java.lang.String>> cloneableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Cloneable, java.lang.Comparable<java.lang.String>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = cloneableKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = wildcardClassKafkaSpout0.collector;
        java.lang.String str8 = wildcardClassKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 100;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap4 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        int int6 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        int int3 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory4 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.Iterable<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> charSequenceKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.Iterable<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        charSequenceKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords3 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap4 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords5 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseRichSpout, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> baseRichSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseRichSpout, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = baseRichSpoutKafkaSpout0.poll();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        boolean boolean4 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        wildcardClassKafkaSpout0.numUncommittedOffsets = '4';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = wildcardClassKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int5 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder3 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = wildcardClassKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords4 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig14 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet16 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseRichSpout, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> baseRichSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseRichSpout, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = baseRichSpoutKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout8 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = wildcardClassKafkaSpout8.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = wildcardClassKafkaSpout8.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray11 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet12 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet12, kafkaSpoutMessageIdArray11);
        wildcardClassKafkaSpout8.emitted = kafkaSpoutMessageIdSet12;
        wildcardClassKafkaSpout8.maxRetries = (short) 10;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout17 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams18 = wildcardClassKafkaSpout17.kafkaSpoutStreams;
        wildcardClassKafkaSpout17.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder21 = wildcardClassKafkaSpout17.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout22 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy23 = wildcardClassKafkaSpout22.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet24 = wildcardClassKafkaSpout22.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray25 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet26 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet26, kafkaSpoutMessageIdArray25);
        wildcardClassKafkaSpout22.emitted = kafkaSpoutMessageIdSet26;
        wildcardClassKafkaSpout17.emitted = kafkaSpoutMessageIdSet26;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig30 = wildcardClassKafkaSpout17.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout31 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams32 = wildcardClassKafkaSpout31.kafkaSpoutStreams;
        wildcardClassKafkaSpout31.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder35 = wildcardClassKafkaSpout31.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout36 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy37 = wildcardClassKafkaSpout36.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet38 = wildcardClassKafkaSpout36.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray39 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet40 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet40, kafkaSpoutMessageIdArray39);
        wildcardClassKafkaSpout36.emitted = kafkaSpoutMessageIdSet40;
        wildcardClassKafkaSpout31.emitted = kafkaSpoutMessageIdSet40;
        wildcardClassKafkaSpout17.emitted = kafkaSpoutMessageIdSet40;
        wildcardClassKafkaSpout8.emitted = kafkaSpoutMessageIdSet40;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet40;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean47 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor5 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        wildcardClassKafkaSpout0.maxRetries = (short) -1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer8 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        wildcardClassKafkaSpout0.maxRetries = (short) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap3 = wildcardClassKafkaSpout0.acked;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, org.slf4j.Logger> offsetEntryKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, org.slf4j.Logger>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        offsetEntryKafkaSpout0.nextTuple();
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig14 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet16 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 100;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer5 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer7 = wildcardClassKafkaSpout0.kafkaConsumer;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        wildcardClassKafkaSpout0.maxRetries = (byte) 100;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer9 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        int int6 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        wildcardClassKafkaSpout0.maxRetries = (short) -1;
        boolean boolean8 = wildcardClassKafkaSpout0.waitingToEmit();
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap9 = wildcardClassKafkaSpout0.acked;
        boolean boolean10 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor5 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>();
        boolean boolean1 = kafkaSpoutMessageIdSetKafkaSpout0.waitingToEmit();
        kafkaSpoutMessageIdSetKafkaSpout0.numUncommittedOffsets = 0L;
        boolean boolean4 = kafkaSpoutMessageIdSetKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdSetKafkaSpout0.nextTuple();
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        wildcardClassKafkaSpout0.maxRetries = (short) -1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer8 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor1 = wildcardClassKafkaSpout0.waitingToEmit;
        boolean boolean2 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        boolean boolean4 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        wildcardClassKafkaSpout0.numUncommittedOffsets = '4';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 0;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder10 = wildcardClassKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        boolean boolean6 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        boolean boolean7 = wildcardClassKafkaSpout0.initialized;
        boolean boolean8 = wildcardClassKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> iRichSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        iRichSpoutKafkaSpout0.activate();
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        int int3 = wildcardClassKafkaSpout0.maxRetries;
        boolean boolean4 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        objKafkaSpout0.close();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> kafkaSpoutMessageIdListKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdListKafkaSpout0.shutdown();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>> kafkaSpoutMessageIdComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdComparatorKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer7 = wildcardClassKafkaSpout0.kafkaConsumer;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        boolean boolean1 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        long long5 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        int int6 = wildcardClassKafkaSpout0.maxRetries;
        boolean boolean7 = wildcardClassKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        boolean boolean4 = wildcardClassKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        long long6 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer7 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout8 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = wildcardClassKafkaSpout8.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = wildcardClassKafkaSpout8.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray11 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet12 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet12, kafkaSpoutMessageIdArray11);
        wildcardClassKafkaSpout8.emitted = kafkaSpoutMessageIdSet12;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet12;
        wildcardClassKafkaSpout0.maxRetries = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> wildcardClassKafkaSpout18 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray19 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet20 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet20, kafkaSpoutMessageIdArray19);
        wildcardClassKafkaSpout18.emitted = kafkaSpoutMessageIdSet20;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet20;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap24 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (short) -1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer7 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer8 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        int int3 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor5 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig6 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig7 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        wildcardClassKafkaSpout0.maxRetries = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        boolean boolean7 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap8 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        int int6 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig3 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        wildcardClassKafkaSpout0.maxRetries = (short) -1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer8 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        boolean boolean7 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap8 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> iRichSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = iRichSpoutKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout4 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = wildcardClassKafkaSpout4.kafkaSpoutStreams;
        wildcardClassKafkaSpout4.numUncommittedOffsets = (byte) 100;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.spout.ISpout> strConsumerRecord8 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, org.apache.storm.spout.ISpout>("KafkaSpout{acked=null, emitted=[]}", 0, 100L, "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 32, serialized key size = 10, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = )", (org.apache.storm.spout.ISpout) wildcardClassKafkaSpout4);
        boolean boolean9 = wildcardClassKafkaSpout4.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout4.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor4 = wildcardClassKafkaSpout0.waitingToEmit;
        java.lang.String str5 = wildcardClassKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        int int6 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig7 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap8 = wildcardClassKafkaSpout0.acked;
        boolean boolean9 = wildcardClassKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory10 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.Object>();
        strComparableKafkaSpout0.consumerAutoCommitMode = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strComparableKafkaSpout0.activate();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder3 = wildcardClassKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        boolean boolean4 = wildcardClassKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        long long6 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        long long7 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor4 = wildcardClassKafkaSpout0.waitingToEmit;
        java.lang.String str5 = wildcardClassKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = wildcardClassKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout0.emitted;
        boolean boolean8 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        boolean boolean9 = wildcardClassKafkaSpout0.initialized;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = wildcardClassKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig11 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        wildcardClassKafkaSpout0.maxRetries = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        boolean boolean9 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> strComparableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = strComparableKafkaSpout0.poll();
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig7 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap8 = wildcardClassKafkaSpout0.acked;
        boolean boolean9 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> offsetEntryKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>>();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory1 = offsetEntryKafkaSpout0.kafkaConsumerFactory;
        offsetEntryKafkaSpout0.consumerAutoCommitMode = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        offsetEntryKafkaSpout0.emit();
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig14 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassKafkaSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpoutKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpoutKafkaSpout0.close();
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig7 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap8 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 100;
        boolean boolean4 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = wildcardClassKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int5 = wildcardClassKafkaSpout0.maxRetries;
        long long6 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        wildcardClassKafkaSpout0.maxRetries = (short) 10;
        boolean boolean9 = wildcardClassKafkaSpout0.waitingToEmit();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        wildcardClassKafkaSpout0.maxRetries = (short) 10;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout9 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = wildcardClassKafkaSpout9.kafkaSpoutStreams;
        wildcardClassKafkaSpout9.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder13 = wildcardClassKafkaSpout9.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout14 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy15 = wildcardClassKafkaSpout14.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet16 = wildcardClassKafkaSpout14.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray17 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet18 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet18, kafkaSpoutMessageIdArray17);
        wildcardClassKafkaSpout14.emitted = kafkaSpoutMessageIdSet18;
        wildcardClassKafkaSpout9.emitted = kafkaSpoutMessageIdSet18;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig22 = wildcardClassKafkaSpout9.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout23 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams24 = wildcardClassKafkaSpout23.kafkaSpoutStreams;
        wildcardClassKafkaSpout23.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder27 = wildcardClassKafkaSpout23.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout28 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy29 = wildcardClassKafkaSpout28.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet30 = wildcardClassKafkaSpout28.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray31 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet32 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet32, kafkaSpoutMessageIdArray31);
        wildcardClassKafkaSpout28.emitted = kafkaSpoutMessageIdSet32;
        wildcardClassKafkaSpout23.emitted = kafkaSpoutMessageIdSet32;
        wildcardClassKafkaSpout9.emitted = kafkaSpoutMessageIdSet32;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet32;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService38 = wildcardClassKafkaSpout0.retryService;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer39 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords40 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig14 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer15 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = wildcardClassKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        int int3 = wildcardClassKafkaSpout0.maxRetries;
        int int4 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = wildcardClassKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 100;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap4 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords5 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassKafkaSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>>();
        wildcardClassKafkaSpoutKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = wildcardClassKafkaSpoutKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpoutKafkaSpout0.nextTuple();
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = wildcardClassKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig6 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = wildcardClassKafkaSpout0.retryService;
        java.lang.String str8 = wildcardClassKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdComparatorKafkaSpout0.activate();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        int int6 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer7 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>();
        boolean boolean1 = kafkaSpoutMessageIdSetKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdSetKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (short) -1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords7 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout8 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = wildcardClassKafkaSpout8.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = wildcardClassKafkaSpout8.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray11 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet12 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet12, kafkaSpoutMessageIdArray11);
        wildcardClassKafkaSpout8.emitted = kafkaSpoutMessageIdSet12;
        wildcardClassKafkaSpout8.maxRetries = (short) 10;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout17 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams18 = wildcardClassKafkaSpout17.kafkaSpoutStreams;
        wildcardClassKafkaSpout17.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder21 = wildcardClassKafkaSpout17.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout22 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy23 = wildcardClassKafkaSpout22.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet24 = wildcardClassKafkaSpout22.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray25 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet26 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet26, kafkaSpoutMessageIdArray25);
        wildcardClassKafkaSpout22.emitted = kafkaSpoutMessageIdSet26;
        wildcardClassKafkaSpout17.emitted = kafkaSpoutMessageIdSet26;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig30 = wildcardClassKafkaSpout17.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout31 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams32 = wildcardClassKafkaSpout31.kafkaSpoutStreams;
        wildcardClassKafkaSpout31.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder35 = wildcardClassKafkaSpout31.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout36 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy37 = wildcardClassKafkaSpout36.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet38 = wildcardClassKafkaSpout36.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray39 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet40 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet40, kafkaSpoutMessageIdArray39);
        wildcardClassKafkaSpout36.emitted = kafkaSpoutMessageIdSet40;
        wildcardClassKafkaSpout31.emitted = kafkaSpoutMessageIdSet40;
        wildcardClassKafkaSpout17.emitted = kafkaSpoutMessageIdSet40;
        wildcardClassKafkaSpout8.emitted = kafkaSpoutMessageIdSet40;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet40;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean47 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        boolean boolean7 = wildcardClassKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        long long14 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.lang.Cloneable> iComponentKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.lang.Cloneable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = iComponentKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        iComponentKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Optional<java.lang.Integer>> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Optional<java.lang.Integer>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdSetKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.apache.storm.kafka.spout.KafkaSpout<org.slf4j.Logger, java.lang.Cloneable> loggerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.slf4j.Logger, java.lang.Cloneable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = loggerKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.spout.ISpout>.KafkaSpoutConsumerRebalanceListener, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> kafkaSpoutConsumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.spout.ISpout>.KafkaSpoutConsumerRebalanceListener, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutConsumerRebalanceListenerKafkaSpout0.shutdown();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassKafkaSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>>();
        wildcardClassKafkaSpoutKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = wildcardClassKafkaSpoutKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = wildcardClassKafkaSpoutKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer7 = wildcardClassKafkaSpout0.kafkaConsumer;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        java.lang.String str5 = wildcardClassKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        int int6 = wildcardClassKafkaSpout0.maxRetries;
        boolean boolean7 = wildcardClassKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.spout.ISpout>.KafkaSpoutConsumerRebalanceListener, java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutConsumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.spout.ISpout>.KafkaSpoutConsumerRebalanceListener, java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = kafkaSpoutConsumerRebalanceListenerKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutConsumerRebalanceListenerKafkaSpout0.activate();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        boolean boolean6 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        boolean boolean7 = wildcardClassKafkaSpout0.initialized;
        boolean boolean8 = wildcardClassKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdSetKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        int int4 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords5 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> kafkaSpoutMessageIdListKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = kafkaSpoutMessageIdListKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> offsetEntryKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>>();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory1 = offsetEntryKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        offsetEntryKafkaSpout0.shutdown();
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        boolean boolean4 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector5 = wildcardClassKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder6 = wildcardClassKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = wildcardClassKafkaSpout0.collector;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor4 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig3 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = wildcardClassKafkaSpout0.retryService;
        boolean boolean10 = wildcardClassKafkaSpout0.waitingToEmit();
        boolean boolean11 = wildcardClassKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.CharSequence> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray1 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet2, kafkaSpoutMessageIdArray1);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet2;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap13 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdListKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdListKafkaSpout0.nextTuple();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 0;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder10 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig11 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet3 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory6 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        int int3 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor5 = wildcardClassKafkaSpout0.waitingToEmit;
        long long6 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer2 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        org.apache.storm.kafka.spout.KafkaSpout<org.slf4j.Logger, java.lang.Cloneable> loggerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.slf4j.Logger, java.lang.Cloneable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        loggerKafkaSpout0.activate();
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.lang.Iterable<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> iRichSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IRichSpout, java.lang.Iterable<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        iRichSpoutKafkaSpout0.numUncommittedOffsets = 35L;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        iRichSpoutKafkaSpout0.nextTuple();
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = kafkaSpoutMessageIdComparatorKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        int int3 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = wildcardClassKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int5 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        wildcardClassKafkaSpout0.maxRetries = (short) -1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer8 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder3 = wildcardClassKafkaSpout0.tuplesBuilder;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        long long6 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor5 = wildcardClassKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseRichSpout, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> baseRichSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseRichSpout, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        baseRichSpoutKafkaSpout0.emit();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>> kafkaSpoutMessageIdComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = kafkaSpoutMessageIdComparatorKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdComparatorKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        boolean boolean9 = wildcardClassKafkaSpout0.waitingToEmit();
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer12 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig14 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap16 = wildcardClassKafkaSpout0.acked;
        wildcardClassKafkaSpout0.maxRetries = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords19 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = wildcardClassKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>>();
        kafkaSpoutMessageIdSetKafkaSpout0.initialized = false;
        boolean boolean3 = kafkaSpoutMessageIdSetKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = kafkaSpoutMessageIdSetKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdSetKafkaSpout0.activate();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>> kafkaSpoutMessageIdComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = kafkaSpoutMessageIdComparatorKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = kafkaSpoutMessageIdComparatorKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = kafkaSpoutMessageIdComparatorKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractCollection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = kafkaSpoutMessageIdCollectionKafkaSpout0.poll();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> offsetEntryKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>>();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory1 = offsetEntryKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        offsetEntryKafkaSpout0.shutdown();
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.clients.consumer.ConsumerRebalanceListener> kafkaSpoutMessageIdListKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.clients.consumer.ConsumerRebalanceListener>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = kafkaSpoutMessageIdListKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        boolean boolean5 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        boolean boolean9 = wildcardClassKafkaSpout0.waitingToEmit();
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        java.lang.String str3 = wildcardClassKafkaSpout0.toString();
        wildcardClassKafkaSpout0.consumerAutoCommitMode = true;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        int int3 = wildcardClassKafkaSpout0.maxRetries;
        int int4 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = wildcardClassKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder13 = wildcardClassKafkaSpout0.tuplesBuilder;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords16 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.spout.ISpout>.KafkaSpoutConsumerRebalanceListener, java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutConsumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.spout.ISpout>.KafkaSpoutConsumerRebalanceListener, java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = kafkaSpoutConsumerRebalanceListenerKafkaSpout0.retryService;
        kafkaSpoutConsumerRebalanceListenerKafkaSpout0.maxRetries = (short) 10;
        boolean boolean4 = kafkaSpoutConsumerRebalanceListenerKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = kafkaSpoutConsumerRebalanceListenerKafkaSpout0.poll();
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        int int6 = wildcardClassKafkaSpout0.maxRetries;
        boolean boolean7 = wildcardClassKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory6 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap4 = wildcardClassKafkaSpout0.acked;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector5 = wildcardClassKafkaSpout0.collector;
        long long6 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        int int6 = wildcardClassKafkaSpout0.maxRetries;
        boolean boolean7 = wildcardClassKafkaSpout0.waitingToEmit();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.lang.Cloneable> iComponentKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.lang.Cloneable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = iComponentKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = iComponentKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        iComponentKafkaSpout0.close();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = wildcardClassKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig6 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = wildcardClassKafkaSpout0.retryService;
        java.lang.String str8 = wildcardClassKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        wildcardClassKafkaSpout0.maxRetries = (byte) 100;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer9 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        boolean boolean6 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        boolean boolean7 = wildcardClassKafkaSpout0.initialized;
        boolean boolean8 = wildcardClassKafkaSpout0.waitingToEmit();
        wildcardClassKafkaSpout0.consumerAutoCommitMode = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Iterable<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdListKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Iterable<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        boolean boolean1 = kafkaSpoutMessageIdListKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdListKafkaSpout0.emit();
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        int int3 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>();
        boolean boolean1 = kafkaSpoutMessageIdSetKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = kafkaSpoutMessageIdSetKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
        org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> serializableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        serializableKafkaSpout0.emit();
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = wildcardClassKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray1 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet2, kafkaSpoutMessageIdArray1);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet2;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 0;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder10 = wildcardClassKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        wildcardClassKafkaSpout0.maxRetries = (short) -1;
        boolean boolean8 = wildcardClassKafkaSpout0.waitingToEmit();
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap9 = wildcardClassKafkaSpout0.acked;
        boolean boolean10 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.close();
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        long long6 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 100;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap4 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        boolean boolean9 = wildcardClassKafkaSpout0.waitingToEmit();
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer12 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str13 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (short) -1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService9 = wildcardClassKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig10 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector11 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        boolean boolean14 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        long long15 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor5 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer7 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout8 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy9 = wildcardClassKafkaSpout8.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet10 = wildcardClassKafkaSpout8.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray11 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet12 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet12, kafkaSpoutMessageIdArray11);
        wildcardClassKafkaSpout8.emitted = kafkaSpoutMessageIdSet12;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet12;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, java.lang.String> offsetEntryKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, java.lang.String>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = offsetEntryKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        boolean boolean14 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        long long15 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor16 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        wildcardClassKafkaSpout0.maxRetries = (short) 10;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout9 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = wildcardClassKafkaSpout9.kafkaSpoutStreams;
        wildcardClassKafkaSpout9.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder13 = wildcardClassKafkaSpout9.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout14 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy15 = wildcardClassKafkaSpout14.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet16 = wildcardClassKafkaSpout14.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray17 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet18 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet18, kafkaSpoutMessageIdArray17);
        wildcardClassKafkaSpout14.emitted = kafkaSpoutMessageIdSet18;
        wildcardClassKafkaSpout9.emitted = kafkaSpoutMessageIdSet18;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig22 = wildcardClassKafkaSpout9.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout23 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams24 = wildcardClassKafkaSpout23.kafkaSpoutStreams;
        wildcardClassKafkaSpout23.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder27 = wildcardClassKafkaSpout23.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout28 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy29 = wildcardClassKafkaSpout28.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet30 = wildcardClassKafkaSpout28.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray31 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet32 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet32, kafkaSpoutMessageIdArray31);
        wildcardClassKafkaSpout28.emitted = kafkaSpoutMessageIdSet32;
        wildcardClassKafkaSpout23.emitted = kafkaSpoutMessageIdSet32;
        wildcardClassKafkaSpout9.emitted = kafkaSpoutMessageIdSet32;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet32;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService38 = wildcardClassKafkaSpout0.retryService;
        boolean boolean39 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams40 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.maxRetries = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        int int4 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = wildcardClassKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig6 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = wildcardClassKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int5 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor9 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        boolean boolean6 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        boolean boolean7 = wildcardClassKafkaSpout0.waitingToEmit();
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        wildcardClassKafkaSpout0.maxRetries = (short) 10;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout9 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = wildcardClassKafkaSpout9.kafkaSpoutStreams;
        wildcardClassKafkaSpout9.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder13 = wildcardClassKafkaSpout9.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout14 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy15 = wildcardClassKafkaSpout14.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet16 = wildcardClassKafkaSpout14.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray17 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet18 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet18, kafkaSpoutMessageIdArray17);
        wildcardClassKafkaSpout14.emitted = kafkaSpoutMessageIdSet18;
        wildcardClassKafkaSpout9.emitted = kafkaSpoutMessageIdSet18;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig22 = wildcardClassKafkaSpout9.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout23 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams24 = wildcardClassKafkaSpout23.kafkaSpoutStreams;
        wildcardClassKafkaSpout23.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder27 = wildcardClassKafkaSpout23.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout28 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy29 = wildcardClassKafkaSpout28.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet30 = wildcardClassKafkaSpout28.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray31 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet32 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet32, kafkaSpoutMessageIdArray31);
        wildcardClassKafkaSpout28.emitted = kafkaSpoutMessageIdSet32;
        wildcardClassKafkaSpout23.emitted = kafkaSpoutMessageIdSet32;
        wildcardClassKafkaSpout9.emitted = kafkaSpoutMessageIdSet32;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet32;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService38 = wildcardClassKafkaSpout0.retryService;
        boolean boolean39 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams40 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.maxRetries = 52;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory6 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray1 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet2, kafkaSpoutMessageIdArray1);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet2;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap3 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        boolean boolean9 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean10 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.lang.reflect.GenericDeclaration> iSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        iSpoutKafkaSpout0.shutdown();
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 100;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        long long5 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        boolean boolean6 = wildcardClassKafkaSpout0.initialized;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory8 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.String>();
        kafkaSpoutMessageIdSetKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdSetKafkaSpout0.shutdown();
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer5 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder6 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout0.emitted;
        wildcardClassKafkaSpout0.maxRetries = 35;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (short) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig14 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet16 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder3 = wildcardClassKafkaSpout0.tuplesBuilder;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector5 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        boolean boolean1 = kafkaSpoutMessageIdComparatorKafkaSpout0.waitingToEmit();
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = kafkaSpoutMessageIdComparatorKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = kafkaSpoutMessageIdComparatorKafkaSpout0.poll();
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout3 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = wildcardClassKafkaSpout3.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap5 = wildcardClassKafkaSpout3.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor6 = wildcardClassKafkaSpout3.waitingToEmit;
        wildcardClassKafkaSpout3.maxRetries = 100;
        wildcardClassKafkaSpout3.maxRetries = (byte) 100;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap11 = wildcardClassKafkaSpout3.acked;
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord25 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 32, serialized key size = 10, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = )", (int) (byte) 10, (long) '4', "hi!", (java.lang.CharSequence) "hi!");
        long long26 = strConsumerRecord25.offset();
        java.lang.String str27 = strConsumerRecord25.toString();
        int int28 = strConsumerRecord25.partition();
        java.util.Optional<java.lang.Integer> intOptional29 = strConsumerRecord25.leaderEpoch();
        java.lang.String str30 = strConsumerRecord25.topic();
        long long31 = strConsumerRecord25.timestamp();
        org.apache.kafka.common.record.TimestampType timestampType32 = strConsumerRecord25.timestampType();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator36 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator36;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator38 = offsetComparator36.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator39 = offsetComparator36.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator36;
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator41 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator41;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator43 = offsetComparator41.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator44 = kafkaSpoutMessageIdComparator43.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator45 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator46 = org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator47 = offsetComparator45.thenComparing(kafkaSpoutMessageIdComparator46);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator48 = kafkaSpoutMessageIdComparator44.thenComparing(kafkaSpoutMessageIdComparator46);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator49 = offsetComparator36.thenComparing(kafkaSpoutMessageIdComparator44);
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator50 = kafkaSpoutMessageIdComparator49.reversed();
        org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator offsetComparator51 = new org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator();
        org.apache.storm.kafka.spout.KafkaSpout.OFFSET_COMPARATOR = offsetComparator51;
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator53 = offsetComparator51.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator54 = kafkaSpoutMessageIdComparator53.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator55 = kafkaSpoutMessageIdComparator53.reversed();
        java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdComparator56 = kafkaSpoutMessageIdComparator49.thenComparing(kafkaSpoutMessageIdComparator53);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord66 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>("ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 32, serialized key size = 10, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = )", (int) (byte) 10, (long) '4', "hi!", (java.lang.CharSequence) "hi!");
        long long67 = strConsumerRecord66.offset();
        java.lang.String str68 = strConsumerRecord66.toString();
        int int69 = strConsumerRecord66.partition();
        org.apache.kafka.common.record.TimestampType timestampType70 = strConsumerRecord66.timestampType();
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord76 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 32, serialized key size = 10, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = 1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 32, serialized key size = 10, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ), value = hi!)", 0, 1L, 35L, timestampType70, 10L, (-1), (int) (short) 10, "hi!", (java.lang.CharSequence) "ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 32, serialized key size = 10, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ), partition = -1, leaderEpoch = null, offset = 100, null = 10, serialized key size = 1, serialized value size = 10, headers = RecordHeaders(headers = [], isReadOnly = false), key = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 32, serialized key size = 10, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ), value = hi!)");
        org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.common.record.TimestampType> kafkaSpoutMessageIdComparatorConsumerRecord77 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.common.record.TimestampType>("ConsumerRecord(topic = , partition = 100, leaderEpoch = null, offset = 0, null = 1, serialized key size = 10, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 32, serialized key size = 10, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ))", (int) (byte) -1, (long) '4', 32L, timestampType32, (long) 1, (int) ' ', (int) (short) 1, kafkaSpoutMessageIdComparator49, timestampType70);
        org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence> strConsumerRecord83 = new org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>("ConsumerRecord(topic = ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 32, serialized key size = 10, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = ), partition = 10, leaderEpoch = null, offset = 52, NoTimestampType = -1, serialized key size = -1, serialized value size = -1, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = hi!)", 32, (long) ' ', (long) 35, timestampType32, (long) (byte) -1, (int) (byte) 0, 10, "", (java.lang.CharSequence) "ConsumerRecord(topic = , partition = 10, leaderEpoch = null, offset = -1, null = 32, serialized key size = 10, serialized value size = 32, headers = RecordHeaders(headers = [], isReadOnly = false), key = hi!, value = )");
        org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.spout.ISpout, org.apache.kafka.common.record.TimestampType> iSpoutConsumerRecord84 = new org.apache.kafka.clients.consumer.ConsumerRecord<org.apache.storm.spout.ISpout, org.apache.kafka.common.record.TimestampType>("hi!", (int) ' ', (long) 0, (org.apache.storm.spout.ISpout) wildcardClassKafkaSpout3, timestampType32);
        int int85 = wildcardClassKafkaSpout3.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout3.close();
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdCollectionKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        int int3 = wildcardClassKafkaSpout0.maxRetries;
        boolean boolean4 = wildcardClassKafkaSpout0.initialized;
        boolean boolean5 = wildcardClassKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        boolean boolean6 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        boolean boolean7 = wildcardClassKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor5 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig7 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig3 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = kafkaSpoutMessageIdCollectionKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = wildcardClassKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer8 = wildcardClassKafkaSpout0.commitTimer;
        wildcardClassKafkaSpout0.numUncommittedOffsets = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = wildcardClassKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        wildcardClassKafkaSpout0.consumerAutoCommitMode = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords7 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig14 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor15 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.initialized = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> timestampTypeEnumKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = timestampTypeEnumKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.Cloneable> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.lang.Cloneable>();
        long long1 = strKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strKafkaSpout0.emit();
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor4 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Optional<java.lang.Integer>> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Optional<java.lang.Integer>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = kafkaSpoutMessageIdSetKafkaSpout0.commit();
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdListKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = kafkaSpoutMessageIdListKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.spout.ISpout>.KafkaSpoutConsumerRebalanceListener, java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutConsumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.spout.ISpout>.KafkaSpoutConsumerRebalanceListener, java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = kafkaSpoutConsumerRebalanceListenerKafkaSpout0.retryService;
        kafkaSpoutConsumerRebalanceListenerKafkaSpout0.maxRetries = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = kafkaSpoutConsumerRebalanceListenerKafkaSpout0.commit();
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory8 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Optional<java.lang.Integer>> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Optional<java.lang.Integer>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = kafkaSpoutMessageIdSetKafkaSpout0.poll();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder5 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = true;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        boolean boolean6 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        boolean boolean7 = wildcardClassKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams8 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        boolean boolean9 = wildcardClassKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        wildcardClassKafkaSpout0.maxRetries = (short) 10;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout9 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = wildcardClassKafkaSpout9.kafkaSpoutStreams;
        wildcardClassKafkaSpout9.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder13 = wildcardClassKafkaSpout9.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout14 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy15 = wildcardClassKafkaSpout14.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet16 = wildcardClassKafkaSpout14.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray17 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet18 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet18, kafkaSpoutMessageIdArray17);
        wildcardClassKafkaSpout14.emitted = kafkaSpoutMessageIdSet18;
        wildcardClassKafkaSpout9.emitted = kafkaSpoutMessageIdSet18;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig22 = wildcardClassKafkaSpout9.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout23 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams24 = wildcardClassKafkaSpout23.kafkaSpoutStreams;
        wildcardClassKafkaSpout23.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder27 = wildcardClassKafkaSpout23.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout28 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy29 = wildcardClassKafkaSpout28.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet30 = wildcardClassKafkaSpout28.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray31 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet32 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet32, kafkaSpoutMessageIdArray31);
        wildcardClassKafkaSpout28.emitted = kafkaSpoutMessageIdSet32;
        wildcardClassKafkaSpout23.emitted = kafkaSpoutMessageIdSet32;
        wildcardClassKafkaSpout9.emitted = kafkaSpoutMessageIdSet32;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet32;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService38 = wildcardClassKafkaSpout0.retryService;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer39 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        wildcardClassKafkaSpout0.maxRetries = (short) 10;
        boolean boolean9 = wildcardClassKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdCollectionKafkaSpout0.close();
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
        org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> serializableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        serializableKafkaSpout0.emit();
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        boolean boolean1 = wildcardClassKafkaSpout0.initialized;
        long long2 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = wildcardClassKafkaSpout0.retryService;
        wildcardClassKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassKafkaSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpoutKafkaSpout0.kafkaSpoutStreams;
        int int2 = wildcardClassKafkaSpoutKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpoutKafkaSpout0.shutdown();
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry> kafkaSpoutMessageIdListKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdListKafkaSpout0.shutdown();
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig3 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.clients.consumer.ConsumerRebalanceListener> kafkaSpoutMessageIdComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.clients.consumer.ConsumerRebalanceListener>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = kafkaSpoutMessageIdComparatorKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.lang.Cloneable> iComponentKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.lang.Cloneable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = iComponentKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        iComponentKafkaSpout0.nextTuple();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor5 = wildcardClassKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        wildcardClassKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = wildcardClassKafkaSpout0.collector;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        boolean boolean4 = wildcardClassKafkaSpout0.initialized;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap5 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        boolean boolean1 = wildcardClassKafkaSpout0.initialized;
        long long2 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig14 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams15 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector16 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, org.slf4j.Logger> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, org.slf4j.Logger>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.shutdown();
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        long long14 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet15 = wildcardClassKafkaSpout0.emitted;
        int int16 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer17 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        long long14 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet15 = wildcardClassKafkaSpout0.emitted;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap16 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer7 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig3 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        wildcardClassKafkaSpout0.initialized = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassKafkaSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>>();
        long long1 = wildcardClassKafkaSpoutKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpoutKafkaSpout0.shutdown();
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.RandomAccess, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> randomAccessKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.RandomAccess, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        randomAccessKafkaSpout0.close();
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor5 = wildcardClassKafkaSpout0.waitingToEmit;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder5 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdListKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdListKafkaSpout0.deactivate();
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, org.slf4j.Logger> offsetEntryKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, org.slf4j.Logger>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        offsetEntryKafkaSpout0.activate();
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = wildcardClassKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords3 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.Cloneable> charSequenceKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.Cloneable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = charSequenceKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        boolean boolean4 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = wildcardClassKafkaSpout0.collector;
        boolean boolean5 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = wildcardClassKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig6 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = true;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig9 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        int int3 = wildcardClassKafkaSpout0.maxRetries;
        boolean boolean4 = wildcardClassKafkaSpout0.initialized;
        boolean boolean5 = wildcardClassKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>> kafkaSpoutMessageIdComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = kafkaSpoutMessageIdComparatorKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = kafkaSpoutMessageIdComparatorKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = kafkaSpoutMessageIdComparatorKafkaSpout0.commit();
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.lang.Cloneable> iComponentKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.lang.Cloneable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        iComponentKafkaSpout0.emit();
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap14 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, java.util.RandomAccess> typeKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.Type, java.util.RandomAccess>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        typeKafkaSpout0.deactivate();
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 100;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap4 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        wildcardClassKafkaSpout0.maxRetries = (byte) 100;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer9 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        boolean boolean6 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        boolean boolean7 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        wildcardClassKafkaSpout0.maxRetries = (short) -1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer8 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        wildcardClassKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer13 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords14 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor4 = wildcardClassKafkaSpout0.waitingToEmit;
        java.lang.String str5 = wildcardClassKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        boolean boolean14 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        long long15 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor16 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory17 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        long long18 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (byte) 100;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig4 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.lang.String str5 = wildcardClassKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        boolean boolean4 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory6 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = wildcardClassKafkaSpout0.collector;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer5 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        int int7 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 100;
        boolean boolean4 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = wildcardClassKafkaSpout0.retryService;
        boolean boolean6 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 0;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder10 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig11 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams12 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet9;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig13 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        boolean boolean14 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = wildcardClassKafkaSpout0.retryService;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer7 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy8 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean9 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.util.Optional<java.lang.Integer>> annotatedElementKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.AnnotatedElement, java.util.Optional<java.lang.Integer>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = annotatedElementKafkaSpout0.commit();
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        wildcardClassKafkaSpout0.initialized = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }
}

