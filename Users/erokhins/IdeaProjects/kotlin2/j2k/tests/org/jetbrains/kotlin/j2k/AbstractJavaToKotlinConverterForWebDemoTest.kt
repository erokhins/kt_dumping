'TestCase' @ [49:62] ==> public constructor TestCase() defined in junit.framework.TestCase[JavaClassConstructorDescriptor]

'newDisposable' @ [50:31] ==> @NotNull public open fun newDisposable(): Disposable defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'loadFile' @ [54:41] ==> @NotNull public open fun loadFile(@NotNull p0: File, p1: Boolean): String defined in com.intellij.openapi.util.io.FileUtil[JavaMethodDescriptor]

'File' @ [54:50] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'javaPath' @ [54:55] ==> value-parameter javaPath: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.doTest[ValueParameterDescriptorImpl]

'setUpJavaCoreEnvironment' @ [55:67] ==> public final fun setUpJavaCoreEnvironment(): JavaCoreProjectEnvironment defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest[SimpleFunctionDescriptorImpl]

'translateToKotlin' @ [56:13] ==> public fun translateToKotlin(code: String, project: Project): String defined in org.jetbrains.kotlin.j2k[DeserializedSimpleFunctionDescriptor]

'fileContents' @ [56:31] ==> val fileContents: String defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.doTest[LocalVariableDescriptor]

'javaCoreEnvironment' @ [56:45] ==> val javaCoreEnvironment: JavaCoreProjectEnvironment defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.doTest[LocalVariableDescriptor]

'project' @ [56:65] ==> public final val JavaCoreProjectEnvironment.project: MockProject[MyPropertyDescriptor]

'dispose' @ [59:22] ==> public open fun dispose(@NotNull p0: Disposable): Unit defined in com.intellij.openapi.util.Disposer[JavaMethodDescriptor]

'DISPOSABLE' @ [59:30] ==> public final val DISPOSABLE: Disposable defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest[PropertyDescriptorImpl]

'cleanRootArea' @ [64:20] ==> public open fun cleanRootArea(@NotNull p0: Disposable): Unit defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'DISPOSABLE' @ [64:34] ==> public final val DISPOSABLE: Disposable defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest[PropertyDescriptorImpl]

'getRootArea' @ [65:31] ==> @NotNull public open fun getRootArea(): ExtensionsArea defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'registerExtensionPoints' @ [67:9] ==> private final fun registerExtensionPoints(area: ExtensionsArea): Unit defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest[SimpleFunctionDescriptorImpl]

'area' @ [67:33] ==> val area: ExtensionsArea defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment[LocalVariableDescriptor]

'JavaCoreApplicationEnvironment' @ [69:38] ==> public constructor JavaCoreApplicationEnvironment(@NotNull p0: Disposable) defined in com.intellij.core.JavaCoreApplicationEnvironment[JavaClassConstructorDescriptor]

'DISPOSABLE' @ [69:69] ==> public final val DISPOSABLE: Disposable defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest[PropertyDescriptorImpl]

'JavaCoreProjectEnvironment' @ [70:44] ==> public constructor JavaCoreProjectEnvironment(p0: (Disposable..Disposable?), p1: (CoreApplicationEnvironment..CoreApplicationEnvironment?)) defined in com.intellij.core.JavaCoreProjectEnvironment[JavaClassConstructorDescriptor]

'DISPOSABLE' @ [70:71] ==> public final val DISPOSABLE: Disposable defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest[PropertyDescriptorImpl]

'applicationEnvironment' @ [70:83] ==> val applicationEnvironment: JavaCoreApplicationEnvironment defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment[LocalVariableDescriptor]

'getArea' @ [72:46] ==> @NotNull public open fun getArea(@Nullable p0: AreaInstance?): ExtensionsArea defined in com.intellij.openapi.extensions.Extensions[JavaMethodDescriptor]

'project' @ [72:54] ==> public final val <no name provided>.project: MockProject[MyPropertyDescriptor]

