package com.lucasgfbatista;

import com.lucasgfbatista.gof.singleton.SingletonEager;
import com.lucasgfbatista.gof.singleton.SingletonLazy;
import com.lucasgfbatista.gof.singleton.SingletonLazyHolder;

public class PatternsTests {

    //LAZY
    SingletonLazy lazy = SingletonLazy.getInstance();
    System.out.println(lazy);
    lazy =SingletonLazy.getInstance();
    System.out.println(lazy);

    //EAGER
    System.out.println("\n");
    SingletonEager eager = SingletonEager.getInstance();
    System.out.println(eager);
    eager =SingletonEager.getInstance();
    System.out.println(eager);


    //LAZY HOLDER
    System.out.println("\n");
    SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
    System.out.println(lazyHolder);
    lazyHolder =SingletonLazyHolder.getInstance();
    System.out.println(lazyHolder);


}
