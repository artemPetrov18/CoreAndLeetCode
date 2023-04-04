package Solid;

public class SRP {
    /*
    * Single Responsibility Principle (Принцип единственной ответственности)
    *
    *   Данный принцип гласит: никогда не должно быть больше одной причины изменить класс.

        На каждый объект возлагается одна обязанность, полностью инкапсулированная в класс. Все сервисы класса направлены на обеспечение этой обязанности.
        Такие классы всегда будет просто изменять, если это понадобится, потому что понятно, за что класс отвечает, а за что — нет.

*       То есть можно будет вносить изменения и не бояться последствий — влияния на другие объекты. А еще подобный код гораздо проще тестировать,
*
*       ведь вы покрываете тестами одну функциональность в изоляции от всех остальных.
*
    *
    *
    * */
}
        //Example  эти три метода реализуют разную логику и выполняют разные задачи тоесть по принцыипа SRP
        //            ИХ следует разделить на три класа
/*
             class OrderProcessor {

            public void process(Order order){
                if (order.isValid() && save(order)) {
                    sendConfirmationEmail(order);
                }
            }

            private boolean save(Order order) {
                MySqlConnection connection = new MySqlConnection("database.url");
                // сохраняем заказ в базу данных

                return true;
            }

            private void sendConfirmationEmail(Order order) {
                String name = order.getCustomerName();
                String email = order.getCustomerEmail();

                // Шлем письмо клиенту
            }
        }
*/


/*          Ипсравленый код по прицыпам СОЛИД(СРП)

        public class MySQLOrderRepository {
            public boolean save(Order order) {
                MySqlConnection connection = new MySqlConnection("database.url");
                // сохраняем заказ в базу данных

                return true;
            }
        }

public class ConfirmationEmailSender {
    public void sendConfirmationEmail(Order order) {
        String name = order.getCustomerName();
        String email = order.getCustomerEmail();

        // Шлем письмо клиенту
    }
}

public class OrderProcessor {
    public void process(Order order){

        MySQLOrderRepository repository = new MySQLOrderRepository();
        ConfirmationEmailSender mailSender = new ConfirmationEmailSender();

        if (order.isValid() && repository.save(order)) {
            mailSender.sendConfirmationEmail(order);
        }
    }

}
*/