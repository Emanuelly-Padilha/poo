package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOJDBC implements ProdutoDAO {

    private static Connection conexao;

    public static Connection getConnection() {

        // O que a professora usou é um pouco diferente mas eu não consegui copiar
        try {
            if (conexao == null || conexao.isClosed()) {

                String url = "jdbc:mysql://localhost:3306/ProdutoDAO";
                String user = "giovanna";
                String password = "3321";

                conexao = DriverManager.getConnection(url, user, password);
                System.out.println("Conectado ao banco com sucesso");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conexao;
    }

    // insert
    @Override
    public void inserir(Produto p) {

        String sql = "INSERT INTO produto (id, descricao, valor) VALUES (?, ?, ?)";

        try (Connection conn = getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, p.getId());
            ps.setString(2, p.getDescrição());
            ps.setDouble(3, p.getValor());

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // listar
    @Override
    public List<Produto> listar() {

        List<Produto> lista = new ArrayList<>();
        String sql = "SELECT * FROM produto";

        try (Connection conn = getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {

                Produto p = new Produto(
                        rs.getInt("id"),
                        rs.getString("descricao"),
                        rs.getDouble("valor"));

                lista.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

    // buscar id
    @Override
    public Produto buscarPorId(int id) {

        String sql = "SELECT * FROM produto WHERE id = ?";

        try (Connection conn = getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Produto(
                        rs.getInt("id"),
                        rs.getString("descricao"),
                        rs.getDouble("valor"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // remover
    @Override
    public void remover(int id) {

        String sql = "DELETE FROM produto WHERE id = ?";

        try (Connection conn = getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
