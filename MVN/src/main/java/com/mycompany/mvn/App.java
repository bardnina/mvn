package com.mycompany.mvn;

import java.util.Iterator;
import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       hello_world();
        
    }
   public static void hello_world() {
		//подготавливаем
		Iterator i = mock(Iterator.class);
		when(i.next()).thenReturn("Hello").thenReturn("World");
		//выполняем
		String result = i.next()+" "+i.next();
		//сравниваем
		assertEquals("Hello Worlb", result);
	}

}
