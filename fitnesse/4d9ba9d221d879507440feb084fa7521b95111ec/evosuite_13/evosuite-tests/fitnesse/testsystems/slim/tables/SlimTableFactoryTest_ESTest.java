/*
 * This file was automatically generated by EvoSuite
 * Tue Nov 02 04:38:54 GMT 2021
 */

package fitnesse.testsystems.slim.tables;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import fitnesse.testsystems.slim.HtmlTable;
import fitnesse.testsystems.slim.SlimTestContext;
import fitnesse.testsystems.slim.SlimTestContextImpl;
import fitnesse.testsystems.slim.Table;
import fitnesse.testsystems.slim.tables.DecisionTable;
import fitnesse.testsystems.slim.tables.DynamicDecisionTable;
import fitnesse.testsystems.slim.tables.ImportTable;
import fitnesse.testsystems.slim.tables.LibraryTable;
import fitnesse.testsystems.slim.tables.OrderedQueryTable;
import fitnesse.testsystems.slim.tables.QueryTable;
import fitnesse.testsystems.slim.tables.ScenarioAndDecisionTableExtensionTest;
import fitnesse.testsystems.slim.tables.ScenarioTable;
import fitnesse.testsystems.slim.tables.ScenarioTableExtensionTest;
import fitnesse.testsystems.slim.tables.SlimErrorTable;
import fitnesse.testsystems.slim.tables.SlimTable;
import fitnesse.testsystems.slim.tables.SlimTableFactory;
import fitnesse.testsystems.slim.tables.SlimTableFactoryTest;
import java.util.Hashtable;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.htmlparser.NodeFilter;
import org.htmlparser.Parser;
import org.htmlparser.filters.AndFilter;
import org.htmlparser.tags.FormTag;
import org.htmlparser.tags.TableTag;
import org.htmlparser.util.NodeList;
import org.htmlparser.visitors.HtmlPage;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SlimTableFactoryTest_ESTest extends SlimTableFactoryTest_ESTest_scaffolding {

  @Test(timeout = 11000)
  public void test00()  throws Throwable  {
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      Table table0 = slimTableFactoryTest0.gettable();
      assertNull(table0);
      
      slimTableFactoryTest0.settable(slimTableFactoryTest0.table);
      String string0 = "";
      Class<DecisionTable> class0 = DecisionTable.class;
      // Undeclared exception!
      try { 
        slimTableFactoryTest0.assertThatTableTypeCreateSlimTableType(string0, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactoryTest", e);
      }
  }

  @Test(timeout = 11000)
  public void test01()  throws Throwable  {
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      Map<String, Class<? extends SlimTable>> map0 = slimTableFactoryTest0.getmap();
      assertNull(map0);
      
      slimTableFactoryTest0.setmap(map0);
      SlimTableFactory slimTableFactory0 = slimTableFactoryTest0.getslimTableFactory();
      assertNull(slimTableFactory0);
      
      String string0 = "C\\!a_:s0j2@V2OJK<";
      Class<OrderedQueryTable> class0 = OrderedQueryTable.class;
      slimTableFactoryTest0.setslimTableFactory(slimTableFactoryTest0.slimTableFactory);
      // Undeclared exception!
      try { 
        slimTableFactoryTest0.assertThatTableTypeImportWorks(string0, string0, string0, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactoryTest", e);
      }
  }

  @Test(timeout = 11000)
  public void test02()  throws Throwable  {
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      String string0 = "Z8<Q<6d=";
      Class<SlimErrorTable> class0 = SlimErrorTable.class;
      // Undeclared exception!
      try { 
        slimTableFactoryTest0.assertThatTableTypeCreateSlimTableType(string0, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactoryTest", e);
      }
  }

  @Test(timeout = 11000)
  public void test03()  throws Throwable  {
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      String string0 = "n#vi}vU\\U9";
      Class<LibraryTable> class0 = LibraryTable.class;
      // Undeclared exception!
      try { 
        slimTableFactoryTest0.assertThatTableTypeCreateSlimTableType(string0, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactoryTest", e);
      }
  }

  @Test(timeout = 11000)
  public void test04()  throws Throwable  {
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      assertNotNull(slimTableFactory0);
      
      slimTableFactoryTest0.setslimTableFactory(slimTableFactory0);
  }

  @Test(timeout = 11000)
  public void test05()  throws Throwable  {
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      Table table0 = slimTableFactoryTest0.gettable();
      assertNull(table0);
      
      slimTableFactoryTest0.settable(table0);
  }

  @Test(timeout = 11000)
  public void test06()  throws Throwable  {
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      String string0 = "dT:";
      String string1 = "jl0ji]lh";
      Class<ScenarioAndDecisionTableExtensionTest.DiffScriptTable> class0 = ScenarioAndDecisionTableExtensionTest.DiffScriptTable.class;
      // Undeclared exception!
      try { 
        slimTableFactoryTest0.assertThatTableTypeImportWorks(string0, string1, string1, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactoryTest", e);
      }
  }

  @Test(timeout = 11000)
  public void test07()  throws Throwable  {
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      Table table0 = slimTableFactoryTest0.table;
      assertNull(table0);
      
      slimTableFactoryTest0.settable(table0);
      Map<String, Class<? extends SlimTable>> map0 = slimTableFactoryTest0.getmap();
      assertNull(map0);
      
      slimTableFactoryTest0.setmap(map0);
      Table table1 = slimTableFactoryTest0.gettable();
      assertNull(table1);
      
      slimTableFactoryTest0.settable(table1);
  }

  @Test(timeout = 11000)
  public void test08()  throws Throwable  {
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      Table table0 = slimTableFactoryTest0.table;
      assertNull(table0);
      
      slimTableFactoryTest0.settable(table0);
      String string0 = "Graceful Difference 2";
      String string1 = "";
      Class<OrderedQueryTable> class0 = OrderedQueryTable.class;
      // Undeclared exception!
      try { 
        slimTableFactoryTest0.assertThatTableTypeImportWorks(string0, string0, string1, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactoryTest", e);
      }
  }

  @Test(timeout = 11000)
  public void test09()  throws Throwable  {
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      Map<String, Class<? extends SlimTable>> map0 = slimTableFactoryTest0.getmap();
      assertNull(map0);
      
      slimTableFactoryTest0.setmap(map0);
      String string0 = "5H";
      String string1 = "joW@4vWQnnH]t\"JI";
      // Undeclared exception!
      try { 
        slimTableFactoryTest0.addTableTypeImport(string0, string1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactoryTest", e);
      }
  }

  @Test(timeout = 11000)
  public void test10()  throws Throwable  {
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      SlimTableFactory slimTableFactory0 = slimTableFactoryTest0.getslimTableFactory();
      assertNull(slimTableFactory0);
  }

  @Test(timeout = 11000)
  public void test11()  throws Throwable  {
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      Table table0 = slimTableFactoryTest0.table;
      assertNull(table0);
      
      slimTableFactoryTest0.settable(table0);
      Table table1 = slimTableFactoryTest0.gettable();
      assertNull(table1);
      
      String string0 = "Iw3&ZKJZZ]'F[";
      Class<QueryTable> class0 = QueryTable.class;
      // Undeclared exception!
      try { 
        slimTableFactoryTest0.assertThatTableTypeImportWorks(string0, string0, string0, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactoryTest", e);
      }
  }

  @Test(timeout = 11000)
  public void test12()  throws Throwable  {
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      Map<String, Class<? extends SlimTable>> map0 = slimTableFactoryTest0.getmap();
      assertNull(map0);
      
      slimTableFactoryTest0.setmap(map0);
      SlimTableFactory slimTableFactory0 = slimTableFactoryTest0.slimTableFactory;
      assertNull(slimTableFactory0);
      
      slimTableFactoryTest0.setslimTableFactory(slimTableFactory0);
      slimTableFactoryTest0.setslimTableFactory(slimTableFactory0);
      slimTableFactoryTest0.slimTableFactory = slimTableFactory0;
      slimTableFactoryTest0.setmap(map0);
      slimTableFactoryTest0.setslimTableFactory(slimTableFactory0);
      SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.getslimTableFactory();
      assertNull(slimTableFactory1);
      
      TableTag tableTag0 = new TableTag();
      assertNotNull(tableTag0);
      assertEquals("TABLE", tableTag0.getRawTagName());
      assertFalse(tableTag0.isEndTag());
      assertEquals((-1), tableTag0.getTagEnd());
      assertEquals((-1), tableTag0.getEndPosition());
      assertFalse(tableTag0.isEmptyXmlTag());
      assertEquals((-1), tableTag0.getStartPosition());
      assertEquals((-1), tableTag0.getTagBegin());
      
      HtmlTable htmlTable0 = null;
      try {
        htmlTable0 = new HtmlTable(tableTag0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.HtmlTable", e);
      }
  }

  @Test(timeout = 11000)
  public void test13()  throws Throwable  {
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      Table table0 = slimTableFactoryTest0.table;
      assertNull(table0);
      
      slimTableFactoryTest0.settable(table0);
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      assertNotNull(slimTableFactory0);
      
      String string0 = "]nr?J>S9I1zHWVQe{";
      slimTableFactoryTest0.setmap(slimTableFactory0.tableTypes);
      Class<QueryTable> class0 = QueryTable.class;
      // Undeclared exception!
      try { 
        slimTableFactoryTest0.assertThatTableTypeCreateSlimTableType(string0, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactoryTest", e);
      }
  }

  @Test(timeout = 11000)
  public void test14()  throws Throwable  {
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      Map<String, Class<? extends SlimTable>> map0 = new Hashtable<String, Class<ScenarioAndDecisionTableExtensionTest.DiffScriptTable>>();
      assertNotNull(map0);
      assertTrue(map0.isEmpty());
      assertEquals(0, map0.size());
      
      slimTableFactoryTest0.setmap(map0);
      assertTrue(map0.isEmpty());
      assertEquals(0, map0.size());
      
      Map<String, Class<? extends SlimTable>> map1 = slimTableFactoryTest0.getmap();
      assertSame(map1, map0);
      assertNotNull(map1);
      assertTrue(map1.isEmpty());
      assertEquals(0, map1.size());
      
      Table table0 = slimTableFactoryTest0.gettable();
      assertNull(table0);
      
      slimTableFactoryTest0.settable(table0);
      Map<String, Class<? extends SlimTable>> map2 = slimTableFactoryTest0.getmap();
      assertSame(map2, map1);
      assertSame(map2, map0);
      assertNotNull(map2);
      assertTrue(map2.isEmpty());
      assertEquals(0, map2.size());
      
      String string0 = "org.eclipse.jgit.storage.dfs.ReadAheadTask";
      Class<ScenarioAndDecisionTableExtensionTest.DiffScriptTable> class0 = ScenarioAndDecisionTableExtensionTest.DiffScriptTable.class;
      // Undeclared exception!
      try { 
        slimTableFactoryTest0.assertThatTableTypeCreateSlimTableType(string0, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactoryTest", e);
      }
  }

  @Test(timeout = 11000)
  public void test15()  throws Throwable  {
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      Table table0 = slimTableFactoryTest0.table;
      assertNull(table0);
      
      slimTableFactoryTest0.settable(table0);
      Table table1 = slimTableFactoryTest0.gettable();
      assertNull(table1);
      
      SlimTableFactory slimTableFactory0 = new SlimTableFactory();
      assertNotNull(slimTableFactory0);
      
      slimTableFactoryTest0.setslimTableFactory(slimTableFactory0);
      String string0 = "Iw3&ZKJZZ]'F";
      SlimTableFactory slimTableFactory1 = slimTableFactoryTest0.getslimTableFactory();
      assertSame(slimTableFactory1, slimTableFactory0);
      assertNotNull(slimTableFactory1);
      
      Class<QueryTable> class0 = QueryTable.class;
      // Undeclared exception!
      try { 
        slimTableFactoryTest0.assertThatTableTypeImportWorks(string0, string0, string0, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("fitnesse.testsystems.slim.tables.SlimTableFactoryTest", e);
      }
  }

  @Test(timeout = 11000)
  public void test16()  throws Throwable  {
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      Hashtable<String, Class<ScenarioAndDecisionTableExtensionTest.ScenarioTableWithDifferentScript>> hashtable0 = new Hashtable<String, Class<ScenarioAndDecisionTableExtensionTest.ScenarioTableWithDifferentScript>>();
      assertNotNull(hashtable0);
      assertTrue(hashtable0.isEmpty());
      assertEquals(0, hashtable0.size());
      
      String string0 = "_ueuOLC6xHeL-UgO";
      Class<ScenarioAndDecisionTableExtensionTest.ScenarioTableWithDifferentScript> class0 = ScenarioAndDecisionTableExtensionTest.ScenarioTableWithDifferentScript.class;
      Class<ScenarioAndDecisionTableExtensionTest.ScenarioTableWithDifferentScript> class1 = hashtable0.put(string0, class0);
      assertNull(class1);
      assertFalse(hashtable0.isEmpty());
      assertEquals(1, hashtable0.size());
      
      slimTableFactoryTest0.setmap(hashtable0);
      assertFalse(hashtable0.isEmpty());
      assertEquals(1, hashtable0.size());
      
      Map<String, Class<? extends SlimTable>> map0 = slimTableFactoryTest0.getmap();
      assertNotNull(map0);
      assertEquals(1, map0.size());
      assertFalse(map0.isEmpty());
      
      SlimTableFactory slimTableFactory0 = slimTableFactoryTest0.getslimTableFactory();
      assertNull(slimTableFactory0);
      
      slimTableFactoryTest0.setslimTableFactory(slimTableFactory0);
      Class<ImportTable> class2 = ImportTable.class;
      String string1 = "org.eclipse.jgit.lib.RefDatabase";
      String string2 = "M1[=n%D%{T";
      slimTableFactoryTest0.setslimTableFactory(slimTableFactory0);
      Class<OrderedQueryTable> class3 = OrderedQueryTable.class;
      slimTableFactoryTest0.setslimTableFactory(slimTableFactory0);
      Table table0 = slimTableFactoryTest0.gettable();
      assertNull(table0);
  }

  @Test(timeout = 11000)
  public void test17()  throws Throwable  {
      long long0 = 52428800L;
      System.setCurrentTimeMillis(long0);
      System.setCurrentTimeMillis(long0);
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      Table table0 = slimTableFactoryTest0.gettable();
      assertNull(table0);
      
      TableTag tableTag0 = new TableTag();
      assertNotNull(tableTag0);
      assertFalse(tableTag0.isEmptyXmlTag());
      assertEquals((-1), tableTag0.getStartPosition());
      assertEquals((-1), tableTag0.getTagBegin());
      assertEquals("TABLE", tableTag0.getRawTagName());
      assertFalse(tableTag0.isEndTag());
      assertEquals((-1), tableTag0.getEndPosition());
      assertEquals((-1), tableTag0.getTagEnd());
      
      FormTag formTag0 = new FormTag();
      assertNotNull(formTag0);
      assertEquals("GET", formTag0.getFormMethod());
      assertFalse(formTag0.isEmptyXmlTag());
      assertEquals((-1), formTag0.getStartPosition());
      assertEquals((-1), formTag0.getTagBegin());
      assertEquals("FORM", formTag0.getRawTagName());
      assertFalse(formTag0.isEndTag());
      assertEquals((-1), formTag0.getTagEnd());
      assertEquals((-1), formTag0.getEndPosition());
      assertNull(formTag0.getFormName());
      
      NodeList nodeList0 = formTag0.getFormInputs();
      assertNotNull(nodeList0);
      assertEquals("GET", formTag0.getFormMethod());
      assertFalse(formTag0.isEmptyXmlTag());
      assertEquals((-1), formTag0.getStartPosition());
      assertEquals((-1), formTag0.getTagBegin());
      assertEquals("FORM", formTag0.getRawTagName());
      assertFalse(formTag0.isEndTag());
      assertEquals((-1), formTag0.getTagEnd());
      assertEquals((-1), formTag0.getEndPosition());
      assertNull(formTag0.getFormName());
      
      tableTag0.setChildren(nodeList0);
      assertFalse(tableTag0.isEmptyXmlTag());
      assertEquals((-1), tableTag0.getStartPosition());
      assertEquals((-1), tableTag0.getTagBegin());
      assertEquals("TABLE", tableTag0.getRawTagName());
      assertFalse(tableTag0.isEndTag());
      assertEquals((-1), tableTag0.getEndPosition());
      assertEquals((-1), tableTag0.getTagEnd());
      assertEquals("GET", formTag0.getFormMethod());
      assertFalse(formTag0.isEmptyXmlTag());
      assertEquals((-1), formTag0.getStartPosition());
      assertEquals((-1), formTag0.getTagBegin());
      assertEquals("FORM", formTag0.getRawTagName());
      assertFalse(formTag0.isEndTag());
      assertEquals((-1), formTag0.getTagEnd());
      assertEquals((-1), formTag0.getEndPosition());
      assertNull(formTag0.getFormName());
      
      HtmlTable htmlTable0 = new HtmlTable(tableTag0);
      assertNotNull(htmlTable0);
      assertFalse(tableTag0.isEmptyXmlTag());
      assertEquals((-1), tableTag0.getStartPosition());
      assertEquals((-1), tableTag0.getTagBegin());
      assertEquals("TABLE", tableTag0.getRawTagName());
      assertFalse(tableTag0.isEndTag());
      assertEquals((-1), tableTag0.getEndPosition());
      assertEquals((-1), tableTag0.getTagEnd());
      assertEquals(0, htmlTable0.getRowCount());
      
      slimTableFactoryTest0.settable(htmlTable0);
      assertFalse(tableTag0.isEmptyXmlTag());
      assertEquals((-1), tableTag0.getStartPosition());
      assertEquals((-1), tableTag0.getTagBegin());
      assertEquals("TABLE", tableTag0.getRawTagName());
      assertFalse(tableTag0.isEndTag());
      assertEquals((-1), tableTag0.getEndPosition());
      assertEquals((-1), tableTag0.getTagEnd());
      assertEquals(0, htmlTable0.getRowCount());
      
      String string0 = "D)G8BB:z#.9X";
      String string1 = "";
      String string2 = null;
      Class<OrderedQueryTable> class0 = OrderedQueryTable.class;
      // Undeclared exception!
      try { 
        slimTableFactoryTest0.assertThatTableTypeImportWorks(string0, string1, string2, class0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 11000)
  public void test18()  throws Throwable  {
      long long0 = 52428800L;
      System.setCurrentTimeMillis(long0);
      System.setCurrentTimeMillis(long0);
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      Table table0 = slimTableFactoryTest0.gettable();
      assertNull(table0);
      
      TableTag tableTag0 = new TableTag();
      assertNotNull(tableTag0);
      assertFalse(tableTag0.isEmptyXmlTag());
      assertEquals((-1), tableTag0.getStartPosition());
      assertEquals((-1), tableTag0.getTagBegin());
      assertEquals((-1), tableTag0.getEndPosition());
      assertFalse(tableTag0.isEndTag());
      assertEquals((-1), tableTag0.getTagEnd());
      assertEquals("TABLE", tableTag0.getRawTagName());
      
      int int0 = tableTag0.getRowCount();
      assertEquals(0, int0);
      assertFalse(tableTag0.isEmptyXmlTag());
      assertEquals((-1), tableTag0.getStartPosition());
      assertEquals((-1), tableTag0.getTagBegin());
      assertEquals((-1), tableTag0.getEndPosition());
      assertFalse(tableTag0.isEndTag());
      assertEquals((-1), tableTag0.getTagEnd());
      assertEquals("TABLE", tableTag0.getRawTagName());
      
      FormTag formTag0 = new FormTag();
      assertNotNull(formTag0);
      assertFalse(formTag0.isEndTag());
      assertFalse(formTag0.isEmptyXmlTag());
      assertEquals((-1), formTag0.getTagEnd());
      assertEquals((-1), formTag0.getStartPosition());
      assertEquals("GET", formTag0.getFormMethod());
      assertEquals((-1), formTag0.getEndPosition());
      assertEquals((-1), formTag0.getTagBegin());
      assertEquals("FORM", formTag0.getRawTagName());
      assertNull(formTag0.getFormName());
      
      NodeList nodeList0 = formTag0.getFormInputs();
      assertNotNull(nodeList0);
      assertFalse(formTag0.isEndTag());
      assertFalse(formTag0.isEmptyXmlTag());
      assertEquals((-1), formTag0.getTagEnd());
      assertEquals((-1), formTag0.getStartPosition());
      assertEquals("GET", formTag0.getFormMethod());
      assertEquals((-1), formTag0.getEndPosition());
      assertEquals((-1), formTag0.getTagBegin());
      assertEquals("FORM", formTag0.getRawTagName());
      assertNull(formTag0.getFormName());
      
      tableTag0.setChildren(nodeList0);
      assertFalse(tableTag0.isEmptyXmlTag());
      assertEquals((-1), tableTag0.getStartPosition());
      assertEquals((-1), tableTag0.getTagBegin());
      assertEquals((-1), tableTag0.getEndPosition());
      assertFalse(tableTag0.isEndTag());
      assertEquals((-1), tableTag0.getTagEnd());
      assertEquals("TABLE", tableTag0.getRawTagName());
      assertFalse(formTag0.isEndTag());
      assertFalse(formTag0.isEmptyXmlTag());
      assertEquals((-1), formTag0.getTagEnd());
      assertEquals((-1), formTag0.getStartPosition());
      assertEquals("GET", formTag0.getFormMethod());
      assertEquals((-1), formTag0.getEndPosition());
      assertEquals((-1), formTag0.getTagBegin());
      assertEquals("FORM", formTag0.getRawTagName());
      assertNull(formTag0.getFormName());
      
      HtmlTable htmlTable0 = new HtmlTable(tableTag0);
      assertNotNull(htmlTable0);
      assertFalse(tableTag0.isEmptyXmlTag());
      assertEquals((-1), tableTag0.getStartPosition());
      assertEquals((-1), tableTag0.getTagBegin());
      assertEquals((-1), tableTag0.getEndPosition());
      assertFalse(tableTag0.isEndTag());
      assertEquals((-1), tableTag0.getTagEnd());
      assertEquals("TABLE", tableTag0.getRawTagName());
      assertEquals(0, htmlTable0.getRowCount());
      
      slimTableFactoryTest0.settable(htmlTable0);
      assertFalse(tableTag0.isEmptyXmlTag());
      assertEquals((-1), tableTag0.getStartPosition());
      assertEquals((-1), tableTag0.getTagBegin());
      assertEquals((-1), tableTag0.getEndPosition());
      assertFalse(tableTag0.isEndTag());
      assertEquals((-1), tableTag0.getTagEnd());
      assertEquals("TABLE", tableTag0.getRawTagName());
      assertEquals(0, htmlTable0.getRowCount());
      
      String string0 = "D)G8BB:z#.9X";
      String string1 = "";
      String string2 = null;
      Class<OrderedQueryTable> class0 = OrderedQueryTable.class;
      String string3 = "zP_wB4)dOI 6a%7t/n";
      Class<SlimErrorTable> class1 = SlimErrorTable.class;
      // Undeclared exception!
      try { 
        slimTableFactoryTest0.assertThatTableTypeCreateSlimTableType(string3, class1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 11000)
  public void test19()  throws Throwable  {
      SlimTableFactoryTest slimTableFactoryTest0 = new SlimTableFactoryTest();
      assertNotNull(slimTableFactoryTest0);
      
      TableTag tableTag0 = new TableTag();
      assertNotNull(tableTag0);
      assertEquals("TABLE", tableTag0.getRawTagName());
      assertFalse(tableTag0.isEmptyXmlTag());
      assertEquals((-1), tableTag0.getStartPosition());
      assertEquals((-1), tableTag0.getTagEnd());
      assertEquals((-1), tableTag0.getTagBegin());
      assertFalse(tableTag0.isEndTag());
      assertEquals((-1), tableTag0.getEndPosition());
      
      String string0 = "V4gxl74aC.\"|K,Vg{,`";
      String string1 = "org.htmlparser.scanners.CompositeTagScanner";
      Parser parser0 = Parser.createParser(string0, string1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals(2.0, Parser.VERSION_NUMBER, 0.01);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(parser0);
      assertEquals("2.0 (Release Build Sep 17, 2006)", parser0.getVersion());
      assertNull(parser0.getURL());
      assertEquals(2.0, parser0.getVersionNumber(), 0.01);
      
      HtmlPage htmlPage0 = new HtmlPage(parser0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals(2.0, Parser.VERSION_NUMBER, 0.01);
      assertNotNull(htmlPage0);
      assertEquals("2.0 (Release Build Sep 17, 2006)", parser0.getVersion());
      assertNull(parser0.getURL());
      assertEquals(2.0, parser0.getVersionNumber(), 0.01);
      assertTrue(htmlPage0.shouldRecurseSelf());
      assertEquals("", htmlPage0.getTitle());
      assertTrue(htmlPage0.shouldRecurseChildren());
      
      NodeList nodeList0 = htmlPage0.getBody();
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertEquals(2.0, Parser.VERSION_NUMBER, 0.01);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotNull(nodeList0);
      assertEquals("2.0 (Release Build Sep 17, 2006)", parser0.getVersion());
      assertNull(parser0.getURL());
      assertEquals(2.0, parser0.getVersionNumber(), 0.01);
      assertTrue(htmlPage0.shouldRecurseSelf());
      assertEquals("", htmlPage0.getTitle());
      assertTrue(htmlPage0.shouldRecurseChildren());
      
      NodeFilter[] nodeFilterArray0 = new NodeFilter[0];
      AndFilter andFilter0 = new AndFilter(nodeFilterArray0);
      assertEquals(0, nodeFilterArray0.length);
      assertNotNull(andFilter0);
      
      boolean boolean0 = true;
      NodeList nodeList1 = nodeList0.extractAllNodesThatMatch((NodeFilter) andFilter0, boolean0);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertFalse(nodeList1.equals((Object)nodeList0));
      assertEquals(2.0, Parser.VERSION_NUMBER, 0.01);
      assertEquals(0, nodeFilterArray0.length);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotSame(nodeList0, nodeList1);
      assertNotSame(nodeList1, nodeList0);
      assertNotNull(nodeList1);
      assertEquals("2.0 (Release Build Sep 17, 2006)", parser0.getVersion());
      assertNull(parser0.getURL());
      assertEquals(2.0, parser0.getVersionNumber(), 0.01);
      assertTrue(htmlPage0.shouldRecurseSelf());
      assertEquals("", htmlPage0.getTitle());
      assertTrue(htmlPage0.shouldRecurseChildren());
      
      tableTag0.setChildren(nodeList1);
      assertFalse(string0.equals((Object)string1));
      assertFalse(string1.equals((Object)string0));
      assertFalse(nodeList0.equals((Object)nodeList1));
      assertFalse(nodeList1.equals((Object)nodeList0));
      assertEquals(2.0, Parser.VERSION_NUMBER, 0.01);
      assertEquals(0, nodeFilterArray0.length);
      assertNotSame(string0, string1);
      assertNotSame(string1, string0);
      assertNotSame(nodeList0, nodeList1);
      assertNotSame(nodeList1, nodeList0);
      assertEquals("TABLE", tableTag0.getRawTagName());
      assertFalse(tableTag0.isEmptyXmlTag());
      assertEquals((-1), tableTag0.getStartPosition());
      assertEquals((-1), tableTag0.getTagEnd());
      assertEquals((-1), tableTag0.getTagBegin());
      assertFalse(tableTag0.isEndTag());
      assertEquals((-1), tableTag0.getEndPosition());
      assertEquals("2.0 (Release Build Sep 17, 2006)", parser0.getVersion());
      assertNull(parser0.getURL());
      assertEquals(2.0, parser0.getVersionNumber(), 0.01);
      assertTrue(htmlPage0.shouldRecurseSelf());
      assertEquals("", htmlPage0.getTitle());
      assertTrue(htmlPage0.shouldRecurseChildren());
      
      HtmlTable htmlTable0 = new HtmlTable(tableTag0);
      assertNotNull(htmlTable0);
      assertEquals("TABLE", tableTag0.getRawTagName());
      assertFalse(tableTag0.isEmptyXmlTag());
      assertEquals((-1), tableTag0.getStartPosition());
      assertEquals((-1), tableTag0.getTagEnd());
      assertEquals((-1), tableTag0.getTagBegin());
      assertFalse(tableTag0.isEndTag());
      assertEquals((-1), tableTag0.getEndPosition());
      assertEquals(0, htmlTable0.getRowCount());
      
      slimTableFactoryTest0.settable(htmlTable0);
      assertEquals("TABLE", tableTag0.getRawTagName());
      assertFalse(tableTag0.isEmptyXmlTag());
      assertEquals((-1), tableTag0.getStartPosition());
      assertEquals((-1), tableTag0.getTagEnd());
      assertEquals((-1), tableTag0.getTagBegin());
      assertFalse(tableTag0.isEndTag());
      assertEquals((-1), tableTag0.getEndPosition());
      assertEquals(0, htmlTable0.getRowCount());
      
      String string2 = "&7HJqB|jawA<";
      String string3 = "j;4.6tBu`3$F@RN%E";
      // Undeclared exception!
      try { 
        slimTableFactoryTest0.addTableTypeImport(string2, string3);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
