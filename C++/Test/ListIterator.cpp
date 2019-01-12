#include "ListIterator.h"

bool ListIterator::hasNext(){
    return (pointer->nachfolger != nullptr);
}

const char* ListIterator::next(){
    pointer = pointer->nachfolger;
    return pointer->inhalt;
}

ListIterator::ListIterator(LinkedList orig){
    list = orig;
}
