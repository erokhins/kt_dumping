'ClassLoader' @ [23:78] ==> protected/*protected and package*/ constructor ClassLoader(p0: (ClassLoader..ClassLoader?)) defined in java.lang.ClassLoader[JavaClassConstructorDescriptor]

'currentThread' @ [23:97] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [23:113] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'SelfThenParentURLClassLoader' @ [24:66] ==> public constructor SelfThenParentURLClassLoader(urls: Array<URL>, onFail: ClassLoader) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader.SelfThenParentURLClassLoader[ClassConstructorDescriptorImpl]

'urls' @ [24:95] ==> value-parameter urls: Array<URL> defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader.<init>[ValueParameterDescriptorImpl]

'parent' @ [24:101] ==> value-parameter parent: ClassLoader defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader.<init>[ValueParameterDescriptorImpl]

'Synchronized' @ [26:5] ==> public constructor Synchronized() defined in kotlin.jvm.Synchronized[DeserializedClassConstructorDescriptor]

'childClassLoader' @ [29:13] ==> private final val childClassLoader: PluginURLClassLoader.SelfThenParentURLClassLoader defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader[PropertyDescriptorImpl]

'findClass' @ [29:30] ==> public open fun findClass(name: String): Class<*> defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader.SelfThenParentURLClassLoader[SimpleFunctionDescriptorImpl]

'name' @ [29:40] ==> value-parameter name: String defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader.loadClass[ValueParameterDescriptorImpl]

'super' @ [32:13] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader[LazyClassReceiverParameterDescriptor]

'loadClass' @ [32:19] ==> protected/*protected and package*/ open fun loadClass(p0: (String..String?), p1: Boolean): (Class<*>..Class<*>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'name' @ [32:29] ==> value-parameter name: String defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader.loadClass[ValueParameterDescriptorImpl]

'resolve' @ [32:35] ==> value-parameter resolve: Boolean defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader.loadClass[ValueParameterDescriptorImpl]

'childClassLoader' @ [36:65] ==> private final val childClassLoader: PluginURLClassLoader.SelfThenParentURLClassLoader defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader[PropertyDescriptorImpl]

'getResources' @ [36:82] ==> public open fun getResources(p0: (String..String?)): (Enumeration<(URL..URL?)>..Enumeration<(URL..URL?)>?) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader.SelfThenParentURLClassLoader[JavaMethodDescriptor]

'name' @ [36:95] ==> value-parameter name: String defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader.getResources[ValueParameterDescriptorImpl]

'URLClassLoader' @ [38:101] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'urls' @ [38:116] ==> value-parameter urls: Array<URL> defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader.SelfThenParentURLClassLoader.<init>[ValueParameterDescriptorImpl]

'findLoadedClass' @ [41:26] ==> protected/*protected and package*/ final fun findLoadedClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader.SelfThenParentURLClassLoader[JavaMethodDescriptor]

'name' @ [41:42] ==> value-parameter name: String defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader.SelfThenParentURLClassLoader.findClass[ValueParameterDescriptorImpl]

'loaded' @ [42:17] ==> val loaded: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader.SelfThenParentURLClassLoader.findClass[LocalVariableDescriptor]

'loaded' @ [43:24] ==> val loaded: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader.SelfThenParentURLClassLoader.findClass[LocalVariableDescriptor]

'super' @ [47:17] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader.SelfThenParentURLClassLoader[LazyClassReceiverParameterDescriptor]

'findClass' @ [47:23] ==> protected/*protected and package*/ open fun findClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.net.URLClassLoader[JavaMethodDescriptor]

'name' @ [47:33] ==> value-parameter name: String defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader.SelfThenParentURLClassLoader.findClass[ValueParameterDescriptorImpl]

'onFail' @ [50:17] ==> private final val onFail: ClassLoader defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader.SelfThenParentURLClassLoader[PropertyDescriptorImpl]

'loadClass' @ [50:24] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'name' @ [50:34] ==> value-parameter name: String defined in org.jetbrains.kotlin.cli.jvm.plugins.PluginURLClassLoader.SelfThenParentURLClassLoader.findClass[ValueParameterDescriptorImpl]

