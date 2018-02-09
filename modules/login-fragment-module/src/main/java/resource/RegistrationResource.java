package resource;

import com.liferay.portal.kernel.util.AggregateResourceBundleLoader;
import com.liferay.portal.kernel.util.CacheResourceBundleLoader;
import com.liferay.portal.kernel.util.ClassResourceBundleLoader;
import com.liferay.portal.kernel.util.ResourceBundleLoader;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.util.ResourceBundle;

/**
 * @author Jan Brychta
 */
@Component(
        immediate = true,
        property = {
                "bundle.symbolic.name=com.liferay.login.web",
                "resource.bundle.base.name=content.Language",
                "servlet.context.name=com.liferay.login.web"
        }
)
public class RegistrationResource implements ResourceBundleLoader {

    private ResourceBundleLoader _resourceBundleLoader;

    @Reference(target = "(&(bundle.symbolic.name=com.liferay.login.web)(!(component.name=RegistrationResource)))")
    public void setResourceBundleLoader(
            ResourceBundleLoader resourceBundleLoader) {

        _resourceBundleLoader = new AggregateResourceBundleLoader(
                new CacheResourceBundleLoader(
                        new ClassResourceBundleLoader(
                                "content.Language",
                                RegistrationResource.class.getClassLoader())),
                resourceBundleLoader);
    }

    @Override
    public ResourceBundle loadResourceBundle(String languageId) {
        return _resourceBundleLoader.loadResourceBundle(languageId);
    }
}
