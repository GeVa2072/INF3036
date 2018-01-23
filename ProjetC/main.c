#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "list.h"


typedef struct client {
	char* nom;
} Client; 

typedef Client* Client_p;

Client_p createClient(char* nom);

void printClient(Client_p client);

int main() {

List list = NULL;

Client_p client = createClient("Moi");

list = addList(list, client);

forEachList(list, &printClient);

}


Client_p createClient(char* nom) {

	Client_p client = malloc(sizeof(Client));
	strcpy(client->nom, nom);
	
	return client;
}


void printClient(Client_p client) {
	printf("Nom: %s\n", client->nom);
}