'registerExtensionPoint' @ [73:44] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(PsiTreeChangePreprocessor..PsiTreeChangePreprocessor?)>, @NotNull p2: Class<out (PsiTreeChangePreprocessor..PsiTreeChangePreprocessor?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiTreeChangePreprocessor

'projectArea' @ [73:67] ==> val projectArea: ExtensionsArea defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment.<no name provided>.preregisterServices[LocalVariableDescriptor]

'EP_NAME' @ [73:106] ==> public final val EP_NAME: (ExtensionPointName<(PsiTreeChangePreprocessor..PsiTreeChangePreprocessor?)>..ExtensionPointName<(PsiTreeChangePreprocessor..PsiTreeChangePreprocessor?)>?) defined in com.intellij.psi.impl.PsiTreeChangePreprocessor[JavaPropertyDescriptor]

'PsiTreeChangePreprocessor' @ [73:115] ==> public fun PsiTreeChangePreprocessor(function: (PsiTreeChangeEventImpl) -> Unit): PsiTreeChangePreprocessor defined in com.intellij.psi.impl[SimpleFunctionDescriptorImpl]

'java' @ [73:148] ==> public val <T> KClass<PsiTreeChangePreprocessor>.java: Class<PsiTreeChangePreprocessor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiTreeChangePreprocessor

'registerExtensionPoint' @ [74:44] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(PsiElementFinder..PsiElementFinder?)>, @NotNull p2: Class<out (PsiElementFinder..PsiElementFinder?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiElementFinder

'projectArea' @ [74:67] ==> val projectArea: ExtensionsArea defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment.<no name provided>.preregisterServices[LocalVariableDescriptor]

'EP_NAME' @ [74:97] ==> public final val EP_NAME: (ExtensionPointName<(PsiElementFinder..PsiElementFinder?)>..ExtensionPointName<(PsiElementFinder..PsiElementFinder?)>?) defined in com.intellij.psi.PsiElementFinder[JavaPropertyDescriptor]

'PsiElementFinder' @ [74:106] ==> public constructor PsiElementFinder() defined in com.intellij.psi.PsiElementFinder[JavaClassConstructorDescriptor]

'java' @ [74:130] ==> public val <T> KClass<PsiElementFinder>.java: Class<PsiElementFinder> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiElementFinder

'javaCoreEnvironment' @ [78:9] ==> val javaCoreEnvironment: <no name provided> defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment[LocalVariableDescriptor]

'project' @ [78:29] ==> public final val <no name provided>.project: MockProject[MyPropertyDescriptor]

'registerService' @ [78:37] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(NullableNotNullManager..NullableNotNullManager?)>, @NotNull p1: NullableNotNullManager): Unit defined in com.intellij.mock.MockProject[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> NullableNotNullManager

'NullableNotNullManager' @ [78:53] ==> public constructor NullableNotNullManager(p0: (Project..Project?)) defined in com.intellij.codeInsight.NullableNotNullManager[JavaClassConstructorDescriptor]

'java' @ [78:83] ==> public val <T> KClass<NullableNotNullManager>.java: Class<NullableNotNullManager> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> NullableNotNullManager

'NullableNotNullManager' @ [78:98] ==> public constructor NullableNotNullManager(p0: (Project..Project?)) defined in com.intellij.codeInsight.NullableNotNullManager[JavaClassConstructorDescriptor]

'javaCoreEnvironment' @ [78:121] ==> val javaCoreEnvironment: <no name provided> defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment[LocalVariableDescriptor]

'project' @ [78:141] ==> public final val <no name provided>.project: MockProject[MyPropertyDescriptor]

'!' @ [79:89] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNotNull' @ [79:90] ==> public open fun isNotNull(owner: PsiModifierListOwner, checkBases: Boolean): Boolean defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment.<no name provided>[SimpleFunctionDescriptorImpl]

'owner' @ [79:100] ==> value-parameter owner: PsiModifierListOwner defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment.<no name provided>.isNullable[ValueParameterDescriptorImpl]

'checkBases' @ [79:107] ==> value-parameter checkBases: Boolean defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment.<no name provided>.isNullable[ValueParameterDescriptorImpl]

'emptyList' @ [82:52] ==> public fun <T> emptyList(): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'applicationEnvironment' @ [85:9] ==> val applicationEnvironment: JavaCoreApplicationEnvironment defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment[LocalVariableDescriptor]

'application' @ [85:32] ==> public final val JavaCoreApplicationEnvironment.application: MockApplication[MyPropertyDescriptor]

'registerService' @ [85:44] ==> public open fun <T : (Any..Any?)> registerService(@NotNull p0: Class<(JavaClassSupers..JavaClassSupers?)>, @NotNull p1: Class<out (JavaClassSupers..JavaClassSupers?)>): Unit defined in com.intellij.mock.MockApplication[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JavaClassSupers

'JavaClassSupers' @ [85:60] ==> public constructor JavaClassSupers() defined in com.intellij.psi.util.JavaClassSupers[JavaClassConstructorDescriptor]

'java' @ [85:83] ==> public val <T> KClass<JavaClassSupers>.java: Class<JavaClassSupers> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JavaClassSupers

'JavaClassSupersImpl' @ [85:89] ==> public constructor JavaClassSupersImpl() defined in com.intellij.psi.impl.JavaClassSupersImpl[JavaClassConstructorDescriptor]

'java' @ [85:116] ==> public val <T> KClass<JavaClassSupersImpl>.java: Class<JavaClassSupersImpl> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JavaClassSupersImpl

'PathUtil' @ [87:22] ==> public object PathUtil defined in org.jetbrains.kotlin.utils[FakeCallableDescriptorForObject]

'getJdkClassesRootsFromCurrentJre' @ [87:31] ==> @JvmStatic public final fun getJdkClassesRootsFromCurrentJre(): List<File> defined in org.jetbrains.kotlin.utils.PathUtil[DeserializedSimpleFunctionDescriptor]

'javaCoreEnvironment' @ [88:13] ==> val javaCoreEnvironment: <no name provided> defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment[LocalVariableDescriptor]

'addJarToClassPath' @ [88:33] ==> public open fun addJarToClassPath(p0: (File..File?)): Unit defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment.<no name provided>[JavaMethodDescriptor]

'root' @ [88:51] ==> val root: File defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment[LocalVariableDescriptor]

'findAnnotations' @ [90:34] ==> public final fun findAnnotations(): File? defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest[SimpleFunctionDescriptorImpl]

'annotations' @ [91:13] ==> val annotations: File? defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment[LocalVariableDescriptor]

'annotations' @ [91:36] ==> val annotations: File? defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment[LocalVariableDescriptor]

'exists' @ [91:48] ==> public open fun exists(): Boolean defined in java.io.File[JavaMethodDescriptor]

'javaCoreEnvironment' @ [92:13] ==> val javaCoreEnvironment: <no name provided> defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment[LocalVariableDescriptor]

'addJarToClassPath' @ [92:33] ==> public open fun addJarToClassPath(p0: (File..File?)): Unit defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment.<no name provided>[JavaMethodDescriptor]

'annotations' @ [92:51] ==> val annotations: File? defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment[LocalVariableDescriptor]

'javaCoreEnvironment' @ [94:16] ==> val javaCoreEnvironment: <no name provided> defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.setUpJavaCoreEnvironment[LocalVariableDescriptor]

'registerExtensionPoint' @ [98:36] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: String, @NotNull p2: Class<out (FileTypeExtensionPoint<*>..FileTypeExtensionPoint<*>?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FileTypeExtensionPoint<*>

'area' @ [98:59] ==> value-parameter area: ExtensionsArea defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.registerExtensionPoints[ValueParameterDescriptorImpl]

'EP_NAME' @ [98:88] ==> public const final val EP_NAME: String defined in com.intellij.psi.stubs.BinaryFileStubBuilders[JavaPropertyDescriptor]

'FileTypeExtensionPoint' @ [98:97] ==> public constructor FileTypeExtensionPoint<T : (Any..Any?)>() defined in com.intellij.openapi.fileTypes.FileTypeExtensionPoint[JavaClassConstructorDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.Any..kotlin.Any?)

'java' @ [98:127] ==> public val <T> KClass<FileTypeExtensionPoint<*>>.java: Class<FileTypeExtensionPoint<*>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FileTypeExtensionPoint<*>

'registerExtensionPoint' @ [99:36] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(FileContextProvider..FileContextProvider?)>, @NotNull p2: Class<out (FileContextProvider..FileContextProvider?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> FileContextProvider

'area' @ [99:59] ==> value-parameter area: ExtensionsArea defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.registerExtensionPoints[ValueParameterDescriptorImpl]

'EP_NAME' @ [99:85] ==> public final val EP_NAME: (ExtensionPointName<(FileContextProvider..FileContextProvider?)>..ExtensionPointName<(FileContextProvider..FileContextProvider?)>?) defined in com.intellij.psi.FileContextProvider[JavaPropertyDescriptor]

'FileContextProvider' @ [99:94] ==> public constructor FileContextProvider() defined in com.intellij.psi.FileContextProvider[JavaClassConstructorDescriptor]

'java' @ [99:121] ==> public val <T> KClass<FileContextProvider>.java: Class<FileContextProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> FileContextProvider

'registerExtensionPoint' @ [101:36] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(MetaDataContributor..MetaDataContributor?)>, @NotNull p2: Class<out (MetaDataContributor..MetaDataContributor?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MetaDataContributor

'area' @ [101:59] ==> value-parameter area: ExtensionsArea defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.registerExtensionPoints[ValueParameterDescriptorImpl]

'EP_NAME' @ [101:85] ==> public final val EP_NAME: (ExtensionPointName<(MetaDataContributor..MetaDataContributor?)>..ExtensionPointName<(MetaDataContributor..MetaDataContributor?)>?) defined in com.intellij.psi.meta.MetaDataContributor[JavaPropertyDescriptor]

'MetaDataContributor' @ [101:94] ==> public fun MetaDataContributor(function: ((MetaDataRegistrar..MetaDataRegistrar?)) -> Unit): MetaDataContributor defined in com.intellij.psi.meta[SimpleFunctionDescriptorImpl]

'java' @ [101:121] ==> public val <T> KClass<MetaDataContributor>.java: Class<MetaDataContributor> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MetaDataContributor

'registerExtensionPoint' @ [102:36] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(PsiAugmentProvider..PsiAugmentProvider?)>, @NotNull p2: Class<out (PsiAugmentProvider..PsiAugmentProvider?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> PsiAugmentProvider

'area' @ [102:59] ==> value-parameter area: ExtensionsArea defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.registerExtensionPoints[ValueParameterDescriptorImpl]

'EP_NAME' @ [102:84] ==> public final val EP_NAME: (ExtensionPointName<(PsiAugmentProvider..PsiAugmentProvider?)>..ExtensionPointName<(PsiAugmentProvider..PsiAugmentProvider?)>?) defined in com.intellij.psi.augment.PsiAugmentProvider[JavaPropertyDescriptor]

'PsiAugmentProvider' @ [102:93] ==> public constructor PsiAugmentProvider() defined in com.intellij.psi.augment.PsiAugmentProvider[JavaClassConstructorDescriptor]

'java' @ [102:119] ==> public val <T> KClass<PsiAugmentProvider>.java: Class<PsiAugmentProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> PsiAugmentProvider

'registerExtensionPoint' @ [103:36] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(JavaMainMethodProvider..JavaMainMethodProvider?)>, @NotNull p2: Class<out (JavaMainMethodProvider..JavaMainMethodProvider?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JavaMainMethodProvider

'area' @ [103:59] ==> value-parameter area: ExtensionsArea defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.registerExtensionPoints[ValueParameterDescriptorImpl]

'EP_NAME' @ [103:88] ==> public final val EP_NAME: (ExtensionPointName<(JavaMainMethodProvider..JavaMainMethodProvider?)>..ExtensionPointName<(JavaMainMethodProvider..JavaMainMethodProvider?)>?) defined in com.intellij.codeInsight.runner.JavaMainMethodProvider[JavaPropertyDescriptor]

'java' @ [103:127] ==> public val <T> KClass<JavaMainMethodProvider>.java: Class<JavaMainMethodProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JavaMainMethodProvider

'registerExtensionPoint' @ [105:36] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(ContainerProvider..ContainerProvider?)>, @NotNull p2: Class<out (ContainerProvider..ContainerProvider?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ContainerProvider

'area' @ [105:59] ==> value-parameter area: ExtensionsArea defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.registerExtensionPoints[ValueParameterDescriptorImpl]

'EP_NAME' @ [105:83] ==> public final val EP_NAME: (ExtensionPointName<(ContainerProvider..ContainerProvider?)>..ExtensionPointName<(ContainerProvider..ContainerProvider?)>?) defined in com.intellij.codeInsight.ContainerProvider[JavaPropertyDescriptor]

'ContainerProvider' @ [105:92] ==> public fun ContainerProvider(function: (PsiElement) -> PsiElement?): ContainerProvider defined in com.intellij.codeInsight[SimpleFunctionDescriptorImpl]

'java' @ [105:117] ==> public val <T> KClass<ContainerProvider>.java: Class<ContainerProvider> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ContainerProvider

'registerExtensionPoint' @ [106:36] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(ClsCustomNavigationPolicy..ClsCustomNavigationPolicy?)>, @NotNull p2: Class<out (ClsCustomNavigationPolicy..ClsCustomNavigationPolicy?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> ClsCustomNavigationPolicy

'area' @ [106:59] ==> value-parameter area: ExtensionsArea defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.registerExtensionPoints[ValueParameterDescriptorImpl]

'EP_NAME' @ [106:91] ==> public final val EP_NAME: (ExtensionPointName<(ClsCustomNavigationPolicy..ClsCustomNavigationPolicy?)>..ExtensionPointName<(ClsCustomNavigationPolicy..ClsCustomNavigationPolicy?)>?) defined in com.intellij.psi.impl.compiled.ClsCustomNavigationPolicy[JavaPropertyDescriptor]

'java' @ [106:133] ==> public val <T> KClass<ClsCustomNavigationPolicy>.java: Class<ClsCustomNavigationPolicy> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> ClsCustomNavigationPolicy

'registerExtensionPoint' @ [107:36] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(ClassFileDecompilers.Decompiler..ClassFileDecompilers.Decompiler?)>, @NotNull p2: Class<out (ClassFileDecompilers.Decompiler..ClassFileDecompilers.Decompiler?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Decompiler

'area' @ [107:59] ==> value-parameter area: ExtensionsArea defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.registerExtensionPoints[ValueParameterDescriptorImpl]

'EP_NAME' @ [107:86] ==> public final val EP_NAME: (ExtensionPointName<(ClassFileDecompilers.Decompiler..ClassFileDecompilers.Decompiler?)>..ExtensionPointName<(ClassFileDecompilers.Decompiler..ClassFileDecompilers.Decompiler?)>?) defined in com.intellij.psi.compiled.ClassFileDecompilers[JavaPropertyDescriptor]

'Decompiler' @ [107:116] ==> public final fun Decompiler(function: (VirtualFile) -> Boolean): ClassFileDecompilers.Decompiler defined in com.intellij.psi.compiled.ClassFileDecompilers[SimpleFunctionDescriptorImpl]

'java' @ [107:134] ==> public val <T> KClass<ClassFileDecompilers.Decompiler>.java: Class<ClassFileDecompilers.Decompiler> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Decompiler

'registerExtensionPoint' @ [109:36] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(TypeAnnotationModifier..TypeAnnotationModifier?)>, @NotNull p2: Class<out (TypeAnnotationModifier..TypeAnnotationModifier?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> TypeAnnotationModifier

'area' @ [109:59] ==> value-parameter area: ExtensionsArea defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.registerExtensionPoints[ValueParameterDescriptorImpl]

'EP_NAME' @ [109:88] ==> public final val EP_NAME: (ExtensionPointName<(TypeAnnotationModifier..TypeAnnotationModifier?)>..ExtensionPointName<(TypeAnnotationModifier..TypeAnnotationModifier?)>?) defined in com.intellij.psi.augment.TypeAnnotationModifier[JavaPropertyDescriptor]

'TypeAnnotationModifier' @ [109:97] ==> public constructor TypeAnnotationModifier() defined in com.intellij.psi.augment.TypeAnnotationModifier[JavaClassConstructorDescriptor]

'java' @ [109:127] ==> public val <T> KClass<TypeAnnotationModifier>.java: Class<TypeAnnotationModifier> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> TypeAnnotationModifier

'registerExtensionPoint' @ [110:36] ==> public open fun <T : (Any..Any?)> registerExtensionPoint(@NotNull p0: ExtensionsArea, @NotNull p1: ExtensionPointName<(MetaLanguage..MetaLanguage?)>, @NotNull p2: Class<out (MetaLanguage..MetaLanguage?)>): Unit defined in com.intellij.core.CoreApplicationEnvironment[JavaMethodDescriptor]
Inferred types:
    <T : (Any..Any?)> -> MetaLanguage

'area' @ [110:59] ==> value-parameter area: ExtensionsArea defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.registerExtensionPoints[ValueParameterDescriptorImpl]

'EP_NAME' @ [110:78] ==> public final val EP_NAME: (ExtensionPointName<(MetaLanguage..MetaLanguage?)>..ExtensionPointName<(MetaLanguage..MetaLanguage?)>?) defined in com.intellij.lang.MetaLanguage[JavaPropertyDescriptor]

'MetaLanguage' @ [110:87] ==> protected/*protected and package*/ constructor MetaLanguage(@NotNull p0: String) defined in com.intellij.lang.MetaLanguage[JavaClassConstructorDescriptor]

'java' @ [110:107] ==> public val <T> KClass<MetaLanguage>.java: Class<MetaLanguage> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MetaLanguage

'JavaToKotlinTranslator' @ [114:27] ==> public object JavaToKotlinTranslator defined in org.jetbrains.kotlin.j2k[FakeCallableDescriptorForObject]

'java' @ [114:57] ==> public val <T> KClass<JavaToKotlinTranslator>.java: Class<JavaToKotlinTranslator> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JavaToKotlinTranslator

'classLoader' @ [114:62] ==> public final val <T : (Any..Any?)> Class<JavaToKotlinTranslator>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> JavaToKotlinTranslator

'classLoader' @ [115:16] ==> var classLoader: (ClassLoader..ClassLoader?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.findAnnotations[LocalVariableDescriptor]

'classLoader' @ [116:26] ==> var classLoader: (ClassLoader..ClassLoader?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.findAnnotations[LocalVariableDescriptor]

'loader' @ [117:17] ==> val loader: (ClassLoader..ClassLoader?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.findAnnotations[LocalVariableDescriptor]

'loader' @ [118:29] ==> val loader: (ClassLoader..ClassLoader?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.findAnnotations[LocalVariableDescriptor]

'urLs' @ [118:36] ==> public final val URLClassLoader.urLs: (Array<(URL..URL?)>..Array<out (URL..URL?)>?)[MyPropertyDescriptor]

'==' @ [119:25] ==> public open fun equals(other: Any?): Boolean defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'url' @ [119:35] ==> val url: (URL..URL?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.findAnnotations[LocalVariableDescriptor]

'protocol' @ [119:39] ==> public final val URL.protocol: (String..String?)[MyPropertyDescriptor]

'url' @ [119:51] ==> val url: (URL..URL?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.findAnnotations[LocalVariableDescriptor]

'file' @ [119:55] ==> public final val URL.file: (String..String?)[MyPropertyDescriptor]

'endsWith' @ [119:62] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'File' @ [120:32] ==> public constructor File(p0: (String..String?)) defined in java.io.File[JavaClassConstructorDescriptor]

'url' @ [120:37] ==> val url: (URL..URL?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.findAnnotations[LocalVariableDescriptor]

'file' @ [120:41] ==> public final val URL.file: (String..String?)[MyPropertyDescriptor]

'classLoader' @ [124:13] ==> var classLoader: (ClassLoader..ClassLoader?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.findAnnotations[LocalVariableDescriptor]

'classLoader' @ [124:27] ==> var classLoader: (ClassLoader..ClassLoader?) defined in org.jetbrains.kotlin.j2k.AbstractJavaToKotlinConverterForWebDemoTest.findAnnotations[LocalVariableDescriptor]

'parent' @ [124:39] ==> public final val ClassLoader.parent: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

