Sviluppo di una applicazione web Spring Boot con le dipendenze neccessarie che:
utilizza Rest Repositories HAL Explorer
si connette a una base dati MySQL locale
cancella lo schema alla fine della sessione
crea la tabella di macchine cars, dove ogni entità Car ha:
primary key
modelName not null
serialNumber not null
currentPrice che può essere null
ha un repository dedicato per cars così puoi usare HAL Explorer per controllare i dati
utilizza HAL Explorer per aggiungere 2 macchine alla base dati
utilizza HAL Explorer per vedere tutte le macchine nella base dati
