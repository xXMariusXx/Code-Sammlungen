#ifndef LISTITERATOR_H_
#define LISTITERATOR_H_

#include "LinkedList.h"
#include "Iterator.h"

class ListIterator: public Iterator{

private:
    LinkedList list;
    element* pointer;

public:
    ListIterator(LinkedList orig);
    virtual bool hasNext();
    virtual const char* next();

};


#endif
