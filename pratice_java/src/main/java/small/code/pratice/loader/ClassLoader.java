package small.code.pratice.loader;

import java.util.HashMap;
import java.util.Map;

public class ClassLoader {
	public static void main(String[] args) {

        System.out.println("class loader for HashMap: "
                + java.util.HashMap.class.getClassLoader());
        System.out.println("class loader for DNSNameService: "
                + sun.net.spi.nameservice.dns.DNSNameService.class
                        .getClassLoader());
        System.out.println("class loader for this class: "
                + ClassLoader.class.getClassLoader());

        //System.out.println(com.mysql.jdbc.Blob.class.getClassLoader());
        Map<String, String> map = new HashMap<>();
        System.out.println("class loader for HashMap: "
                + new ClassLoader().getClass().getClassLoader());

    }
}
