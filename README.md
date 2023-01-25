## Запуск и функционал
1. Собрать проект
2. Запустить docker-compose
3. Доступные конечные точки  
- GET /cars - все автомобили с фильтрацией(параметры запроса {licensePlate, yearManufacture, brand})
- POST /cars - добавления автомобиля поля JSON (licensePlate, yearManufacture, brand)
- DELETE /cars/{id} - уделения автомобился по id
- GET /statistics - информация по взаимодействиям с бд (lastTimeSaveCar - время последнего добавления автомобился в БД, lastTimeDeleteCar - удаления, lastTimeModificationDb - время последнего изменения данных в БД, amountCar - количество автомобилий в БД)
