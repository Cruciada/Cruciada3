package com.example.toshiba.cruciada;

import java.util.ArrayList;
import java.util.Date;

public class NewsFeedGenerator {

    static int Max_Events = 15;

    public class user{
        int id,nr_books_read;
        class book_read{
            int book_id;
            Date date;
        }
        book_read[] books = new book_read[10001];
    }

    public class event_book{
        int id,book_id;
        Date date;
    }

    user[] friends = new user[10001];
    int nr_friends =16 ;

    void generator(){

        event_book[] events = new event_book[10001];
        int events_put = 0;
        for(int i=0;i<nr_friends;++i){
            for(int j=0;j<friends[i].nr_books_read;++j){
                events[events_put].id=friends[i].id;
                events[events_put].book_id=friends[i].books[j].book_id;
                events[events_put].date=friends[i].books[j].date;
                events_put++;
                if(events_put==Max_Events){
                    i=nr_friends;
                    break;
                }
            }
        }

    }

}
