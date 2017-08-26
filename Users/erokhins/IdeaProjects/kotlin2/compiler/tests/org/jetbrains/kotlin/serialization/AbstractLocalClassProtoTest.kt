'TestCaseWithTmpdir' @ [34:46] ==> public constructor TestCaseWithTmpdir() defined in org.jetbrains.kotlin.test.TestCaseWithTmpdir[JavaClassConstructorDescriptor]

'File' @ [36:22] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'filename' @ [36:27] ==> value-parameter filename: String defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.doTest[ValueParameterDescriptorImpl]

'createEnvironmentWithMockJdkAndIdeaAnnotations' @ [38:25] ==> @NotNull public open fun createEnvironmentWithMockJdkAndIdeaAnnotations(p0: (Disposable..Disposable?)): KotlinCoreEnvironment defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'testRootDisposable' @ [38:72] ==> public final val AbstractLocalClassProtoTest.testRootDisposable: Disposable[MyPropertyDescriptor]

'let' @ [38:92] ==> @InlineOnly public inline fun <T, R> KotlinCoreEnvironment.let(block: (KotlinCoreEnvironment) -> ModuleDescriptor): ModuleDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCoreEnvironment
    <R> -> ModuleDescriptor

'compileKotlinToDirAndGetModule' @ [39:32] ==> @NotNull public open fun compileKotlinToDirAndGetModule(@NotNull p0: (MutableList<(File..File?)>..List<(File..File?)>), @NotNull p1: File, @NotNull p2: KotlinCoreEnvironment): ModuleDescriptor defined in org.jetbrains.kotlin.jvm.compiler.LoadDescriptorUtil[JavaMethodDescriptor]

'listOf' @ [39:63] ==> public fun <T> listOf(element: File): List<File> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'source' @ [39:70] ==> val source: File defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.doTest[LocalVariableDescriptor]

'tmpdir' @ [39:79] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest[JavaPropertyDescriptor]

'environment' @ [39:87] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'?:' @ [42:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: String?, right: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> String

'findStringWithPrefixes' @ [42:53] ==> @Nullable public open fun findStringWithPrefixes(p0: (String..String?), vararg p1: (String..String?)): String? defined in org.jetbrains.kotlin.test.InTextDirectivesUtils[JavaMethodDescriptor]

'source' @ [42:76] ==> val source: File defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.doTest[LocalVariableDescriptor]

'readText' @ [42:83] ==> public fun File.readText(charset: Charset = ...): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'error' @ [43:34] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'URLClassLoader' @ [45:27] ==> public constructor URLClassLoader(p0: (Array<(URL..URL?)>..Array<out (URL..URL?)>?), p1: (ClassLoader..ClassLoader?)) defined in java.net.URLClassLoader[JavaClassConstructorDescriptor]

'arrayOf' @ [45:42] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: (URL..URL?)): Array<(URL..URL?)> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> (java.net.URL..java.net.URL?)

'tmpdir' @ [45:50] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest[JavaPropertyDescriptor]

'toURI' @ [45:57] ==> public open fun toURI(): (URI..URI?) defined in java.io.File[JavaMethodDescriptor]

'toURL' @ [45:65] ==> public open fun toURL(): (URL..URL?) defined in java.net.URI[JavaMethodDescriptor]

'runtimeAndReflectJarClassLoader' @ [45:97] ==> @NotNull public open fun runtimeAndReflectJarClassLoader(): ClassLoader defined in org.jetbrains.kotlin.codegen.forTestCompile.ForTestCompileRuntime[JavaMethodDescriptor]

'tmpdir' @ [47:25] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest[JavaPropertyDescriptor]

'walkTopDown' @ [47:32] ==> public fun File.walkTopDown(): FileTreeWalk defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'singleOrNull' @ [47:46] ==> public inline fun <T> Sequence<File>.singleOrNull(predicate: (File) -> Boolean): File? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> File

'it' @ [47:61] ==> value-parameter it: File defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.doTest.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [47:64] ==> public final val File.path: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [47:69] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'classNameSuffix' @ [47:80] ==> val classNameSuffix: String defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.doTest[LocalVariableDescriptor]

'error' @ [48:28] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'classNameSuffix' @ [48:61] ==> val classNameSuffix: String defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.doTest[LocalVariableDescriptor]

'tmpdir' @ [48:97] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest[JavaPropertyDescriptor]

