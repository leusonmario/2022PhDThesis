import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector4 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.io.Serializable> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = strKafkaSpout0.commit();
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.String> strComparableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.String>();
        strComparableKafkaSpout0.initialized = true;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = strComparableKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strComparableKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        boolean boolean6 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        boolean boolean7 = wildcardClassKafkaSpout0.initialized;
        boolean boolean8 = wildcardClassKafkaSpout0.waitingToEmit();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams9 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet3 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        wildcardClassKafkaSpout0.maxRetries = (short) -1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer8 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer10 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        boolean boolean5 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        int int4 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        boolean boolean5 = wildcardClassKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, org.slf4j.Logger> offsetEntryKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, org.slf4j.Logger>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        offsetEntryKafkaSpout0.emit();
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = wildcardClassKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer8 = wildcardClassKafkaSpout0.commitTimer;
        wildcardClassKafkaSpout0.numUncommittedOffsets = 'a';
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
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
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor14 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, org.apache.storm.topology.IComponent> charSequenceKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, org.apache.storm.topology.IComponent>();
        charSequenceKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = charSequenceKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
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
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = wildcardClassKafkaSpout0.collector;
        java.lang.String str8 = wildcardClassKafkaSpout0.toString();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        boolean boolean7 = wildcardClassKafkaSpout0.initialized;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer8 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> strComparableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>>();
        boolean boolean1 = strComparableKafkaSpout0.consumerAutoCommitMode;
        strComparableKafkaSpout0.numUncommittedOffsets = (-1L);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strComparableKafkaSpout0.nextTuple();
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder5 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
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
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        boolean boolean4 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        wildcardClassKafkaSpout0.numUncommittedOffsets = '4';
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassKafkaSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpoutKafkaSpout0.emit();
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test524");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy5 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test525");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>>();
        kafkaSpoutMessageIdSetKafkaSpout0.initialized = false;
        boolean boolean3 = kafkaSpoutMessageIdSetKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdSetKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test526");
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
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap38 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test527");
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
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector28 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test528");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = wildcardClassKafkaSpout0.collector;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector10 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test529");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test530");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = kafkaSpoutMessageIdSetKafkaSpout0.poll();
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test531");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector11 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test532");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> strConsumerRecordKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>, java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector1 = strConsumerRecordKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strConsumerRecordKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test533");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        wildcardClassKafkaSpout0.maxRetries = (byte) 100;
        java.lang.String str8 = wildcardClassKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords9 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test534");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test535");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        wildcardClassKafkaSpout0.maxRetries = (short) 10;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test536");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        boolean boolean4 = wildcardClassKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout5 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout5.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout5.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray8 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet9 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet9, kafkaSpoutMessageIdArray8);
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet9;
        wildcardClassKafkaSpout5.maxRetries = (short) 10;
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig27 = wildcardClassKafkaSpout14.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout28 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams29 = wildcardClassKafkaSpout28.kafkaSpoutStreams;
        wildcardClassKafkaSpout28.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder32 = wildcardClassKafkaSpout28.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout33 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy34 = wildcardClassKafkaSpout33.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet35 = wildcardClassKafkaSpout33.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray36 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet37 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet37, kafkaSpoutMessageIdArray36);
        wildcardClassKafkaSpout33.emitted = kafkaSpoutMessageIdSet37;
        wildcardClassKafkaSpout28.emitted = kafkaSpoutMessageIdSet37;
        wildcardClassKafkaSpout14.emitted = kafkaSpoutMessageIdSet37;
        wildcardClassKafkaSpout5.emitted = kafkaSpoutMessageIdSet37;
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet37;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean44 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test537");
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
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig17 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test538");
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
        boolean boolean10 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test539");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdSetKafkaSpout0.deactivate();
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test540");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = wildcardClassKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer5 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test541");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = wildcardClassKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer8 = wildcardClassKafkaSpout0.commitTimer;
        int int9 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str12 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test542");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> offsetEntryKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        offsetEntryKafkaSpout0.emit();
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test543");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        boolean boolean4 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test544");
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
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer41 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test545");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor4 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test546");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 100;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test547");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, org.apache.kafka.common.header.Headers> iComponentKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, org.apache.kafka.common.header.Headers>();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector1 = iComponentKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        iComponentKafkaSpout0.nextTuple();
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test548");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test549");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test550");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>, org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.spout.ISpout>.KafkaSpoutConsumerRebalanceListener> strConsumerRecordKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>, org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.spout.ISpout>.KafkaSpoutConsumerRebalanceListener>();
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector1 = strConsumerRecordKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = strConsumerRecordKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test551");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.emit();
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test552");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams4 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test553");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        wildcardClassKafkaSpout0.maxRetries = (short) -1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer8 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        wildcardClassKafkaSpout0.maxRetries = (byte) -1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean12 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test554");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> objKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Object, java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = objKafkaSpout0.commit();
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test555");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test556");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test557");
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
        boolean boolean17 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test558");
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
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap38 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test559");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.Iterable<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> charSequenceKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.Iterable<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = charSequenceKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test560");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = kafkaSpoutMessageIdSetKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test561");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory3 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test562");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test563");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (short) 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str11 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test564");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.lang.Cloneable> iComponentKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.IComponent, java.lang.Cloneable>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = iComponentKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = iComponentKafkaSpout0.poll();
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test565");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        boolean boolean4 = wildcardClassKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        int int6 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test566");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.List<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = kafkaSpoutMessageIdSetKafkaSpout0.commit();
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test567");
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
        java.lang.String str10 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test568");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor5 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig6 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig7 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test569");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        boolean boolean4 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = wildcardClassKafkaSpout0.emitted;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test570");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        int int4 = wildcardClassKafkaSpout0.maxRetries;
        int int5 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy6 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test571");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.Iterable<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> charSequenceKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.Iterable<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        java.lang.String str1 = charSequenceKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        charSequenceKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test572");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test573");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder3 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService4 = wildcardClassKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test574");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        java.lang.String str3 = wildcardClassKafkaSpout0.toString();
        wildcardClassKafkaSpout0.consumerAutoCommitMode = true;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        boolean boolean7 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test575");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService3 = wildcardClassKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test576");
        org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, java.lang.reflect.GenericDeclaration> serializableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.io.Serializable, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        serializableKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test577");
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
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test578");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        wildcardClassKafkaSpout0.maxRetries = 100;
        wildcardClassKafkaSpout0.maxRetries = (byte) 100;
        java.lang.String str8 = wildcardClassKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test579");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry> kafkaSpoutMessageIdListKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry>();
        boolean boolean1 = kafkaSpoutMessageIdListKafkaSpout0.waitingToEmit();
        kafkaSpoutMessageIdListKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdListKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test580");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        boolean boolean4 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test581");
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
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test582");
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
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService16 = wildcardClassKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test583");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test584");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder5 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        boolean boolean7 = wildcardClassKafkaSpout0.waitingToEmit();
        int int8 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder9 = wildcardClassKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test585");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        boolean boolean4 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector5 = wildcardClassKafkaSpout0.collector;
        boolean boolean6 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test586");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        long long6 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        int int7 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.deactivate();
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test587");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords12 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test588");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean7 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test589");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        boolean boolean4 = wildcardClassKafkaSpout0.initialized;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        long long6 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap7 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test590");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        boolean boolean3 = wildcardClassKafkaSpout0.waitingToEmit();
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer5 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder6 = wildcardClassKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test591");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        boolean boolean5 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test592");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory4 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams5 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test593");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        java.lang.String str3 = wildcardClassKafkaSpout0.toString();
        wildcardClassKafkaSpout0.consumerAutoCommitMode = true;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        boolean boolean7 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test594");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.spout.ISpout>.KafkaSpoutConsumerRebalanceListener, java.io.Serializable> kafkaSpoutConsumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.spout.ISpout>.KafkaSpoutConsumerRebalanceListener, java.io.Serializable>();
        kafkaSpoutConsumerRebalanceListenerKafkaSpout0.maxRetries = 1;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean3 = kafkaSpoutConsumerRebalanceListenerKafkaSpout0.commit();
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test595");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder5 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams6 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str9 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test596");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.spout.ISpout>.KafkaSpoutConsumerRebalanceListener, java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutConsumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseComponent, org.apache.storm.spout.ISpout>.KafkaSpoutConsumerRebalanceListener, java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = kafkaSpoutConsumerRebalanceListenerKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutConsumerRebalanceListenerKafkaSpout0.shutdown();
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test597");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Enum<org.apache.kafka.common.record.TimestampType>> kafkaSpoutMessageIdCollectionKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Enum<org.apache.kafka.common.record.TimestampType>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdCollectionKafkaSpout0.deactivate();
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test598");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.Object> strComparableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Comparable<java.lang.String>, java.lang.Object>();
        strComparableKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = strComparableKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        strComparableKafkaSpout0.emit();
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test599");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        long long1 = genericDeclarationKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        genericDeclarationKafkaSpout0.activate();
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test600");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.lang.reflect.GenericDeclaration> iSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.spout.ISpout, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        iSpoutKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test601");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> consumerRebalanceListenerKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        boolean boolean1 = consumerRebalanceListenerKafkaSpout0.consumerAutoCommitMode;
        consumerRebalanceListenerKafkaSpout0.initialized = false;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        consumerRebalanceListenerKafkaSpout0.shutdown();
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test602");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 100;
        boolean boolean4 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet5 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder6 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory7 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test603");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.String, java.lang.CharSequence>>();
        boolean boolean1 = kafkaSpoutMessageIdSetKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdSetKafkaSpout0.commitOffsetsForAckedTuples();
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test604");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder7 = wildcardClassKafkaSpout0.tuplesBuilder;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 0;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer10 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test605");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        boolean boolean4 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords5 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test606");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test607");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        long long2 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams3 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords4 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test608");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        boolean boolean4 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test609");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = wildcardClassKafkaSpout0.collector;
        java.lang.String str8 = wildcardClassKafkaSpout0.toString();
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory9 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test610");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.clients.consumer.ConsumerRebalanceListener> kafkaSpoutMessageIdComparatorKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.kafka.clients.consumer.ConsumerRebalanceListener>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = kafkaSpoutMessageIdComparatorKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService2 = kafkaSpoutMessageIdComparatorKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdComparatorKafkaSpout0.activate();
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test611");
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
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer13 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test612");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig11 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test613");
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
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test614");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 100;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test615");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        boolean boolean2 = wildcardClassKafkaSpout0.initialized;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        int int4 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test616");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test617");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration> genericDeclarationKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.reflect.GenericDeclaration, java.lang.reflect.GenericDeclaration>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = genericDeclarationKafkaSpout0.commit();
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test618");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer5 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords6 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test619");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.io.Serializable> strKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.String, java.io.Serializable>();
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService1 = strKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean2 = strKafkaSpout0.poll();
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test620");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 100;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap4 = wildcardClassKafkaSpout0.acked;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords5 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test621");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap2 = wildcardClassKafkaSpout0.acked;
        wildcardClassKafkaSpout0.consumerAutoCommitMode = false;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer5 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test622");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.reflect.AnnotatedElement> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.reflect.AnnotatedElement>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = kafkaSpoutMessageIdSetKafkaSpout0.commit();
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test623");
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
        wildcardClassKafkaSpout0.emit();
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test624");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector3 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test625");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder4 = wildcardClassKafkaSpout0.tuplesBuilder;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig5 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet6 = wildcardClassKafkaSpout0.emitted;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet7 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test626");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        org.apache.storm.kafka.spout.KafkaSpoutTuplesBuilder<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutTuplesBuilder5 = wildcardClassKafkaSpout0.tuplesBuilder;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test627");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        int int6 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy7 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet8 = wildcardClassKafkaSpout0.emitted;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (short) 0;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords11 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test628");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str41 = wildcardClassKafkaSpout0.getWildCardTopics();
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test629");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test630");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor3 = wildcardClassKafkaSpout0.waitingToEmit;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test631");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        boolean boolean7 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.activate();
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test632");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap4 = wildcardClassKafkaSpout0.acked;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector5 = wildcardClassKafkaSpout0.collector;
        boolean boolean6 = wildcardClassKafkaSpout0.waitingToEmit();
        wildcardClassKafkaSpout0.maxRetries = (short) 100;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector9 = wildcardClassKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams10 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean11 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test633");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> charSequenceKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.util.AbstractSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        charSequenceKafkaSpout0.close();
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test634");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        java.util.Iterator<org.apache.kafka.clients.consumer.ConsumerRecord<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassConsumerRecordItor2 = wildcardClassKafkaSpout0.waitingToEmit;
        boolean boolean3 = wildcardClassKafkaSpout0.initialized;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test635");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>> wildcardClassKafkaSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpoutKafkaSpout0.kafkaSpoutStreams;
        int int2 = wildcardClassKafkaSpoutKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpoutKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test636");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.numUncommittedOffsets = (byte) 100;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer4 = wildcardClassKafkaSpout0.kafkaConsumer;
        long long5 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test637");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.io.Serializable> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdSetKafkaSpout0.shutdown();
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test638");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdListKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.util.Comparator<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        long long1 = kafkaSpoutMessageIdListKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdListKafkaSpout0.emit();
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test639");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        org.apache.storm.kafka.spout.KafkaSpoutMessageId[] kafkaSpoutMessageIdArray3 = new org.apache.storm.kafka.spout.KafkaSpoutMessageId[] {};
        java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet4 = new java.util.LinkedHashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.apache.storm.kafka.spout.KafkaSpoutMessageId>) kafkaSpoutMessageIdSet4, kafkaSpoutMessageIdArray3);
        wildcardClassKafkaSpout0.emitted = kafkaSpoutMessageIdSet4;
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams7 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy10 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig11 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector12 = wildcardClassKafkaSpout0.collector;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector13 = wildcardClassKafkaSpout0.collector;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test640");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdSetKafkaSpout0.activate();
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test641");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.io.Serializable> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.HashSet<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.io.Serializable>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdSetKafkaSpout0.activate();
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test642");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy2 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Map<org.apache.kafka.common.TopicPartition, org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.OffsetEntry> topicPartitionMap3 = wildcardClassKafkaSpout0.acked;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy4 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test643");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        int int3 = wildcardClassKafkaSpout0.maxRetries;
        int int4 = wildcardClassKafkaSpout0.maxRetries;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = wildcardClassKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean6 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test644");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig2 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.kafka.clients.consumer.KafkaConsumer<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaConsumer3 = wildcardClassKafkaSpout0.kafkaConsumer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test645");
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
        boolean boolean15 = wildcardClassKafkaSpout0.initialized;
        boolean boolean16 = wildcardClassKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean17 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test646");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        int int1 = wildcardClassKafkaSpout0.maxRetries;
        wildcardClassKafkaSpout0.maxRetries = (short) 1;
        java.lang.String str4 = wildcardClassKafkaSpout0.toString();
        wildcardClassKafkaSpout0.maxRetries = (byte) 0;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory7 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        long long8 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = wildcardClassKafkaSpout0.getComponentConfiguration();
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test647");
        org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseRichSpout, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry> baseRichSpoutKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<org.apache.storm.topology.base.BaseRichSpout, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        baseRichSpoutKafkaSpout0.nextTuple();
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test648");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, org.apache.storm.topology.base.BaseRichSpout> timestampTypeEnumKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Enum<org.apache.kafka.common.record.TimestampType>, org.apache.storm.topology.base.BaseRichSpout>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean1 = timestampTypeEnumKafkaSpout0.commit();
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test649");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        boolean boolean1 = wildcardClassKafkaSpout0.initialized;
        long long2 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test650");
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
        boolean boolean14 = wildcardClassKafkaSpout0.waitingToEmit();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str15 = wildcardClassKafkaSpout0.getNamedTopics();
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test651");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService5 = wildcardClassKafkaSpout0.retryService;
        org.apache.storm.kafka.spout.KafkaSpoutConfig<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpoutConfig6 = wildcardClassKafkaSpout0.kafkaSpoutConfig;
        org.apache.storm.kafka.spout.KafkaSpoutRetryService kafkaSpoutRetryService7 = wildcardClassKafkaSpout0.retryService;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean8 = wildcardClassKafkaSpout0.commit();
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test652");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry> kafkaSpoutMessageIdListKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.AbstractList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, org.apache.storm.kafka.spout.KafkaSpout<org.apache.kafka.clients.consumer.ConsumerRebalanceListener, java.lang.Comparable<java.lang.String>>.OffsetEntry>();
        boolean boolean1 = kafkaSpoutMessageIdListKafkaSpout0.waitingToEmit();
        kafkaSpoutMessageIdListKafkaSpout0.initialized = true;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean4 = kafkaSpoutMessageIdListKafkaSpout0.commit();
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test653");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator> charSequenceKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, org.apache.storm.kafka.spout.KafkaSpout.OffsetComparator>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        charSequenceKafkaSpout0.shutdown();
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test654");
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
        boolean boolean11 = wildcardClassKafkaSpout0.initialized;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.nextTuple();
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test655");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory2 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy3 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        boolean boolean4 = wildcardClassKafkaSpout0.consumerAutoCommitMode;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        boolean boolean5 = wildcardClassKafkaSpout0.poll();
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test656");
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
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory11 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test657");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Iterable<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> kafkaSpoutMessageIdListKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.ArrayList<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Iterable<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdListKafkaSpout0.doSeekRetriableTopicPartitions();
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test658");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer4 = wildcardClassKafkaSpout0.commitTimer;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.apache.kafka.clients.consumer.ConsumerRecords<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassConsumerRecords5 = wildcardClassKafkaSpout0.pollKafkaBroker();
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test659");
        org.apache.storm.kafka.spout.KafkaSpout<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>> kafkaSpoutMessageIdSetKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.Class<?>>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdSetKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test660");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutStreams kafkaSpoutStreams1 = wildcardClassKafkaSpout0.kafkaSpoutStreams;
        wildcardClassKafkaSpout0.initialized = false;
        wildcardClassKafkaSpout0.maxRetries = (-1);
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.spout.SpoutOutputCollector spoutOutputCollector7 = wildcardClassKafkaSpout0.collector;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer8 = wildcardClassKafkaSpout0.commitTimer;
        int int9 = wildcardClassKafkaSpout0.maxRetries;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.subscribeKafkaConsumer();
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test661");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        org.apache.storm.kafka.spout.KafkaSpoutConfig.FirstPollOffsetStrategy firstPollOffsetStrategy1 = wildcardClassKafkaSpout0.firstPollOffsetStrategy;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet2 = wildcardClassKafkaSpout0.emitted;
        java.lang.String str3 = wildcardClassKafkaSpout0.toString();
        wildcardClassKafkaSpout0.consumerAutoCommitMode = true;
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>.Timer timer6 = wildcardClassKafkaSpout0.commitTimer;
        org.apache.storm.kafka.spout.internal.KafkaConsumerFactory kafkaConsumerFactory7 = wildcardClassKafkaSpout0.kafkaConsumerFactory;
        wildcardClassKafkaSpout0.maxRetries = 97;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.close();
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test662");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.Iterable<org.apache.storm.kafka.spout.KafkaSpoutMessageId>> charSequenceKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.CharSequence, java.lang.Iterable<org.apache.storm.kafka.spout.KafkaSpoutMessageId>>();
        java.lang.String str1 = charSequenceKafkaSpout0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        charSequenceKafkaSpout0.nextTuple();
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test663");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement> wildcardClassKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Class<?>, java.lang.reflect.AnnotatedElement>();
        boolean boolean1 = wildcardClassKafkaSpout0.initialized;
        long long2 = wildcardClassKafkaSpout0.numUncommittedOffsets;
        java.util.Set<org.apache.storm.kafka.spout.KafkaSpoutMessageId> kafkaSpoutMessageIdSet3 = wildcardClassKafkaSpout0.emitted;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        wildcardClassKafkaSpout0.shutdown();
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test664");
        org.apache.storm.kafka.spout.KafkaSpout<java.lang.Iterable<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.CharSequence> kafkaSpoutMessageIdIterableKafkaSpout0 = new org.apache.storm.kafka.spout.KafkaSpout<java.lang.Iterable<org.apache.storm.kafka.spout.KafkaSpoutMessageId>, java.lang.CharSequence>();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        kafkaSpoutMessageIdIterableKafkaSpout0.deactivate();
    }
}

