package ganada.obj;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.junit.BeforeClass;

import oracle.jdbc.pool.OracleConnectionPoolDataSource;

public abstract class DBTester {

    @BeforeClass
    public static void setUpClass() throws Exception {
	try {
	    // Create initial context
	    System.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.naming.java.javaURLContextFactory");
	    System.setProperty(Context.URL_PKG_PREFIXES, "org.apache.naming");
	    InitialContext ic = new InitialContext();

	    ic.createSubcontext("java:");
	    ic.createSubcontext("java:comp");
	    ic.createSubcontext("java:comp/env");
	    ic.createSubcontext("java:comp/env/jdbc");

	    // Construct DataSource
	    OracleConnectionPoolDataSource ds = new OracleConnectionPoolDataSource();
	    ds.setURL("jdbc:oracle:thin:@khdb.cp8nvxes5rzu.ap-northeast-2.rds.amazonaws.com:1521:ORCL");
	    ds.setUser("rune");
	    ds.setPassword("q1w2e3r4");

	    ic.bind("java:comp/env/jdbc/orcl", ds);
	} catch (NamingException ex) {
	    ex.printStackTrace();
	    // Logger.getLogger(BannerHTMLTest.class.getName()).log(Level.SEVERE,
	    // null, ex);
	}

    }
}
