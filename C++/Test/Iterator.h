#ifndef ITERATOR_H_
#define ITERATOR_H_

class Iterator{
private:

public:
    //Iterator();
    virtual bool hasNext() = 0;
    virtual const char* next() = 0;

};


#endif
