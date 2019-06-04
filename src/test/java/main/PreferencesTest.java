package main;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PreferencesTest {

    private Preferences prefTest = new Preferences();

    /**
     * Hogy mi legyen a felhasznló és a jelszó.
     * @throws Exception - kivételt dob.
     */
    @Before
    public void setUp() throws Exception {
        prefTest.setUsername("ezaz");
        prefTest.setPassword("azez");
    }

    /**
     * Teszteli a belépést az alkalamzásba. Ez a teszt át fog menni.
     * @throws Exception - kivételt dob.
     */
    @Test
    public void mid() throws Exception {
        assertEquals("ezaz", prefTest.getUsername());
        assertEquals("azez", prefTest.getPassword());
    }

    /**
     * Teszteli a belépést az alkalamzásba. Ez a teszt nem fog átmenni.
     * @throws Exception - kivételt dob.
     */
    @Test
    public void mid2() throws Exception {
        assertEquals("kutya", prefTest.getUsername());
        assertEquals("macska", prefTest.getPassword());
    }

    /**
     * Teszteli a belépést az alkalamzásba. Ez a teszt nem fog átmenni.
     * @throws Exception - kivételt dob.
     */
    @Test
    public void mid3() throws Exception {
        assertEquals(null, prefTest.getUsername());
        assertEquals(null, prefTest.getPassword());
    }
}