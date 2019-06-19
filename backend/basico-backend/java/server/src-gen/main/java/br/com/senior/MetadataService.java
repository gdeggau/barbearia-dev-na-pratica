package br.com.senior;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Properties;
import java.util.Set;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.reflections.Reflections;
import org.reflections.scanners.ResourcesScanner;
import org.reflections.util.ClasspathHelper;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Lazy
@Service
public class MetadataService {

	private static final List<Service> OWN_SERVICES = Arrays.asList(
		new Service("furb", "basico", ArtifactInfo.getVersion())
	);

	private Set<Service> dependencies;
	
	public String getMetadata(String domain, String service, String format) throws IOException {
		try (InputStream streamWithDomain = getClass().getClassLoader()
				.getResourceAsStream(String.format("%s_%s.%s", domain, service, format));
				InputStream stream = getClass().getClassLoader()
						.getResourceAsStream(String.format("%s.%s", service, format))) {

			if (Objects.isNull(streamWithDomain) && Objects.isNull(stream)) {
				throw new IllegalArgumentException("No metadata available in format " + format);
			}
			String ret = IOUtils.toString(streamWithDomain != null ? streamWithDomain : stream, "UTF-8");
			return ret.replaceAll("\\$\\{version\\}", ArtifactInfo.getVersion());
		}
	}
	
	public Set<Service> getDependencies() {
		if (dependencies == null) {
			dependencies = discoverDependencies();
		}
		return dependencies;
	}
	
	private Set<Service> discoverDependencies() {
		Reflections ref = new Reflections(ClasspathHelper.forJavaClassPath(), new ResourcesScanner());
		Set<String> resources = ref.getResources(Pattern.compile("service-info.properties"));
	
		Set<Service> dependencies = new LinkedHashSet<>();
		
		for (String resource : resources) {
			Properties properties = new Properties();
			try {
				properties.load(this.getClass().getClassLoader().getResourceAsStream(resource));
			} catch (IOException e) {
				throw new ServiceDependenceException("Error loading service-info.properties file", e);
			}
			
			Service service = new Service(properties.getProperty("domain"), properties.getProperty("service"), properties.getProperty("version"));
			if (!OWN_SERVICES.contains(service)) {
				dependencies.add(service);
			}
		}
		
		return dependencies;
	}
	
	public static final class Service {
		private final String domain;
		private final String service;
		private final String version;
		
		public Service(String domain, String service, String version) {
			this.domain = domain;
			this.service = service;
			this.version = version;
		}
		
		public String getDomain() {
			return domain;
		}
		public String getService() {
			return service;
		}
		public String getVersion() {
			return version;
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((domain == null) ? 0 : domain.hashCode());
			result = prime * result + ((service == null) ? 0 : service.hashCode());
			result = prime * result + ((version == null) ? 0 : version.hashCode());
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj) return true;
			if (obj == null) return false;
			if (getClass() != obj.getClass()) return false;
			
			Service other = (Service) obj;
			if (domain == null) {
				if (other.domain != null) return false;
			} else if (!domain.equals(other.domain)) return false;
			
			if (service == null) {
				if (other.service != null) return false;
			} else if (!service.equals(other.service)) return false;
			
			if (version == null) {
				if (other.version != null) return false;
			} else if (!version.equals(other.version)) return false;
			
			return true;
		}
	}
}

