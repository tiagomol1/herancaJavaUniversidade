public class BasePlusComissionEmployeeTest {
    public static void main(String[] args) {
        BasePlusComissionEmployee employee = new BasePlusComissionEmployee(
          "João", "Ninguém", "123.456.789-00",
          10000, .05, 800
        );

        System.out.println("Imprimindo dados por métodos get: ");
        System.out.println("Nome: " + employee.getFirstName());
        System.out.println("Sobrenome: " + employee.getLastName());
        System.out.println("CPF: " + employee.getCpf());
        System.out.println("Venda bruta: " + employee.getGrossSales());
        System.out.println("Comissão: " + employee.getComissionRate());
        System.out.println("Salário base: " + employee.getBaseSalary());
        System.out.println("Rendimento: " + employee.earnings());

        try {
            employee.setGrossSales(-1);
        } catch (IllegalArgumentException ex) {
            System.out.println("Erro atualizando vendas brutas do funcionário: " + ex.getMessage());
        }

        try {
            employee.setComissionRate(4);
        } catch (IllegalArgumentException ex) {
            System.out.println("Erro atualizando comissão do funcionário: " + ex.getMessage());
        }

        try {
            employee.setBaseSalary(-1);
        } catch (IllegalArgumentException ex) {
            System.out.println("Erro atualizando salário do funcionário: " + ex.getMessage());
        }

        System.out.println("Atualizada a informação do funcionário:");
        System.out.println(employee);
    }
}
