/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.mycompany.testsonguyento.Utils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 *
 * @author admin
 */
public class TestSNT {
    @Test
    public void testSoLe(){
        int n = 5;
        boolean actual = Utils.ktNt(n);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testSoChan(){
        int n = 2;
        boolean actual = Utils.ktNt(n);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    @Tag("Critical")
    @DisplayName ("KT SNT chan")
    public void testSoChanTrue()
    {
        int n = 5;
        boolean actual;
        actual = Utils.ktNt(n);
        Assertions.assertTrue(actual);
    }
}
