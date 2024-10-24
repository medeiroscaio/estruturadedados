public class Pedido {
    private int id;
    private String descricao;
    private boolean vip;

    public Pedido(int id, String descricao, boolean vip) {
        this.id = id;
        this.descricao = descricao;
        this.vip = vip;
    }

    public int getId() {
        return id;
    }

    public boolean isVip() {
        return vip;
    }

    @Override
    public String toString() {
        return "Pedido [ID=" + id + ", Descrição=" + descricao + ", VIP=" + vip + "]";
    }
}
