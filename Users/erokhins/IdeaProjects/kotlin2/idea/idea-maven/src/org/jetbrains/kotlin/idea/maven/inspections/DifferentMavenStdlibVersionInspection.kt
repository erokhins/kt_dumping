'DomElementsInspection<MavenDomProjectModel>' @ [36:47] ==> public constructor DomElementsInspection<T : (DomElement..DomElement?)>(p0: (Class<out (MavenDomProjectModel..MavenDomProjectModel?)>..Class<out (MavenDomProjectModel..MavenDomProjectModel?)>?), @NotNull vararg p1: (Class<out (MavenDomProjectModel..MavenDomProjectModel?)>..Class<out (MavenDomProjectModel..MavenDomProjectModel?)>?)) defined in com.intellij.util.xml.highlighting.DomElementsInspection[JavaClassConstructorDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> MavenDomProjectModel

'java' @ [36:119] ==> public val <T> KClass<MavenDomProjectModel>.java: Class<MavenDomProjectModel> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> MavenDomProjectModel

'domFileElement' @ [38:13] ==> value-parameter domFileElement: DomFileElement<MavenDomProjectModel>? defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[ValueParameterDescriptorImpl]

'holder' @ [38:39] ==> value-parameter holder: DomElementAnnotationHolder? defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[ValueParameterDescriptorImpl]

'domFileElement' @ [42:20] ==> value-parameter domFileElement: DomFileElement<MavenDomProjectModel>? defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[ValueParameterDescriptorImpl]

'file' @ [42:35] ==> public final val <T : (DomElement..DomElement?)> DomFileElement<MavenDomProjectModel>.file: XmlFile[MyPropertyDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> MavenDomProjectModel

'domFileElement' @ [43:22] ==> value-parameter domFileElement: DomFileElement<MavenDomProjectModel>? defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[ValueParameterDescriptorImpl]

'module' @ [43:37] ==> public final val <T : (DomElement..DomElement?)> DomFileElement<MavenDomProjectModel>.module: Module?[MyPropertyDescriptor]
Inferred types:
    <T : (DomElement..DomElement?)> -> MavenDomProjectModel

'?:' @ [44:23] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: MavenProjectsManager?, right: MavenProjectsManager): MavenProjectsManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> MavenProjectsManager

'getInstance' @ [44:44] ==> public open fun getInstance(p0: (Project..Project?)): (MavenProjectsManager..MavenProjectsManager?) defined in org.jetbrains.idea.maven.project.MavenProjectsManager[JavaMethodDescriptor]

'module' @ [44:56] ==> val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'project' @ [44:63] ==> public final val Module.project: Project[MyPropertyDescriptor]

'manager' @ [45:23] ==> val manager: MavenProjectsManager defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'findProject' @ [45:31] ==> @Nullable public open fun findProject(@NotNull p0: Module): MavenProject? defined in org.jetbrains.idea.maven.project.MavenProjectsManager[JavaMethodDescriptor]

'module' @ [45:43] ==> val module: Module defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'project' @ [47:29] ==> val project: MavenProject defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'findDependencies' @ [47:37] ==> @NotNull public open fun findDependencies(@Nullable p0: String?, @Nullable p1: String?): (MutableList<(MavenArtifact..MavenArtifact?)>..List<(MavenArtifact..MavenArtifact?)>) defined in org.jetbrains.idea.maven.project.MavenProject[JavaMethodDescriptor]

'GROUP_ID' @ [47:78] ==> public final val GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'MAVEN_STDLIB_ID' @ [47:88] ==> public val MAVEN_STDLIB_ID: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'map' @ [47:105] ==> public inline fun <T, R> Iterable<(MavenArtifact..MavenArtifact?)>.map(transform: ((MavenArtifact..MavenArtifact?)) -> (String..String?)): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.model.MavenArtifact..org.jetbrains.idea.maven.model.MavenArtifact?)
    <R> -> (kotlin.String..kotlin.String?)

'it' @ [47:111] ==> value-parameter it: (MavenArtifact..MavenArtifact?) defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [47:114] ==> public final val MavenArtifact.version: (String..String?)[MyPropertyDescriptor]

