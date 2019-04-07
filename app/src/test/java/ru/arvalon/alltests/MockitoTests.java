package ru.arvalon.alltests;

import android.content.Context;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mockito;

import static junit.framework.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

/**
 * MockitoTests. Так можно создавать объекты-обманки из классов
 * Created by arvalon on 09.02.2018.
 */

public class MockitoTests {

    Presenter presenter;
    FotoView view;

    @Captor
    ArgumentCaptor<Throwable> t;

    @Before
    public void init(){
        t= ArgumentCaptor.forClass(Throwable.class);
        presenter = new Presenter();
        view=mock(FotoView.class);
        presenter.register(view);
    }

    @Test
    public void testError(){
        presenter.loadData("error");
        verify(view).showError(t.capture());
        assertEquals("ERROR",t.getValue().getMessage());
        verifyNoMoreInteractions(view);

        //Context context = mock(Context.class);
        //Context ctx = MockitoTests.mock(Context.class);

    }

    @Test
    public void testdata(){
        presenter.loadData("data");
        verify(view).newData("data");
        verifyNoMoreInteractions(view);
    }

    @After
    public void tearDown(){

    }
}
