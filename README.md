# Использование RabbitMQ, создание publisher/consumer и очереди с использованием Spring Framework компонентов
1. Скачайте архив проекта (Cсылка на проект consumer: https://github.com/DaurenGitAcc/RabbitMQ_Consumer_Spring )
2. Распакуйте и откройте в вашем IDE
3. Скачайте RabbitMQ на свой компьютер и подключите сервер
4. Запустите проект (совместно publisher и consumer)
5. Перейдите в PostMan и введите следующие запросы: <br/>
   POST |  localhost:8080/send  - для добавления сообщения в очередь.<br/> Сообщение передается в теле запроса в качестве простого текста. <br/>
   После передачи, сообщение доставляется потребителю и появляется в логе.


# <img src="https://github.com/DaurenGitAcc/RabbitMQ_Spring/blob/main/screenshots/Снимок1.PNG" width=80% height=80%>
<br/>
# <img src="https://github.com/DaurenGitAcc/RabbitMQ_Spring/blob/main/screenshots/Снимок.PNG" width=80% height=80%>
<br/>
# <img src="https://github.com/DaurenGitAcc/RabbitMQ_Spring/blob/main/screenshots/Снимок3.PNG" width=80% height=80%><br/>