'listFiles' @ [48:104] ==> public open fun listFiles(): (Array<(File..File?)>..Array<out (File..File?)>?) defined in java.io.File[JavaMethodDescriptor]

'toList' @ [48:116] ==> public fun <T> Array<out (File..File?)>.toList(): List<(File..File?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.io.File..java.io.File?)

'classLoader' @ [49:21] ==> val classLoader: URLClassLoader defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.doTest[LocalVariableDescriptor]

'loadClass' @ [49:33] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.net.URLClassLoader[JavaMethodDescriptor]

'classFile' @ [49:43] ==> val classFile: File defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.doTest[LocalVariableDescriptor]

'toRelativeString' @ [49:53] ==> public fun File.toRelativeString(base: File): String defined in kotlin.io[DeserializedSimpleFunctionDescriptor]

'tmpdir' @ [49:70] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest[JavaPropertyDescriptor]

'substringBeforeLast' @ [49:78] ==> public fun String.substringBeforeLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [49:108] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'replace' @ [49:126] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'assertHasAnnotationData' @ [50:9] ==> @Suppress private final fun assertHasAnnotationData(clazz: Class<*>): Unit defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest[SimpleFunctionDescriptorImpl]

'clazz' @ [50:33] ==> val clazz: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.doTest[LocalVariableDescriptor]

'newConfiguration' @ [52:45] ==> @NotNull public open fun newConfiguration(@NotNull p0: ConfigurationKind, @NotNull p1: TestJdkKind, @NotNull vararg p2: (File..File?)): CompilerConfiguration defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'ALL' @ [52:80] ==> enum entry ALL defined in org.jetbrains.kotlin.test.ConfigurationKind[FakeCallableDescriptorForObject]

'MOCK_JDK' @ [52:97] ==> enum entry MOCK_JDK defined in org.jetbrains.kotlin.test.TestJdkKind[FakeCallableDescriptorForObject]

'tmpdir' @ [52:107] ==> protected/*protected and package*/ final var tmpdir: (File..File?) defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest[JavaPropertyDescriptor]

'apply' @ [52:115] ==> @InlineOnly public inline fun <T> CompilerConfiguration.apply(block: (CompilerConfiguration).() -> Unit): CompilerConfiguration defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompilerConfiguration

