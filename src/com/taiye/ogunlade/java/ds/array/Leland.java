//
//
//public class Leland {
//    public static void main(String[] args) {
//        (define largest - sublist
//                (lambda(lst sublist1 sublist2 sublist1_len sublist1_len2)
//        (cond
//        ; When list is empty return|sublist1_len - sublist1_len2 |<=1 and sublist1 = sublist2
//                ((null ? lst) (and( <= (abs(-sublist1_len sublist1_len2)) 1)( = sublist1 sublist2)))
//        (else
//        (or
//                (largest - sublist(cdr lst) (+sublist1(car lst)) sublist2(+sublist1_len 1) sublist1_len2)
//        (largest - sublist(cdr lst) (-(car lst)sublist1)sublist2(+sublist1_len 1) sublist1_len2)
//        (largest - sublist(cdr lst) sublist1(+sublist2(car lst)) sublist1_len(+sublist1_len2 1))
//        (largest - sublist(cdr lst) sublist1(-(car lst) sublist2)sublist1_len(+sublist1_len2 1))
//        );
//        end or
//        );
//        end else
//        );
//        end cond
//        );
//        end lambda
//        );
//        end define;
//        Tests
//                (largest - sublist '(1 2 3 4) 0 0 0 0) ;#t
//        (largest - sublist '(1) 0 0 0 0) ;#f
//        (largest - sublist '(1 3 1 2) 0 0 0 0) ;#f
//        (largest - sublist '(33 25 30 37 39 16 49 17 24 14 2) 0 0 0 0) ;#t
//
//    }
//}