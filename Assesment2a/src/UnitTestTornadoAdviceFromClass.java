import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class UnitTestTornadoAdviceFromClass
{
    Storm tornado = new Tornado();

    @Test
    void AdviceUnclassified()
    {
        assertEquals("There is no need to panic", tornado.GetAdvice("Unclassified"));
    }

    @Test
    void AdviceF0()
    {
        assertEquals("Find safe room/shelter, shield yourself from debris", tornado.GetAdvice("f0"));
    }

    @Test
    void AdviceF1()
    {
        assertEquals("Find safe room/shelter, shield yourself from debris", tornado.GetAdvice("f1"));
    }

    @Test
    void AdviceF2()
    {
        assertEquals("Find underground shelter, crouch near to the floor covering your head with your hands", tornado.GetAdvice("f2"));
    }

    @Test
    void AdviceF3()
    {
        assertEquals("Find underground shelter, crouch near to the floor covering your head with your hands", tornado.GetAdvice("f3"));
    }

    @Test
    void AdviceF4()
    {
        assertEquals("Find underground shelter, crouch near to the floor covering your head with your hands", tornado.GetAdvice("f4"));
    }

    @Test
    void AdviceF5()
    {
        assertEquals("Find underground shelter, crouch near to the floor covering your head with your hands", tornado.GetAdvice("f2"));
    }
}