'put' @ [56:13] ==> public open fun <T : (Any..Any?)> put(@NotNull p0: CompilerConfigurationKey<(Boolean..Boolean?)>, @NotNull p1: Boolean): Unit defined in org.jetbrains.kotlin.config.CompilerConfiguration[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Boolean

'USE_SINGLE_MODULE' @ [56:38] ==> public final val USE_SINGLE_MODULE: (CompilerConfigurationKey<(Boolean..Boolean?)>..CompilerConfigurationKey<(Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.config.JVMConfigurationKeys[JavaPropertyDescriptor]

'KotlinCoreEnvironment' @ [58:27] ==> public companion object defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment[FakeCallableDescriptorForObject]

'createForTests' @ [58:49] ==> @JvmStatic public final fun createForTests(parentDisposable: Disposable, configuration: CompilerConfiguration, extensionConfigs: EnvironmentConfigFiles): KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.compiler.KotlinCoreEnvironment.Companion[DeserializedSimpleFunctionDescriptor]

'testRootDisposable' @ [58:64] ==> public final val AbstractLocalClassProtoTest.testRootDisposable: Disposable[MyPropertyDescriptor]

'configuration' @ [58:84] ==> val configuration: CompilerConfiguration defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.doTest[LocalVariableDescriptor]

'JVM_CONFIG_FILES' @ [58:122] ==> enum entry JVM_CONFIG_FILES defined in org.jetbrains.kotlin.cli.jvm.compiler.EnvironmentConfigFiles[FakeCallableDescriptorForObject]

'JvmResolveUtil' @ [60:26] ==> public object JvmResolveUtil defined in org.jetbrains.kotlin.resolve.lazy[FakeCallableDescriptorForObject]

'createContainer' @ [60:41] ==> @JvmStatic @JvmOverloads public final fun createContainer(environment: KotlinCoreEnvironment, files: Collection<KtFile> = ...): ComponentProvider defined in org.jetbrains.kotlin.resolve.lazy.JvmResolveUtil[DeserializedSimpleFunctionDescriptor]

'environment' @ [60:57] ==> val environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.doTest[LocalVariableDescriptor]

'get' @ [60:70] ==> public inline fun <reified T : Any> ComponentProvider.get(): DeserializationComponentsForJava defined in org.jetbrains.kotlin.container[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T : Any> -> DeserializationComponentsForJava

'components' @ [60:110] ==> public final val components: DeserializationComponents defined in org.jetbrains.kotlin.load.kotlin.DeserializationComponentsForJava[DeserializedPropertyDescriptor]

'components' @ [62:31] ==> val components: DeserializationComponents defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.doTest[LocalVariableDescriptor]

'classDeserializer' @ [62:42] ==> public final val classDeserializer: ClassDeserializer defined in org.jetbrains.kotlin.serialization.deserialization.DeserializationComponents[DeserializedPropertyDescriptor]

'deserializeClass' @ [62:60] ==> public final fun deserializeClass(classId: ClassId, classDataWithSource: ClassDataWithSource? = ...): ClassDescriptor? defined in org.jetbrains.kotlin.serialization.deserialization.ClassDeserializer[DeserializedSimpleFunctionDescriptor]

'clazz' @ [62:77] ==> val clazz: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.doTest[LocalVariableDescriptor]

'classId' @ [62:83] ==> public val Class<*>.classId: ClassId defined in org.jetbrains.kotlin.load.java.structure.reflect[DeserializedPropertyDescriptor]

'error' @ [63:34] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'clazz' @ [63:65] ==> val clazz: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.doTest[LocalVariableDescriptor]

'clazz' @ [63:84] ==> val clazz: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.doTest[LocalVariableDescriptor]

'classId' @ [63:90] ==> public val Class<*>.classId: ClassId defined in org.jetbrains.kotlin.load.java.structure.reflect[DeserializedPropertyDescriptor]

'validateAndCompareDescriptorWithFile' @ [65:39] ==> public open fun validateAndCompareDescriptorWithFile(@NotNull p0: DeclarationDescriptor, @NotNull p1: RecursiveDescriptorComparator.Configuration, @NotNull p2: File): Unit defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator[JavaMethodDescriptor]

'classDescriptor' @ [66:17] ==> val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.doTest[LocalVariableDescriptor]

'DONT_INCLUDE_METHODS_OF_OBJECT' @ [67:47] ==> public final val DONT_INCLUDE_METHODS_OF_OBJECT: (RecursiveDescriptorComparator.Configuration..RecursiveDescriptorComparator.Configuration?) defined in org.jetbrains.kotlin.test.util.RecursiveDescriptorComparator[JavaPropertyDescriptor]

'replaceExtension' @ [68:33] ==> @NotNull public open fun replaceExtension(@NotNull p0: File, @Nullable p1: String?): File defined in org.jetbrains.kotlin.test.KotlinTestUtils[JavaMethodDescriptor]

'source' @ [68:50] ==> val source: File defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.doTest[LocalVariableDescriptor]

'Suppress' @ [72:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'checkNotNull' @ [74:9] ==> @InlineOnly public inline fun <T : Any> checkNotNull(value: Annotation?, lazyMessage: () -> Any): Annotation defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Annotation

'clazz' @ [74:22] ==> value-parameter clazz: Class<*> defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.assertHasAnnotationData[ValueParameterDescriptorImpl]

'getAnnotation' @ [74:28] ==> public open fun <A : (Annotation..Annotation?)> getAnnotation(p0: (Class<(Annotation..Annotation?)>..Class<(Annotation..Annotation?)>?)): (Annotation..Annotation?) defined in java.lang.Class[JavaMethodDescriptor]
Inferred types:
    <A : (Annotation..Annotation?)> -> Annotation

'clazz' @ [75:17] ==> value-parameter clazz: Class<*> defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.assertHasAnnotationData[ValueParameterDescriptorImpl]

'classLoader' @ [75:23] ==> public final val <T : (Any..Any?)> Class<out (Any..Any?)>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'loadClass' @ [75:35] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in java.lang.ClassLoader[JavaMethodDescriptor]

'METADATA_FQ_NAME' @ [75:64] ==> public final val METADATA_FQ_NAME: (FqName..FqName?) defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'asString' @ [75:81] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'clazz' @ [76:59] ==> value-parameter clazz: Class<*> defined in org.jetbrains.kotlin.serialization.AbstractLocalClassProtoTest.assertHasAnnotationData[ValueParameterDescriptorImpl]

