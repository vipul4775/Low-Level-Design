package com.vipul.lld.librarymanagementsystem;

 class BookOperations {

    Fine fine;
    public void issueBook(BookItem bookItem,SystemUser user){}
    public BookIssueDetails returnBook(BookItem bookItem,SystemUser user){return null;}
    public BookIssueDetails renewBook(BookItem bookItem,SystemUser user){return null;}
    public BookReservationDetails reserveBook(BookItem book, SystemUser user){return null;}

    public BookReservationDetails getReservationDetails(BookItem bookItem,SystemUser user){return null;}
    public void updateReservationDetails(BookItem bookItem,SystemUser user){}
}
