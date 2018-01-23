#ifndef __LIST_H_
#define __LIST_H_

typedef struct element Element;
typedef Element* Element_p;
typedef Element_p List;

struct element {
	void * element;
	Element* next;
};

List addList(List list, void * element);
List removeList(List list, int position);
List getList(List list, int position);
void forEachList(List list, void * function);

#endif
