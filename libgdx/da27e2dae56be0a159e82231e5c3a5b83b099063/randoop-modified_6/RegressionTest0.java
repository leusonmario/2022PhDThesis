import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test00001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00001");
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.Graphics.Monitor monitor0 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.getPrimaryMonitor();
            org.junit.Assert.fail("Expected exception of type com.badlogic.gdx.utils.GdxRuntimeException; message: Couldn't load shared library 'libgdx64.so' for target: Linux, 64-bit");
        } catch (com.badlogic.gdx.utils.GdxRuntimeException e) {
        // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        // The following exception was thrown during execution in test generation
        try {
            com.badlogic.gdx.Graphics.DisplayMode displayMode0 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.getDisplayMode();
            org.junit.Assert.fail("Expected exception of type java.lang.ExceptionInInitializerError; message: null");
        } catch (java.lang.ExceptionInInitializerError e) {
        // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        java.lang.Class<?> wildcardClass4 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        java.lang.Class<?> wildcardClass8 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass5 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType16);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        java.lang.Class<?> wildcardClass5 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        java.lang.Class<?> wildcardClass9 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = null;
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration11.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration11.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration11.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration11.setTitle("");
        lwjgl3ApplicationConfiguration11.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = null;
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode31);
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        java.lang.Class<?> wildcardClass7 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode3 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode3.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass9 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass7 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        java.lang.Class<?> wildcardClass7 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (byte) -1);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', 0, (-1));
        java.lang.Class<?> wildcardClass16 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        java.lang.Class<?> wildcardClass14 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass10 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration14.setInitialBackgroundColor(color17);
        lwjgl3ApplicationConfiguration14.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration14.setDecorated(false);
        lwjgl3ApplicationConfiguration14.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color30);
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration27.setPreferencesConfig("hi!", fileType33);
        lwjgl3ApplicationConfiguration27.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration27.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = null;
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode46);
        com.badlogic.gdx.Graphics.DisplayMode displayMode51 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode51);
        java.lang.Class<?> wildcardClass53 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode39 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode39.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        java.lang.Class<?> wildcardClass23 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', 0);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass7 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass13 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        java.lang.Class<?> wildcardClass12 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, 1, (int) (short) -1, (int) (byte) 100, (int) 'a', (int) (byte) 0, (int) (short) -1);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) (short) 1, (int) '4', (int) '#', (int) (byte) 0, 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        java.lang.Class<?> wildcardClass9 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = null;
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration11.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration11.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration11.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration11.setTitle("");
        lwjgl3ApplicationConfiguration11.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = null;
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        java.lang.Class<?> wildcardClass38 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        java.lang.Class<?> wildcardClass13 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (byte) -1, (int) (short) 1);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 100, (-1));
        java.lang.Class<?> wildcardClass10 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType24);
        java.lang.Class<?> wildcardClass26 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass9 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, (int) (byte) 1);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass11 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 1);
        java.lang.Class<?> wildcardClass16 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        java.lang.Class<?> wildcardClass6 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass14 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) (short) 0, 0);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', 100);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration12.setTitle("hi!");
        lwjgl3ApplicationConfiguration12.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) ' ', (int) (byte) 1, (int) (short) 0, (-1), (int) '#', (int) '4');
        java.lang.Class<?> wildcardClass36 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        java.lang.Class<?> wildcardClass13 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass12 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) (byte) -1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType12);
        lwjgl3ApplicationConfiguration6.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration6.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (-1));
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) '#');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass29 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) 'a');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (short) -1, (int) (byte) 100, (int) ' ', (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration7.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration7.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration7.setDecorated(false);
        lwjgl3ApplicationConfiguration7.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color23);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration20.setPreferencesConfig("hi!", fileType26);
        lwjgl3ApplicationConfiguration20.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration20.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = null;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration7.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode39);
        java.lang.Class<?> wildcardClass44 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode39 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode39.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode3);
        java.lang.Class<?> wildcardClass5 = hdpiMode3.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode3 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode3.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass23 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass11 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass7 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) (byte) 10);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) (short) 10, (int) (byte) 10, (-1), (int) (short) -1, (int) (byte) 10, (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 0, 0, 1, (int) ' ', 1, (int) (short) -1, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, 100);
        java.lang.Class<?> wildcardClass40 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 0);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass23 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass13 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) 'a');
        java.lang.Class<?> wildcardClass20 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = null;
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode16);
        lwjgl3ApplicationConfiguration15.setTitle("hi!");
        lwjgl3ApplicationConfiguration15.setInitialVisible(true);
        lwjgl3ApplicationConfiguration15.setTitle("hi!");
        lwjgl3ApplicationConfiguration15.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration15.useVsync(false);
        lwjgl3ApplicationConfiguration15.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = null;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode37);
        lwjgl3ApplicationConfiguration36.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration36.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration36.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration36.setTitle("");
        lwjgl3ApplicationConfiguration36.setDecorated(true);
        lwjgl3ApplicationConfiguration36.disableAudio(true);
        lwjgl3ApplicationConfiguration36.setWindowPosition(1, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration58.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color61 = null;
        lwjgl3ApplicationConfiguration58.setInitialBackgroundColor(color61);
        lwjgl3ApplicationConfiguration58.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration58.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration58.setDecorated(false);
        lwjgl3ApplicationConfiguration58.disableAudio(true);
        lwjgl3ApplicationConfiguration58.setWindowedMode((int) '#', (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration82 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode83 = null;
        lwjgl3ApplicationConfiguration82.setHdpiMode(hdpiMode83);
        com.badlogic.gdx.Graphics.DisplayMode displayMode85 = null;
        lwjgl3ApplicationConfiguration82.setFullscreenMode(displayMode85);
        lwjgl3ApplicationConfiguration82.useOpenGL3(true, 10, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode91 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration82.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration58.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode91);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode91);
        org.junit.Assert.assertTrue("'" + hdpiMode91 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode91.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, (int) ' ', (int) '4');
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode3 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode3.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType12);
        lwjgl3ApplicationConfiguration6.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration6.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, 100, (int) '#', (int) (short) 0, (-1), (int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 1);
        java.lang.Class<?> wildcardClass37 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass5 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) -1);
        java.lang.Class<?> wildcardClass9 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass14 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration12.setTitle("hi!");
        lwjgl3ApplicationConfiguration12.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass34 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 100, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) (short) 0, (int) (short) 10, 100, (int) '4', (int) (short) 100, (int) (byte) 0);
        java.lang.Class<?> wildcardClass28 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration12.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration12.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration12.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration12.setTitle("");
        lwjgl3ApplicationConfiguration12.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = null;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        java.lang.Class<?> wildcardClass36 = hdpiMode32.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        java.lang.Class<?> wildcardClass20 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 0, (int) (short) 10, (int) '#', (int) (short) 10, (int) ' ', (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass31 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass10 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass14 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, (int) ' ', (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (short) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        java.lang.Class<?> wildcardClass20 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode3 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode3.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (short) -1, (int) (byte) 100, (int) ' ', (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration19.setTitle("hi!");
        lwjgl3ApplicationConfiguration19.setInitialVisible(true);
        lwjgl3ApplicationConfiguration19.setDecorated(false);
        lwjgl3ApplicationConfiguration19.setResizable(true);
        lwjgl3ApplicationConfiguration19.setBackBufferConfig((int) '#', (int) '4', (int) (short) 1, (int) (byte) 1, (int) (short) 1, (int) (short) 1, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration38 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = null;
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration38.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration38.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration38.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration38.setTitle("");
        lwjgl3ApplicationConfiguration38.setDecorated(true);
        lwjgl3ApplicationConfiguration38.disableAudio(true);
        lwjgl3ApplicationConfiguration38.setWindowPosition(1, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration60.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color63 = null;
        lwjgl3ApplicationConfiguration60.setInitialBackgroundColor(color63);
        lwjgl3ApplicationConfiguration60.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration60.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration60.setDecorated(false);
        lwjgl3ApplicationConfiguration60.disableAudio(true);
        lwjgl3ApplicationConfiguration60.setWindowedMode((int) '#', (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration84 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode85 = null;
        lwjgl3ApplicationConfiguration84.setHdpiMode(hdpiMode85);
        com.badlogic.gdx.Graphics.DisplayMode displayMode87 = null;
        lwjgl3ApplicationConfiguration84.setFullscreenMode(displayMode87);
        lwjgl3ApplicationConfiguration84.useOpenGL3(true, 10, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode93 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration84.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration38.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode93);
        org.junit.Assert.assertTrue("'" + hdpiMode93 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode93.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) '#', (int) (short) 1, 100, (int) (short) 100, 100, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration24.setInitialBackgroundColor(color27);
        lwjgl3ApplicationConfiguration24.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration24.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = null;
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration35.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration35.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration35.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration35.setTitle("");
        lwjgl3ApplicationConfiguration35.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = null;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode53);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode55);
        java.lang.Class<?> wildcardClass60 = hdpiMode55.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass60);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType12);
        lwjgl3ApplicationConfiguration6.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration6.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType34);
        java.lang.Class<?> wildcardClass36 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass7 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode13);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        java.lang.Class<?> wildcardClass7 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass10 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType12);
        lwjgl3ApplicationConfiguration6.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration6.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.setInitialVisible(false);
        lwjgl3ApplicationConfiguration30.useVsync(false);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration30.setInitialBackgroundColor(color35);
        lwjgl3ApplicationConfiguration30.setTitle("");
        lwjgl3ApplicationConfiguration30.setWindowPosition((int) '4', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType44 = null;
        lwjgl3ApplicationConfiguration42.setPreferencesConfig("", fileType44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = null;
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode47);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode49 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration42.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode49);
        java.lang.Class<?> wildcardClass54 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode49 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode49.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass54);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType16);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType14);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) 'a', 100, 10, (int) (short) 0, (int) 'a', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) (byte) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode26);
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType29);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) 'a');
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        java.lang.Class<?> wildcardClass11 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) (byte) -1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, 100, 0, (int) (short) 100, (int) (byte) 100, (int) (byte) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType19);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration8 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration8.setPreferencesConfig("", fileType10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode13);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration12.setFullscreenMode(displayMode15);
        lwjgl3ApplicationConfiguration12.useOpenGL3(true, 10, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode21 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode21);
        lwjgl3ApplicationConfiguration8.setHdpiMode(hdpiMode21);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode21);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode21 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode21.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (short) -1, (int) (byte) 100, (int) ' ', (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) ' ');
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) (byte) 100, (-1), (int) 'a', (int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) '#', (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (byte) 1, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color40 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color40);
        java.lang.Class<?> wildcardClass42 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener9 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener9);
        java.lang.Class<?> wildcardClass11 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        java.lang.Class<?> wildcardClass20 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) '4', (int) (byte) -1, 0, (int) (short) 1, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration26.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration26.setInitialBackgroundColor(color29);
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration26.setPreferencesConfig("hi!", fileType32);
        lwjgl3ApplicationConfiguration26.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration26.setWindowPosition((int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration26.setWindowPosition((int) (byte) -1, (int) (short) 0);
        lwjgl3ApplicationConfiguration26.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode46);
        java.lang.Class<?> wildcardClass49 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType12);
        lwjgl3ApplicationConfiguration6.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration6.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType20);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType30);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration12.setTitle("hi!");
        lwjgl3ApplicationConfiguration12.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (byte) 10);
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 1, 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass16 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, 0);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) (byte) 100, (-1), (int) 'a', (int) (byte) 1, (int) (short) 1);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 0, (int) (short) 10, (int) '#', (int) (short) 10, (int) ' ', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) (byte) 10, (int) (byte) -1, 10, (int) (byte) 1, (-1), (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener33);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) 'a', (int) '4', 0, (int) '4', (int) (short) 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass43 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 100, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration18.setInitialBackgroundColor(color21);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration18.setPreferencesConfig("hi!", fileType24);
        lwjgl3ApplicationConfiguration18.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration18.setWindowPosition((int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration18.setWindowPosition((int) (byte) -1, (int) (short) 0);
        lwjgl3ApplicationConfiguration18.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode38);
        java.lang.Class<?> wildcardClass41 = hdpiMode38.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 100, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration20.setPreferencesConfig("", fileType22);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = null;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + hdpiMode27 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode27.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) (byte) 1, (int) (short) 100, (int) (short) -1, (int) (short) -1, (int) 'a', 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (-1));
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) '#', 100, (int) '4', (int) (short) -1, (int) (byte) 0, (int) (byte) -1);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, 10, (int) (byte) 10, (int) (byte) 10, (int) (short) 100, (int) (byte) 10, 100);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration29.setPreferencesConfig("", fileType31);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener33 = null;
        lwjgl3ApplicationConfiguration29.setWindowListener(lwjgl3WindowListener33);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration35.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3ApplicationConfiguration35.setInitialBackgroundColor(color38);
        com.badlogic.gdx.Files.FileType fileType41 = null;
        lwjgl3ApplicationConfiguration35.setPreferencesConfig("hi!", fileType41);
        lwjgl3ApplicationConfiguration35.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color45 = null;
        lwjgl3ApplicationConfiguration35.setInitialBackgroundColor(color45);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode47);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode47);
        java.lang.Class<?> wildcardClass51 = hdpiMode47.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode47 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode47.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType16);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType26);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType9);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 1, 0);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass10 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', 1, 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (-1), (int) (short) 0, 10, (int) (short) 0, (int) ' ', (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode47);
        java.lang.Class<?> wildcardClass49 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode21 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode21);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration12.setTitle("hi!");
        lwjgl3ApplicationConfiguration12.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass36 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) (short) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) -1, (int) 'a', (int) (short) -1, 1, 0, (int) (byte) 100);
        java.lang.Class<?> wildcardClass31 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration21.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration21.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration21.setDecorated(false);
        lwjgl3ApplicationConfiguration21.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color37);
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration34.setPreferencesConfig("hi!", fileType40);
        lwjgl3ApplicationConfiguration34.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration34.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode51 = null;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode51);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, 1, (int) '4');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass64 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode53 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode53.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass31 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType26);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration12.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration12.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration12.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration12.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration12.setDecorated(false);
        lwjgl3ApplicationConfiguration12.disableAudio(true);
        lwjgl3ApplicationConfiguration12.setWindowedMode((int) '#', (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = null;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode37);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3ApplicationConfiguration36.setFullscreenMode(displayMode39);
        lwjgl3ApplicationConfiguration36.useOpenGL3(true, 10, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode45);
        java.lang.Class<?> wildcardClass49 = hdpiMode45.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode45 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode45.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass49);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (-1));
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', 100, (int) (byte) 100, 0, (int) (short) -1, (int) (short) 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 10, (int) (short) -1);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType17);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode27 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode27);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) '#', (int) (short) 1, 100, (int) (short) 100, 100, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration24.setInitialBackgroundColor(color27);
        lwjgl3ApplicationConfiguration24.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration24.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = null;
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration35.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration35.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration35.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration35.setTitle("");
        lwjgl3ApplicationConfiguration35.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = null;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode53);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode55);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration60.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color63 = null;
        lwjgl3ApplicationConfiguration60.setInitialBackgroundColor(color63);
        com.badlogic.gdx.Files.FileType fileType66 = null;
        lwjgl3ApplicationConfiguration60.setPreferencesConfig("hi!", fileType66);
        lwjgl3ApplicationConfiguration60.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color70 = null;
        lwjgl3ApplicationConfiguration60.setInitialBackgroundColor(color70);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode72 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration60.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration76 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration76.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color79 = null;
        lwjgl3ApplicationConfiguration76.setInitialBackgroundColor(color79);
        com.badlogic.gdx.Files.FileType fileType82 = null;
        lwjgl3ApplicationConfiguration76.setPreferencesConfig("hi!", fileType82);
        lwjgl3ApplicationConfiguration76.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color86 = null;
        lwjgl3ApplicationConfiguration76.setInitialBackgroundColor(color86);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode88 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration76.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode88);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode92 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode92);
        com.badlogic.gdx.Files.FileType fileType95 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType95);
        com.badlogic.gdx.graphics.Color color97 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color97);
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode72 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode72.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode88 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode88.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) '4', (int) (byte) -1, 0, (int) (short) 1, (int) (byte) 1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration20.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration20.setDecorated(false);
        lwjgl3ApplicationConfiguration20.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color36);
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("hi!", fileType39);
        lwjgl3ApplicationConfiguration33.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color43);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration33.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = null;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode50);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertTrue("'" + hdpiMode45 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode45.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode52 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode52.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color23);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass29 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        com.badlogic.gdx.graphics.Color color33 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color33);
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = null;
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode30);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration27.setFullscreenMode(displayMode32);
        lwjgl3ApplicationConfiguration27.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration36.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color39);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType43 = null;
        lwjgl3ApplicationConfiguration41.setPreferencesConfig("", fileType43);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener45 = null;
        lwjgl3ApplicationConfiguration41.setWindowListener(lwjgl3WindowListener45);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration47.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color50 = null;
        lwjgl3ApplicationConfiguration47.setInitialBackgroundColor(color50);
        com.badlogic.gdx.Files.FileType fileType53 = null;
        lwjgl3ApplicationConfiguration47.setPreferencesConfig("hi!", fileType53);
        lwjgl3ApplicationConfiguration47.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color57 = null;
        lwjgl3ApplicationConfiguration47.setInitialBackgroundColor(color57);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode59 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode59);
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode59);
        lwjgl3ApplicationConfiguration41.setWindowPosition(1, (-1));
        lwjgl3ApplicationConfiguration41.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration69 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType71 = null;
        lwjgl3ApplicationConfiguration69.setPreferencesConfig("", fileType71);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener73 = null;
        lwjgl3ApplicationConfiguration69.setWindowListener(lwjgl3WindowListener73);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration75 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration75.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color78 = null;
        lwjgl3ApplicationConfiguration75.setInitialBackgroundColor(color78);
        com.badlogic.gdx.Files.FileType fileType81 = null;
        lwjgl3ApplicationConfiguration75.setPreferencesConfig("hi!", fileType81);
        lwjgl3ApplicationConfiguration75.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color85 = null;
        lwjgl3ApplicationConfiguration75.setInitialBackgroundColor(color85);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode87 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration75.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration69.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color96 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color96);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        org.junit.Assert.assertTrue("'" + hdpiMode30 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode30.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode59 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode59.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode87 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode87.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType12);
        lwjgl3ApplicationConfiguration6.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration6.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (-1));
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) (byte) 10, 10);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) '4', (int) (byte) -1, 0, (int) (short) 1, (int) (byte) 1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration20.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration20.setDecorated(false);
        lwjgl3ApplicationConfiguration20.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color36);
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("hi!", fileType39);
        lwjgl3ApplicationConfiguration33.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color43);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration33.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = null;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode50);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode52);
        com.badlogic.gdx.graphics.Color color57 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color57);
        java.lang.Class<?> wildcardClass59 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode45 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode45.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode52 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode52.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.setInitialVisible(false);
        lwjgl3ApplicationConfiguration21.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration26.setPreferencesConfig("", fileType28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration26.setWindowListener(lwjgl3WindowListener30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration32 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration32.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration32.setInitialBackgroundColor(color35);
        com.badlogic.gdx.Files.FileType fileType38 = null;
        lwjgl3ApplicationConfiguration32.setPreferencesConfig("hi!", fileType38);
        lwjgl3ApplicationConfiguration32.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color42 = null;
        lwjgl3ApplicationConfiguration32.setInitialBackgroundColor(color42);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode44 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration32.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode44);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass51 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode44 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode44.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType10);
        java.lang.Class<?> wildcardClass12 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass9 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType22);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType13 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType13);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 0);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
        org.junit.Assert.assertTrue("'" + hdpiMode3 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode3.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType12);
        lwjgl3ApplicationConfiguration6.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration6.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (-1));
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = null;
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration22.setTitle("hi!");
        lwjgl3ApplicationConfiguration22.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = null;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        java.lang.Class<?> wildcardClass36 = hdpiMode32.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (short) -1, (int) (byte) 100, (int) ' ', (int) (short) 10, (int) (byte) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (-1), (int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType27);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass36 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = null;
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration22.setTitle("hi!");
        lwjgl3ApplicationConfiguration22.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = null;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color36);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) (short) 1, (int) '4', (int) '#', (int) (byte) 0, 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType27);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 100);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) '4', (int) (short) 1, (int) (byte) 1, (int) (short) 1, (int) (short) 1, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration19.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration19.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration19.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration19.setTitle("");
        lwjgl3ApplicationConfiguration19.setDecorated(true);
        lwjgl3ApplicationConfiguration19.disableAudio(true);
        lwjgl3ApplicationConfiguration19.setWindowPosition(1, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration41.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration41.setInitialBackgroundColor(color44);
        lwjgl3ApplicationConfiguration41.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration41.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration41.setDecorated(false);
        lwjgl3ApplicationConfiguration41.disableAudio(true);
        lwjgl3ApplicationConfiguration41.setWindowedMode((int) '#', (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode66 = null;
        lwjgl3ApplicationConfiguration65.setHdpiMode(hdpiMode66);
        com.badlogic.gdx.Graphics.DisplayMode displayMode68 = null;
        lwjgl3ApplicationConfiguration65.setFullscreenMode(displayMode68);
        lwjgl3ApplicationConfiguration65.useOpenGL3(true, 10, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode74 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration65.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (-1), (int) (short) -1, (int) (short) -1, 100, (int) (short) 100, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        org.junit.Assert.assertTrue("'" + hdpiMode74 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode74.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration10 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode11 = null;
        lwjgl3ApplicationConfiguration10.setHdpiMode(hdpiMode11);
        lwjgl3ApplicationConfiguration10.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration10.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration10.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration10.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode26);
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration12.setTitle("hi!");
        lwjgl3ApplicationConfiguration12.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (byte) 10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode35 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode35);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) -1, (int) 'a', (int) (short) -1, 1, 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, 0);
        java.lang.Class<?> wildcardClass9 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass12 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = null;
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode30);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration27.setFullscreenMode(displayMode32);
        lwjgl3ApplicationConfiguration27.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration36.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color39);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration41 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType43 = null;
        lwjgl3ApplicationConfiguration41.setPreferencesConfig("", fileType43);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener45 = null;
        lwjgl3ApplicationConfiguration41.setWindowListener(lwjgl3WindowListener45);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration47.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color50 = null;
        lwjgl3ApplicationConfiguration47.setInitialBackgroundColor(color50);
        com.badlogic.gdx.Files.FileType fileType53 = null;
        lwjgl3ApplicationConfiguration47.setPreferencesConfig("hi!", fileType53);
        lwjgl3ApplicationConfiguration47.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color57 = null;
        lwjgl3ApplicationConfiguration47.setInitialBackgroundColor(color57);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode59 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode59);
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode59);
        lwjgl3ApplicationConfiguration41.setWindowPosition(1, (-1));
        lwjgl3ApplicationConfiguration41.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration69 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType71 = null;
        lwjgl3ApplicationConfiguration69.setPreferencesConfig("", fileType71);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener73 = null;
        lwjgl3ApplicationConfiguration69.setWindowListener(lwjgl3WindowListener73);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration75 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration75.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color78 = null;
        lwjgl3ApplicationConfiguration75.setInitialBackgroundColor(color78);
        com.badlogic.gdx.Files.FileType fileType81 = null;
        lwjgl3ApplicationConfiguration75.setPreferencesConfig("hi!", fileType81);
        lwjgl3ApplicationConfiguration75.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color85 = null;
        lwjgl3ApplicationConfiguration75.setInitialBackgroundColor(color85);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode87 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration75.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration69.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration41.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode87);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType97 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType97);
        org.junit.Assert.assertTrue("'" + hdpiMode30 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode30.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode59 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode59.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode87 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode87.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (byte) 0, (int) (short) 0, 0, (int) '#', (int) '4', 0);
        java.lang.Class<?> wildcardClass28 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', 1, 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass41 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (short) 0, 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, 1, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = null;
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration25.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration25.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration25.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode38);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration40.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3ApplicationConfiguration40.setInitialBackgroundColor(color43);
        lwjgl3ApplicationConfiguration40.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration40.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode52 = null;
        lwjgl3ApplicationConfiguration51.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration51.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration51.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration51.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration51.setTitle("");
        lwjgl3ApplicationConfiguration51.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration68 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode69 = null;
        lwjgl3ApplicationConfiguration68.setHdpiMode(hdpiMode69);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode71 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration68.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration51.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode71);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode71);
        java.lang.Class<?> wildcardClass77 = hdpiMode71.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode71 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode71.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        java.lang.Class<?> wildcardClass20 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (short) -1, (int) (short) 10, 0, (int) (byte) 10, (int) (short) -1, (int) 'a');
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType19);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType28);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration30.setPreferencesConfig("", fileType32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3ApplicationConfiguration30.setWindowListener(lwjgl3WindowListener34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration36.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color39);
        com.badlogic.gdx.Files.FileType fileType42 = null;
        lwjgl3ApplicationConfiguration36.setPreferencesConfig("hi!", fileType42);
        lwjgl3ApplicationConfiguration36.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color46 = null;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color46);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode48 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode48);
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode48);
        lwjgl3ApplicationConfiguration30.setWindowPosition(1, (-1));
        lwjgl3ApplicationConfiguration30.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType60 = null;
        lwjgl3ApplicationConfiguration58.setPreferencesConfig("", fileType60);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener62 = null;
        lwjgl3ApplicationConfiguration58.setWindowListener(lwjgl3WindowListener62);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration64 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration64.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color67 = null;
        lwjgl3ApplicationConfiguration64.setInitialBackgroundColor(color67);
        com.badlogic.gdx.Files.FileType fileType70 = null;
        lwjgl3ApplicationConfiguration64.setPreferencesConfig("hi!", fileType70);
        lwjgl3ApplicationConfiguration64.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color74 = null;
        lwjgl3ApplicationConfiguration64.setInitialBackgroundColor(color74);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode76 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration64.setHdpiMode(hdpiMode76);
        lwjgl3ApplicationConfiguration58.setHdpiMode(hdpiMode76);
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode76);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode76);
        java.lang.Class<?> wildcardClass81 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode48 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode48.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode76 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode76.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass81);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (int) (byte) -1);
        java.lang.Class<?> wildcardClass6 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', 0, (int) (short) 0);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        java.lang.Class<?> wildcardClass8 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) (byte) 100, (-1), (int) 'a', (int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration26.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration26.setInitialBackgroundColor(color29);
        com.badlogic.gdx.Files.FileType fileType32 = null;
        lwjgl3ApplicationConfiguration26.setPreferencesConfig("hi!", fileType32);
        lwjgl3ApplicationConfiguration26.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration26.setWindowPosition((int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration26.setWindowPosition((int) (byte) -1, (int) (short) 0);
        lwjgl3ApplicationConfiguration26.setWindowedMode((int) (short) 10, (int) (short) 0);
        com.badlogic.gdx.Files.FileType fileType48 = null;
        lwjgl3ApplicationConfiguration26.setPreferencesConfig("", fileType48);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration50.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color53 = null;
        lwjgl3ApplicationConfiguration50.setInitialBackgroundColor(color53);
        lwjgl3ApplicationConfiguration50.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration50.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode62 = null;
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode62);
        lwjgl3ApplicationConfiguration61.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration61.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration61.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration61.setTitle("");
        lwjgl3ApplicationConfiguration61.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration78 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode79 = null;
        lwjgl3ApplicationConfiguration78.setHdpiMode(hdpiMode79);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode81 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration78.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode81);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode81);
        org.junit.Assert.assertTrue("'" + hdpiMode81 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode81.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass23 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) 'a', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 10, (int) (byte) 0);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', 1, 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (-1), (int) (short) 0, 10, (int) (short) 0, (int) ' ', (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode47);
        com.badlogic.gdx.Files.FileType fileType50 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType50);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(10, (int) (byte) 0);
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode14 = null;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode16);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode16);
        java.lang.Class<?> wildcardClass19 = hdpiMode16.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode16 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode16.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType11 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) '4');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType28);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) ' ');
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration11.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color14);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration11.setPreferencesConfig("hi!", fileType17);
        lwjgl3ApplicationConfiguration11.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration11.setInitialBackgroundColor(color21);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration11.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration27.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color30);
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration27.setPreferencesConfig("hi!", fileType33);
        lwjgl3ApplicationConfiguration27.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration27.setInitialBackgroundColor(color37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode45 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode45);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode23 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode23.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode39 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode39.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType24);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (short) 0, (int) (byte) -1, (int) (byte) 10, (int) (short) 100, 10, (int) ' ');
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode38);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (short) -1, 100, 0, (int) (byte) 100, (int) (short) 0, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType33);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass37 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration22 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode23 = null;
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode23);
        lwjgl3ApplicationConfiguration22.setTitle("hi!");
        lwjgl3ApplicationConfiguration22.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = null;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration22.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color36);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass40 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration7.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration7.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration7.setDecorated(false);
        lwjgl3ApplicationConfiguration7.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color23);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration20.setPreferencesConfig("hi!", fileType26);
        lwjgl3ApplicationConfiguration20.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration20.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = null;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration7.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode39);
        com.badlogic.gdx.Graphics.DisplayMode displayMode44 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = null;
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode47);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode49 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode49);
        java.lang.Class<?> wildcardClass52 = hdpiMode49.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode39 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode39.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode49 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode49.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = null;
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration11.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration11.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration11.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration11.setTitle("");
        lwjgl3ApplicationConfiguration11.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = null;
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, 100, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener48 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener48);
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (-1));
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (-1));
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass13 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) (short) 0, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) '4', (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, 10, (int) 'a');
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) 'a', (int) (byte) 1, (int) 'a', 0, (int) '#', (-1));
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        java.lang.Class<?> wildcardClass26 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color9);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 10, (int) '4');
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) 10, (-1), (int) (short) 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass28 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) ' ');
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color28 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color28);
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) '#', (int) (short) 1, 100, (int) (short) 100, 100, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration24.setInitialBackgroundColor(color27);
        lwjgl3ApplicationConfiguration24.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration24.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = null;
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration35.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration35.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration35.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration35.setTitle("");
        lwjgl3ApplicationConfiguration35.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = null;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode53);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode55);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration60.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color63 = null;
        lwjgl3ApplicationConfiguration60.setInitialBackgroundColor(color63);
        com.badlogic.gdx.Files.FileType fileType66 = null;
        lwjgl3ApplicationConfiguration60.setPreferencesConfig("hi!", fileType66);
        lwjgl3ApplicationConfiguration60.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color70 = null;
        lwjgl3ApplicationConfiguration60.setInitialBackgroundColor(color70);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode72 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration60.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration76 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration76.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color79 = null;
        lwjgl3ApplicationConfiguration76.setInitialBackgroundColor(color79);
        com.badlogic.gdx.Files.FileType fileType82 = null;
        lwjgl3ApplicationConfiguration76.setPreferencesConfig("hi!", fileType82);
        lwjgl3ApplicationConfiguration76.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color86 = null;
        lwjgl3ApplicationConfiguration76.setInitialBackgroundColor(color86);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode88 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration76.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Files.FileType fileType95 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType95);
        com.badlogic.gdx.graphics.Color color97 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color97);
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode72 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode72.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode88 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode88.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (short) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode26);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) (byte) 100, (-1), (int) 'a', (int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        java.lang.Class<?> wildcardClass34 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        java.lang.Class<?> wildcardClass5 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (short) 1, (int) ' ', (int) (byte) 0, 100, (int) '4', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        com.badlogic.gdx.Graphics.DisplayMode displayMode14 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode14);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (-1));
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) '#');
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration5.setHdpiMode(hdpiMode6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration5.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 0, 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (short) -1, 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
        org.junit.Assert.assertTrue("'" + hdpiMode3 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode3.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) (byte) 10);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener26 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener26);
        java.lang.Class<?> wildcardClass28 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) '4', (int) (short) 1, (int) (byte) 1, (int) (short) 1, (int) (short) 1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) '#');
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (short) -1, 100, 0, (int) (byte) 100, (int) (short) 0, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType33);
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 0, (int) (short) 10, (int) '#', (int) (short) 10, (int) ' ', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        java.lang.Class<?> wildcardClass28 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) '4', (int) (byte) -1, 0, (int) (short) 1, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, (int) '#', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) '#');
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType16);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        com.badlogic.gdx.Graphics.DisplayMode displayMode8 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode8);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) (byte) 100, (-1), (int) 'a', (int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) '#', (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) '4');
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType34);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode38 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode38);
        java.lang.Class<?> wildcardClass40 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (byte) -1, (int) (byte) 100);
        java.lang.Class<?> wildcardClass28 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color27);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) (byte) 10, 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) 'a', (int) (short) 10, (int) '#', (int) (short) 1, (int) '4', 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '#', (-1));
        java.lang.Class<?> wildcardClass26 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (short) 10, (int) (short) 10, 100, (int) '4', (int) '#', (int) ' ');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) ' ', (int) '#');
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode3 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode3.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (short) 1);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType26);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass36 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration26.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration26.setInitialBackgroundColor(color29);
        lwjgl3ApplicationConfiguration26.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration26.setDecorated(false);
        lwjgl3ApplicationConfiguration26.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode39 = null;
        lwjgl3ApplicationConfiguration26.setFullscreenMode(displayMode39);
        com.badlogic.gdx.Graphics.DisplayMode displayMode41 = null;
        lwjgl3ApplicationConfiguration26.setFullscreenMode(displayMode41);
        lwjgl3ApplicationConfiguration26.useOpenGL3(true, 10, (int) (byte) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration47 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration47.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode50 = null;
        lwjgl3ApplicationConfiguration47.setFullscreenMode(displayMode50);
        lwjgl3ApplicationConfiguration47.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener54 = null;
        lwjgl3ApplicationConfiguration47.setWindowListener(lwjgl3WindowListener54);
        lwjgl3ApplicationConfiguration47.setWindowedMode((int) (short) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode60 = null;
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode60);
        lwjgl3ApplicationConfiguration59.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration59.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration59.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration59.setTitle("");
        lwjgl3ApplicationConfiguration59.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration76 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode77 = null;
        lwjgl3ApplicationConfiguration76.setHdpiMode(hdpiMode77);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode79 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration76.setHdpiMode(hdpiMode79);
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode79);
        lwjgl3ApplicationConfiguration47.setHdpiMode(hdpiMode79);
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode79);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode79);
        java.lang.Class<?> wildcardClass85 = hdpiMode79.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode79 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode79.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass85);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        com.badlogic.gdx.Files.FileType fileType24 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType24);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration28.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration28.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration28.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3ApplicationConfiguration28.setWindowListener(lwjgl3WindowListener35);
        lwjgl3ApplicationConfiguration28.setWindowedMode((int) (short) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration40 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode41 = null;
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode41);
        lwjgl3ApplicationConfiguration40.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration40.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration40.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration40.setTitle("");
        lwjgl3ApplicationConfiguration40.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode58 = null;
        lwjgl3ApplicationConfiguration57.setHdpiMode(hdpiMode58);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode60 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration57.setHdpiMode(hdpiMode60);
        lwjgl3ApplicationConfiguration40.setHdpiMode(hdpiMode60);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode60);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode60);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) ' ');
        com.badlogic.gdx.graphics.Color color68 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color68);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode60 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode60.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, 100, 0, (int) (short) 100, (int) (byte) 100, (int) (byte) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 0);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', (int) (byte) -1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (-1));
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, (int) (byte) 0, (int) ' ');
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) (byte) 100, (-1), (int) 'a', (int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 100, 0, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (-1));
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) 'a', (int) ' ', 0, (int) (byte) 0, (int) (short) 0, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, (-1));
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (byte) 10, 10, 100, (int) (byte) 0, (int) '#', (int) (byte) 0);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("", fileType15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration13.setWindowListener(lwjgl3WindowListener17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration19.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration19.setPreferencesConfig("hi!", fileType25);
        lwjgl3ApplicationConfiguration19.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration19.setInitialBackgroundColor(color29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration13.setWindowPosition(1, (-1));
        lwjgl3ApplicationConfiguration13.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration13.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration43.setInitialVisible(false);
        lwjgl3ApplicationConfiguration43.useVsync(false);
        com.badlogic.gdx.graphics.Color color48 = null;
        lwjgl3ApplicationConfiguration43.setInitialBackgroundColor(color48);
        lwjgl3ApplicationConfiguration43.setTitle("");
        lwjgl3ApplicationConfiguration43.setWindowPosition((int) '4', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration55 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType57 = null;
        lwjgl3ApplicationConfiguration55.setPreferencesConfig("", fileType57);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration59 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode60 = null;
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode60);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode62 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration59.setHdpiMode(hdpiMode62);
        lwjgl3ApplicationConfiguration55.setHdpiMode(hdpiMode62);
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode62);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode62);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode62);
        java.lang.Class<?> wildcardClass68 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode62 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode62.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass68);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) (short) 10, (int) (short) 10, 100, (int) '4', (int) '#', (int) ' ');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, (int) (short) 0, 1, 10, (int) (byte) 10, (int) (short) 1, (int) (short) -1);
        java.lang.Class<?> wildcardClass39 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (byte) 100);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener27 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener27);
        java.lang.Class<?> wildcardClass29 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (-1));
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType15);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) -1, (int) 'a', (int) (short) -1, 1, 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) (short) -1, 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) '#');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) (byte) 0, (-1), 0, 1, (-1), (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        java.lang.Class<?> wildcardClass51 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass51);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 0, 0, (int) (byte) -1, (int) (byte) 100, 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) (byte) 1, (int) (short) 100, (int) (short) -1, (int) (short) -1, (int) 'a', 10);
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType16);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (short) -1, (int) '4', (int) (byte) 100, 0, (-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 0, (int) (short) 10, (int) '#', (int) (short) 10, (int) ' ', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) (byte) 10, (int) (byte) -1, 10, (int) (byte) 1, (-1), (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) 'a');
        java.lang.Class<?> wildcardClass36 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color29);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) -1, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration12.setTitle("hi!");
        lwjgl3ApplicationConfiguration12.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration12.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode34 = null;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode34);
        lwjgl3ApplicationConfiguration33.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration33.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration33.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration33.setTitle("");
        lwjgl3ApplicationConfiguration33.setResizable(true);
        com.badlogic.gdx.graphics.Color color50 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color50);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener52 = null;
        lwjgl3ApplicationConfiguration33.setWindowListener(lwjgl3WindowListener52);
        lwjgl3ApplicationConfiguration33.setBackBufferConfig((int) 'a', (int) (short) 10, (int) (byte) 10, (-1), (int) (short) -1, (int) (byte) 10, (int) '4');
        lwjgl3ApplicationConfiguration33.setBackBufferConfig((int) (short) 0, 0, 1, (int) ' ', 1, (int) (short) -1, (int) '4');
        lwjgl3ApplicationConfiguration33.setDecorated(false);
        lwjgl3ApplicationConfiguration33.setWindowPosition((int) 'a', 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration75 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType77 = null;
        lwjgl3ApplicationConfiguration75.setPreferencesConfig("", fileType77);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener79 = null;
        lwjgl3ApplicationConfiguration75.setWindowListener(lwjgl3WindowListener79);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration81 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration81.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color84 = null;
        lwjgl3ApplicationConfiguration81.setInitialBackgroundColor(color84);
        com.badlogic.gdx.Files.FileType fileType87 = null;
        lwjgl3ApplicationConfiguration81.setPreferencesConfig("hi!", fileType87);
        lwjgl3ApplicationConfiguration81.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color91 = null;
        lwjgl3ApplicationConfiguration81.setInitialBackgroundColor(color91);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode93 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration81.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration75.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode93);
        java.lang.Class<?> wildcardClass99 = hdpiMode93.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode93 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode93.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass99);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType18);
        java.lang.Class<?> wildcardClass20 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, 1, (int) '4', (int) '#', (int) 'a', 10, (int) (byte) 10);
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 100);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 100, 0);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) (short) 1, (int) '4', (int) '#', (int) (byte) 0, 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration12.setTitle("hi!");
        lwjgl3ApplicationConfiguration12.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = null;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode20);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode22 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode22);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (byte) 100, (int) (short) 10);
        java.lang.Class<?> wildcardClass30 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode22 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode22.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (int) (short) 100);
        java.lang.Class<?> wildcardClass16 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode17);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener25 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener25);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.Files.FileType fileType7 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType7);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, 0, (int) (short) -1);
        java.lang.Class<?> wildcardClass28 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass29 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (byte) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType12);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) -1, 0, 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) '4', (int) (byte) -1, 0, (int) (short) 1, (int) (byte) 1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration20.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration20.setDecorated(false);
        lwjgl3ApplicationConfiguration20.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color36);
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("hi!", fileType39);
        lwjgl3ApplicationConfiguration33.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color43);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration33.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = null;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode50);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass64 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode45 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode45.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode52 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode52.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.graphics.Color color20 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color20);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = null;
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration24.setTitle("hi!");
        lwjgl3ApplicationConfiguration24.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration24.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration45.setInitialVisible(false);
        lwjgl3ApplicationConfiguration45.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType52 = null;
        lwjgl3ApplicationConfiguration50.setPreferencesConfig("", fileType52);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener54 = null;
        lwjgl3ApplicationConfiguration50.setWindowListener(lwjgl3WindowListener54);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration56 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration56.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color59 = null;
        lwjgl3ApplicationConfiguration56.setInitialBackgroundColor(color59);
        com.badlogic.gdx.Files.FileType fileType62 = null;
        lwjgl3ApplicationConfiguration56.setPreferencesConfig("hi!", fileType62);
        lwjgl3ApplicationConfiguration56.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color66 = null;
        lwjgl3ApplicationConfiguration56.setInitialBackgroundColor(color66);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode68 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration56.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration45.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode68);
        java.lang.Class<?> wildcardClass74 = hdpiMode68.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode68 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode68.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Graphics.DisplayMode displayMode9 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode9);
        java.lang.Class<?> wildcardClass11 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (short) -1, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, 100);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color16);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration13.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration13.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = null;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 100);
        org.junit.Assert.assertTrue("'" + hdpiMode25 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode25.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) 'a', (-1));
        com.badlogic.gdx.graphics.Color color31 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color31);
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass16 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, (int) (short) 0, 0);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (-1));
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType12);
        lwjgl3ApplicationConfiguration6.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration6.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration30 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration30.setInitialVisible(false);
        lwjgl3ApplicationConfiguration30.useVsync(false);
        com.badlogic.gdx.graphics.Color color35 = null;
        lwjgl3ApplicationConfiguration30.setInitialBackgroundColor(color35);
        lwjgl3ApplicationConfiguration30.setTitle("");
        lwjgl3ApplicationConfiguration30.setWindowPosition((int) '4', (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration42 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType44 = null;
        lwjgl3ApplicationConfiguration42.setPreferencesConfig("", fileType44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration46 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode47 = null;
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode47);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode49 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration46.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration42.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration30.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode49 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode49.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType12);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) 'a');
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) '4', (int) (byte) -1, 0, (int) (short) 1, (int) (byte) 1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration20.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration20.setDecorated(false);
        lwjgl3ApplicationConfiguration20.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color36);
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("hi!", fileType39);
        lwjgl3ApplicationConfiguration33.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color43);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration33.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = null;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode50);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode52);
        com.badlogic.gdx.graphics.Color color57 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color57);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (short) 0, (int) (byte) 1, (int) (short) 0, 1, (int) (short) -1, 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 0, 10);
        com.badlogic.gdx.graphics.Color color70 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color70);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        org.junit.Assert.assertTrue("'" + hdpiMode45 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode45.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode52 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode52.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration12.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration12.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration12.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration12.setTitle("");
        lwjgl3ApplicationConfiguration12.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = null;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color36);
        java.lang.Class<?> wildcardClass38 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) (short) 0, (int) 'a');
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', (int) '4');
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 100, (int) (byte) 10);
        java.lang.Class<?> wildcardClass29 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener24 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener24);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) '4', (-1), (-1), (int) (byte) 0, (int) (byte) 10, 10);
        java.lang.Class<?> wildcardClass38 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) (byte) 100, (-1), (int) 'a', (int) (byte) 1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 100, (-1), (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration14 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration14.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration14.setInitialBackgroundColor(color17);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration14.setPreferencesConfig("hi!", fileType20);
        lwjgl3ApplicationConfiguration14.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration14.setInitialBackgroundColor(color24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration14.setInitialVisible(true);
        lwjgl3ApplicationConfiguration14.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration14.setFullscreenMode(displayMode32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode35 = null;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode35);
        lwjgl3ApplicationConfiguration34.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration34.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration34.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration34.setTitle("");
        lwjgl3ApplicationConfiguration34.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode52 = null;
        lwjgl3ApplicationConfiguration51.setHdpiMode(hdpiMode52);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode54 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration51.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration14.setHdpiMode(hdpiMode54);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode54);
        java.lang.Class<?> wildcardClass59 = hdpiMode54.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode54 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode54.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass59);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode7 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode7);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 0, (int) (short) 10, (int) '#', (int) (short) 10, (int) ' ', (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', 0, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 10, (int) (byte) 0, (int) (short) 100, 0, (int) (short) -1, 10);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType20);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) (byte) 100, (-1), (int) 'a', (int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) ' ');
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), 0, (int) '#');
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType26);
        lwjgl3ApplicationConfiguration0.setWindowedMode(1, (int) (short) -1);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) ' ', (int) (short) 100, (int) (short) 100, (int) (short) 1, (int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) 'a');
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType20);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, 0);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) ' ');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, 1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener5 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener5);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 0, 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '4', 100, (int) (short) -1);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType22);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) '4', (int) (byte) -1, 0, (int) (short) 1, (int) (byte) 1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration20.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration20.setDecorated(false);
        lwjgl3ApplicationConfiguration20.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color36);
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("hi!", fileType39);
        lwjgl3ApplicationConfiguration33.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color43);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration33.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = null;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode50);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, (int) (byte) 10, 0);
        java.lang.Class<?> wildcardClass61 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode45 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode45.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode52 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode52.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType12);
        lwjgl3ApplicationConfiguration6.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration6.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) 0);
        com.badlogic.gdx.Files.FileType fileType34 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType34);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((-1), (int) '#', (int) (short) 1, (int) (byte) 100, (int) (byte) -1, (int) (byte) 100, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = null;
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration23.setFullscreenMode(displayMode26);
        lwjgl3ApplicationConfiguration23.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration23.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration23.setInitialBackgroundColor(color39);
        com.badlogic.gdx.Files.FileType fileType42 = null;
        lwjgl3ApplicationConfiguration23.setPreferencesConfig("hi!", fileType42);
        lwjgl3ApplicationConfiguration23.setWindowPosition(100, (int) (short) 10);
        lwjgl3ApplicationConfiguration23.setWindowPosition((int) (byte) 10, 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType52 = null;
        lwjgl3ApplicationConfiguration50.setPreferencesConfig("", fileType52);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener54 = null;
        lwjgl3ApplicationConfiguration50.setWindowListener(lwjgl3WindowListener54);
        lwjgl3ApplicationConfiguration50.setDecorated(true);
        com.badlogic.gdx.graphics.Color color58 = null;
        lwjgl3ApplicationConfiguration50.setInitialBackgroundColor(color58);
        com.badlogic.gdx.Graphics.DisplayMode displayMode60 = null;
        lwjgl3ApplicationConfiguration50.setFullscreenMode(displayMode60);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration62 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode63 = null;
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode63);
        lwjgl3ApplicationConfiguration62.setTitle("hi!");
        lwjgl3ApplicationConfiguration62.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration69 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode70 = null;
        lwjgl3ApplicationConfiguration69.setHdpiMode(hdpiMode70);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode72 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration69.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration62.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration50.setDecorated(true);
        lwjgl3ApplicationConfiguration50.setBackBufferConfig((int) (byte) 1, (int) ' ', (int) (byte) 1, (int) (short) 0, (-1), (int) '#', (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration86 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType88 = null;
        lwjgl3ApplicationConfiguration86.setPreferencesConfig("", fileType88);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration90 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode91 = null;
        lwjgl3ApplicationConfiguration90.setHdpiMode(hdpiMode91);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode93 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration90.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration86.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode93);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode93);
        org.junit.Assert.assertTrue("'" + hdpiMode72 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode72.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode93 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode93.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (-1), 10);
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, 100, 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, 0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 1, (int) (short) 100, 10, (-1), 1, 0);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType25);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) -1, (int) 'a', (int) (short) -1, 1, 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) (short) -1, 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) ' ');
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color41);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(100, (int) (byte) 1, (int) (short) 1, (int) (byte) 10, (int) (byte) -1, 100, (int) '4');
        java.lang.Class<?> wildcardClass55 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) (short) 0, (int) (byte) 10);
        java.lang.Class<?> wildcardClass19 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, 0, (int) (short) 10, (int) '#', (int) (short) 10, (int) ' ', (int) (byte) -1);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) 100);
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType39);
        lwjgl3ApplicationConfiguration0.useVsync(false);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener19 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener19);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration19 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration19.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color22 = null;
        lwjgl3ApplicationConfiguration19.setInitialBackgroundColor(color22);
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration19.setPreferencesConfig("hi!", fileType25);
        lwjgl3ApplicationConfiguration19.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color29 = null;
        lwjgl3ApplicationConfiguration19.setInitialBackgroundColor(color29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener31 = null;
        lwjgl3ApplicationConfiguration19.setWindowListener(lwjgl3WindowListener31);
        lwjgl3ApplicationConfiguration19.disableAudio(false);
        lwjgl3ApplicationConfiguration19.setBackBufferConfig((int) (short) 100, (int) '#', (int) (short) 1, 100, (int) (short) 100, 100, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration43 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration43.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color46 = null;
        lwjgl3ApplicationConfiguration43.setInitialBackgroundColor(color46);
        lwjgl3ApplicationConfiguration43.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration43.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration54 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = null;
        lwjgl3ApplicationConfiguration54.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration54.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration54.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration54.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration54.setTitle("");
        lwjgl3ApplicationConfiguration54.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration71 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode72 = null;
        lwjgl3ApplicationConfiguration71.setHdpiMode(hdpiMode72);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode74 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration71.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration54.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration43.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration19.setHdpiMode(hdpiMode74);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode74);
        java.lang.Class<?> wildcardClass80 = hdpiMode74.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode74 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode74.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass80);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 10);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType17);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (byte) 100);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) ' ', (int) (byte) 10);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener34 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener34);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode13 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode13);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode17 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode17);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1), (int) (byte) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, 10);
        java.lang.Class<?> wildcardClass28 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode13 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode13.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) (byte) 100, (-1), (int) 'a', (int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(10, (int) '#', (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        java.lang.Class<?> wildcardClass38 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass38);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType14);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode31 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode31);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass35 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 10, (int) (short) 10);
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (int) (byte) 1);
        java.lang.Class<?> wildcardClass12 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 0, 1);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, (-1), (int) (short) 100);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration21.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration21.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration21.setDecorated(false);
        lwjgl3ApplicationConfiguration21.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color37);
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration34.setPreferencesConfig("hi!", fileType40);
        lwjgl3ApplicationConfiguration34.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration34.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration50 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode51 = null;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode51);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration50.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode53);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, 1, (int) '4');
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode53 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode53.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType15);
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 10, 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener8 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener8);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) (short) -1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color16);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration13.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration13.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = null;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) '#');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, (int) '4');
        com.badlogic.gdx.graphics.Color color45 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color45);
        java.lang.Class<?> wildcardClass47 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode25 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode25.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass47);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass11 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode15 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode15);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) (short) 0, (int) 'a');
        com.badlogic.gdx.Files.FileType fileType25 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType25);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) '#', (int) '4');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 0);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) -1, (int) '4', (int) (byte) 1, 10, (int) (short) 1, (int) (short) -1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', 0, (-1));
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration15 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = null;
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode16);
        lwjgl3ApplicationConfiguration15.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration15.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration15.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration15.setTitle("");
        lwjgl3ApplicationConfiguration15.setTitle("");
        lwjgl3ApplicationConfiguration15.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration15.setFullscreenMode(displayMode34);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration36.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color39 = null;
        lwjgl3ApplicationConfiguration36.setInitialBackgroundColor(color39);
        lwjgl3ApplicationConfiguration36.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration36.setDecorated(false);
        lwjgl3ApplicationConfiguration36.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration49.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color52 = null;
        lwjgl3ApplicationConfiguration49.setInitialBackgroundColor(color52);
        com.badlogic.gdx.Files.FileType fileType55 = null;
        lwjgl3ApplicationConfiguration49.setPreferencesConfig("hi!", fileType55);
        lwjgl3ApplicationConfiguration49.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color59 = null;
        lwjgl3ApplicationConfiguration49.setInitialBackgroundColor(color59);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode61 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode61);
        lwjgl3ApplicationConfiguration49.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration65 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode66 = null;
        lwjgl3ApplicationConfiguration65.setHdpiMode(hdpiMode66);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode68 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration65.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration15.setHdpiMode(hdpiMode68);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode68);
        java.lang.Class<?> wildcardClass74 = hdpiMode68.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode61 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode61.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode68 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode68.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass74);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener15 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener15);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass21 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 100, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) (short) 1, (int) '4', (int) '#', (int) (byte) 0, 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) (short) -1);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        lwjgl3ApplicationConfiguration16.setTitle("hi!");
        lwjgl3ApplicationConfiguration16.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration23 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode24 = null;
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode24);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration23.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode26);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode26 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode26.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 0, 0, (int) (byte) -1, (int) (byte) 100, 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration27 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode28 = null;
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode28);
        lwjgl3ApplicationConfiguration27.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration27.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration27.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration27.setTitle("");
        lwjgl3ApplicationConfiguration27.setTitle("");
        lwjgl3ApplicationConfiguration27.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode46 = null;
        lwjgl3ApplicationConfiguration27.setFullscreenMode(displayMode46);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration48.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color51 = null;
        lwjgl3ApplicationConfiguration48.setInitialBackgroundColor(color51);
        lwjgl3ApplicationConfiguration48.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration48.setDecorated(false);
        lwjgl3ApplicationConfiguration48.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration61 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration61.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color64 = null;
        lwjgl3ApplicationConfiguration61.setInitialBackgroundColor(color64);
        com.badlogic.gdx.Files.FileType fileType67 = null;
        lwjgl3ApplicationConfiguration61.setPreferencesConfig("hi!", fileType67);
        lwjgl3ApplicationConfiguration61.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color71 = null;
        lwjgl3ApplicationConfiguration61.setInitialBackgroundColor(color71);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode73 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode73);
        lwjgl3ApplicationConfiguration61.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration77 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode78 = null;
        lwjgl3ApplicationConfiguration77.setHdpiMode(hdpiMode78);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode80 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration77.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration61.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration27.setHdpiMode(hdpiMode80);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode80);
        java.lang.Class<?> wildcardClass86 = hdpiMode80.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode73 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode73.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode80 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode80.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass86);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color19 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color19);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration21.setPreferencesConfig("", fileType23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration25 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode26 = null;
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode26);
        com.badlogic.gdx.Graphics.DisplayMode displayMode28 = null;
        lwjgl3ApplicationConfiguration25.setFullscreenMode(displayMode28);
        lwjgl3ApplicationConfiguration25.useOpenGL3(true, 10, (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode34 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration25.setHdpiMode(hdpiMode34);
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode34);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode34);
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType39);
        java.lang.Class<?> wildcardClass41 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode34 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode34.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass41);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', 0);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType23);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (short) -1, 0);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 100, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', 0, (-1));
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType21 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType21);
        java.lang.Class<?> wildcardClass23 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 10);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType20);
        com.badlogic.gdx.Graphics.DisplayMode displayMode22 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode22);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) '#');
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) -1, (-1));
        com.badlogic.gdx.Files.FileType fileType5 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType5);
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) '4', (int) 'a');
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType28);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (short) 0, 0, 10, (int) (byte) 0, (int) ' ', (int) '#');
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) ' ');
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        java.lang.Class<?> wildcardClass15 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setAudioConfig(1, (int) 'a', (int) (byte) 10);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener30 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener30);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration7 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration7.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration7.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration7.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration7.setDecorated(false);
        lwjgl3ApplicationConfiguration7.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color23);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration20.setPreferencesConfig("hi!", fileType26);
        lwjgl3ApplicationConfiguration20.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration20.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration36 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode37 = null;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode37);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode39 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration36.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration7.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode39);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType49 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType49);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (byte) 1);
        java.lang.Class<?> wildcardClass55 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode39 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode39.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass55);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 1, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        java.lang.Class<?> wildcardClass20 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration12.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration12.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration12.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration12.setTitle("");
        lwjgl3ApplicationConfiguration12.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = null;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 1, (-1));
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode44 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode44);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 1, (int) 'a');
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) 'a', (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) -1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '4', (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, 10);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType20);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType23);
        com.badlogic.gdx.Graphics.DisplayMode displayMode25 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode25);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) 'a', (int) (short) -1, 0, (int) (short) 10, (int) '4', (int) (byte) 10, (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 100, (int) (byte) 0, (int) (byte) 100, (-1), (int) (short) 1, (int) (byte) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass43 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '4', (int) '4', (int) (byte) -1, 0, (int) (short) 1, (int) (byte) 1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration20 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration20.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration20.setInitialBackgroundColor(color23);
        lwjgl3ApplicationConfiguration20.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration20.setDecorated(false);
        lwjgl3ApplicationConfiguration20.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration33 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration33.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color36 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color36);
        com.badlogic.gdx.Files.FileType fileType39 = null;
        lwjgl3ApplicationConfiguration33.setPreferencesConfig("hi!", fileType39);
        lwjgl3ApplicationConfiguration33.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color43 = null;
        lwjgl3ApplicationConfiguration33.setInitialBackgroundColor(color43);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode45 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode45);
        lwjgl3ApplicationConfiguration33.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = null;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode50);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode52 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration33.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration20.setHdpiMode(hdpiMode52);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode52);
        com.badlogic.gdx.graphics.Color color57 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color57);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, 0);
        org.junit.Assert.assertTrue("'" + hdpiMode45 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode45.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode52 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode52.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color16);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration13.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration13.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = null;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) ' ', (int) ' ', (int) ' ');
        java.lang.Class<?> wildcardClass43 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode25 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode25.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass43);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 0, 0, (int) (byte) -1, (int) (byte) 100, 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, 100, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (-1));
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType15);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, 100, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener29 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener29);
        java.lang.Class<?> wildcardClass31 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration13 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration13.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color16);
        com.badlogic.gdx.Files.FileType fileType19 = null;
        lwjgl3ApplicationConfiguration13.setPreferencesConfig("hi!", fileType19);
        lwjgl3ApplicationConfiguration13.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color23 = null;
        lwjgl3ApplicationConfiguration13.setInitialBackgroundColor(color23);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode25 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode25);
        lwjgl3ApplicationConfiguration13.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = null;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration13.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) '#');
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 10, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener45 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener45);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        org.junit.Assert.assertTrue("'" + hdpiMode25 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode25.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', (int) 'a', (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        com.badlogic.gdx.Files.FileType fileType10 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType10);
        com.badlogic.gdx.Graphics.DisplayMode displayMode12 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode12);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (short) -1, 100, 0, (int) (byte) 100, (int) (short) 0, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener28 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener28);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
        com.badlogic.gdx.Files.FileType fileType33 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType33);
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType36);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener12 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener12);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (int) '#', (int) (short) 1, 100, (int) (short) 100, 100, (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration24.setInitialBackgroundColor(color27);
        lwjgl3ApplicationConfiguration24.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration24.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = null;
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration35.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration35.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration35.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration35.setTitle("");
        lwjgl3ApplicationConfiguration35.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode53 = null;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode53);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode55 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode55);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode55);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration60 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration60.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color63 = null;
        lwjgl3ApplicationConfiguration60.setInitialBackgroundColor(color63);
        com.badlogic.gdx.Files.FileType fileType66 = null;
        lwjgl3ApplicationConfiguration60.setPreferencesConfig("hi!", fileType66);
        lwjgl3ApplicationConfiguration60.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color70 = null;
        lwjgl3ApplicationConfiguration60.setInitialBackgroundColor(color70);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode72 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode72);
        lwjgl3ApplicationConfiguration60.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration76 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration76.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color79 = null;
        lwjgl3ApplicationConfiguration76.setInitialBackgroundColor(color79);
        com.badlogic.gdx.Files.FileType fileType82 = null;
        lwjgl3ApplicationConfiguration76.setPreferencesConfig("hi!", fileType82);
        lwjgl3ApplicationConfiguration76.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color86 = null;
        lwjgl3ApplicationConfiguration76.setInitialBackgroundColor(color86);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode88 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration76.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration60.setHdpiMode(hdpiMode88);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode88);
        com.badlogic.gdx.Graphics.DisplayMode displayMode92 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode92);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener94 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener94);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        org.junit.Assert.assertTrue("'" + hdpiMode55 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode55.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode72 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode72.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode88 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode88.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (short) 10);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, (int) (byte) 1);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowPosition(0, (-1));
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', 0);
        com.badlogic.gdx.Files.FileType fileType23 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType23);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (-1), (int) ' ', 1, (int) (short) 0, (-1), (int) '4');
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 100, (int) 'a', (int) (short) 10, (int) (byte) 10, 10, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        java.lang.Class<?> wildcardClass37 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass37);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType26);
        com.badlogic.gdx.Files.FileType fileType29 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType29);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.Files.FileType fileType14 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType14);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, (int) ' ', (int) (byte) 100, 0, (-1), (int) '#', (int) (byte) 0);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType12);
        lwjgl3ApplicationConfiguration6.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration6.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (-1));
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 1, 100, (int) (byte) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType30 = null;
        lwjgl3ApplicationConfiguration28.setPreferencesConfig("", fileType30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener32 = null;
        lwjgl3ApplicationConfiguration28.setWindowListener(lwjgl3WindowListener32);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration34 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration34.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color37 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color37);
        com.badlogic.gdx.Files.FileType fileType40 = null;
        lwjgl3ApplicationConfiguration34.setPreferencesConfig("hi!", fileType40);
        lwjgl3ApplicationConfiguration34.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration34.setInitialBackgroundColor(color44);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode46 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration34.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode46);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode52 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode52);
        com.badlogic.gdx.graphics.Color color54 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color54);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode46 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode46.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener11 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener11);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 1, 10);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, 0, 0, (int) 'a', (int) 'a', (int) (short) 100, (-1));
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) 'a', (int) (byte) -1, 0, (int) (short) -1, (int) (byte) 1, 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 10, (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        java.lang.Class<?> wildcardClass31 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (-1));
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) ' ', (int) (short) 0, (int) (byte) -1, (int) (short) 0, (int) (byte) 1, (int) '4', (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration24 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration24.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color27 = null;
        lwjgl3ApplicationConfiguration24.setInitialBackgroundColor(color27);
        lwjgl3ApplicationConfiguration24.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration24.useVsync(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener35 = null;
        lwjgl3ApplicationConfiguration24.setWindowListener(lwjgl3WindowListener35);
        lwjgl3ApplicationConfiguration24.setTitle("");
        lwjgl3ApplicationConfiguration24.setWindowedMode((int) (short) 10, (int) (short) -1);
        lwjgl3ApplicationConfiguration24.setTitle("");
        com.badlogic.gdx.graphics.Color color44 = null;
        lwjgl3ApplicationConfiguration24.setInitialBackgroundColor(color44);
        lwjgl3ApplicationConfiguration24.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration48 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode49 = null;
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode49);
        lwjgl3ApplicationConfiguration48.setTitle("hi!");
        lwjgl3ApplicationConfiguration48.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration48.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration69 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration69.setInitialVisible(false);
        lwjgl3ApplicationConfiguration69.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration74 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType76 = null;
        lwjgl3ApplicationConfiguration74.setPreferencesConfig("", fileType76);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener78 = null;
        lwjgl3ApplicationConfiguration74.setWindowListener(lwjgl3WindowListener78);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration80 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration80.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color83 = null;
        lwjgl3ApplicationConfiguration80.setInitialBackgroundColor(color83);
        com.badlogic.gdx.Files.FileType fileType86 = null;
        lwjgl3ApplicationConfiguration80.setPreferencesConfig("hi!", fileType86);
        lwjgl3ApplicationConfiguration80.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color90 = null;
        lwjgl3ApplicationConfiguration80.setInitialBackgroundColor(color90);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode92 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration80.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration74.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration69.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration48.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration24.setHdpiMode(hdpiMode92);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode92);
        org.junit.Assert.assertTrue("'" + hdpiMode92 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode92.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) ' ', (int) '#');
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) -1, 0, (int) (byte) 100);
        com.badlogic.gdx.Files.FileType fileType26 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType26);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color30 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color30);
        com.badlogic.gdx.graphics.Color color32 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color32);
        com.badlogic.gdx.graphics.Color color34 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color34);
        java.lang.Class<?> wildcardClass36 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass36);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (-1));
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType20 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType20);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 10);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.graphics.Color color17 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color17);
        com.badlogic.gdx.Graphics.DisplayMode displayMode19 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode19);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        java.lang.Class<?> wildcardClass25 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (int) 'a');
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(10, (int) (byte) 10, (int) (short) 100, (int) '#', 100, (int) (byte) 100, (-1));
        lwjgl3ApplicationConfiguration0.disableAudio(false);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode24 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode24);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 0, (int) (short) 100, (int) 'a');
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (byte) -1, (int) (short) 0, 1, (int) (short) 0, 100, (int) (short) 100);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) 'a');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType18 = null;
        lwjgl3ApplicationConfiguration16.setPreferencesConfig("", fileType18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener20 = null;
        lwjgl3ApplicationConfiguration16.setWindowListener(lwjgl3WindowListener20);
        lwjgl3ApplicationConfiguration16.setDecorated(true);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration16.setInitialBackgroundColor(color24);
        com.badlogic.gdx.Graphics.DisplayMode displayMode26 = null;
        lwjgl3ApplicationConfiguration16.setFullscreenMode(displayMode26);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = null;
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode29);
        lwjgl3ApplicationConfiguration28.setTitle("hi!");
        lwjgl3ApplicationConfiguration28.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = null;
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode36);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode38 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode38);
        lwjgl3ApplicationConfiguration16.setDecorated(true);
        lwjgl3ApplicationConfiguration16.setBackBufferConfig((int) (byte) 1, (int) ' ', (int) (byte) 1, (int) (short) 0, (-1), (int) '#', (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration52 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType54 = null;
        lwjgl3ApplicationConfiguration52.setPreferencesConfig("", fileType54);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration56 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode57 = null;
        lwjgl3ApplicationConfiguration56.setHdpiMode(hdpiMode57);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode59 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration56.setHdpiMode(hdpiMode59);
        lwjgl3ApplicationConfiguration52.setHdpiMode(hdpiMode59);
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode59);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode59);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        java.lang.Class<?> wildcardClass66 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode38 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode38.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertTrue("'" + hdpiMode59 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode59.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass66);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) -1, 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        java.lang.Class<?> wildcardClass23 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.graphics.Color color5 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color5);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '4', (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color14 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color14);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener18 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener18);
        com.badlogic.gdx.Graphics.DisplayMode displayMode20 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode20);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode23 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode23);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) ' ', (int) (short) 0);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) 100, (-1));
        com.badlogic.gdx.Files.FileType fileType15 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType15);
        java.lang.Class<?> wildcardClass17 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode3 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode3);
        com.badlogic.gdx.Graphics.DisplayMode displayMode5 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode5);
        com.badlogic.gdx.Files.FileType fileType8 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType8);
        java.lang.Class<?> wildcardClass10 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode3 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode3.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener10 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener10);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType12);
        lwjgl3ApplicationConfiguration6.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration6.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 1, (int) (byte) 100, (int) (byte) 1, (int) '4', (int) (short) 10, 0, 100);
        com.badlogic.gdx.Files.FileType fileType38 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType38);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 10, 0, (int) (short) 0, (int) ' ', (int) '4', 10, (int) (short) 10);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType12);
        lwjgl3ApplicationConfiguration6.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration6.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), 1);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 10, (int) (short) 0);
        com.badlogic.gdx.Files.FileType fileType22 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType22);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 100);
        java.lang.Class<?> wildcardClass28 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color10 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration16 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode17 = null;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode17);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode19 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration16.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode19);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, 0, (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (short) 10, (int) (byte) 100, 0);
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode12 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode12.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode19 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode19.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType17 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType17);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener17 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener17);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (-1));
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.graphics.Color color8 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color8);
        com.badlogic.gdx.Graphics.DisplayMode displayMode10 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode10);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (int) (short) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        java.lang.Class<?> wildcardClass18 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener13 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener13);
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration18 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration18.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color21 = null;
        lwjgl3ApplicationConfiguration18.setInitialBackgroundColor(color21);
        lwjgl3ApplicationConfiguration18.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration18.setDecorated(false);
        lwjgl3ApplicationConfiguration18.setResizable(true);
        lwjgl3ApplicationConfiguration18.setAudioConfig((int) 'a', 1, (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration35 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode36 = null;
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode36);
        lwjgl3ApplicationConfiguration35.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration35.setInitialVisible(false);
        lwjgl3ApplicationConfiguration35.useOpenGL3(true, (int) (short) 100, 0);
        lwjgl3ApplicationConfiguration35.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration49 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode50 = null;
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode50);
        lwjgl3ApplicationConfiguration49.setTitle("hi!");
        lwjgl3ApplicationConfiguration49.setInitialVisible(true);
        lwjgl3ApplicationConfiguration49.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration58 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration58.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color61 = null;
        lwjgl3ApplicationConfiguration58.setInitialBackgroundColor(color61);
        lwjgl3ApplicationConfiguration58.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration58.setDecorated(false);
        lwjgl3ApplicationConfiguration58.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration71 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration71.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color74 = null;
        lwjgl3ApplicationConfiguration71.setInitialBackgroundColor(color74);
        com.badlogic.gdx.Files.FileType fileType77 = null;
        lwjgl3ApplicationConfiguration71.setPreferencesConfig("hi!", fileType77);
        lwjgl3ApplicationConfiguration71.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color81 = null;
        lwjgl3ApplicationConfiguration71.setInitialBackgroundColor(color81);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode83 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration71.setHdpiMode(hdpiMode83);
        lwjgl3ApplicationConfiguration71.setInitialVisible(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration87 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode88 = null;
        lwjgl3ApplicationConfiguration87.setHdpiMode(hdpiMode88);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode90 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration87.setHdpiMode(hdpiMode90);
        lwjgl3ApplicationConfiguration71.setHdpiMode(hdpiMode90);
        lwjgl3ApplicationConfiguration58.setHdpiMode(hdpiMode90);
        lwjgl3ApplicationConfiguration49.setHdpiMode(hdpiMode90);
        lwjgl3ApplicationConfiguration35.setHdpiMode(hdpiMode90);
        lwjgl3ApplicationConfiguration18.setHdpiMode(hdpiMode90);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode90);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        org.junit.Assert.assertTrue("'" + hdpiMode83 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode83.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertTrue("'" + hdpiMode90 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode90.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) -1, (int) 'a', (int) (short) -1, 1, 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) (short) -1, 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener41);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) 'a');
        java.lang.Class<?> wildcardClass46 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass46);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) 'a', (int) (short) 0);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration21 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration21.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration21.setInitialBackgroundColor(color24);
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration21.setPreferencesConfig("hi!", fileType27);
        lwjgl3ApplicationConfiguration21.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration21.setWindowPosition((int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration21.setWindowPosition((int) (byte) -1, (int) (short) 0);
        lwjgl3ApplicationConfiguration21.setWindowedMode((int) (short) 10, (int) (short) 0);
        com.badlogic.gdx.Files.FileType fileType43 = null;
        lwjgl3ApplicationConfiguration21.setPreferencesConfig("", fileType43);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration45 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration45.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color48 = null;
        lwjgl3ApplicationConfiguration45.setInitialBackgroundColor(color48);
        lwjgl3ApplicationConfiguration45.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration45.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration56 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode57 = null;
        lwjgl3ApplicationConfiguration56.setHdpiMode(hdpiMode57);
        lwjgl3ApplicationConfiguration56.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration56.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration56.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration56.setTitle("");
        lwjgl3ApplicationConfiguration56.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration73 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode74 = null;
        lwjgl3ApplicationConfiguration73.setHdpiMode(hdpiMode74);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode76 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration73.setHdpiMode(hdpiMode76);
        lwjgl3ApplicationConfiguration56.setHdpiMode(hdpiMode76);
        lwjgl3ApplicationConfiguration45.setHdpiMode(hdpiMode76);
        lwjgl3ApplicationConfiguration21.setHdpiMode(hdpiMode76);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode76);
        com.badlogic.gdx.graphics.Color color82 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color82);
        org.junit.Assert.assertTrue("'" + hdpiMode76 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode76.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        com.badlogic.gdx.Files.FileType fileType16 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType16);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) '4', (int) (short) 10);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        java.lang.Class<?> wildcardClass24 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (-1), (int) (short) 1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode21 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode21);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, 100);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration5 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode6 = null;
        lwjgl3ApplicationConfiguration5.setHdpiMode(hdpiMode6);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode8 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration5.setHdpiMode(hdpiMode8);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode8);
        java.lang.Class<?> wildcardClass11 = hdpiMode8.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode8 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode8.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, 10, (int) (short) 1, (int) (byte) 100, (int) (byte) 100, (int) (byte) 0, 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (byte) 1, (int) '4');
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) '#', (int) (short) 100, (int) (byte) 0, (int) (short) 10, (int) (byte) 100, (int) (short) 100, 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) '4');
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.Files.FileType fileType31 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType31);
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 10, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) -1, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) -1, 1);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 1, (int) (short) 0);
        java.lang.Class<?> wildcardClass32 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration11 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode12 = null;
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode12);
        lwjgl3ApplicationConfiguration11.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration11.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration11.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration11.setTitle("");
        lwjgl3ApplicationConfiguration11.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration28 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode29 = null;
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode29);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode31 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration28.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration11.setHdpiMode(hdpiMode31);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode31);
        com.badlogic.gdx.Files.FileType fileType36 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType36);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.setTitle("");
        org.junit.Assert.assertTrue("'" + hdpiMode31 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode31.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.graphics.Color color6 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color6);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.Files.FileType fileType9 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType9);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType6);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(0, (int) (byte) 0, (int) (byte) 100, (-1), (int) 'a', (int) (byte) 1, (int) (short) 1);
        com.badlogic.gdx.graphics.Color color18 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color18);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener22 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener22);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) ' ');
        lwjgl3ApplicationConfiguration0.disableAudio(true);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        lwjgl3ApplicationConfiguration0.setAudioConfig(0, (int) ' ', 1);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) ' ', (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode16 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode16);
        com.badlogic.gdx.Graphics.DisplayMode displayMode18 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode18);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, 10);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener16 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener16);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig(1, (int) 'a', (int) (short) 10, 1, (int) (byte) -1, (int) (byte) -1, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((-1), (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) '#', (int) (byte) -1);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (byte) 1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((-1), (int) (byte) 1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) (byte) 0, 1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition(1, (int) 'a');
        java.lang.Class<?> wildcardClass27 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration17 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = null;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode18);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode20 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration17.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode20);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) -1, (int) 'a', (int) (short) -1, 1, 0, (int) (byte) 100);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', (int) (short) -1, 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 0, (int) 'a');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 1, (int) '#');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener41 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener41);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 100, (int) 'a');
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (byte) 0, (int) ' ');
        lwjgl3ApplicationConfiguration0.useOpenGL3(true, (int) (short) 0, (int) (short) 1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode54 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode54);
        org.junit.Assert.assertTrue("'" + hdpiMode20 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode20.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 0, (int) (short) 1, (int) (short) 10, (int) (byte) -1, 10, (int) ' ');
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 0, (int) (byte) -1);
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color16);
        lwjgl3ApplicationConfiguration0.setResizable(true);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) '#', 100, (int) (byte) 100);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) (short) 100, 1, 100, (int) (short) -1, (int) (short) 10, (int) (byte) 0);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) '#', (int) (short) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Files.FileType fileType27 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType27);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) 10, (int) '#');
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (-1));
        com.badlogic.gdx.graphics.Color color11 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color11);
        java.lang.Class<?> wildcardClass13 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode3 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode3);
        lwjgl3ApplicationConfiguration0.useVsync(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener7 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener7);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 1, (int) 'a');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration12 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode13 = null;
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode13);
        lwjgl3ApplicationConfiguration12.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration12.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration12.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration12.setTitle("");
        lwjgl3ApplicationConfiguration12.setDecorated(true);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration29 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode30 = null;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode30);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode32 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical;
        lwjgl3ApplicationConfiguration29.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration12.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode32);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.graphics.Color color38 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color38);
        java.lang.Class<?> wildcardClass40 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode32 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical + "'", hdpiMode32.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Logical));
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        com.badlogic.gdx.Graphics.DisplayMode displayMode11 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode11);
        com.badlogic.gdx.graphics.Color color13 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color13);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (short) -1, (int) (short) 0);
        java.lang.Class<?> wildcardClass22 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 10, (int) (byte) 100, (int) (byte) 1, (int) (byte) -1, (int) '4', (int) 'a', (int) ' ');
        lwjgl3ApplicationConfiguration0.setAudioConfig(100, (int) (byte) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) (byte) 1, 100);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration26 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode27 = null;
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode27);
        lwjgl3ApplicationConfiguration26.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration26.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration26.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration26.disableAudio(true);
        com.badlogic.gdx.graphics.Color color41 = null;
        lwjgl3ApplicationConfiguration26.setInitialBackgroundColor(color41);
        lwjgl3ApplicationConfiguration26.useOpenGL3(true, (int) 'a', (int) (short) 0);
        com.badlogic.gdx.Graphics.DisplayMode displayMode47 = null;
        lwjgl3ApplicationConfiguration26.setFullscreenMode(displayMode47);
        lwjgl3ApplicationConfiguration26.setResizable(false);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration51 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType53 = null;
        lwjgl3ApplicationConfiguration51.setPreferencesConfig("", fileType53);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener55 = null;
        lwjgl3ApplicationConfiguration51.setWindowListener(lwjgl3WindowListener55);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration57 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration57.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color60 = null;
        lwjgl3ApplicationConfiguration57.setInitialBackgroundColor(color60);
        com.badlogic.gdx.Files.FileType fileType63 = null;
        lwjgl3ApplicationConfiguration57.setPreferencesConfig("hi!", fileType63);
        lwjgl3ApplicationConfiguration57.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color67 = null;
        lwjgl3ApplicationConfiguration57.setInitialBackgroundColor(color67);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode69 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration57.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration51.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration26.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode69);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass78 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertTrue("'" + hdpiMode69 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode69.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
        org.junit.Assert.assertNotNull(wildcardClass78);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setTitle("");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) (short) -1, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (short) 0, (int) (short) 1);
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(0, (int) (byte) 100);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener23 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener23);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) 'a', 1);
        lwjgl3ApplicationConfiguration0.setAudioConfig((int) 'a', 1, (-1));
        java.lang.Class<?> wildcardClass33 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setWindowPosition(100, (int) '4');
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener6 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener6);
        java.lang.Class<?> wildcardClass8 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.setTitle("");
        lwjgl3ApplicationConfiguration0.disableAudio(false);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        lwjgl3ApplicationConfiguration0.setWindowedMode(100, (int) ' ');
        com.badlogic.gdx.graphics.Color color24 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color24);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.setResizable(true);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.Files.FileType fileType2 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType2);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener4 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener4);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration6 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration6.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color9 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color9);
        com.badlogic.gdx.Files.FileType fileType12 = null;
        lwjgl3ApplicationConfiguration6.setPreferencesConfig("hi!", fileType12);
        lwjgl3ApplicationConfiguration6.setTitle("hi!");
        com.badlogic.gdx.graphics.Color color16 = null;
        lwjgl3ApplicationConfiguration6.setInitialBackgroundColor(color16);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode18 = com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels;
        lwjgl3ApplicationConfiguration6.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode18);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        com.badlogic.gdx.Files.FileType fileType28 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("hi!", fileType28);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.Graphics.DisplayMode displayMode32 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode32);
        com.badlogic.gdx.Graphics.DisplayMode displayMode34 = null;
        lwjgl3ApplicationConfiguration0.setFullscreenMode(displayMode34);
        org.junit.Assert.assertTrue("'" + hdpiMode18 + "' != '" + com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels + "'", hdpiMode18.equals(com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode.Pixels));
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        com.badlogic.gdx.graphics.Color color3 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color3);
        com.badlogic.gdx.Files.FileType fileType6 = null;
        lwjgl3ApplicationConfiguration0.setPreferencesConfig("", fileType6);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        lwjgl3ApplicationConfiguration0.useOpenGL3(false, (int) ' ', (-1));
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener14 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener14);
        java.lang.Class<?> wildcardClass16 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        lwjgl3ApplicationConfiguration0.setInitialVisible(false);
        lwjgl3ApplicationConfiguration0.setResizable(false);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (short) 100, (-1), (int) (short) 10, (int) (byte) 100, (int) '#', 100, (int) '#');
        java.lang.Class<?> wildcardClass13 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 10, 100);
        lwjgl3ApplicationConfiguration0.setWindowedMode((int) (byte) 100, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.setAudioConfig((-1), (int) (short) 0, (int) (short) 0);
        lwjgl3ApplicationConfiguration0.disableAudio(true);
        lwjgl3ApplicationConfiguration0.setWindowPosition(10, (int) (short) 100);
        lwjgl3ApplicationConfiguration0.setWindowPosition((int) 'a', (int) (short) -1);
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3WindowListener lwjgl3WindowListener21 = null;
        lwjgl3ApplicationConfiguration0.setWindowListener(lwjgl3WindowListener21);
        lwjgl3ApplicationConfiguration0.setDecorated(false);
        com.badlogic.gdx.graphics.Color color25 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color25);
        lwjgl3ApplicationConfiguration0.useVsync(true);
        java.lang.Class<?> wildcardClass29 = lwjgl3ApplicationConfiguration0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration lwjgl3ApplicationConfiguration0 = new com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration();
        com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration.HdpiMode hdpiMode1 = null;
        lwjgl3ApplicationConfiguration0.setHdpiMode(hdpiMode1);
        lwjgl3ApplicationConfiguration0.setTitle("hi!");
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) -1, (int) (short) 10, (int) (byte) 0, (int) (short) 0, (int) (byte) 10, (int) (short) -1, (int) (byte) -1);
        lwjgl3ApplicationConfiguration0.setInitialVisible(true);
        com.badlogic.gdx.graphics.Color color15 = null;
        lwjgl3ApplicationConfiguration0.setInitialBackgroundColor(color15);
        lwjgl3ApplicationConfiguration0.setBackBufferConfig((int) (byte) 0, (int) '4', 100, 10, 0, (int) (short) 10, (int) '#');
    }
}