'distinct' @ [47:124] ==> public fun <T> Iterable<(String..String?)>.distinct(): List<(String..String?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'project' @ [48:29] ==> val project: MavenProject defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'findPlugin' @ [48:37] ==> @Nullable public open fun findPlugin(@Nullable p0: String?, @Nullable p1: String?): MavenPlugin? defined in org.jetbrains.idea.maven.project.MavenProject[JavaMethodDescriptor]

'GROUP_ID' @ [48:72] ==> public final val GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'MAVEN_PLUGIN_ID' @ [48:106] ==> public final val MAVEN_PLUGIN_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'version' @ [48:124] ==> public final val MavenPlugin.version: (String..String?)[MyPropertyDescriptor]

'pluginVersion' @ [50:13] ==> val pluginVersion: String? defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'stdlibVersion' @ [50:38] ==> val stdlibVersion: List<(String..String?)> defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'isEmpty' @ [50:52] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'stdlibVersion' @ [50:65] ==> val stdlibVersion: List<(String..String?)> defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'singleOrNull' @ [50:79] ==> public fun <T> List<(String..String?)>.singleOrNull(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'pluginVersion' @ [50:97] ==> val pluginVersion: String? defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'?:' @ [54:23] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: PomFile?, right: PomFile): PomFile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> PomFile

'forFileOrNull' @ [54:31] ==> public final fun forFileOrNull(xmlFile: XmlFile): PomFile? defined in org.jetbrains.kotlin.idea.maven.PomFile.Companion[SimpleFunctionDescriptorImpl]

'file' @ [54:45] ==> val file: XmlFile defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'pomFile' @ [55:9] ==> val pomFile: PomFile defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'findKotlinPlugins' @ [55:17] ==> public final fun findKotlinPlugins(): List<(MavenDomPlugin..MavenDomPlugin?)> defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'filter' @ [55:37] ==> public inline fun <T> Iterable<(MavenDomPlugin..MavenDomPlugin?)>.filter(predicate: ((MavenDomPlugin..MavenDomPlugin?)) -> Boolean): List<(MavenDomPlugin..MavenDomPlugin?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomPlugin..org.jetbrains.idea.maven.dom.model.MavenDomPlugin?)

'it' @ [55:46] ==> value-parameter it: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [55:49] ==> public final val MavenDomPlugin.version: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [55:57] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'stdlibVersion' @ [55:72] ==> val stdlibVersion: List<(String..String?)> defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'singleOrNull' @ [55:86] ==> public fun <T> List<(String..String?)>.singleOrNull(): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'forEach' @ [55:103] ==> @HidesMembers public inline fun <T> Iterable<(MavenDomPlugin..MavenDomPlugin?)>.forEach(action: ((MavenDomPlugin..MavenDomPlugin?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomPlugin..org.jetbrains.idea.maven.dom.model.MavenDomPlugin?)

'plugin' @ [56:25] ==> value-parameter plugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [56:32] ==> public final val MavenDomPlugin.version: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [56:40] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'let' @ [56:53] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> List<DifferentMavenStdlibVersionInspection.SetVersionQuickFix>): List<DifferentMavenStdlibVersionInspection.SetVersionQuickFix> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> List<SetVersionQuickFix>

'createFixes' @ [57:17] ==> private final fun createFixes(project: MavenProject, versionElement: GenericDomValue<*>, versions: List<String>): List<DifferentMavenStdlibVersionInspection.SetVersionQuickFix> defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection[SimpleFunctionDescriptorImpl]

'project' @ [57:29] ==> val project: MavenProject defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'plugin' @ [57:38] ==> value-parameter plugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [57:45] ==> public final val MavenDomPlugin.version: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stdlibVersion' @ [57:54] ==> val stdlibVersion: List<(String..String?)> defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'version' @ [57:70] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'emptyList' @ [58:18] ==> public fun <T> emptyList(): List<DifferentMavenStdlibVersionInspection.SetVersionQuickFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SetVersionQuickFix

'holder' @ [60:13] ==> value-parameter holder: DomElementAnnotationHolder? defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[ValueParameterDescriptorImpl]

'createProblem' @ [60:20] ==> public abstract fun createProblem(@NotNull p0: DomElement, p1: (HighlightSeverity..HighlightSeverity?), p2: (String..String?), vararg p3: (LocalQuickFix..LocalQuickFix?)): (DomElementProblemDescriptor..DomElementProblemDescriptor?) defined in com.intellij.util.xml.highlighting.DomElementAnnotationHolder[JavaMethodDescriptor]

'plugin' @ [60:34] ==> value-parameter plugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [60:41] ==> public final val MavenDomPlugin.version: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'WARNING' @ [61:52] ==> public final val WARNING: (HighlightSeverity..HighlightSeverity?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'plugin' @ [62:53] ==> value-parameter plugin: (MavenDomPlugin..MavenDomPlugin?) defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [62:60] ==> public final val MavenDomPlugin.version: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stdlibVersion' @ [62:108] ==> val stdlibVersion: List<(String..String?)> defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'joinToString' @ [62:122] ==> public fun <T> Iterable<(String..String?)>.joinToString(separator: CharSequence = ..., prefix: CharSequence = ..., postfix: CharSequence = ..., limit: Int = ..., truncated: CharSequence = ..., transform: (((String..String?)) -> CharSequence)? = ...): String defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.String..kotlin.String?)

'fixes' @ [63:35] ==> val fixes: List<DifferentMavenStdlibVersionInspection.SetVersionQuickFix> defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [63:41] ==> public inline fun <reified T> Collection<DifferentMavenStdlibVersionInspection.SetVersionQuickFix>.toTypedArray(): Array<DifferentMavenStdlibVersionInspection.SetVersionQuickFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> SetVersionQuickFix

'pomFile' @ [67:9] ==> val pomFile: PomFile defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'findDependencies' @ [67:17] ==> public final fun findDependencies(artifact: MavenId, scope: MavenArtifactScope? = ...): List<(MavenDomDependency..MavenDomDependency?)> defined in org.jetbrains.kotlin.idea.maven.PomFile[SimpleFunctionDescriptorImpl]

'MavenId' @ [67:34] ==> public constructor MavenId(@Nullable p0: String?, @Nullable p1: String?, @Nullable p2: String?) defined in org.jetbrains.idea.maven.model.MavenId[JavaClassConstructorDescriptor]

'GROUP_ID' @ [67:66] ==> public final val GROUP_ID: String defined in org.jetbrains.kotlin.idea.maven.configuration.KotlinMavenConfigurator.Companion[PropertyDescriptorImpl]

'MAVEN_STDLIB_ID' @ [67:76] ==> public val MAVEN_STDLIB_ID: String defined in org.jetbrains.kotlin.idea.versions in file KotlinRuntimeLibraryUtil.kt[PropertyDescriptorImpl]

'filter' @ [68:14] ==> public inline fun <T> Iterable<(MavenDomDependency..MavenDomDependency?)>.filter(predicate: ((MavenDomDependency..MavenDomDependency?)) -> Boolean): List<(MavenDomDependency..MavenDomDependency?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomDependency..org.jetbrains.idea.maven.dom.model.MavenDomDependency?)

'it' @ [68:23] ==> value-parameter it: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [68:26] ==> public final val MavenDomDependency.version: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [68:34] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'pluginVersion' @ [68:49] ==> val pluginVersion: String? defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'forEach' @ [69:14] ==> @HidesMembers public inline fun <T> Iterable<(MavenDomDependency..MavenDomDependency?)>.forEach(action: ((MavenDomDependency..MavenDomDependency?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.idea.maven.dom.model.MavenDomDependency..org.jetbrains.idea.maven.dom.model.MavenDomDependency?)

'dependency' @ [70:29] ==> value-parameter dependency: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [70:40] ==> public final val MavenDomDependency.version: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'stringValue' @ [70:48] ==> public final var <T : (Any..Any?)> GenericDomValue<(String..String?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (kotlin.String..kotlin.String?)

'let' @ [70:61] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> List<DifferentMavenStdlibVersionInspection.SetVersionQuickFix>): List<DifferentMavenStdlibVersionInspection.SetVersionQuickFix> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> List<SetVersionQuickFix>

'createFixes' @ [71:21] ==> private final fun createFixes(project: MavenProject, versionElement: GenericDomValue<*>, versions: List<String>): List<DifferentMavenStdlibVersionInspection.SetVersionQuickFix> defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection[SimpleFunctionDescriptorImpl]

'project' @ [71:33] ==> val project: MavenProject defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'dependency' @ [71:42] ==> value-parameter dependency: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [71:53] ==> public final val MavenDomDependency.version: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'listOf' @ [71:62] ==> public fun <T> listOf(vararg elements: String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'version' @ [71:69] ==> value-parameter version: String defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'pluginVersion' @ [71:78] ==> val pluginVersion: String? defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'emptyList' @ [72:22] ==> public fun <T> emptyList(): List<DifferentMavenStdlibVersionInspection.SetVersionQuickFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SetVersionQuickFix

'holder' @ [74:17] ==> value-parameter holder: DomElementAnnotationHolder? defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[ValueParameterDescriptorImpl]

'createProblem' @ [74:24] ==> public abstract fun createProblem(@NotNull p0: DomElement, p1: (HighlightSeverity..HighlightSeverity?), p2: (String..String?), vararg p3: (LocalQuickFix..LocalQuickFix?)): (DomElementProblemDescriptor..DomElementProblemDescriptor?) defined in com.intellij.util.xml.highlighting.DomElementAnnotationHolder[JavaMethodDescriptor]

'dependency' @ [74:38] ==> value-parameter dependency: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [74:49] ==> public final val MavenDomDependency.version: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'WARNING' @ [75:56] ==> public final val WARNING: (HighlightSeverity..HighlightSeverity?) defined in com.intellij.lang.annotation.HighlightSeverity[JavaPropertyDescriptor]

'pluginVersion' @ [76:56] ==> val pluginVersion: String? defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement[LocalVariableDescriptor]

'dependency' @ [76:109] ==> value-parameter dependency: (MavenDomDependency..MavenDomDependency?) defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement.<anonymous>[ValueParameterDescriptorImpl]

'version' @ [76:120] ==> public final val MavenDomDependency.version: (GenericDomValue<(String..String?)>..GenericDomValue<(String..String?)>?)[MyPropertyDescriptor]

'fixes' @ [77:39] ==> val fixes: List<DifferentMavenStdlibVersionInspection.SetVersionQuickFix> defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.checkFileElement.<anonymous>[LocalVariableDescriptor]

'toTypedArray' @ [77:45] ==> public inline fun <reified T> Collection<DifferentMavenStdlibVersionInspection.SetVersionQuickFix>.toTypedArray(): Array<DifferentMavenStdlibVersionInspection.SetVersionQuickFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> SetVersionQuickFix

'versions' @ [82:27] ==> value-parameter versions: List<String> defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.createFixes[ValueParameterDescriptorImpl]

'maxBy' @ [82:36] ==> public inline fun <T, R : Comparable<MavenVersionComparable>> Iterable<String>.maxBy(selector: (String) -> MavenVersionComparable): String? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R : Comparable<R>> -> MavenVersionComparable

'MavenVersionComparable' @ [82:44] ==> public constructor MavenVersionComparable(p0: (String..String?)) defined in org.jetbrains.idea.maven.dom.MavenVersionComparable[JavaClassConstructorDescriptor]

'bestVersion' @ [83:13] ==> val bestVersion: String defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.createFixes[LocalVariableDescriptor]

'versionElement' @ [83:28] ==> value-parameter versionElement: GenericDomValue<*> defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.createFixes[ValueParameterDescriptorImpl]

'stringValue' @ [83:43] ==> public final var <T : (Any..Any?)> GenericDomValue<out (Any..Any?)>.stringValue: String?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'emptyList' @ [84:20] ==> public fun <T> emptyList(): List<DifferentMavenStdlibVersionInspection.SetVersionQuickFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SetVersionQuickFix

'project' @ [87:26] ==> value-parameter project: MavenProject defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.createFixes[ValueParameterDescriptorImpl]

'properties' @ [87:34] ==> public final val MavenProject.properties: Properties[MyPropertyDescriptor]

'entries' @ [87:45] ==> public open val entries: MutableSet<MutableMap.MutableEntry<(Any..Any?), (Any..Any?)>> defined in java.util.Properties[JavaPropertyDescriptor]

'filter' @ [87:53] ==> public inline fun <T> Iterable<MutableMap.MutableEntry<(Any..Any?), (Any..Any?)>>.filter(predicate: (MutableMap.MutableEntry<(Any..Any?), (Any..Any?)>) -> Boolean): List<MutableMap.MutableEntry<(Any..Any?), (Any..Any?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableEntry<(kotlin.Any..kotlin.Any?), (kotlin.Any..kotlin.Any?)>

'it' @ [87:62] ==> value-parameter it: MutableMap.MutableEntry<(Any..Any?), (Any..Any?)> defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.createFixes.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [87:65] ==> public abstract val value: (Any..Any?) defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'bestVersion' @ [87:74] ==> val bestVersion: String defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.createFixes[LocalVariableDescriptor]

'map' @ [87:88] ==> public inline fun <T, R> Iterable<MutableMap.MutableEntry<(Any..Any?), (Any..Any?)>>.map(transform: (MutableMap.MutableEntry<(Any..Any?), (Any..Any?)>) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableEntry<(kotlin.Any..kotlin.Any?), (kotlin.Any..kotlin.Any?)>
    <R> -> String

'it' @ [87:100] ==> value-parameter it: MutableMap.MutableEntry<(Any..Any?), (Any..Any?)> defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.createFixes.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [87:103] ==> public abstract val key: (Any..Any?) defined in kotlin.collections.MutableMap.MutableEntry[DeserializedPropertyDescriptor]

'properties' @ [89:16] ==> val properties: List<String> defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.createFixes[LocalVariableDescriptor]

'map' @ [89:27] ==> public inline fun <T, R> Iterable<String>.map(transform: (String) -> DifferentMavenStdlibVersionInspection.SetVersionQuickFix): List<DifferentMavenStdlibVersionInspection.SetVersionQuickFix> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> SetVersionQuickFix

'SetVersionQuickFix' @ [89:33] ==> public constructor SetVersionQuickFix(versionElement: GenericDomValue<*>, newVersion: String, versionResolved: String?) defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.SetVersionQuickFix[ClassConstructorDescriptorImpl]

'versionElement' @ [89:52] ==> value-parameter versionElement: GenericDomValue<*> defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.createFixes[ValueParameterDescriptorImpl]

'it' @ [89:68] ==> value-parameter it: String defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.createFixes.<anonymous>[ValueParameterDescriptorImpl]

'bestVersion' @ [89:72] ==> val bestVersion: String defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.createFixes[LocalVariableDescriptor]

'SetVersionQuickFix' @ [90:13] ==> public constructor SetVersionQuickFix(versionElement: GenericDomValue<*>, newVersion: String, versionResolved: String?) defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.SetVersionQuickFix[ClassConstructorDescriptorImpl]

'versionElement' @ [90:32] ==> value-parameter versionElement: GenericDomValue<*> defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.createFixes[ValueParameterDescriptorImpl]

'bestVersion' @ [90:48] ==> val bestVersion: String defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.createFixes[LocalVariableDescriptor]

'if (versionResolved == null) "Change version to $newVersion" else "Change version to $newVersion ($versionResolved)"' @ [94:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'versionResolved' @ [94:38] ==> public final val versionResolved: String? defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.SetVersionQuickFix[PropertyDescriptorImpl]

'newVersion' @ [94:83] ==> public final val newVersion: String defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.SetVersionQuickFix[PropertyDescriptorImpl]

'newVersion' @ [94:120] ==> public final val newVersion: String defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.SetVersionQuickFix[PropertyDescriptorImpl]

'versionResolved' @ [94:133] ==> public final val versionResolved: String? defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.SetVersionQuickFix[PropertyDescriptorImpl]

'versionElement' @ [98:13] ==> public final val versionElement: GenericDomValue<*> defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.SetVersionQuickFix[PropertyDescriptorImpl]

'value' @ [98:28] ==> public final var <T : (Any..Any?)> GenericDomValue<out (Any..Any?)>.value: Any?[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(*)

'newVersion' @ [98:36] ==> public final val newVersion: String defined in org.jetbrains.kotlin.idea.maven.inspections.DifferentMavenStdlibVersionInspection.SetVersionQuickFix[PropertyDescriptorImpl]

